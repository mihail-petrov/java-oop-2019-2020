package com.kasparovtron.pieces;
public class Queen extends Peice {
	
	Queen(String color, int row, int col) {
		
		super(color, row, col);
		this.power 	= 10;
		this.id 	= 6;
	}

	@Override
	public void move(int moveRow, int moveCol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(int attackRow, int attackCol) {
		// TODO Auto-generated method stub
		
	}
}