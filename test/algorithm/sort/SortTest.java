package algorithm.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {

    @Test
    void bubbleSort() {
        BubbleSort bubbleSort = new BubbleSort();
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5 }, bubbleSort.sort(new int[] { 3, 5, 1, 4, 2, 0 }));
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5 }, bubbleSort.sort(new int[] { 0, 1, 2, 3, 4, 5 }));
    }

    @Test
    void selectionSort() {
        SelectionSort selectionSort = new SelectionSort();
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5 }, selectionSort.sort(new int[] { 3, 5, 1, 4, 2, 0 }));
        assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 5 }, selectionSort.sort(new int[] { 0, 1, 2, 3, 4, 5 }));
    }
}