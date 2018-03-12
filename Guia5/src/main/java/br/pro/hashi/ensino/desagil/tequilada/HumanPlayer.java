package br.pro.hashi.ensino.desagil.tequilada;

public class HumanPlayer extends Player {
	private int row;
	private int col;

	public HumanPlayer(int row, int col) {
		super(row, col);
	}

	public void move(int rowShift, int colShift) {
		row += rowShift;
		col += colShift;
	}

	public int getRow() {
		return row;
	}
	public int getCol() {
		return col;
	}

}
