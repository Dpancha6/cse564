package com.mycompany.assign3;
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author dpancha6
 */
public class Ass3 extends javax.swing.JFrame {
    public static HashMap<Integer, ArrayList<Integer>> hash;
    public Ass3() {
        initComponents();
    }
    private void initComponents() {
        load = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        canvas1 = new java.awt.Canvas();
        panel1 = new javax.swing.JPanel();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        load.setText("Load File");
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });
        getContentPane().add(load, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 6, -1, -1));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 41, 388, 44));
        jLabel1.setText("Path");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, -1, -1));
        jLabel2.setText("Distance");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 54, -1, -1));
        t1.setEnabled(false);
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        getContentPane().add(t1, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 51, 71, -1));
        getContentPane().add(canvas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, -1, -1));
        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 416, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(287, 130, -1, 356));
        pack();
    }
    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
                            System.out.println("Loading file...");
                            JFileChooser chooser = new JFileChooser();
                            chooser.showOpenDialog(null);
                            File inputFile = chooser.getSelectedFile();
                            System.out.println("File: "+inputFile.getAbsolutePath());
                            try {
                                 hash = new HashMap<>();
                                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                                String line = reader.readLine();
                                for (int i=0;i<7;i++) {
                                    line = reader.readLine();
                                }
                                while (line != null) {
                                    // read next line
                                    String arr[] = line.trim().split(" ");
                                    //System.out.println(arr[0].toString());
                                    if (arr[0].equals("EOF")) {
                                        break;
                                    }
                                    ArrayList<Integer> a = new ArrayList<>();
                                    a.add((int)Double.parseDouble(arr[1]));
                                    a.add((int)Double.parseDouble(arr[2]));
                                    hash.put((int)Double.parseDouble(arr[0]),a);
                                    line = reader.readLine();
                                }
                            }
                            catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                         DrawCanva fr = new DrawCanva();
    }
    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
     }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ass3().setVisible(true);
            }
        });
    }
//GEN-BEGIN:variables
    private java.awt.Canvas canvas1;
    private javax.swing.JButton load;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panel1;
    private javax.swing.JTextField t1;
}
