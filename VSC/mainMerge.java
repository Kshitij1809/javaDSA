import java.util.Arrays;


class MergeSortProgram {

    private static void Merge(int[] arr, int startPos1, int endPos1, int startPos2, int endPos2) {

		int[] mergedArray = new int[endPos1 - startPos1 + 1 + endPos2 - startPos2 + 1];
		int i1 = startPos1;
		int i2 = startPos2;
		int r = 0;
		System.out.println(startPos1 + " " + startPos2 + " " + r);

		System.out.println("arr : "+Arrays.toString(arr));
		while ((i1 <= endPos1) && (i2 <= endPos2)) {
			if (arr[i1] < arr[i2]) {
				mergedArray[r] = arr[i1];
				System.out.println("1]"+Arrays.toString(mergedArray));
				++i1;
			}
			else {
				mergedArray[r] = arr[i2];
				System.out.println("2]"+Arrays.toString(mergedArray));
				++i2;
			}
			++r;
		}
		System.out.println(Arrays.toString(mergedArray));

		while (i1 <= endPos1) {
			mergedArray[r] = arr[i1];
			++i1;
			++r;
		}
		System.out.println(Arrays.toString(mergedArray));
		while (i2 <= endPos2) {
			mergedArray[r] = arr[i2];
			++i2;
			++r;
		}
		System.out.println(Arrays.toString(mergedArray));

		int i = startPos1;
		int j = 0;
		while (j < r) {
			arr[i] = mergedArray[j];
			++i;
			++j;
		}
		System.out.println(Arrays.toString(mergedArray));
	}
	
	private static void MergeSort(int[] arr, int startPos, int endPos) {
		int middlePos = 0;
		if ((endPos - startPos + 1) <= 1) {
			System.out.println(middlePos);
			return;
		}

		middlePos = (startPos + endPos) / 2; // startPos + (endPos - startPos) / 2
		System.out.println("mid : "+startPos+" "+middlePos + " " + endPos);
		
		System.out.println("1] startPos & mid after call : "+startPos+" "+middlePos + " " + endPos);
		MergeSort(arr, startPos, middlePos);
		System.out.println("2] mid & endPos after call 2 : "+startPos+" "+ (middlePos+1) + " " + endPos);
		MergeSort(arr, middlePos + 1, endPos);


		System.out.println("merge called : "+ startPos + " " + middlePos + " "+ (middlePos + 1) + " "+ endPos);
		Merge(arr, startPos, middlePos, middlePos + 1, endPos);
	}

	public static void MergeSort(int[] arr) {
		MergeSort(arr, 0, arr.length - 1);
	}

    
}

public class mainMerge {
    public static void main(String[] args) {
        int[] mergeSortNums = { 12, 11, 13, 5, 6, 7 };
		System.out.println("\nBefore sorting - " + Arrays.toString(mergeSortNums));
		MergeSortProgram.MergeSort(mergeSortNums);
		System.out.println("After merge sort - " + Arrays.toString(mergeSortNums));
    }
    
}
