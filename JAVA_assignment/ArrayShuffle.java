package Coding_Assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ArrayShuffle {
    public static void main(String[] args) {
        ArrayShuffle obj = new ArrayShuffle();
        obj.shuffleAndPrintArrays();
    }

    public void shuffleAndPrintArrays() {
        // Original array
        List<Integer> originalArray = new ArrayList<>();
        originalArray.add(1);
        originalArray.add(2);
        originalArray.add(3);
        originalArray.add(4);
        originalArray.add(5);
        originalArray.add(6);
        originalArray.add(7);

        // Create a copy of original array
        List<Integer> shuffledArray = new ArrayList<>(originalArray);

        // Shuffle copy
        Collections.shuffle(shuffledArray);

        // Printing original array
        System.out.print("Original Array: ");
        for (Integer value : originalArray) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Printing shuffled array
        System.out.print("Shuffled Array: ");
        for (Integer value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}
