import javax.swing.JOptionPane;

public class Tugas_5_2 {

    public static void main(String[] args) {

        String word1 = JOptionPane.showInputDialog("Enter word1:");
        String word2 = JOptionPane.showInputDialog("Enter word2:");
        String word3 = JOptionPane.showInputDialog("Enter word3:");

        String msg = word1 + " " + word2 + " " + word3;

        JOptionPane.showMessageDialog(null, msg);
    }
}
