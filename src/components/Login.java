package components;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JSplitPane;
import javax.swing.JTextField;


public class Login {
	private static JTextField txtAbout;    // Your class name
	private static JTextField txtSignIn;

  public static void main(String[] args) {
     
     JFrame f = new JFrame("A JFrame");
     f.setSize(250, 250);
     f.setLocation(300,200);
     f.getContentPane().add(BorderLayout.CENTER, new JTextArea(10, 40));
     
     JSplitPane splitPane = new JSplitPane();
     f.getContentPane().add(splitPane, BorderLayout.WEST);
     
     txtAbout = new JTextField();
     txtAbout.setText("ABOUT");
     splitPane.setLeftComponent(txtAbout);
     txtAbout.setColumns(10);
     
     txtSignIn = new JTextField();
     txtSignIn.setText("Sign In");
     splitPane.setRightComponent(txtSignIn);
     txtSignIn.setColumns(10);
     f.setVisible(true);
     
   }
}
