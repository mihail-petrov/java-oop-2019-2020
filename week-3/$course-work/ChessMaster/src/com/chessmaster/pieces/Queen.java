package com.chessmaster.pieces;
public class Queen extends Piece {
	
	
	Queen(String color, int row, int col) {
		
		super(color, row, col);
		this.power  = 10;
		this.id 	= 6;
	}

	@Override
	public void move(int row, int col) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int row, int col) {
		// TODO Auto-generated method stub
		
	}
}