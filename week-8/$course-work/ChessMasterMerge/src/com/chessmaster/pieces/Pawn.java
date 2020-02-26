package com.chessmaster.pieces;

import com.chessmaster.config.PieceColor;

public class Pawn extends Piece {

	public Pawn(PieceColor color, int row, int col) throws Exception {
		
		super(color, "P", row, col);
		this.power  = 1;
		this.id 	= 1;
	}
	
	public boolean isMoveActionValid(int moveRow, int moveCol) {
		
		int moveRowCoeficient = this.row - moveRow;
		int moveColCoeficient = this.col - moveCol;
		
		boolean isMoveActionValidRegardingTheRow = (moveRowCoeficient == 1);
		boolean isMoveActionValidRegardingTheCol = (moveColCoeficient == 0);
		
		return isMoveActionValidRegardingTheRow &&
			   isMoveActionValidRegardingTheCol;
	}
	
	public void move(int row, int col) {
		
		if(isMoveActionValid(row, col)) {
			
			this.row = row;
			this.col = col;
		}
	}
	
	public void attack() {
		
	}
	
	public void render() {
		
	}

	@Override
	public void attack(int row, int col) {
		// TODO Auto-generated method stub
		
	}
}
