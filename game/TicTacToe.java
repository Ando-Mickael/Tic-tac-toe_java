package game;

import display.Case;
import display.Config;
import display.Plateau;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TicTacToe extends JFrame {

	Plateau plateau;
	Config config;
	Case[] tabCase;
	String J1, J2;
	int turn;
	boolean gameOver;

	public TicTacToe(String J1, String J2) {
		this.J1 = J1;
		this.J2 = J2;

		plateau = new Plateau(this);
		config = new Config(this.J1, this.J2);
		tabCase = plateau.getTabCase();
		turn = 0;
		gameOver = false;

		initUI();
		addAllComponent();
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}

	public Case[] getTabCase() {
		return tabCase;
	}

	public void setTabCase(Case[] tabCase) {
		this.tabCase = tabCase;
	}

	public String getJ1() {
		return J1;
	}

	public void setJ1(String J1) {
		this.J1 = J1;
	}

	public String getJ2() {
		return J2;
	}

	public void setJ2(String J2) {
		this.J2 = J2;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public boolean isGameOver() {
		return gameOver;
	}

	public void setGameOver(boolean gameOver) {
		this.gameOver = gameOver;
	}

	private void initUI() {
		setTitle("Tic Tac Toe");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(500, 700);
		setLayout(new BorderLayout());
	}

	private void addAllComponent() {
		add(plateau, BorderLayout.CENTER);
		add(config, BorderLayout.SOUTH);
	}

	public void verifGameOver() {

		if ((tabCase[0].getText().equals(tabCase[2].getText()) && tabCase[1].getText().equals(tabCase[2].getText()))
				&& !tabCase[2].getText().equals("")
				|| (tabCase[3].getText().equals(tabCase[5].getText())
						&& tabCase[4].getText().equals(tabCase[5].getText())) && !tabCase[5].getText().equals("")
				|| (tabCase[6].getText().equals(tabCase[8].getText())
						&& tabCase[7].getText().equals(tabCase[8].getText())) && !tabCase[8].getText().equals("")
				|| (tabCase[0].getText().equals(tabCase[6].getText())
						&& tabCase[3].getText().equals(tabCase[6].getText())) && !tabCase[6].getText().equals("")
				|| (tabCase[1].getText().equals(tabCase[7].getText())
						&& tabCase[4].getText().equals(tabCase[7].getText())) && !tabCase[7].getText().equals("")
				|| (tabCase[2].getText().equals(tabCase[8].getText())
						&& tabCase[5].getText().equals(tabCase[8].getText())) && !tabCase[8].getText().equals("")
				|| (tabCase[0].getText().equals(tabCase[8].getText())
						&& tabCase[4].getText().equals(tabCase[8].getText())) && !tabCase[8].getText().equals("")
				|| (tabCase[2].getText().equals(tabCase[6].getText())
						&& tabCase[4].getText().equals(tabCase[6].getText())) && !tabCase[6].getText().equals("")) {

			disableAllCase();

			String str = "Victoire de ";
			if (turn % 2 != 0) {
				str += J1;
			} else {
				str += J2;
			}
			JOptionPane.showMessageDialog(this, str);

			gameOver = true;
		}

		if (turn == 9) {
			JOptionPane.showMessageDialog(this, "Match nul");
			gameOver = true;
		}

	}

	private void disableAllCase() {
		for (int i = 0; i < tabCase.length; i++) {
			tabCase[i].setEnabled(false);
		}
	}

	public void changeTurn() {
		turn++;
	}

	public void play() {
		setVisible(true);
	}

}
