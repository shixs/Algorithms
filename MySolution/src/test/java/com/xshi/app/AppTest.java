package com.xshi.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest{
    private RemoveDuplicateWords rdw = new RemoveDuplicateWords();
    private String sentence = "";
    @Test
    public void testSentence(){
      String testString = "This is a book is book.";
      sentence = "This is a book.";
      assertEquals(sentence,rdw.removeDuplicateWords(testString));
    }
}
