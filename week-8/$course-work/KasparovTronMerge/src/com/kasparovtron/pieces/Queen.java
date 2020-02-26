package com.kasparovtron.pieces;

import com.kasparovtron.config.PieceColor;

public class Queen extends Peice {
	
	public Queen(PieceColor  color, int row, int col)  throws Exception {
		
		super(color, "Q",  row, col);
		this.power 	= 10;
		this.id 	= 6;
	}


	@Override
	public void attack(int attackRow, int attackCol) {
		// TODO Auto-generated method stub
	}


	@Override
	public boolean isMovePosible(int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}
}