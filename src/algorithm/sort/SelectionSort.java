package algorithm.sort;

public class SelectionSort {
    public int[] sort(int[] targetArray) {
        for(int i = 0; i < targetArray.length - 1; i++) {
            int minIdx = i;
            for(int j = i + 1; j < targetArray.length; j++) {
                if(targetArray[minIdx] > targetArray[j]) {
                    minIdx = j;
                }
            }

            if(i != minIdx) {
                int tmp = targetArray[i];
                targetArray[i] = targetArray[minIdx];
                targetArray[minIdx] = tmp;
            }
        }

        return targetArray;
    }
}
