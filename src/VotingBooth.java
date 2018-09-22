import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {

		String age = JOptionPane.showInputDialog("Gimme ur age");
		int a = Integer.parseInt(age);
		if (a >= 18) {
			JOptionPane.showInputDialog("Who should the next President be?");
		} else {
			JOptionPane.showMessageDialog(null, "ew disgustang child!");

		}

	}
}