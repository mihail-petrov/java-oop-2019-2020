package com.chessmaster.pieces;

import com.chessmaster.config.PieceColor;

public abstract class Piece {

	public String color;
	public int power;
	public int id;
	
	public int row;
	public int col;

	public String signature;
	
	public Piece(String color, String signature, int row, int col) {
		
		this.color 	= color;
		this.row 	= row;
		this.col 	= col;
		this.signature = signature;
	}
	
	public Piece(String color) {
		
		this.color 	= color;
		this.row 	= 0;
		this.col 	= 0;
	}	
	
	
	public String getSignature() {
		
		return (this.color == PieceColor.WHITE) 
				? ("w" + this.signature)
			    : ("b" + this.signature);
	}
	
	public abstract boolean isMoveActionValid(int row, int col);
	
	public void move(int row, int col) {
		
		if(isMoveActionValid(row, col)) {
			
			this.row = row;
			this.col = col;
		}
	}
	
	
	public abstract void attack(int row, int col);
}