package com.kasparovtron.pieces;

import com.kasparovtron.config.PieceColor;

public class Bishop extends Peice{
	
	public Bishop(PieceColor  color, int row, int col) throws Exception {
		super(color, "B", row, col);
		this.power 	= 5;
		this.id 	= 3;
	}
	
	@Override
	public boolean isMovePosible(int moveRow, int moveCol) {
		return false;
	}
	
	public void attack(int attackRow, int attackCol) {
		
	}
}
