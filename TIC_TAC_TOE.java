/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tic.tac.toe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author KIIT
 */
public class TIC_TAC_TOE extends javax.swing.JFrame {
    
    private int xcount=0;
    private int ocount=0;
    private String startGame="X";
    
    
    
    /**
     * Creates new form TIC_TAC_TOE
     */
    public TIC_TAC_TOE() {
        initComponents();
        b1.setBackground(color.WHITE);
        b2.setBackground(color.WHITE);
        b3.setBackground(color.WHITE);
        b4.setBackground(color.WHITE);
        b5.setBackground(color.WHITE);
        b6.setBackground(color.WHITE);
        b7.setBackground(color.WHITE);
        b8.setBackground(color.WHITE);
        b9.setBackground(color.WHITE);
    }
    private void reset()
    {
        b1.setText(null);
        b2.setText(null);
        b3.setText(null);
        b4.setText(null);
        b5.setText(null);
        b6.setText(null);
        b7.setText(null);
        b8.setText(null);
        b9.setText(null);
        b1.setBackground(color.WHITE);
        b2.setBackground(color.WHITE);
        b3.setBackground(color.WHITE);
        b4.setBackground(color.WHITE);
        b5.setBackground(color.WHITE);
        b6.setBackground(color.WHITE);
        b7.setBackground(color.WHITE);
        b8.setBackground(color.WHITE);
        b9.setBackground(color.WHITE);
        
    }
            
    private void gameScore()
    {
        playerx.setText(String.valueOf(xcount));
        playero.setText(String.valueOf(ocount));
    }
    
    private void winingGame()
    {
        String bb1=b1.getText();
        String bb2=b2.getText();
        String bb3=b3.getText();
        String bb4=b4.getText();
        String bb5=b5.getText();
        String bb6=b6.getText();
        String bb7=b7.getText();
        String bb8=b8.getText();
        String bb9=b9.getText();
        
//        player x
        if(("X".equals(bb1)) && ("X".equals(bb2)) && ("X".equals(bb3)))
        {
            b1.setBackground(Color.ORANGE);
            b2.setBackground(Color.ORANGE);
            b3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            reset();
            
        }
        if(("X".equals(bb1)) && ("X".equals(bb5)) && ("X".equals(bb9)))
        {
            b1.setBackground(Color.ORANGE);
            b5.setBackground(Color.ORANGE);
            b9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            reset();
            
        }
        if(("X".equals(bb1)) && ("X".equals(bb4)) && ("X".equals(bb7)))
        {
            b1.setBackground(Color.ORANGE);
            b4.setBackground(Color.ORANGE);
            b7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            reset();
            
        }
        if(("X".equals(bb2)) && ("X".equals(bb5)) && ("X".equals(bb8)))
        {
            b2.setBackground(Color.ORANGE);
            b5.setBackground(Color.ORANGE);
            b7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            reset();
            
        }
        if(("X".equals(bb3)) && ("X".equals(bb6)) && ("X".equals(bb9)))
        {
            b3.setBackground(Color.ORANGE);
            b6.setBackground(Color.ORANGE);
            b9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            reset();
        }
        if(("X".equals(bb4)) && ("X".equals(bb6)) && ("X".equals(bb5)))
        {
            b4.setBackground(Color.ORANGE);
            b6.setBackground(Color.ORANGE);
            b5.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            reset();
        }
        if(("X".equals(bb3)) && ("X".equals(bb5)) && ("X".equals(bb7)))
        {
            b5.setBackground(Color.ORANGE);
            b7.setBackground(Color.ORANGE);
            b3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            reset();
        }
        if(("X".equals(bb7)) && ("X".equals(bb8)) && ("X".equals(bb9)))
        {
            b7.setBackground(Color.ORANGE);
            b8.setBackground(Color.ORANGE);
            b9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player X Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xcount++;
            gameScore();
            reset();
        }
        //player o
        if(("O".equals(bb1)) && ("O".equals(bb2)) && ("O".equals(bb3)))
        {
            b1.setBackground(Color.ORANGE);
            b2.setBackground(Color.ORANGE);
            b3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            reset();
        }
        if(("O".equals(bb1)) && ("O".equals(bb5)) && ("O".equals(bb9)))
        {
            b1.setBackground(Color.ORANGE);
            b5.setBackground(Color.ORANGE);
            b9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            reset();
        }
        if(("O".equals(bb4)) && ("O".equals(bb5)) && ("O".equals(bb6)))
        {
            b4.setBackground(Color.ORANGE);
            b5.setBackground(Color.ORANGE);
            b6.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            reset();
        }
        if(("O".equals(bb1)) && ("O".equals(bb4)) && ("O".equals(bb7)))
        {
            b1.setBackground(Color.ORANGE);
            b4.setBackground(Color.ORANGE);
            b7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            reset();
        }
        if(("O".equals(bb2)) && ("O".equals(bb5)) && ("O".equals(bb8)))
        {
            b2.setBackground(Color.ORANGE);
            b5.setBackground(Color.ORANGE);
            b7.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            reset();
        }
        if(("O".equals(bb3)) && ("O".equals(bb6)) && ("O".equals(bb9)))
        {
            b3.setBackground(Color.ORANGE);
            b6.setBackground(Color.ORANGE);
            b9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            reset();
        }
        if(("O".equals(bb3)) && ("O".equals(bb5)) && ("O".equals(bb7)))
        {
            b5.setBackground(Color.ORANGE);
            b7.setBackground(Color.ORANGE);
            b3.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            reset();
        }
        if(("O".equals(bb7)) && ("O".equals(bb8)) && ("O".equals(bb9)))
        {
            b7.setBackground(Color.ORANGE);
            b8.setBackground(Color.ORANGE);
            b9.setBackground(Color.ORANGE);
            JOptionPane.showMessageDialog(this,"Player O Wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            ocount++;
            gameScore();
            reset();
        }
        
        
        
        
        
    }
    private void choose_a_player()
    {
        if(startGame.equalsIgnoreCase("x"))
        {
            startGame="O";
        }
        else
        {
            startGame="X";
        }
        winingGame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        button01 = new javax.swing.JPanel();
        b3 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerx = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        jPanel5.setBackground(new java.awt.Color(204, 255, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 346, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
        );

        jButton2.setText("jButton1");
        jButton2.setMaximumSize(new java.awt.Dimension(30, 40));

        jButton6.setText("jButton1");
        jButton6.setMaximumSize(new java.awt.Dimension(30, 40));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton9.setText("jButton1");
        jButton9.setMaximumSize(new java.awt.Dimension(30, 40));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(204, 255, 204));

        jPanel6.setBackground(new java.awt.Color(204, 255, 204));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("TIC TAC TOE");

        jLabel2.setFont(new java.awt.Font("Swis721 Blk BT", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TIC TAC TOE");
        jLabel2.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        button01.setBackground(new java.awt.Color(153, 255, 153));
        button01.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        b3.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b3.setMaximumSize(new java.awt.Dimension(30, 40));
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b1.setMaximumSize(new java.awt.Dimension(30, 40));
        b1.setMinimumSize(new java.awt.Dimension(30, 40));
        b1.setPreferredSize(new java.awt.Dimension(30, 40));
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b2.setMaximumSize(new java.awt.Dimension(30, 40));
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b4.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b4.setMaximumSize(new java.awt.Dimension(30, 40));
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b5.setMaximumSize(new java.awt.Dimension(30, 40));
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b6.setMaximumSize(new java.awt.Dimension(30, 40));
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b7.setMaximumSize(new java.awt.Dimension(30, 40));
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b8.setMaximumSize(new java.awt.Dimension(30, 40));
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setFont(new java.awt.Font("Tahoma", 1, 70)); // NOI18N
        b9.setMaximumSize(new java.awt.Dimension(30, 40));
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout button01Layout = new javax.swing.GroupLayout(button01);
        button01.setLayout(button01Layout);
        button01Layout.setHorizontalGroup(
            button01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button01Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(button01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b7, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(b4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22)
                .addGroup(button01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(button01Layout.createSequentialGroup()
                        .addGroup(button01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b5, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(button01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(b6, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(button01Layout.createSequentialGroup()
                        .addComponent(b8, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        button01Layout.setVerticalGroup(
            button01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(button01Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(button01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(b3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(button01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(button01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
        );

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reset.setBackground(new java.awt.Color(0, 255, 102));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(0, 255, 102));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel1.setText("Player X: ");

        playero.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        playero.setText("xxxxxxxx");

        playerx.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        playerx.setText("xxxxxxxx");

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        jLabel5.setText("Player O:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button01, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        // TODO add your handling code here:
        b3.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            b3.setForeground(color.RED);
        }
        else
        {
            b3.setForeground(color.MAGENTA);
        }
        choose_a_player();
    }//GEN-LAST:event_b3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        // TODO add your handling code here:
        
        b1.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            b1.setForeground(color.RED);
        }
        else
        {
            b1.setForeground(color.MAGENTA);
        }
        choose_a_player();
        
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        // TODO add your handling code here:
        b2.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            b2.setForeground(color.RED);
        }
        else
        {
            b2.setForeground(color.MAGENTA);
        }
        choose_a_player();
    }//GEN-LAST:event_b2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        // TODO add your handling code here:
        b4.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            b4.setForeground(color.RED);
        }
        else
        {
            b4.setForeground(color.MAGENTA);
        }
        choose_a_player();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        // TODO add your handling code here:
        b5.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            b5.setForeground(color.RED);
        }
        else
        {
            b5.setForeground(color.MAGENTA);
        }
        choose_a_player();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        // TODO add your handling code here:
        b6.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            b6.setForeground(color.RED);
        }
        else
        {
            b6.setForeground(color.MAGENTA);
        }
        choose_a_player();
    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        // TODO add your handling code here:
        b7.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            b7.setForeground(color.RED);
        }
        else
        {
            b7.setForeground(color.MAGENTA);
        }
        choose_a_player();
    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        // TODO add your handling code here:
        b8.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            b8.setForeground(color.RED);
        }
        else
        {
            b8.setForeground(color.MAGENTA);
        }
        choose_a_player();
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        // TODO add your handling code here:
        b9.setText(startGame);
        if(startGame.equalsIgnoreCase("x"))
        {
            b9.setForeground(color.RED);
        }
        else
        {
            b9.setForeground(color.MAGENTA);
        }
        choose_a_player();
    }//GEN-LAST:event_b9ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        JFrame frame= new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame," Confirm if you want to Exit","Tic Tac Toe",JOptionPane.YES_NO_CANCEL_OPTION)!= JOptionPane.YES_NO_CANCEL_OPTION ){
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        b1.setText(null);
        b2.setText(null);
        b3.setText(null);
        b4.setText(null);
        b5.setText(null);
        b6.setText(null);
        b7.setText(null);
        b8.setText(null);
        b9.setText(null);
        playerx.setText("xxxxxx");
        playero.setText("xxxxxx");
        b1.setBackground(color.WHITE);
        b2.setBackground(color.WHITE);
        b3.setBackground(color.WHITE);
        b4.setBackground(color.WHITE);
        b5.setBackground(color.WHITE);
        b6.setBackground(color.WHITE);
        b7.setBackground(color.WHITE);
        b8.setBackground(color.WHITE);
        b9.setBackground(color.WHITE);
        
        
        
    }//GEN-LAST:event_resetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JPanel button01;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerx;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}
