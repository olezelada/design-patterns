package com.gildedrose.solution.constants;

import java.util.Arrays;
import java.util.List;

public class Constant {

    static final String CONSTRUCTOR_MSG = "Must not have constructor It is a utility class";

    private Constant() {
        throw new IllegalStateException(CONSTRUCTOR_MSG);
    }

    public static class ItemNames{
        public static final String AGED = "Aged Brie";
        public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
        public static final String BACKSTAGE = "Backstage passes to a TAFKAL80ETC concert";
        public static final String CONJURED = "Conjured";
        public static final List<String> ALL_NAMES = Arrays.asList(AGED, SULFURAS, BACKSTAGE);
        private ItemNames() {throw new IllegalStateException(CONSTRUCTOR_MSG);}
    }
}
