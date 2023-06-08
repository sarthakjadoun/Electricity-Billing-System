import java.awt.*;
import javax.swing.*;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


class GenerateBill extends JFrame{
    GenerateBill()
    {

        setLayout(new BorderLayout());       
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        Choice month;
 
        JLabel heading = new JLabel("Electricity Bill");
        heading.setFont(new Font("Times New Roman", Font.BOLD, 40));
        jp1.add(heading);

        jp2.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel l1 = new JLabel("UNIT:");
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

       JLabel l2 = new JLabel("MONTH:                          ");
        l2.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 15));
        gbc.gridx=0;
        gbc.gridy=40;
        
        jp2.add(l2,gbc);
        
        month = new Choice();
        month.add("NONE                                  ");
        month.add("January");
        month.add("February");
        month.add("March");
        month.add("April");
        month.add("May");
        month.add("June");
        month.add("July");
        month.add("August");
        month.add("September");
        month.add("October");
        month.add("November");
        month.add("December");
        gbc.gridx=0;
        gbc.gridy=60;
        gbc.gridwidth=80;
        gbc.gridheight = 20;
        jp2.add(month,gbc);


        JLabel l3 = new JLabel("AMOUNT(INR):               ");
        l3.setFont(new Font("Times New Roman", Font.CENTER_BASELINE, 15));
        gbc.gridx=0;
        gbc.gridy=80;
        jp2.add(l3,gbc);
        
        JTextArea d3 = new JTextArea( 0,15); 
        gbc.gridx=0;
        gbc.gridy=120;
        gbc.gridwidth=60;
        gbc.gridheight = 20;
        jp2.add(d3,gbc);
          

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("calculator.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image, "West");
        

        JButton b1 = new JButton("HOME");
        gbc.gridx=0;
        gbc.gridy=100;
        gbc.gridwidth=50;
        gbc.gridheight = 20;

        JButton b2 = new JButton("PAY BILL ");
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

        setSize(500,450);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       class PayBill{
         double Bill(int a) {
               int units = a;
                double bill = 0;  
              
                if(units < 150)  
                {  
                    bill = units * 5.50;  
                }  
                
                else if(units < 300){  
                    bill = 150 * 5.50+ (units - 150) * 6;  
                }  
                 
                else if(units > 300)  
                {  
                    bill =  150*5.50 + 150*6 + (units -300)*6.50;
                }  
        
               return bill;
            } 
        }
     
     }
    public static void main(String args[]){
        new GenerateBill();
    }
   
}