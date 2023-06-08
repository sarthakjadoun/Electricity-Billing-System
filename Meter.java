import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


class Meter extends JFrame{
    Meter()
    {

        setLayout(new BorderLayout());       
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
 
        JLabel heading = new JLabel("Meter Details");
        heading.setFont(new Font("Times New Roman", Font.BOLD, 40));
        jp1.add(heading);

        jp2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel l1 = new JLabel("METER NO:");
        l1.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 15));
        gbc.gridx=0;
        gbc.gridy=0;
        jp2.add(l1,gbc);

        JTextField d1 = new JTextField(15);
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=50;
        gbc.gridheight = 20;

        jp2.add(d1,gbc);

        JLabel l2 = new JLabel("ADDRESS:                       ");
        l2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 15));
        gbc.gridx=0;
        gbc.gridy=40;
        
        jp2.add(l2,gbc);
        
        JTextField d2 = new JTextField(15);
        gbc.gridx=0;
        gbc.gridy=60;
        gbc.gridwidth=50;
        gbc.gridheight = 20;
        jp2.add(d2,gbc);


        JLabel l3 = new JLabel("ZONE:                               ");
        l3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 15));
        gbc.gridx=0;
        gbc.gridy=90;
        
        jp2.add(l3,gbc);
        
        JTextField d3 = new JTextField(15);
        gbc.gridx=0;
        gbc.gridy=120;
        gbc.gridwidth=50;
        gbc.gridheight = 20;
        jp2.add(d3,gbc);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("meter.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image, "West");
        

        JButton b1 = new JButton("PREVIOUS");
      
        gbc.gridx=0;
        gbc.gridy=100;
        gbc.gridwidth=50;
        gbc.gridheight = 20;

        JButton b2 = new JButton("PROCEED");
        gbc.gridx=60;
        gbc.gridy=100;
        gbc.gridwidth=50;
        gbc.gridheight = 20;

        jp1.setLayout(new FlowLayout());
        
        jp3.add(b1);
        jp3.add(b2);
      

        add(jp1,BorderLayout.NORTH);
        add(jp2,BorderLayout.CENTER );
        add(jp3,BorderLayout.SOUTH);

        setSize(500,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String args[]){
        new Meter();
    }
   
}