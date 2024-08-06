package in.thiru;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class N09MergeTwoUnsortedArrays {
	
	public static void main(String[] args) {
		
		int[] array1= {10,90,60};
		int[] array2= {40,50,60};
		
        int[] array = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).toArray();
   
        for (int i : array) {
			System.out.println(i);
		}
        
        int[] a1= {1,2,3,4};
        int[] a2= {5,6,7,8};
        
       int[] array3 = IntStream.concat(Arrays.stream(a1), Arrays.stream(a2)).toArray();
       
       List<Integer> collect = Arrays.stream(array3).boxed().collect(Collectors.toList());
       System.out.println(collect);
        
		
	}

}
