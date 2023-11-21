package com.gildedrose.cleanandorder;

import com.gildedrose.Item;

import java.util.Arrays;
import java.util.List;

public class GildedRose {

    private static final int MAX_QUALITY = 50;
    private static final String AGED = "Aged Brie";
    private static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    private static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
    //private static final List<String> ALL_NAMES = Arrays.asList(AGED, BACKSTAGE, SULFURAS);
    //private static final List<String> ALL_WITHOUT_AGED = Arrays.asList(BACKSTAGE, SULFURAS);

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    /*public void updateQuality() {
        for (Item item: items){
            if(!ALL_NAMES.contains(item.getName()) && item.getQuality() > 0){
                item.setQuality(item.getQuality() - 1);
            }else{
                if (!AGED.equals(item.getName())) {
                    int quality = 0;
                    if (!ALL_WITHOUT_AGED.contains(item.getName()) && item.getQuality() > 0) {
                        quality = item.getQuality() - 1;
                    }
                    item.setQuality(quality);
                } else {
                    if (item.getQuality() < MAX_QUALITY) {
                        item.setQuality(item.getQuality() + 1);
                    }
                }
            }
        }
    }*/


    public void updateQuality() {
        Arrays.stream(items).forEach(item -> this.validateConditions(item));
    }
    /* initial update method
    /*
      public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals(AGED) && !items[i].name.equals(BACKSTAGE)) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals(SULFURAS)) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < MAX_QUALITY) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals(BACKSTAGE)) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < MAX_QUALITY) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < MAX_QUALITY) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals(SULFURAS)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals(AGED)) {
                    if (!items[i].name.equals(BACKSTAGE)) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals(SULFURAS)) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < MAX_QUALITY) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
    * */

    private Item validateFirstBlockConditional(Item item) {
        List<String> itemNames = Arrays.asList(AGED, BACKSTAGE, SULFURAS);
        Item tempItem;

        if (!itemNames.contains(item.getName()) && item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
            tempItem = item;
        } else {
            tempItem = this.validateElseConditional(item);
        }
        return tempItem;
    }

    private void validateConditions(Item item) {
        this.validateFirstBlockConditional(item);
        if (!SULFURAS.equals(item.getName())) {
            item.setSellIn(item.getSellIn() - 1);
        }
        this.validateSecondBlock(item);
    }

    private Item validateElseConditional(Item item) {
        if (item.getQuality() < MAX_QUALITY) {
            item.setQuality(item.getQuality() + 1);
            if (BACKSTAGE.equals(item.getName()) && item.getSellIn() < 11) { //(item.getSellIn() < 11 || item.getSellIn() < 6)
                item.setQuality(item.getQuality() + 1);
            }
        }
        return item;
    }

    private Item validateSecondBlock(Item item) {
        List<String> itemNames = Arrays.asList(BACKSTAGE, SULFURAS);
        if (!AGED.equals(item.getName())) {
            int quality = 0;
            if (!itemNames.contains(item.getName()) && item.getQuality() > 0) {
                quality = item.getQuality() - 1;
            }
            item.setQuality(quality);
        } else {
            if (item.getQuality() < MAX_QUALITY) {
                item.setQuality(item.getQuality() + 1);
            }
        }

        return item;
    }
}
