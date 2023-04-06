package display;

import game.TicTacToe;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Case extends JButton implements ActionListener {

	TicTacToe ttt;

	public Case(TicTacToe ttt) {
		this.ttt = ttt;
		initUI();
		addActionListener(this);
	}

	private void initUI() {
		setText("");
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		int turn = ttt.getTurn();
		if (turn % 2 == 0) {
			setText("X");
		} else {
			setText("O");
		}

		ttt.changeTurn();
		setEnabled(false);
		ttt.verifGameOver();

	}

}
