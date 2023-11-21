package com.gildedrose.solution;

import com.gildedrose.Item;

import static com.gildedrose.solution.constants.Constant.ItemNames.BACKSTAGE;

public class QualityIncrease implements ItemStrategy {

    private static final int SIX_DAY = 6;
    private static final int ELEVEN_DAY = 11;
    private static final int MAX_QUALITY = 50;

    @Override
    public void apply(Item item) {
        int qualityIncrease = 0;

        if (item.getQuality() < MAX_QUALITY) {
            qualityIncrease++;
            if (BACKSTAGE.equals(item.getName())) {
                qualityIncrease = this.getItemIncreaseBySeelIn(item, qualityIncrease);
            }
        }

        item.setQuality(item.getQuality() + qualityIncrease);
    }

    private int getItemIncreaseBySeelIn(Item item, int qualityIncrease){

        if (item.getSellIn() < ELEVEN_DAY) {
            qualityIncrease++;
        }

        if (item.sellIn < SIX_DAY) {
            qualityIncrease++;
        }

        return qualityIncrease;
    }
}
