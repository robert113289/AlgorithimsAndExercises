package com.Search;

import org.junit.Test;

public class BinaryTest {

	@Test
	public void searchArray() {
		int[] arr = new int[100_000];
		for(int i = 0; i < arr.length - 1; i++){
			arr[i] = i;
		}
		Binary.searchArray(arr, 0 , arr.length,232);
	}

	@Test
	public void iterativeBinarySearch() {
		int[] arr = new int[100_000];
		for(int i = 0; i < arr.length - 1; i++){
			arr[i] = i;
		}
		Binary.iterativeBinarySearch(arr,232);
	}
}