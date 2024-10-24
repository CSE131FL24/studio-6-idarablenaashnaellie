package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		
			// FIXME compute the geometric sum for the first n terms recursively
		
			if (n == 0) {
		        return 0;
		    }
		    return Math.pow(0.5, n) + geometricSum(n - 1);
		}
			
		
	
	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		if (radius < radiusMinimumDrawingThreshold) {
	        return;
	    }
	    StdDraw.circle(xCenter, yCenter, radius);
	    circlesUponCircles(xCenter, yCenter + radius, radius / 3.0, radiusMinimumDrawingThreshold); // Top
	    circlesUponCircles(xCenter, yCenter - radius, radius / 3.0, radiusMinimumDrawingThreshold); // Bottom
	    circlesUponCircles(xCenter - radius, yCenter, radius / 3.0, radiusMinimumDrawingThreshold); // Left
	    circlesUponCircles(xCenter + radius, yCenter, radius / 3.0, radiusMinimumDrawingThreshold); // Right

	}
		// FIXME
	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int[]temp2 = new int[array.length];
		return reverseHelper(int[]array, int index, int[]temp2){
			
	
		
		
	}
	public static int [] reverseHelper(int[]array, int index, int[]temp) {
		if(index < 0) {
			return temp;
		}
		else {
		temp[index] = array[array.length - 1 - index];
		return reverseHelper(array, index - 1, temp);	
		}
		
	}
		

	/*private static int[] reverseHelper(int[] array, int start, int end) {
	    if (start >= end) {
	        return array;
	    }
	    int temp = array[start];
	    array[start] = array[end];
	    array[end] = temp;
	    return reverseHelper(array, start + 1, end - 1);
	
		
			// FIXME create a helper method that can recursively reverse the given array
		//	return new int[0];
		*/
}
	
	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		
			// FIXME compute the gcd of p and q using recursion
			return 0;
		
	}

}
