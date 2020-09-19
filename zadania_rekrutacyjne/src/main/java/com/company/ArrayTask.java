package com.company;

import java.util.HashMap;

public class ArrayTask {

    public boolean checkArray(int[] integerArray) {
        boolean check = false;
        if (integerArray != null && integerArray.length != 0) {
            HashMap<Integer, Integer> indexIntegerMap = new HashMap<>();

            for (int index = 0; index < integerArray.length; index++) {
                indexIntegerMap.put(index, integerArray[index]);
                for (int secondIndex = 0; secondIndex < integerArray.length; secondIndex++) {

                    if (
                            index != secondIndex
                            && indexIntegerMap.containsValue(integerArray[index] + 1 - integerArray[secondIndex])
                            && indexIntegerMap.get(index) != integerArray[index] + 1 - integerArray[secondIndex]
                    ) {
                        check = true;
                        break;
                    }
                }
                if (check) {
                    break;
                }
            }
        }
        return check;
    }
}
