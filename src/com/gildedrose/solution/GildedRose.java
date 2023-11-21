package com.gildedrose.solution;

import com.gildedrose.Item;

import java.util.Arrays;

import static com.gildedrose.solution.constants.Constant.ItemNames.*;

public class GildedRose {

    private Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(item -> {
            ItemStrategy strategy = this.getStrategyByContext(item);
            strategy.apply(item);
        });
    }

    private ItemStrategy getStrategyByContext(Item item) {
        ItemStrategy strategy;
        if (!ALL_NAMES.contains(item.getName()) && item.getQuality() > 0) {
            strategy = new ReduceQuality();
        } else {
            strategy = new QualityIncrease();
        }

        if (!SULFURAS.equals(item.getName())) {
            strategy = new ReduceSellIn();
        }

        if (item.getSellIn() < 0) {
            strategy = new SellingMinorZero();
        }

        if(CONJURED.equals(item.getName())){
            strategy = new Conjured();
        }

        return strategy;
    }
}
