/* --------Calculator using Java awt(Abstract Window Toolkit------- */

import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
class VenkyComponents extends Frame{
    VenkyComponents(){
        setTitle("Venky calculator ");
        setSize(300,425);
        setVisible(true);
        setLayout(null);

        TextField t1 = new TextField();
        t1.setBounds(25,28,250,35);
        t1.setFont(new Font("Serif",Font.PLAIN,22));
        add(t1);
        TextField t2 = new TextField();
        t2.setBounds(25,63,250,35);
        t2.setFont(new Font("Serif",Font.PLAIN+Font.BOLD,26));
        add(t2);
        Button b1 = new Button("7");
        b1.setBounds(25,100,50,50);
        b1.setBackground(Color.gray);
        b1.setForeground(Color.white);
        add(b1);
        Button b2 = new Button("8");
        b2.setBounds(75,100,50,50);
        b2.setBackground(Color.gray);
        b2.setForeground(Color.white);
        add(b2);
        Button b3 = new Button("9");
        b3.setBounds(125,100,50,50);
        b3.setBackground(Color.gray);
        b3.setForeground(Color.white);
        add(b3);
        Button b4 = new Button("DEL");
        b4.setBackground(Color.orange);
        b4.setBounds(175,100,50,50);
        add(b4);
        Button b5 = new Button("AC");
        b5.setBackground(Color.orange);
        b5.setBounds(225,100,50,50);
        add(b5);
        Button b6 = new Button("4");
        b6.setBackground(Color.gray);
        b6.setForeground(Color.white);
        add(b6);
        b6.setBounds(25,150,50,50);
        Button b7 = new Button("5");
        b7.setBounds(75,150,50,50);
        b7.setBackground(Color.gray);
        b7.setForeground(Color.white);
        add(b7);
        Button b8 = new Button("6");
        b8.setBounds(125,150,50,50);
        b8.setBackground(Color.gray);
        b8.setForeground(Color.white);
        add(b8);
        Button b9 = new Button("X");
        b9.setBounds(175,150,50,50);
        b9.setBackground(Color.gray);
        b9.setForeground(Color.white);
        add(b9);
        Button b10 = new Button("÷");
        b10.setBounds(225,150,50,50);
        b10.setBackground(Color.gray);
        b10.setForeground(Color.white);
        add(b10);
        Button b11 = new Button("1");
        b11.setBounds(25,200,50,50);
        b11.setBackground(Color.gray);
        b11.setForeground(Color.white);
        add(b11);
        Button b12 = new Button("2");
        b12.setBounds(75,200,50,50);
        b12.setBackground(Color.gray);
        b12.setForeground(Color.white);
        add(b12);
        Button b13 = new Button("3");
        b13.setBounds(125,200,50,50);
        b13.setBackground(Color.gray);
        b13.setForeground(Color.white);
        add(b13);
        Button b14 = new Button("+");
        b14.setBounds(175,200,50,50);
        b14.setBackground(Color.gray);
        b14.setForeground(Color.white);
        add(b14);
        Button b15 = new Button("-");
        b15.setBounds(225,200,50,50);
        b15.setBackground(Color.gray);
        b15.setForeground(Color.white);
        add(b15);
        Button b16 = new Button(".");
        b16.setBounds(25,250,50,50);
        b16.setBackground(Color.gray);
        b16.setForeground(Color.white);
        add(b16);
        Button b17 = new Button("0");
        b17.setBounds(75,250,50,50);
        b17.setBackground(Color.gray);
        b17.setForeground(Color.white);
        add(b17);
        Button b18 = new Button("10");
        b18.setBounds(125,250,50,50);
        b18.setBackground(Color.gray);
        b18.setForeground(Color.white);
        add(b18);
        Button b19 = new Button("=");
        b19.setBounds(175,250,100,50);
        b19.setBackground(Color.gray);
        b19.setForeground(Color.white);
        add(b19);
        Button b20 = new Button("x!");
        b20.setBounds(25,300,50,50);
        b20.setBackground(Color.gray);
        b20.setForeground(Color.white);
        add(b20);
        Button b21 = new Button("√x");
        b21.setBounds(75,300,50,50);
        b21.setBackground(Color.gray);
        b21.setForeground(Color.white);
        add(b21);
        Button b22 = new Button("x²");
        b22.setBounds(125,300,50,50);
        b22.setBackground(Color.gray);
        b22.setForeground(Color.white);
        add(b22);
        Button b23 = new Button("log");
        b23.setBounds(175,300,50,50);
        b23.setBackground(Color.gray);
        b23.setForeground(Color.white);
        add(b23);
        Button b24 = new Button("ln");
        b24.setBounds(225,300,50,50);
        b24.setBackground(Color.gray);
        b24.setForeground(Color.white);
        add(b24);
        Button b25 = new Button("sin");
        b25.setBounds(25,350,50,50);
        b25.setBackground(Color.gray);
        b25.setForeground(Color.white);
        add(b25);
        Button b26 = new Button("cos");
        b26.setBounds(75,350,50,50);
        b26.setBackground(Color.gray);
        b26.setForeground(Color.white);
        add(b26);
        Button b27 = new Button("tan");
        b27.setBounds(125,350,50,50);
        b27.setBackground(Color.gray);
        b27.setForeground(Color.white);
        add(b27);
        Button b28 = new Button("Sin-1");
        b28.setBounds(175,350,50,50);
        b28.setBackground(Color.gray);
        b28.setForeground(Color.white);
        add(b28);
        Button b29 = new Button("cos-1");
        b29.setBounds(225,350,50,50);
        b29.setBackground(Color.gray);
        b29.setForeground(Color.white);
        add(b29);

        
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"7");
            }
        });
         b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"8");
            }
        });
         b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"9");
            }
        });
         b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"4");
            }
        });
         b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"5");
            }
        });
         b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"6");
            }
        });
         b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"X");
            }
        });
         b10.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"÷");
            }
        });
         b11.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"1");
            }
        });
         b12.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"2");
            }
        });
         b13.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"3");
            }
        });
         b14.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"+");
            }
        });
         b15.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"-");
            }
        });
         b16.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+".");
            }
        }); b17.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"0");
            }
        });
         b18.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText(t1.getText()+"10");
            }
        });
         b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                t1.setText("");
                t2.setText("");
            }
        });
         b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

              t1.setText(t1.getText().substring(0,t1.getText().length()-1));
            }
        });
         b20.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

              String fact = t1.getText();
              int num = Integer.parseInt(fact);
             // System.out.println(num);
              int result = 1 ;
              while(num!=0){
                    result = result * num ;
                    num--;
              }
             // System.out.println(result);
             t1.setText(fact+"!");
             t2.setText(Integer.toString(result));

            }
        });
        b21.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

              String fact = t1.getText();
              double num = Double.parseDouble(fact);
             t2.setText(Double.toString(Math.sqrt(num)));

            }
        });
         b22.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

              String fact = t1.getText();
              int num = Integer.parseInt(fact);
             t2.setText(Integer.toString(num*num));

            }
        });
        b23.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

              String fact = t1.getText();
              double num = Double.parseDouble(fact);
              t1.setText("log10"+fact);
             t2.setText(Double.toString(Math.log10(num)));

            }
        });
         b24.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

              String fact = t1.getText();
              double num = Double.parseDouble(fact);
              t1.setText("loge"+fact);
             t2.setText(Double.toString(Math.log(num)));

            }
        });
        b25.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

              String fact = t1.getText();
              double num = Double.parseDouble(fact);
              t1.setText("sin("+fact+")");
             t2.setText(Double.toString(Math.sin(num)));

            }
        });
        b26.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

              String fact = t1.getText();
              double num = Double.parseDouble(fact);
              t1.setText("cos("+fact+")");
             t2.setText(Double.toString(Math.cos(num)));

            }
        });
        b27.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

              String fact = t1.getText();
              double num = Double.parseDouble(fact);
              t1.setText("tan("+fact+")");
             t2.setText(Double.toString(Math.tan(num)));

            }
        });
        b28.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

              String fact = t1.getText();
              double num = Double.parseDouble(fact);
              t1.setText("sin-1("+fact+")");
             t2.setText(Double.toString(Math.asin(num)));

            }
        });
        b29.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){

              String fact = t1.getText();
              double num = Double.parseDouble(fact);
              t1.setText("cos-1("+fact+")");
             t2.setText(Double.toString(Math.acos(num)));

            }
        });
        b19.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
            
              String s=t1.getText();
            //  System.out.println(s);
              String[] s1 = s.split("");
              int a = 0;
              String operator = "";
              for(int i=0;i<s1.length;i++){
                if(s1[i].equals("+")||s1[i].equals("-")||s1[i].equals("X")||s1[i].equals("÷")){
                    a = i;
                    operator = s1[i];
                    break;
                }
              }
             
            String left,right;
            left = s.substring(0,a);
            int ileft,iright;
            ileft = Integer.parseInt(left);
           // System.out.println(ileft);
            right = s.substring(a+1,s.length());
             iright = Integer.parseInt(right);
             //System.out.println(iright);
             String  b ;
             int c;
            if(operator.equals("+")){
                t2.setText(Integer.toString(ileft+iright));
            }
            else if(operator.equals("-")){
                t2.setText(Integer.toString(ileft-iright));
            }
            else if(operator.equals("X")){
                t2.setText(Integer.toString(ileft*iright));
            }
           else  if(operator.equals("÷")){
                t2.setText(Integer.toString(ileft/iright));
            }else{
                t2.setText("Syntax Error");
            }   
            }
        });
 addWindowListener(new WindowAdapter(){
        public void windowClosing(WindowEvent we){
            System.exit(0);
        }
      });
    }
}

class Calculator{
    public static void main(String args[]){
       VenkyComponents v = new VenkyComponents();
     
    }
}