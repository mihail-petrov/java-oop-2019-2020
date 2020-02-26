package com.kasparovtron.pieces;

import com.kasparovtron.config.PieceColor;

public class Chudaka 
	extends Peice 
	implements CanBlast  {

	public Chudaka(PieceColor  color, int row, int col) throws Exception {
		
		super(color, "Cd", row, col);
		this.power 	= 15;
		this.id 	= 7;
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

	@Override
	public void blast(int row, int col) {
		// TODO Auto-generated method stub
		
	}

}
