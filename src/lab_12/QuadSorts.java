package lab_12;

public class QuadSorts {
	public static int[] bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < arr.length - i - 1; j ++) {
				if(arr[j+1] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	public static int[] selectionSort(int[] arr) {
		for(int i = 0; i < arr.length; i ++) {
			int stemp = Integer.MAX_VALUE;
			int pos = 0;
			for(int j = i; j < arr.length; j ++) {
				if(arr[j] < stemp) {
					stemp = arr[j];
					pos = j;
				}
			}
			arr[pos] = arr[i];
			arr[i] = stemp;			
		}
		return arr;
	}
	public static int[] insertionSort(int[] arr) {
		int[] newar = new int[arr.length];
		for(int i = 0; i<arr.length; i ++) {
			newar[i] = Integer.MAX_VALUE;
		}
		newar[0]  = arr[0];
		
		int temp2 = 0;
		for(int i = 1; i < arr.length; i ++) {
			int temp = arr[i];
			for(int j = 0; j < arr.length; j++) {
					if(temp <= newar[j]) { 										
						if(j == arr.length-1) {
							newar[j] = temp;
						}
						temp2 = newar[j];
						newar[j] = temp;
						temp = temp2;
					}
					else if(temp> newar[j]&& newar[j] != 0)  {	
						continue;
					}
					else {
						newar[j] = temp;
					}
			}
		}
		return newar;
	}
	public static int[] mergeSort(int[] arr) {
		if(arr.length <= 1) {
			return arr;
		}
		int count2 = 0;
		int middle = arr.length /2;	
		int[] left = new int[middle];
		int[] right = new int[arr.length - middle];
		int count = 0;
		for(int i = 0; i < middle; i ++) {
			left[i] = arr[i];
			count++;
		}
		for(int i = middle; i < arr.length; i ++) {
			right[i-middle] = arr[i];
		}
		count2 ++;
		left = mergeSort(left);
		right = mergeSort(right);
		
		return QuadSorts.merge(left, right);
	}
	public static int[] merge(int[] left, int[] right) {
		int[] result = new int[left.length +right.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < left.length && j < right.length) {
			if(left[i] < right[j]) {
				result[k++] = left[i++];
			}
			else {
				result[k++] = right[j++];
			}			
		}
		while(i < left.length) {
			result[k++] = left[i++];
		}
		while(j< right.length) {
			result[k++] = right[j++];
		}
		return result;
	}
		
		
}


