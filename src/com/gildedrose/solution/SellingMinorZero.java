package com.gildedrose.solution;

import com.gildedrose.Item;

import static com.gildedrose.solution.constants.Constant.ItemNames.*;

public class SellingMinorZero implements ItemStrategy {

    private static final int MAX_QUALITY = 50;

    @Override
    public void apply(Item item) {
        int quality = item.getQuality();
        if (!AGED.equals(item.getName())) {
            quality = this.getQualityByItemNamesCondition(item);
        } else {
            if (item.getQuality() < MAX_QUALITY) {
                quality = item.getQuality() + 1;
            }
        }
        item.setQuality(quality);
    }

    private int getQualityByItemNamesCondition(Item item) {
        int quality = 0;
        if (!BACKSTAGE.equals(item.getName())) {
            if (item.getQuality() > 0) {
                if (!SULFURAS.equals(item.getName())) {
                    quality = item.getQuality() - 1;
                }
            }
        }
        return quality;
    }
}
