package ttsttsts;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMaxMinFromMatrix {
	public static void main(String[] args) {
	
		int inputMatrix[][] = { { 1, 3, 4 }, { 2, 10, 3 }, { 3, 4, 5 } };

		// Finding minimum and maximum without sorting
        int min = inputMatrix[0][0];
        int max = inputMatrix[0][0];

        // Iterate through the 2D array to find min and max
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix.length; j++) {
                if (max < inputMatrix[i][j]) {
                    max = inputMatrix[i][j];
                }
                else if (min > inputMatrix[i][j]) {
                    min = inputMatrix[i][j];
                }
            }
        }

        System.out.println("Minimum = " + min);
        System.out.println("Maximum = " + max);
		
	}
}
