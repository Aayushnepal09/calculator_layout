package examplePoly;

import java.awt.Color;

import java.awt.GridLayout;



import javax.swing.*;
import javax.swing.border.Border;



public class calcu {
    JFrame frame;
    JButton btn1,btn2,btn3,
            btn4,btn5,btn6,btn7,btn8,btn9,
            btndot,btnadd,btnsub,btnmul,btndiv,btnequal;
    JTextField txt;
    JPanel panel;
//    GridLayout layout(5,3);



    public calcu() {
        frame=new JFrame();
        frame.getContentPane().setBackground( Color.DARK_GRAY );
        panel=new JPanel();
        GridLayout layout = new GridLayout(5,3);
        layout.setHgap(5);
        layout.setVgap(5);

        panel.setLayout(layout);

        panel.setBounds(8,50,370,350);
        panel.setBackground(Color.black);



        frame.add(panel);

        txt=new JTextField();
        txt.setBounds(8,8,370,40);
        Border border = BorderFactory.createLineBorder(Color.GRAY, 5);
        txt.setBorder(border);
        frame.add(txt);




        btn1=new JButton("1");
        btn1.setBackground(Color.blue);
        btn1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));

        btn2=new JButton("2");
        btn2.setBackground(Color.blue);
        btn2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));

        btn3=new JButton("3");
        btn3.setBackground(Color.blue);
        btn3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));

        btn4=new JButton("4");
        btn4.setBackground(Color.blue);
        btn4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));

        btn5=new JButton("5");
        btn5.setBackground(Color.blue);
        btn5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));

        btn6=new JButton("6");
        btn6.setBackground(Color.blue);
        btn6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 4));

        btn7=new JButton("7");
        btn7.setBackground(Color.blue);
        btn7.setBorder(BorderFactory.createLineBorder(Color.WHITE,4));

        btn8=new JButton("8");
        btn8.setBackground(Color.blue);
        btn8.setBorder(BorderFactory.createLineBorder(Color.WHITE,4));

        btn9=new JButton("9");
        btn9.setBackground(Color.blue);
        btn9.setBorder(BorderFactory.createLineBorder(Color.WHITE,4));

        btndot=new JButton(".");
        btndot.setBackground(Color.blue);
        btndot.setBorder(BorderFactory.createLineBorder(Color.WHITE,4));

        btnadd=new JButton("+");
        btnadd.setBackground(Color.blue);
        btnadd.setBorder(BorderFactory.createLineBorder(Color.WHITE,4));

        btnsub=new JButton("-");
        btnsub.setBackground(Color.blue);
        btnsub.setBorder(BorderFactory.createLineBorder(Color.WHITE,4));

        btnmul=new JButton("*");
        btnmul.setBackground(Color.blue);
        btnmul.setBorder(BorderFactory.createLineBorder(Color.WHITE,4));

        btndiv=new JButton("/");
        btndiv.setBackground(Color.blue);
        btndiv.setBorder(BorderFactory.createLineBorder(Color.WHITE,4));

        btnequal=new JButton("=");
        btnequal.setBackground(Color.blue);
        btnequal.setBorder(BorderFactory.createLineBorder(Color.WHITE,4));




        panel.add(btn1);panel.add(btn2);panel.add(btn3);
        panel.add(btn4);panel.add(btn5);panel.add(btn6);
        panel.add(btn7);panel.add(btn8);panel.add(btn9);
        panel.add(btndot);panel.add(btnadd);panel.add(btnsub);
        panel.add(btnmul);panel.add(btndiv);panel.add(btnequal);

        frame.setSize(400,450);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new calcu();
    }



}







