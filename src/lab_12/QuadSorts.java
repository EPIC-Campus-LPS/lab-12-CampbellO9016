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
			newar[i] = 0;
		}
		newar[0]  = arr[0];
		for(int i = 0; i < arr.length; i ++) {
			for(int j = 0; j < newar.length; j++) {
				for(int k = 0; k <1; k++) {
					if(arr[i] <= newar[j]) { //I think maybe change this.
						int temp = arr[i];
						arr[i] = newar[k];
						newar[k] = temp; 
					}
//					else if(arr[i] > newar[j]) { 
//						int temp = arr[i];
//						arr[i] = newar[k];
//						newar[k] = temp; 
//					}
				}
			}
		}
//		newar[0] = arr[0];
//		for(int i = 1; i < arr.length; i ++) {
//			for(int j = i; j < arr.length; j ++) {
//				if(arr[j] <= newar[0]) {
////					int temp = newar[0]; 
////					newar[0] = arr[j];
//					for(int k = 0; k < arr.length; k ++) {
//						//I think put the loops for each inside of ifs for up or down
//					}
//				}
//				else if(arr[j] > newar[0]) {
//					
//				}
//			}
//		}
		return newar;
	}
//	public static int[] mergeSort(int[] arr) {
//		
//	}
}
