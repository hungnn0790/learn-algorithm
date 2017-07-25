package com.realife.learning;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double[][] a = new double[][] { {1,2,3}, {4,5,6}, {7,8,9} };
        double[][] b = new double[][] { {1,2,3}, {4,5,6}, {7,8,9} };
    	double[][] result = MatrixUtils.multipleMatrix(a, b);
    	
    	for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				System.out.print(result[i][j] + " ");
			}
			
			System.out.println("\n");
		}
    }
}
