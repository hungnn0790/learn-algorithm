package com.realife.learning;

public class MatrixUtils {

	public static double[][] multipleMatrix(double[][] a, double[][] b) {
		int matrixLength = a.length;
		double[][] resultMatrix = new double[matrixLength][matrixLength];
		
		for (int i = 0; i < matrixLength; i++) {
			for (int j = 0; j < matrixLength; j++) {
				for (int k = 0; k < matrixLength; k++) {
					resultMatrix[i][j] += a[i][k] * b[k][j]; 
				}
			}
		}
		
		return resultMatrix;
	}
}
