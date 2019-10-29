package com.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
class SomeBusinessMockAnnotationsTest {

	@Mock
	DataService dataServiceMock;

	@InjectMocks
	SomeBusiness business;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.initMocks(this); // without this you will get NPE
	}

	@Test
	void testFindTheGreatestFromAllData() {
		// MockitoAnnotations.initMocks(this);
		Mockito.when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 24, 15, 3 });
		int result = business.findTheGreatestFromAllData();
		assertEquals(24, result);
	}

}
