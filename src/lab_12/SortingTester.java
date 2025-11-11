package lab_12;

public class SortingTester {

	public static void main(String[] args) {
		System.out.println("Bubble Sort");
		int[] nums = {4, 5, 7, 2, 1};
		for(int n: nums) {
			System.out.println(n);
		}
		System.out.println();
		QuadSorts.bubbleSort(nums);
		for(int n: nums) {
			System.out.println(n);
		}int[] nums2 = {4, 5, 7, 2, 1};
		System.out.println("Selection Sort");
		for(int n: nums2) {
			System.out.println(n);
		}
		System.out.println();
		QuadSorts.selectionSort(nums2);
		for(int n: nums2) {
			System.out.println(n);
		}
		int[] nums3 = {8,3,2,5,1};
		System.out.println("Insertion Sort");

		for(int n: nums3) {
			System.out.println(n);
		}
		System.out.println();
		nums3 = QuadSorts.insertionSort(nums3);
		for(int n: nums3) {
			System.out.println(n);
		}
		int[] nums4 = {4, 5, 7, 2, 1};
		System.out.println("Merge Sort");
		for(int n: nums4) {
			System.out.println(n);
		}
		System.out.println();
		QuadSorts.mergeSort(nums4);
		for(int n: nums4) {
			System.out.println(n);
		}
		
	}

}
