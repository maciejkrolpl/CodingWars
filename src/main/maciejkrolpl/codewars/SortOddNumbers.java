package main.maciejkrolpl.codewars;

public class SortOddNumbers {
    public static int[] sortArray(int[] array) {
        if (array.length==0) {
            return array;
        }
        boolean swapped=true;
        int loopsToDo = array.length-1;
        while (swapped) {
            swapped = false;
            for (int i = 0; i<loopsToDo; i++) {
                if (array[i]>array[i + 1]) {
                    int temp = array[i];
                    array[i] =  array[i+1];
                    array[i + 1] =  temp;
                    swapped = true;
                }
            }
            loopsToDo--;
        }
        return array;
    }
}
