package org.practices.mycoding;

public class RotateMatrixBy90DegreesAntiClockwise {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int len = matrix.length;

		// System.out.println(len);

		// Convert the Matrix to Transpose Matrix
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				if (i == j)
					continue;
				matrix[j][i] = matrix[i][j] + matrix[j][i];
				matrix[i][j] = matrix[j][i] - matrix[i][j];
				matrix[j][i] = matrix[j][i] - matrix[i][j];
			}
		}

		System.out.println("Transpose Matrix");
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}

		System.out.println("\nAfter Anti clock Rotation");
		for (int i = 0; i < len / 2; i++) {
			for (int j = 0; j < len; j++) {
				matrix[len - 1 - i][i + j] = matrix[i][j]
						+ matrix[len - 1 - i][i + j];
				matrix[i][j] = matrix[len - 1 - i][i + j] - matrix[i][j];
				matrix[len - 1 - i][i + j] = matrix[len - 1 - i][i + j]
						- matrix[i][j];
			}
		}

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
