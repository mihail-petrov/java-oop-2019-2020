import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Blastable;
import com.chessmaster.pieces.Chudaka;
import com.chessmaster.pieces.Pawn;
import com.chessmaster.pieces.Piece;
import com.chessmaster.test.PawnTest;

public class Application {

	public static void main(String[] args) {
		
		// PawnTest.run();
		
		Pawn p = new Pawn(PieceColor.BLACK, 1, 0);
		Chudaka cd = new Chudaka(PieceColor.BLACK, 1, 0);
		
		
		System.out.println(p  instanceof Pawn); // true
		System.out.println(p  instanceof Piece); // false
		System.out.println(p  instanceof Object); // false
		System.out.println(p  instanceof Blastable);
		System.out.println(cd instanceof Blastable); // false
		
		
		// Piece pp = new Piece(PieceColor.BLACK, 1, 0);
		
		
	}
}