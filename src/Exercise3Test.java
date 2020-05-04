public class Exercise3Test {
    public static void main(String[] args) {
        var arrayUnsorted = new int[]{20,21,10,16,24,13,7};
        SortingAlgorithm algorithm = new Exercise3_SelectionSort();
        var result = algorithm.sortingAlgorithm(arrayUnsorted);
        printArray(result);

        System.out.println();

        var arrayUnsorted2 = new int[]{20,21,10,16,24,13,7};
        SortingAlgorithm algorithm2 = new Exercise3_InsertionSort();
        var result2 = algorithm2.sortingAlgorithm(arrayUnsorted2);
        printArray(result2);
    }

    private static void printArray(int[] array){
        for (var element:array){
            System.out.print(element+", ");
        }
    }
}
