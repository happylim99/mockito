package com.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	void findTheGreatestFromAllData() {
		SomeBusiness business = new SomeBusiness(new DataServiceStub());
		int result = business.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}

class DataServiceStub implements DataService {

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] { 24, 6, 15 };
	}

}