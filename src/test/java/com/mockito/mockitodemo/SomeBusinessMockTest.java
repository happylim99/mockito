package com.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SomeBusinessMockTest {

	@Test
	void testFindTheGreatestFromAllData() {
		DataService dataServiceMock = Mockito.mock(DataService.class);

		Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		SomeBusiness business = new SomeBusiness(dataServiceMock);
		int result = business.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}
