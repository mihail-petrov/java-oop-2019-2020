package com.kasparovtron.pieces;

import com.kasparovtron.config.PieceColor;

public abstract class Peice {

	public String color;
	public int power;
	public int id;
	
	public int row;
	public int col;
	
	public String signature;
	
	public Peice(String color, String signature, int row, int col) {
		
		this.color 		= color;
		this.row 		= row;
		this.col 		= col;
		this.signature 	= signature;
	}
	
	public String getStignature() {
		
		if(this.color.equals(PieceColor.WHITE)) {
			return "w" + this.signature;	
		}
		
		return "b" + this.signature;		
	}
	
	public abstract boolean isMovePosible(int row, int col);
	
	public void move(int moveRow, int moveCol) {
		
		if(this.isMovePosible(moveRow, moveCol)) {
			
			this.row = moveRow;
			this.col = moveCol;
		}		
	}
	
	public abstract void attack(int attackRow, int attackCol);
}
