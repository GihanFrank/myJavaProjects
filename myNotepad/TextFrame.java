import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class TextFrame extends JFrame {
public TextFrame() {
super("Text Frame");
buildGUI();
setDefaultCloseOperation(EXIT_ON_CLOSE);
pack();
setVisible(true);
}

private void buildGUI() {
JPanel top = new JPanel();
top.setLayout(new FlowLayout());
JTextField input = new JTextField(15);
JButton addb = new JButton("Add Text");
top.add(input);
top.add(addb);
top.setBorder(new TitledBorder(
new EtchedBorder(),
"Add Text"));

Container c = getContentPane();
c.add(top, BorderLayout.NORTH);
JTextArea display = new JTextArea(20, 30);
c.add(display, BorderLayout.CENTER);
JButton quit = new JButton("Quit");
c.add(quit, BorderLayout.SOUTH);

AddListener addl =
new AddListener(input, display);
QuitListener quitl =
new QuitListener();
addb.addActionListener(addl);
input.addActionListener(addl);
quit.addActionListener(quitl);
}

class AddListener implements ActionListener {
private JTextField in;
private JTextArea out;
AddListener(JTextField in, JTextArea out) {
this.in = in;
this.out = out;
}
public void actionPerformed(ActionEvent e) {
out.append(in.getText() + "\n");
}
}

class QuitListener implements ActionListener {
public void actionPerformed(ActionEvent e) {
System.exit(0);
}
}
public static void main(String[] args) {
TextFrame tf = new TextFrame();
}
}