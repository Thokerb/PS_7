public class Exercise3_SelectionSort implements SortingAlgorithm {
    @Override
    public int[] sortingAlgorithm(int[] array) {
        int[] queue = new int[array.length];
        // first we put all elements in our priority queue
        // since we are using an array as implementation four our queue
        // we could also copy the input array, but since it's an academic exercise for complexity
        // we will manually clone the array. Reasons:
        // 1. Show complexity of n* O(1) for insert
        // 2. Pure function
        for (int i = 0; i < array.length; i++) {
            queue[i] = array[i];
        }

        var result = new int[array.length];
        int biggestNumber = queue[0];
        int biggestNumberPosition = 0;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < queue.length; j++) {
                if(biggestNumber < queue[j]){
                    biggestNumber = queue[j];
                    biggestNumberPosition = j;
                }
            }
            result[i] = biggestNumber;
            queue = removeElementFromArray(biggestNumberPosition,queue);
            if(queue.length != 0){
                biggestNumber = queue[0];
            }
            biggestNumberPosition = 0;
        }

        return result;
    }
    /*
    ArrayUtil Function
     */
    private int[] removeElementFromArray(int index,int[] array){
        var newArray = new int[array.length-1];
        var targetIndex = 0;
        for (int i = 0; i < array.length-1; i++) {
            if(index == i){
                targetIndex++;
            }
            newArray[i] = array[targetIndex];
            targetIndex++;
        }
        return newArray;
    }
}