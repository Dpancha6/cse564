package com.mycompany.assign3;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class DrawCanva extends JFrame {
    private final MyCanvas canvas = new MyCanvas();
    public DrawCanva() {
        setLayout(new BorderLayout());
        setSize(600, 600);
        setTitle("Canvas demo");
        add("Center", canvas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    private class MyCanvas extends Canvas {
        @Override

        public void paint(Graphics g) {
            Ass3 a = new Ass3();

            int max_x = 50000;
            int max_y = 130000;
            int scale_x = max_x/(400);
            int scale_y = max_y/(400);


            g.setColor(Color.black);
            HashMap<Integer, ArrayList<Integer>> hash1 = a.hash;
            Iterator<Map.Entry<Integer, ArrayList<Integer>>> iterator= hash1.entrySet().iterator();
            while(iterator.hasNext()){
                Map.Entry<Integer,ArrayList<Integer>> entry =iterator.next();
//                int max_key = Collections.max(Map.entrySet(), Map.Entry.comparingByValue()).getKey();
//                System.out.println(max_key);
                g.fillRect((int)(entry.getValue().get(1)/scale_y), (int)(entry.getValue().get(0)/scale_x), 1, 1);
            }
        }
    }
}