package com.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class ListTest {

	@Test
	void testSingleReturns() {
		List listMock = Mockito.mock(List.class);
		Mockito.when(listMock.size()).thenReturn(10);
		assertEquals(10, listMock.size());
		assertEquals(10, listMock.size());
	}

	@Test
	void testMultipleReturns() {
		List listMock = Mockito.mock(List.class);
		Mockito.when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
	}

	@Test
	void testGet_SpecificParameter() {
		List listMock = Mockito.mock(List.class);
		Mockito.when(listMock.get(0)).thenReturn("some string");
		assertEquals("some string", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}

	@Test
	void testGet_GenericParameter() {
		List listMock = Mockito.mock(List.class);
		Mockito.when(listMock.get(Mockito.anyInt())).thenReturn("some string");
		assertEquals("some string", listMock.get(0));
		assertEquals("some string", listMock.get(1));
	}

}
