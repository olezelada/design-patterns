package com.gildedrose.solution;

import com.gildedrose.Item;

import static com.gildedrose.solution.constants.Constant.ItemNames.SULFURAS;

public class ReduceQuality implements ItemStrategy {

    @Override
    public void apply(Item item) {
        if (item.getQuality() > 0) {
            item.setQuality(item.getQuality() - 1);
        }
    }
}
