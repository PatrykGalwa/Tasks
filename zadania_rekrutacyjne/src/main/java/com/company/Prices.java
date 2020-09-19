package com.company;

public class Prices {

    public String calculateMaximumProfit(int[] pricesArray) {
        String returnValue = "";
        if (pricesArray != null && pricesArray.length != 0) {
            int lowerPrice = pricesArray[0];
            int higherPrice = pricesArray[0];
            int profit = 0;
            int tmpLowerPrice = pricesArray[0];

            for (int price : pricesArray) {

                if (lowerPrice > price) {
                    tmpLowerPrice = price;
                }

                if (price - lowerPrice > profit) {
                    higherPrice = price;
                    profit = price - lowerPrice;
                }

                if (price - tmpLowerPrice > profit) {
                    higherPrice = price;
                    lowerPrice = tmpLowerPrice;
                    profit = price - lowerPrice;
                }
            }

            returnValue = String.format("%d, %d, %d", lowerPrice, higherPrice, profit);
        }
        return returnValue;
    }
}
