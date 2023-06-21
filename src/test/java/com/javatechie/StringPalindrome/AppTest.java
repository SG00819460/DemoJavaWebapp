
package com.javatechie.StringPalindrome;

import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
         private Palindrome palindrome;
         private String input;
	
        String input1 = "noon";
	App app = new App();
	boolean expected = true;

    @Before
    public void setUp() throws Exception {

        input = null;
        palindrome = new Palindrome();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test(expected = NullPointerException.class)
    public void nullStringTest() throws Exception {

        palindrome.isPalindrome(null);

    }
	@Test
	public void isPlaindromeTest() {
		assertEquals(expected, app.isPalindrome(input1));
	}

	@Test
	public void isNotPlaindromeTest() {
		assertEquals(false, app.isPalindrome("abc"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void isNotPlaindromeExceptionTest() {
		assertEquals(false, app.isPalindrome(null));
	}
	
	


}
