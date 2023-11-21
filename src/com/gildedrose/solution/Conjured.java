package com.gildedrose.solution;

import com.gildedrose.Item;

import static com.gildedrose.solution.constants.Constant.ItemNames.CONJURED;
import static com.gildedrose.solution.constants.Constant.ItemNames.SULFURAS;

public class Conjured implements ItemStrategy {

    @Override
    public void apply(Item item) {
       int quality = item.getQuality() - 2;
        item.setQuality(quality);
    }
}
