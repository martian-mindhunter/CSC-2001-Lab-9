public class Main {

    // comparing merge sort using arrays to quick sort

    // Merge sort that gives sorted int array
    public static int[] mergeSort(int[] array){

        if(array.length <= 1){
            return array;
        }

            int mid = array.length / 2;
            System.out.println(mid);
            int[] firstHalf = new int[mid];
            System.out.println(array.length - mid);
            int[] secondHalf = new int[array.length - mid];

            for(int j = 0; j < firstHalf.length; j++){
                firstHalf[j] = array[j];
                System.out.println("First Half: " + firstHalf[j]);
            }

            for(int j = 0; j < secondHalf.length; j++){
                secondHalf[j] = array[j + mid];
                System.out.println("Second Half: " + secondHalf[j]);
            }

            firstHalf = mergeSort(firstHalf);
            secondHalf = mergeSort(secondHalf);

            return mergeHelper(firstHalf, secondHalf);

    }

    // Helper method for merge that sorts between two given arrays & returns single array
    public static int[] mergeHelper(int[] left, int[] right){

        int sorted[] = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                sorted[k++] = left[i++];
            } else {
                sorted[k++] = right[j++];
            }
        }

        while (i < left.length) {
            sorted[k++] = left[i++];
        }

        while (j < right.length) {
            sorted[k++] = right[j++];
        }

        for(int p = 0; p < sorted.length; p++){
            System.out.println(sorted[p]);
        }
        return sorted;

    }

    // Quick sort method given int array
    public static int[] quickSort(int[] array){

    }

}
