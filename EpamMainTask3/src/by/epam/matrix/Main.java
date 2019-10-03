package by.epam.matrix;

public class Main {

	public static void main(String[] args) {
		
		Matrix matrix = new Matrix();
		
		matrix.makeMatrix();
		
		matrix.findArithmeticMeanValue();
		matrix.findGeometricMeanValue();
		matrix.findMaxAndMin();
		matrix.findPositionOfFirstLocalMax();
		matrix.findPositionOfFirstLocalMin();
		matrix.transposeMatrix();
	}

}
