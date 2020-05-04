public class Exercise3_InsertionSort implements SortingAlgorithm {
    @Override
    public int[] sortingAlgorithm(int[] array) {
        int[] queue = new int[array.length];
        var result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            queue[i] = array[i];
        }

        var j = 0;
        result[0] = queue[0];
        for (int i = 1; i < result.length; i++) {
            while (result[j] > queue[i]){
                j++;
            }
            shiftArrayElementsRight(result,j,i);
            result[j] = queue[i];
            j = 0;
        }

        return result;
    }

    private void shiftArrayElementsRight(int[] list, int startIndex,int numberElements) {
        int prev = 0;
        for(int i = 0;i <= numberElements;i++){
            var help = prev;
            prev = list[i];
            if(i < startIndex)continue;
            list[i] = help;
        }
    }
}
