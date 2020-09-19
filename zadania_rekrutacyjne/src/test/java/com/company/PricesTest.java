package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PricesTest {

    private Prices prices;
    private int[] pricesArray;

    @Before
    public void prepareTestVariables() {
        prices = new Prices();
    }

    @Test
    public void shouldReturnEmptyStringWhenArrayIsNull() {
        pricesArray = null;

        String returnValue = prices.calculateMaximumProfit(pricesArray);

        assertEquals("", returnValue);
    }

    @Test
    public void shouldReturnEmptyStringWhenEmptyArray() {
        pricesArray = new int[]{};

        String returnValue = prices.calculateMaximumProfit(pricesArray);

        assertEquals("", returnValue);
    }

    @Test
    public void shouldReturnZeroProfit() {
        pricesArray = new int[]{5, 5, 5};

        String returnValue = prices.calculateMaximumProfit(pricesArray);

        assertEquals("5, 5, 0", returnValue);
    }

    @Test
    public void shouldReturnCorrectProfitFromSmallArray() {
        pricesArray = new int[]{4, 2, 5, 3, 7};

        String returnValue = prices.calculateMaximumProfit(pricesArray);

        assertEquals("2, 7, 5", returnValue);
    }

    @Test
    public void shouldReturnCorrectProfitFromHudgeArray() {
        pricesArray = new int[]{4, 2, 5, 9, 3, 2, 6, 1, 6, 12, 9};

        String returnValue = prices.calculateMaximumProfit(pricesArray);

        assertEquals("1, 12, 11", returnValue);
    }

    @After
    public void cleaning() {
        pricesArray = null;
        prices = null;
    }
}
