import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;


public class ApplicationWindow extends JPanel {

	private final int TILE_SIDE = 50;
	
	
	private int selectedRow = -1;
	private int selectedCol = -1;
		
	public ApplicationWindow() {
		// addMouseListener(new CustomMouseListener());
		addMouseListener(new CustomMouseProxy() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// System.out.println("Ovberwriteble anonimus class");
				// System.out.print(e.getX());
				// System.out.print(e.getY());
				
				int x = e.getX();
				int y = e.getY();
				
				selectedRow = y / TILE_SIDE;
				selectedCol = x / TILE_SIDE;
				
				updateUI();
			}

		});
	}
	
	public void paint(Graphics g) {
		
		System.out.println("Rerender");
		
		for(int row = 0; row < 10; row++) {
			for(int col = 0; col < 10; col++) {
				render(g, row, col);
			}
		}
	}
	
	private void render(Graphics g, int row, int col) {
		
		boolean isRowEven   = (row % 2 == 0);
		boolean isColEven   = (col % 2 == 0);
		
		boolean isTileWhite = (isRowEven && isColEven) || 
							  (!isRowEven && !isColEven);
		
		Color tileColor 	= (isTileWhite) ? Color.WHITE 
											: Color.BLACK; 
				
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		if(selectedRow != -1 && selectedCol != -1) {
			
			tileX 		= selectedRow * TILE_SIDE;
			tileY 		= selectedCol * TILE_SIDE;
			tileColor 	= Color.RED;
		}
		
		g.setColor(tileColor);
		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	}
}