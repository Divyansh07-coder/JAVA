import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class gui2{
    public static void main(String[] args) {
        Myscreen screen = new Myscreen();
        screen.inIt();
    }

}
class Myscreen{
    private JFrame frame;
    private JLabel l1;
    private JButton b1,b2;
    public void inIt() {
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        l1 = new JLabel();
        l1.setText("ABVIC");
        b1 = new JButton("OK");
        b2 = new JButton("Cancel");
        b1.setBounds(100,50,100,60);
        b2.setBounds(200,50,100,60);
        frame.add(b1);
        frame.add(b2);
        frame.add(l1);
        frame.setVisible(true);
    }
}
