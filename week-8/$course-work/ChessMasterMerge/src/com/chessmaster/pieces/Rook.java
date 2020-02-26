package com.chessmaster.pieces;

import com.chessmaster.config.PieceColor;

public class Rook extends Piece {
	
	public Rook(PieceColor color, int row, int col) throws Exception {
		
		super(color, "R", row, col);
		this.power  = 5;
		this.id 	= 4;
	}

	@Override
	public void move(int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isMoveActionValid(int row, int col) {
		// TODO Auto-generated method stub
		return false;
	}
}