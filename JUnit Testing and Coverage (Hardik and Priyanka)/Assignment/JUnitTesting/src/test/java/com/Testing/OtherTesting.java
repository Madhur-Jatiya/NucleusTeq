package com.Testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OtherTesting {
	
	@Test
	public void isPositive()
	{
		Assertions.assertTrue(10>5);
	}
	@Test
	public void isNegative()
	{
		Assertions.assertFalse(10<5);
	}
}
