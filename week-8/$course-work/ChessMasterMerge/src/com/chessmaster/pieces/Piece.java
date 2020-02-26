package com.chessmaster.pieces;

import java.security.InvalidParameterException;

import com.chessmaster.config.PieceColor;

public abstract class Piece {
	
	// example
	// private int errorCode; 
	// private String errorMessage;
	
	
	
	// protected String color;
	protected PieceColor color;
	protected int power;
	protected int id;
	
	protected int row;
	protected int col;

	protected String signature;
	
	public Piece(PieceColor color, String signature, int row, int col) throws Exception {
		
		this.color = color;
		
//		if(color.equals(PieceColor.BLACK) || color.equals(PieceColor.WHITE)) {
//			this.color 	= color;	
//		}
//		else if(color.equals(PieceColor.RED)) {
//			throw new InvalidParameterException("Invalid argument red");
//		}
//		else {
//			// this.errorCode = 10;
//			// this.errorMessage = "Invalid color";
//			throw new Exception("General exception I have no idea"); 
//		}
		
		this.row 	= row;
		this.col 	= col;
		this.signature = signature;
	}
	
	public Piece(String color) {
		
		this.color 	= color;
		this.row 	= 0;
		this.col 	= 0;
	}
	
    public void setRow(int row) {
		
		if(row >= 0 && row <= 9) {
			this.row = row;
		}
	}
	
	public int getRow() {
		return this.row;
	}
	
	public void setCol(int col) {
		
		if(col >= 0 && col <= 9) {
			this.col = col;
		}
	}	

	
	public int getCol() {
		return this.col;
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