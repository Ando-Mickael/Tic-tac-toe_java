package display;

import game.TicTacToe;
import java.awt.GridLayout;
import javax.swing.JPanel;

public class Plateau extends JPanel {

    TicTacToe ttt;
    Case[] tabCase;

    public Plateau(TicTacToe ttt) {
        this.ttt = ttt;

        tabCase = new Case[9];

        initUI();
        addTabCase();
    }

    public TicTacToe getTtt() {
        return ttt;
    }

    public void setTtt(TicTacToe ttt) {
        this.ttt = ttt;
    }

    public Case[] getTabCase() {
        return tabCase;
    }

    public void setTabCase(Case[] tabCase) {
        this.tabCase = tabCase;
    }

    private void initUI() {
        setSize(500, 500);
        setLayout(new GridLayout(3, 3));
    }

    private void addTabCase() {
        for (int i = 0; i < tabCase.length; i++) {
            tabCase[i] = new Case(ttt);
            add(tabCase[i]);
        }
    }

}
