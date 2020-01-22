import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.*;
import com.kasparovtron.tests.PawnTest;

public class Application {

	public static void main(String[] args) {
		
		// How to restrict the input parameter. 
		// I need only two specific color strings
		// Pawn p1 = new Pawn(PieceColor.BLACK, 1, 0);
		
		// PawnTest.run();
		
		Pawn p = new Pawn(PieceColor.BLACK, 1, 0 );
		Chudaka c = new Chudaka(PieceColor.BLACK, 1, 0 );
		
		if(p instanceof Pawn) {
			System.out.println("Yes");
		}
		
		if(p instanceof Peice) {
			System.out.println("Yes");
		}
		
		if(p instanceof Object) {
			System.out.println("Yes");
		}
		
		if(c instanceof CanBlast) {
			System.out.println("Yes");
		}
		
		
		//System.out.print(p.color);
		//System.out.print(p);
	}
}
