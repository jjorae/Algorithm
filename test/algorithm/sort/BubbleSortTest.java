package algorithm.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sort() {
        BubbleSort bubbleSort = new BubbleSort();
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5 }, bubbleSort.sort(new int[] { 3, 5, 1, 4, 2, 0 }));
    }
}