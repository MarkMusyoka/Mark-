import javax.swing.*,
import java.awt.*;
import java.awt.event.*;
import java.lang.Exception;
class CreateLoginForm extends JFrame implements ActionListener
{
JButton b1;
JPanel newPanel;
JLabel userLabel,passLabel;
final JTextField textField1,textField2;
CreateLoginForm()
userLabel=newJLabel();
userLabel.setText("Employee name");
textField1=new JTextField(15);
passLabel=new JLabel()
passLabel.setText("Password");
texField2=new JPasswordField(15);
b1=new JButton("SUBMIT")

