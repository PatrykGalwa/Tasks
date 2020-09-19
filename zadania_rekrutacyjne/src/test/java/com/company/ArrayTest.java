package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArrayTest {

    private ArrayTask arrayTask;
    private int[] integerArray;

    @Before
    public void prepare() {
        arrayTask = new ArrayTask();
    }

    @Test
    public void shouldReturnFalseWhenArrayIsNull() {
        integerArray = null;

        boolean result = arrayTask.checkArray(integerArray);

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseWhenArrayIsEmpty() {
        integerArray = new int[]{};

        boolean result = arrayTask.checkArray(integerArray);

        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseGivenSelectedArray() {
        integerArray = new int[]{1,2,9};

        boolean result = arrayTask.checkArray(integerArray);

        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueWhenGivenSelectedArray() {
        integerArray = new int[]{3,6,8};

        boolean result = arrayTask.checkArray(integerArray);

        assertTrue(result);
    }

    @After
    public void cleaning() {
        arrayTask = null;
        integerArray = null;
    }
}
