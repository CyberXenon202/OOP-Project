
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;


public class Calculator extends JFrame{

    Container cn;
    ImageIcon image;
    JLabel inputLabel1, inputLabel2, display;
    JTextField input1, input2;
    JButton plus, sub, mul, div;
    Font f, f1;

  
    // Constrctor
    Calculator(){
        materials();
    }

    // Materials method
    public void materials(){

        // Size of container
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(500, 100, 400, 550);
        setFont(f);
        setTitle("Calculator");

        setResizable(false);

        // Container Object
        cn=this.getContentPane();
        cn.setBackground(Color.lightGray);

        // Icon Object
        image= new ImageIcon(getClass().getResource("calculator.png"));
        this.setIconImage(image.getImage());

        // Font Object
        f= new Font("Italic", Font.BOLD, 18); // For JLabel
        f1= new Font("Italic", Font.BOLD, 28); // For Button

        // for Input Feild 1
        input1= new JTextField();
        input1.setBounds(70, 50, 70,30);
        input1.setHorizontalAlignment(JTextField.CENTER);
        input1.setToolTipText("Please enter input here!!!");
        cn.add(input1);

        // For JLabel 1
        inputLabel1= new JLabel();
        inputLabel1.setBounds(70, 80, 70, 30);
        inputLabel1.setText("Input 1");
        inputLabel1.setFont(f);
        inputLabel1.setOpaque(false);
        inputLabel1.setForeground(Color.BLACK);
        inputLabel1.setToolTipText("Please enter input here!!!");
        cn.add(inputLabel1);


        // for Input Feild 2
        input2= new JTextField();
        input2.setBounds(220, 50, 70,30);
        input2.setHorizontalAlignment(JTextField.CENTER);
        input2.setToolTipText("Please enter input here!!!");
        cn.add(input2);

        // For JLabel 2
        inputLabel2= new JLabel();
        inputLabel2.setBounds(220, 80, 70, 30);
        inputLabel2.setText("Input 2");
        inputLabel2.setFont(f);
        inputLabel2.setOpaque(false);
        inputLabel2.setForeground(Color.BLACK);
        inputLabel2.setToolTipText("Please enter input here!!!");
        cn.add(inputLabel2);

        // For Button
        plus= new JButton();
        plus.setBounds(100, 170, 50, 50);
        plus.setText("+");
        plus.setToolTipText("Click the button for Adding!");
        plus.setFont(f1);
        cn.add(plus);

        sub= new JButton();
        sub.setBounds(220, 170, 50, 50);
        sub.setText("-");
        sub.setToolTipText("Click the button for Subtraction!");
        sub.setFont(f1);
        cn.add(sub);
        
        mul= new JButton();
        mul.setBounds(100, 260, 50, 50);
        mul.setText("x");
        mul.setToolTipText("Click the button for Multiplication!");
        mul.setFont(f1);
        cn.add(mul);

        div= new JButton();
        div.setBounds(220, 260, 50, 50);
        div.setText("/");
        div.setToolTipText("Click the button for Division");
        div.setFont(f1);
        cn.add(div);

       
        // Output
        display= new JLabel();
        display.setBounds(100, 350, 200, 50);
        display.setFont(f1);
        display.setOpaque(true);
        display.setForeground(Color.BLACK);
        display.setBackground(Color.WHITE);
        display.setHorizontalAlignment(JLabel.CENTER);
        display.setToolTipText("Output");
        cn.add(display);
        
        

        // For Adding buttun click
        plus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                //Check all input are Digit or not
                String s1= input1.getText();
                int flag1=0;
                int count1=0;
                for(int i=0; i<s1.length(); i++){
                    if(s1.charAt(i)!='0' && s1.charAt(i)!='1' && s1.charAt(i)!='2' && s1.charAt(i)!='3'&& 
                    s1.charAt(i)!='4' &&s1.charAt(i)!='5' && s1.charAt(i)!='6' && s1.charAt(i)!='7' && 
                    s1.charAt(i)!='8'  && s1.charAt(i)!='9' && s1.charAt(i)!='.'){
                        flag1=-1;
                        break;
                    }
                    if(s1.charAt(i)=='.'){
                        count1++;
                    }
                }  
                       
                String s2= input2.getText();
                int flag2=0;
                int count2=0;
                for(int i=0; i<s2.length(); i++){
                    if(s2.charAt(i)!='0' && s2.charAt(i)!='1'&& s2.charAt(i)!='2' && s2.charAt(i)!='3' && 
                    s2.charAt(i)!='4' && s2.charAt(i)!='5' && s2.charAt(i)!='6' && s2.charAt(i)!='7' && 
                    s2.charAt(i)!='8'  && s2.charAt(i)!='9' && s2.charAt(i)!='.'){
                        flag2=-1;
                        break;
                    }
                    if(s2.charAt(i)=='.'){
                        count2++;
                    }
                }
                // If Digit then Working
                if(flag1==0 && flag2==0 && count1<=1 && count2<=1){
                    double n1= Double.parseDouble(s1);

                    Double n2= Double.parseDouble(s2);

                    double result= n1+n2;
                    String s3=String.valueOf(result);

                    display.setText("=  "+s3);    
                }
                else{
                    display.setText("Invalid Input!");
                }         
            }
        });

        // For subtraction buttun click
        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                //Check all input are Digit or not
                String s1= input1.getText();
                int flag1=0;
                int count1=0;
                for(int i=0; i<s1.length(); i++){
                    if(s1.charAt(i)!='0' && s1.charAt(i)!='1' && s1.charAt(i)!='2' && s1.charAt(i)!='3'&& 
                    s1.charAt(i)!='4' &&s1.charAt(i)!='5' && s1.charAt(i)!='6' && s1.charAt(i)!='7' && 
                    s1.charAt(i)!='8'  && s1.charAt(i)!='9' && s1.charAt(i)!='.'){
                        flag1=-1;
                        break;
                    }
                    if(s1.charAt(i)=='.'){
                        count1++;
                    }
                }  
                       
                String s2= input2.getText();
                int flag2=0;
                int count2=0;
                for(int i=0; i<s2.length(); i++){
                    if(s2.charAt(i)!='0' && s2.charAt(i)!='1'&& s2.charAt(i)!='2' && s2.charAt(i)!='3' && 
                    s2.charAt(i)!='4' && s2.charAt(i)!='5' && s2.charAt(i)!='6' && s2.charAt(i)!='7' && 
                    s2.charAt(i)!='8'  && s2.charAt(i)!='9' && s2.charAt(i)!='.'){
                        flag2=-1;
                        break;
                    }
                    if(s2.charAt(i)=='.'){
                        count2++;
                    }
                    
                }
                // If Digit then Working
                if(flag1==0 && flag2==0 && count1<=1 && count2<=1){
                    double n1= Double.parseDouble(s1);

                    Double n2= Double.parseDouble(s2);

                    double result= n1-n2;
                    String s3=String.valueOf(result);

                    display.setText("=  "+s3);    
                }
                else{
                    display.setText("Invalid Input!");
                }           
            }
        });

        // For Multiplication buttun click
        mul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                //Check all input are Digit or not
                String s1= input1.getText();
                int flag1=0;
                int count1=0;
                for(int i=0; i<s1.length(); i++){
                    if(s1.charAt(i)!='0' && s1.charAt(i)!='1' && s1.charAt(i)!='2' && s1.charAt(i)!='3'&& 
                    s1.charAt(i)!='4' &&s1.charAt(i)!='5' && s1.charAt(i)!='6' && s1.charAt(i)!='7' && 
                    s1.charAt(i)!='8'  && s1.charAt(i)!='9' && s1.charAt(i)!='.'){
                        flag1=-1;
                        break;
                    }
                    if(s1.charAt(i)=='.'){
                        count1++;
                    }
                }  

                String s2= input2.getText();
                int flag2=0;
                int count2=0;
                for(int i=0; i<s2.length(); i++){
                    if(s2.charAt(i)!='0' && s2.charAt(i)!='1'&& s2.charAt(i)!='2' && s2.charAt(i)!='3' && 
                    s2.charAt(i)!='4' && s2.charAt(i)!='5' && s2.charAt(i)!='6' && s2.charAt(i)!='7' && 
                    s2.charAt(i)!='8'  && s2.charAt(i)!='9' && s2.charAt(i)!='.'){
                        flag2=-1;
                        break;
                    }
                    if(s2.charAt(i)=='.'){
                        count2++;
                    }
                }
                // If Digit then Working
                if(flag1==0 && flag2==0 && count1<=1 && count2<=1){
                    double n1= Double.parseDouble(s1);

                    Double n2= Double.parseDouble(s2);

                    double result= n1*n2;
                    String s3=String.valueOf(result);

                    display.setText("=  "+s3);    
                }
                else{
                    display.setText("Invalid Input!");
                }
            }
        });
        
        // For Division buttun click
        div.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

                //Check all input are Digit or not
                String s1= input1.getText();
                int flag1=0;
                int count1=0;
                for(int i=0; i<s1.length(); i++){
                    if(s1.charAt(i)!='0' && s1.charAt(i)!='1' && s1.charAt(i)!='2' && s1.charAt(i)!='3'&& 
                    s1.charAt(i)!='4' &&s1.charAt(i)!='5' && s1.charAt(i)!='6' && s1.charAt(i)!='7' && 
                    s1.charAt(i)!='8'  && s1.charAt(i)!='9' && s1.charAt(i)!='.'){
                        flag1=-1;
                        break;
                    }
                    if(s1.charAt(i)=='.'){
                        count1++;
                    }
                }

                String s2= input2.getText();
                int flag2=0;
                int count2=0;
                for(int i=0; i<s2.length(); i++){
                    if(s2.charAt(i)!='0' && s2.charAt(i)!='1'&& s2.charAt(i)!='2' && s2.charAt(i)!='3' && 
                    s2.charAt(i)!='4' && s2.charAt(i)!='5' && s2.charAt(i)!='6' && s2.charAt(i)!='7' && 
                    s2.charAt(i)!='8'  && s2.charAt(i)!='9' && s2.charAt(i)!='.'){
                        flag2=-1;
                        break;
                    }
                    if(s2.charAt(i)=='.'){
                        count2++;
                    }
                }
                // If Digit then Working
                if(flag1==0 && flag2==0 && count1<=1 && count2<=1){
                    double n1= Double.parseDouble(s1);
                    Double n2= Double.parseDouble(s2);

                    // Check denominator is zero or not
                    if(n2==0.0){
                    display.setText("Invalid !!!");
                    }
                    else{
                        double result= n1/n2;
                        String s3=String.valueOf(result);
                        display.setText(s3);
                    }
                }
                else{
                    display.setText("Invalid Input!");
                }           
            }
        });

    }
    
    
    public static void main(String[] args) {
        Calculator cal= new Calculator();
        cal.setVisible(true);
    }

}