import javax.swing.JOptionPane;

public class RollerCoaster {
	public static void main(String[] args) {

		String height = JOptionPane.showInputDialog("How tall are you in inches?");
		int h = Integer.parseInt(height);
		if (h > 48) {
			JOptionPane.showMessageDialog(null, "Get on the rollercoaster,NOW!");
		} else {
			JOptionPane.showMessageDialog(null, "ur not allowed, get out");
		}

	}
}
