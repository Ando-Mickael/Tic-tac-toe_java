package display;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Config extends JPanel {

    String J1, J2;

    public Config(String J1, String J2) {
	this.J1 = J1;
	this.J2 = J2;

	initUI();
	addAllElement();
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

    private void initUI() {
	setSize(500, 200);
	setLayout(new GridLayout(2, 2));
    }

    private void addAllElement() {
	add(new JLabel(J1));
	add(new JLabel(J2));
	add(new JLabel("X"));
	add(new JLabel("O"));
    }

}
