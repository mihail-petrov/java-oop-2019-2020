import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class GameBoardPanel extends JPanel {
	
	private final int TILE_SIDE = 50;
	
	private int selectedRow = -1;
	private int selectedCol = -1;
	
	public GameBoardPanel() {
		
		addMouseListener(new ChessBoardEventProxy() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int x = e.getX();
				int y = e.getY();
				
				selectedRow = y / TILE_SIDE; 
				selectedCol = x / TILE_SIDE;
				
				// paint(getGraphics());
				updateUI();
			}
		});
	}
	
	public void paint(Graphics g) {
		
		for(int row = 0; row < 10; row++) {
			for(int col = 0; col < 10; col++) {
				render(g, row, col);
			}
		}
		
		//g.setColor(Color.GREEN);
		//g.fillRect(10, 10, 100, 100);
	}
	
	private void render(Graphics g, int row, int col) {
		
		boolean isRowEven 	= (row % 2 == 0);
		boolean isColEvent 	= (col % 2 == 0);
		
		boolean isWhite 	= (isRowEven && isColEvent) ||
							  (!isRowEven && !isColEvent);
		
		Color tileColor = isWhite ? Color.WHITE 
								  : Color.BLACK;
		
		boolean isSelected = (row == selectedRow) && 
							 (col == selectedCol);
		
		int tileX = col * TILE_SIDE;
		int tileY = row * TILE_SIDE;
		
		if(isSelected) {
			
			tileColor = Color.RED;
			g.setColor(tileColor);
			g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
			return;
		}
		
		g.setColor(tileColor);
		g.fillRect(tileX, tileY, TILE_SIDE, TILE_SIDE);
	}
}