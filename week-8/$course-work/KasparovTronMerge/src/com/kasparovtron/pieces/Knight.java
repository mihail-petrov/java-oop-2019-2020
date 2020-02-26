package com.kasparovtron.pieces;

import com.kasparovtron.config.PieceColor;

public class Knight extends Peice {
	
	
	public Knight(PieceColor  color, int row, int col) throws Exception {
		
		super(color, "Kn",row, col);
		this.power 	= 5;
		this.id 	= 4;
	}

	@Override
	public boolean isMovePosible(int moveRow, int moveCol) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void attack(int attackRow, int attackCol) {
		// TODO Auto-generated method stub
		
	}
}
