package com.gildedrose.solution;

import com.gildedrose.Item;
import com.gildedrose.solution.ItemStrategy;

import static com.gildedrose.solution.constants.Constant.ItemNames.SULFURAS;

public class ReduceSellIn implements ItemStrategy {

    @Override
    public void apply(Item item) {
        if (!SULFURAS.equals(item.getName())) {
            item.setSellIn(item.getSellIn() - 1);
        }
    }
}
