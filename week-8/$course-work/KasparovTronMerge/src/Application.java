import com.kasparovtron.config.PieceColor;
import com.kasparovtron.pieces.Pawn;
import com.kasparovtron.pieces.Peice;

public class Application {
		
	public static void main(String[] args) {
		
//		try {
//			Peice p = new Pawn("pesho", 0, 0);	
//		}
//		catch(IllegalArgumentException iae) {
//			
//			System.out.println("Log exception");
//			System.out.println(iae.getMessage());
//			System.out.println("***");
//			iae.printStackTrace();
//		}
//		catch(IllegalAccessError err) {
//			System.out.print("Error catch");
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//			System.out.println("***");
//			e.printStackTrace();
//		}
		
		try {
			Peice p = new Pawn(PieceColor.WHITE, 0, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
