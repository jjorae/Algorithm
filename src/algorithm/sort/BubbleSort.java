package algorithm.sort;

public class BubbleSort {
    public int[] sort(int[] targetArray) {
        for(int i = 0; i < targetArray.length - 1; i++) {
            for(int j = 0; j < targetArray.length - 1; j++) {
                if(targetArray[j] > targetArray[j + 1]) {
                    int tmp = targetArray[j];
                    targetArray[j] = targetArray[j + 1];
                    targetArray[j + 1] = tmp;
                }
            }
        }

        return targetArray;
    }
}
