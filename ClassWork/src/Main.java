
public class Main {

	public static void main(String[] args) {
		/*Triangle A = new Triangle();
		Triangle B = new Triangle();
		Triangle C = new Triangle();
		
		A.enterTheTriangAndCheckForTriangle();
		B.enterTheTriangAndCheckForTriangle();
		C.enterTheTriangAndCheckForTriangle();
		
		Triangle[] ABC = {A, B, C};
		
		A.findMaxSquare(ABC);
		*/
		Triangle random = new Triangle();
		random.findMaxSquare(random.makeTriangles());
	}

}
