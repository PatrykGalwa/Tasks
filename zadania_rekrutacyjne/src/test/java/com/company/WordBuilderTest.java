package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.company.WordBuilder.FALSE_VALUE;
import static com.company.WordBuilder.TRUE_VALUE;
import static org.junit.Assert.assertEquals;

public class WordBuilderTest {

    private WordBuilder wordBuilder;
    private char[][] chars;

    @Before
    public void prepare() {
        wordBuilder = new WordBuilder();
        chars = new char[][]{
                {'A', 'L', 'O', 'N', 'E'}
                ,{'S', 'A', 'D', 'A', 'B'}
                ,{'H', 'A', 'P', 'P', 'Y'}
                ,{'E', 'U', 'T', 'Q', 'W'}
                ,{'S', 'O', 'C', 'O', 'L'}
        };
    }

    @Test
    public void shouldReturnFalseWhenWordIsNull() {
        String returnValue = wordBuilder.checkValue(chars, null);
        assertEquals(FALSE_VALUE, returnValue);
    }

    @Test
    public void shouldReturnFalseWhenWordIsEmpty() {
        String returnValue = wordBuilder.checkValue(chars, "");
        assertEquals(FALSE_VALUE, returnValue);
    }

    @Test
    public void shouldReturnFalseWhenSelectedWord() {
        String returnValue = wordBuilder.checkValue(chars ,"ZAP");
        assertEquals(FALSE_VALUE, returnValue);
    }

    @Test
    public void shouldReturnTrueWhenSelectedWord() {
        String returnValue = wordBuilder.checkValue(chars, "NAP");
        assertEquals(TRUE_VALUE, returnValue);
    }

    @After
    public void cleaning() {
        wordBuilder = null;
        chars  = null;
    }
}
