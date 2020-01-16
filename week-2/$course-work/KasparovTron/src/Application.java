import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.*;
import com.kasparovtron.tests.PawnTest;

public class Application {

	public static void main(String[] args) {
		
		// How to restrict the input parameter. 
		// I need only two specific color strings
		// Pawn p1 = new Pawn(PieceColor.BLACK, 1, 0);
		
		PawnTest.run();
	}
}
