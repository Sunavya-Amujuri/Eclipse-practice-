package Arrays;

import java.util.*;

//public class MainArray {
//
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5};
//		int res = Arrays.stream(arr).sum();
//				
//		System.out.print(res);
//	}
//}

// Linear Search

// 1) While loop

//class LinearSearch{
//	public int search(int[] arr, int target) {
//		int i= 0;
//		while(i < arr.length) {
//			if(arr[i] == target) {
//				return i;
//			}
//			i++;
//		}
//		return -1;
//	}
//}
//public class MainArray {
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5};
//		int target = 3;
//		LinearSearch ls = new LinearSearch();
//		int res = ls.search(arr, target);
//					
//		System.out.print(res);
//	}
//}

// 2) Recursion

//class LinearSearch{
//	public int search(int[] arr, int target, int index) {
//		if(index < 0) return -1;
//		if(arr[index] == target) return index;
//		
//		return search(arr, target, index+1);
//	}
//}
//public class MainArray {
//	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5};
//		int target = 4;
//		LinearSearch ls = new LinearSearch();
//		int res = ls.search(arr, target, 0);
//					
//		System.out.print(res);
//	}
//}

// Max AND Min

// 1) for loop

//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {3, 1, 7, 2, 9};
//		
//		int max = arr[0];
//		int min = arr[0];
//		
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i] > max) max = arr[i];
//			if(arr[i] < min) min = arr[i];
//		}
//		System.out.println("Max : " + max);
//		System.out.println("Min : " + min);
//	}
//}

//2) Using Sorting

//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {3, 1, 7, 2, 9};
//		
//		Arrays.sort(arr);
//		
//		int min = arr[0];
//		int max = arr[arr.length - 1];
//		
//		// using java streams
//		int max = Arrays.stream(arr).max().getAsInt();
//		int min = Arrays.stream(arr).min().getAsInt();
//		
//		System.out.println("Max: " + max + " ,Min: " + min);
//	}
//}

// 3) recursion

//class maxAndMin{
//	static int max(int[]arr, int n) {
//		if(n == 1) return arr[0];
//		return Math.max(arr[n-1], max(arr, n-1));
//	}
//	
//	static int min(int[]arr, int n) {
//		if(n == 1) return arr[0];
//		return Math.min(arr[n-1], min(arr, n-1));
//	}
//}
//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {3, 1, 7, 2, 9};
//		
//		System.out.println("Max: " + maxAndMin.max(arr, arr.length));
//		System.out.println("Min: " + maxAndMin.min(arr, arr.length));
//	}
//}

// sorting

// 1) Brute Force (Bubble sort or selection sort are best) (will go for bubble sort)

//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {5, 3, 8, 4, 2};
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr.length-i-1; j++) {
//				if(arr[j] > arr[j+1]) {
//					int temp = arr[j];  // swap
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
//		
//		for(int num : arr) {
//			System.out.print(num + " ");
//		}
//	}
//}

// 2) built in function

//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {5, 3, 8, 4, 2};
//		
//		Arrays.sort(arr);
//		
//		for(int num : arr) {
//			System.out.print(num + " ");
//		}
//	}
//}

// Array Rotation

// 1)Brute Force (Rotate one-by-one)

//class Rotate{
//	public static void rotate(int[] arr, int k) {
//		int n = arr.length;
//		
//		for(int i=0; i<k; i++) {
//			int last = arr[n-1];
//			
//			for(int j=n-1; j>0; j--) {
//				arr[j] = arr[j-1];
//			}
//			arr[0] = last;
//		}
//	}
//}	
//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {1, 2, 3, 4, 5};
//		int k = 2;
//		
//		Rotate.rotate(arr, k);
//		
//		for(int num : arr) {
//			System.out.print(num + " ");
//		}
//	}
//}

// 2)Better Approach(using extra Array)

//class Rotate{
//	public static void rotate(int[] arr, int k) {
//		int n = arr.length;
//		int[]temp = new int[n];
//		
//		for(int i=0; i<n; i++) {
//			temp[(i+k)%n] = arr[i];
//		}
//		for(int i=0; i<n; i++) {
//			arr[i] = temp[i];
//		}
//	}
//}	
//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {1, 2, 3, 4, 5};
//		int k = 2;
//		
//		Rotate.rotate(arr, k);
//		
//		for(int num : arr) {
//			System.out.print(num + " ");
//		}
//	}
//}

// 3) reversal

//class Rotate{
//	public static void rotate(int[] arr, int k) {
//		int n = arr.length;
//		reverse(arr, 0, n-1);
//		reverse(arr, 0, k-1);
//		reverse(arr, k, n-1);
//	}
//	public static void reverse(int[]arr, int start, int last) {
//		while(start < last) {
//			int temp = arr[start];
//			arr[start] = arr[last];
//			arr[last] = temp;
//			start++;
//			last--;
//		}
//	}
//}	
//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {1, 2, 3, 4, 5};
//		int k = 2;
//		
//		Rotate.rotate(arr, k);
//		
//		for(int num : arr) {
//			System.out.print(num + " ");
//		}
//	}
//}

// Remove element

// 1) Shift method

//class Remove{
//	public static int remove(int[]arr, int index) {
//		int n = arr.length;
//		for(int i=index; i<n-1; i++) {
//			arr[i] = arr[i+1];
//		}
//		return n-1;
//	}
//}
//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {1, 2, 3, 4, 5};
//		int index = 2;
//		int newSize = Remove.remove(arr, index);
//		
//		for(int i=0; i<newSize; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
//}

// 2) Two Pointer

//class Remove{
//	public static int remove(int[]arr, int val) {
//		int k = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] != val) {
//				arr[k++] = arr[i];
//			}
//		}
//		return k;
//	}
//}
//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {1, 2, 3, 4, 5};
//		int val = 2;
//		int newSize = Remove.remove(arr, val);
//		
//		for(int i=0; i<newSize; i++) {
//			System.out.print(arr[i] + " ");
//		}
//	}
//}

// using Arraylist  but space is 0(n), not best , using two pointer is best

//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {1, 2, 3, 4, 5};
//		int val = 2;
//		
//		List<Integer> list = new ArrayList<>();
//		
//		for(int num : arr) {
//			if(num != val) {
//				list.add(num);
//			}
//		}
//		
//		for(int num : list) {
//			System.out.print(num + " ");
//		}
//	}
//}


// Two pointer Approaches

// 1. Opposite Direction (Left ↔ Right)

//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {1, 2, 3, 4, 5};
//		
//		int left = 0; 
//		int right = arr.length-1;
//		
//		while(left < right) {
//			int temp = arr[left];
//			arr[left] = arr[right];
//			arr[right] = temp;
//			left++;
//			right--;
//		}
//		for(int num : arr) {
//			System.out.print(num + " ");
//		};
//	}
//}

// 2. Same Direction (Slow & Fast Pointer)

//class Duplicate{
//	public static int duplicate(int[]arr) {
//		int k = 1;
//		for(int i=1; i<arr.length; i++) {
//			if(arr[i] != arr[i-1]) {
//				arr[k++] = arr[i];
//			}
//		}
//		return k;
//	}
//}
//public class MainArray{
//	public static void main(String[] a) {
//		int[] arr = {1, 2, 2, 4, 5};
//		int res = Duplicate.duplicate(arr);
//		
//		for(int i=0; i<res; i++) {
//			System.out.print(arr[i] + " ");
//		}	
//	}
//}

// 3. Sliding Window (Dynamic Two Pointer)

//class Duplicate{
//	public static int lengthOfLongestSubstring(String s) {
//		HashSet<Character> set = new HashSet<>();
//		int left = 0, max = 0;
//		
//		for(int i=0; i<s.length(); i++) {
//			if(set.contains(s.charAt(i))) {
//				set.remove(s.charAt(left));
//				left++;
//			}
//			set.add(s.charAt(i));
//			max = Math.max(max, i-left+1);
//		}
//		return max;
//	}
//}
//public class MainArray{
//	public static void main(String[] a) {
//		String s = "abcdabcdebb";
//		
//		int res = Duplicate.lengthOfLongestSubstring(s);
//		
//		System.out.print("Length of longest SubString is " + res);			
//	}
//}

// 4) Partitioning Two Pointer Approach

class Partition{
	static void partitionEvenOrOdd(int[]arr) {
		int left = 0;
		
		for(int right=0; right < arr.length; right++) {
			if(arr[right] % 2 == 0) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
			}
		}
	}
}
public class MainArray{
public static void main(String[] a) {
	int[] arr = {1, 2, 3, 4, 5};
	
	Partition.partitionEvenOrOdd(arr);;
	
	for(int num : arr) {
		System.out.print(num + " ");
	}
}
}
