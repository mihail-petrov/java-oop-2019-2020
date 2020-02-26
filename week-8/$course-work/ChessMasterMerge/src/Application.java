import java.security.InvalidParameterException;

import com.chessmaster.config.PieceColor;
import com.chessmaster.pieces.Piece;
import com.chessmaster.pieces.Rook;

public class Application {
	
	public static void main(String[] args) {
		
//		try {
//			Piece p = new Rook(PieceColor.WHITE, 0, 0);
//			System.out.print("* Process");
//		}
//		catch(InvalidParameterException e) {
//			System.out.println("Log");
//			e.printStackTrace();
//		}
//		catch(Exception e) {
//			e.getMessage();
//			e.printStackTrace();
//		}
//		finally {
//			System.out.print(" FINAL CODE ");	
//		}
//		
//		System.out.print("* External Process");
		
		
		try {
			Piece p = new Rook(PieceColor.BLACK, 0, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
