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
newPanel=new Jpane(new GridLayout(3,1))
newPanel.add(userLabel);
newPanel.add(textfield1);
newPanel.add(passLabel);
newPanel.add(textField2);
newPanel.add(b1);
add(newPanel,BorderLayout.CENTER);
b1.addActionListener(this);
setTitle("LOGIN TO MZURI PAYROLL");
}
public void actionPerformed(ActionEvent ae)
{
  String userValue=textField1.getText();
  String passValue=textField2.getText();
if(userValue.equals("test1@gmal.com")&&passValue.equals("test")){
NewPage page=new NewPage();
  page.setVisible(true);
 JLabel wel_label=new JLabel("Welcome:"+userValue);
 page.getContentPane().add(wel_label);
}
  else{
    system.out.printlm("Please enter valid username and password")
    }
}
}
class LoginformDemo
{
  public static void main (String arg[])
  {
    try
    {
     createLoginForm form=new CreateLoginForm();
      form.setSizeVisible(true);
    }
    catch(Exception e)
    {
   JoptionPane.showMessageDialog(null,e.getMessage());
    }
  }
}

