import javax.swing.*;

public class Hellojava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, Java!");
        JLabel label = new JLabel("Hello, Java!", JLabel.CENTER);
        frame.add(label);
        frame.setSize(500,500);
        frame.setVisible(true);
        //System.out.println("Hello Java");
    }
}