package com.exercises;


public class StringCompression {

	public String compress(String str){
		StringBuffer buffer = new StringBuffer();
		char[] arr = str.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if (i + 1 == arr.length) {
				//string ended with one letter
				buffer.append(arr[i]);
				break; // to avoid the count being added to the end
			}
			int count = 1;
			while (i + 1 < arr.length && arr[i + 1] == arr[i]) {
				count++;
				i++;
			}
			buffer.append(arr[i]);
			if(count > 1){
				buffer.append(count);
			}

		}
		return buffer.toString();
	}
}
