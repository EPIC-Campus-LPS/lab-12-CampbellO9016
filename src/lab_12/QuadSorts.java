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
		if(arr.length == 1) {
			return arr;
		}
		int count2 = 0;
		int len = arr.length;	
		int n[] = new int[len/2];
		int n2[] = new int[len/2];
		int count = 0;
		for(int i = 0; i < n.length; i ++) {
			n[i] = arr[i];
			count++;
		}
		for(int i = 0; i < n2.length; i ++) {
			n2[i] = arr[count +i];
		}
		count2 ++;
		n = mergeSort(n);
		n2 = mergeSort(n2);
		int n3[] = new int[len];
		int count1 = 0;
		int j = 0;
		int k = 0;
		for(int i = 0; i < arr.length; i ++) {
			if(n2[j] < n[k]) {
				arr[count1] = n2[j];
				j++;
			}
			else if(n[k] <n[j]) {
				arr[count1] = n[k];
				k++;
			}
					
		}
		System.out.println("c" +count2);
		return arr;
	}
		
		
}


