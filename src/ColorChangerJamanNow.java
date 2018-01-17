import java.awt.Color;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class ColorChangerJamanNow extends javax.swing.JFrame {

    private int xPos, yPos;
    private int curR = 0, curG = 0, curB = 0;
    private volatile boolean userUsing = true;
    private final String saveFilename = "ABC.txt";
    private JLabel lblAbout;
    
    public ColorChangerJamanNow() {
        initComponents();
        this.setLocationRelativeTo(null);
        updatePreview();
        updateScrollBars();
        lblAbout = new JLabel(
            "<html>\n" +
            "  <head>\n" +
            "    <style type=\"text/css\">\n" +
            "      * {\n" +
            "        padding: 0;\n" +
            "        margin: 0;\n" +
            "        font-family: arial;\n" +
            "      }\n" +
            "      body {\n" +
            "        padding: 8px;\n" +
            "        font-size: 10px;\n" +
            "        color: black;\n" +
            "        background-color: white;\n" +
            "        width: 350px;\n" +
            "      }\n" +
            "      span {\n" +
            "        display: inline-block;\n" +
            "      }\n" +
            "    </style>\n" +
            "  </head>\n" +
            "  <body>\n" +
            "    <h1 style=\"text-align: center\">\n" +
            "      Color Changer \n" +
            "      <span style=\"color:rgb(255,102,102);\">Jaman</span>\n" +
            "      <span style=\"color:rgb(0,204,102);\">Now</span>\n" +
            "    </h1>\n" +
            "    <br/>\n" +
            "    <p style=\"text-align: justify\">\n" +
            "      Color Changer \n" +
            "      <span style=\"color:rgb(255,102,102);\">Jaman</span>\n" +
            "      <span style=\"color:rgb(0,204,102);\">Now</span>\n" +
            "      adalah sebuah aplikasi jenis \"Color Picker\" dimana kita bisa\n" +
            "      men-sampel warna dengan cara men-setting nilai RGB melalui JScrollBar yang disediakan.\n" +
            "      Aplikasi ini juga merupakan sebuah realisasi dari tugas yang\n" +
            "      diberikan oleh Pak Felix Valentine selaku dosen saya dalam mata kuliah \n" +
            "      \"Pengembangan Aplikasi\".\n" +
            "    </p>\n" +
            "    <br/>\n" +
            "    <br/>\n" +
            "    <p style=\"text-align:right; font-weight:bold;\">\n" +
            "      Dibuat oleh: Irvin Delano (03081170007) - 17IS1 - github(delanobgt)\n" +
            "    </p>\n" +
            "  </body>  \n" +
            "</html>"
        );
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlContent = new javax.swing.JPanel();
        pnlTitle = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        scrollRed = new javax.swing.JScrollBar();
        lblExecute = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        scrollGreen = new javax.swing.JScrollBar();
        scrollBlue = new javax.swing.JScrollBar();
        jLabel6 = new javax.swing.JLabel();
        radioSave = new javax.swing.JRadioButton();
        radioLoad = new javax.swing.JRadioButton();
        pnlPreview = new javax.swing.JPanel();
        lblRedText = new javax.swing.JLabel();
        lblBlueText = new javax.swing.JLabel();
        lblGreenText = new javax.swing.JLabel();
        lblGreenValue = new javax.swing.JLabel();
        lblRedValue = new javax.swing.JLabel();
        lblBlueValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setMaximumSize(new java.awt.Dimension(450, 350));
        setMinimumSize(new java.awt.Dimension(450, 350));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(450, 350));
        getContentPane().setLayout(null);

        pnlContent.setBackground(new java.awt.Color(255, 255, 255));
        pnlContent.setMaximumSize(new java.awt.Dimension(450, 350));
        pnlContent.setPreferredSize(new java.awt.Dimension(450, 350));
        pnlContent.setLayout(null);

        pnlTitle.setBackground(new java.awt.Color(0, 204, 204));
        pnlTitle.setMaximumSize(new java.awt.Dimension(450, 30));
        pnlTitle.setMinimumSize(new java.awt.Dimension(450, 30));
        pnlTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlTitleMouseDragged(evt);
            }
        });
        pnlTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlTitleMousePressed(evt);
            }
        });
        pnlTitle.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("<html>" +
            "Color Changer " +
            "<span style='color: rgb(230,102,102);'>Jaman</span>" +
            "<span style='color: rgb(0,160,102);'>Now</span>" +
            "</html>");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        pnlTitle.add(jLabel1);
        jLabel1.setBounds(0, 0, 280, 30);

        lblMinimize.setBackground(new java.awt.Color(0, 204, 204));
        lblMinimize.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblMinimize.setForeground(new java.awt.Color(255, 255, 255));
        lblMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimize.setText("-");
        lblMinimize.setOpaque(true);
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblMinimizeMouseReleased(evt);
            }
        });
        pnlTitle.add(lblMinimize);
        lblMinimize.setBounds(390, 0, 30, 30);

        lblClose.setBackground(new java.awt.Color(0, 204, 204));
        lblClose.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblClose.setForeground(new java.awt.Color(255, 255, 255));
        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setText("X");
        lblClose.setOpaque(true);
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblCloseMouseReleased(evt);
            }
        });
        pnlTitle.add(lblClose);
        lblClose.setBounds(420, 0, 30, 30);

        lblInfo.setBackground(new java.awt.Color(0, 204, 204));
        lblInfo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setText("?");
        lblInfo.setOpaque(true);
        lblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblInfoMouseReleased(evt);
            }
        });
        pnlTitle.add(lblInfo);
        lblInfo.setBounds(360, 0, 30, 30);

        pnlContent.add(pnlTitle);
        pnlTitle.setBounds(0, 0, 450, 30);

        scrollRed.setBackground(new java.awt.Color(255, 255, 255));
        scrollRed.setBlockIncrement(1);
        scrollRed.setForeground(new java.awt.Color(0, 204, 204));
        scrollRed.setMaximum(255);
        scrollRed.setValue(255);
        scrollRed.setVisibleAmount(0);
        scrollRed.setAlignmentX(0.0F);
        scrollRed.setAlignmentY(0.0F);
        scrollRed.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrollValueChanged(evt);
            }
        });
        pnlContent.add(scrollRed);
        scrollRed.setBounds(30, 70, 30, 170);

        lblExecute.setBackground(new java.awt.Color(0, 204, 204));
        lblExecute.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblExecute.setForeground(new java.awt.Color(255, 255, 255));
        lblExecute.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExecute.setText("Execute");
        lblExecute.setOpaque(true);
        lblExecute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblExecuteMouseReleased(evt);
            }
        });
        pnlContent.add(lblExecute);
        lblExecute.setBounds(115, 320, 105, 25);

        lblExit.setBackground(new java.awt.Color(255, 255, 255));
        lblExit.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblExit.setForeground(new java.awt.Color(0, 204, 204));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("Exit");
        lblExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204), 2));
        lblExit.setOpaque(true);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lblExitMouseReleased(evt);
            }
        });
        pnlContent.add(lblExit);
        lblExit.setBounds(5, 320, 105, 25);

        jLabel4.setBackground(new java.awt.Color(255, 102, 102));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("R");
        jLabel4.setOpaque(true);
        pnlContent.add(jLabel4);
        jLabel4.setBounds(30, 50, 30, 20);

        jLabel5.setBackground(new java.awt.Color(0, 204, 102));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("G");
        jLabel5.setOpaque(true);
        pnlContent.add(jLabel5);
        jLabel5.setBounds(100, 50, 30, 20);

        scrollGreen.setBackground(new java.awt.Color(255, 255, 255));
        scrollGreen.setBlockIncrement(1);
        scrollGreen.setForeground(new java.awt.Color(0, 204, 204));
        scrollGreen.setMaximum(255);
        scrollGreen.setValue(255);
        scrollGreen.setVisibleAmount(0);
        scrollGreen.setAlignmentX(0.0F);
        scrollGreen.setAlignmentY(0.0F);
        scrollGreen.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrollValueChanged(evt);
            }
        });
        pnlContent.add(scrollGreen);
        scrollGreen.setBounds(100, 70, 30, 170);

        scrollBlue.setBackground(new java.awt.Color(255, 255, 255));
        scrollBlue.setBlockIncrement(1);
        scrollBlue.setForeground(new java.awt.Color(0, 204, 204));
        scrollBlue.setMaximum(255);
        scrollBlue.setValue(255);
        scrollBlue.setVisibleAmount(0);
        scrollBlue.setAlignmentX(0.0F);
        scrollBlue.setAlignmentY(0.0F);
        scrollBlue.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        scrollBlue.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                scrollValueChanged(evt);
            }
        });
        pnlContent.add(scrollBlue);
        scrollBlue.setBounds(170, 70, 30, 170);

        jLabel6.setBackground(new java.awt.Color(0, 153, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("B");
        jLabel6.setOpaque(true);
        pnlContent.add(jLabel6);
        jLabel6.setBounds(170, 50, 30, 20);

        radioSave.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioSave);
        radioSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioSave.setSelected(true);
        radioSave.setText("Save Color");
        radioSave.setFocusPainted(false);
        pnlContent.add(radioSave);
        radioSave.setBounds(125, 270, 85, 23);

        radioLoad.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(radioLoad);
        radioLoad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radioLoad.setText("Load Color");
        radioLoad.setFocusPainted(false);
        pnlContent.add(radioLoad);
        radioLoad.setBounds(125, 290, 85, 23);

        pnlPreview.setMaximumSize(new java.awt.Dimension(225, 320));
        pnlPreview.setMinimumSize(new java.awt.Dimension(225, 320));
        pnlPreview.setPreferredSize(new java.awt.Dimension(225, 320));

        lblRedText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRedText.setText("Red");

        lblBlueText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBlueText.setText("Blue");

        lblGreenText.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblGreenText.setText("Green");

        lblGreenValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblGreenValue.setText(":");

        lblRedValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblRedValue.setText(":");

        lblBlueValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBlueValue.setText(":");

        javax.swing.GroupLayout pnlPreviewLayout = new javax.swing.GroupLayout(pnlPreview);
        pnlPreview.setLayout(pnlPreviewLayout);
        pnlPreviewLayout.setHorizontalGroup(
            pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreviewLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPreviewLayout.createSequentialGroup()
                        .addGroup(pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRedText)
                            .addComponent(lblBlueText))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPreviewLayout.createSequentialGroup()
                        .addComponent(lblGreenText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBlueValue)
                    .addComponent(lblRedValue)
                    .addComponent(lblGreenValue))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        pnlPreviewLayout.setVerticalGroup(
            pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPreviewLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRedText)
                    .addComponent(lblRedValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGreenText)
                    .addComponent(lblGreenValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPreviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBlueText)
                    .addComponent(lblBlueValue))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        pnlContent.add(pnlPreview);
        pnlPreview.setBounds(225, 30, 225, 320);

        getContentPane().add(pnlContent);
        pnlContent.setBounds(0, 0, 450, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pnlTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTitleMousePressed
        xPos = evt.getX();
        yPos = evt.getY();
    }//GEN-LAST:event_pnlTitleMousePressed
    private void pnlTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlTitleMouseDragged
        this.setLocation(evt.getXOnScreen()-xPos, evt.getYOnScreen()-yPos);
    }//GEN-LAST:event_pnlTitleMouseDragged
    private void lblMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMouseEntered
        JLabel lblSource = ((JLabel)evt.getSource());
        if (lblSource == lblClose) {
            lblClose.setBackground(new Color(255, 120, 120));
        } else if (lblSource == lblExit) {
            lblExit.setBackground(new Color(0, 204, 204));
            lblExit.setForeground(Color.WHITE);
        } else {
            lblSource.setBackground(new Color(0, 175, 175));
        }
    }//GEN-LAST:event_lblMouseEntered
    private void lblMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMouseExited
        JLabel lblSource = ((JLabel)evt.getSource());
        if (lblSource == lblExit) {
            lblExit.setBackground(Color.WHITE);
            lblExit.setForeground(new Color(0, 204, 204));
        } else {
            lblSource.setBackground(new Color(0, 204, 204));
        }
    }//GEN-LAST:event_lblMouseExited
    private void lblCloseMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseReleased
        System.exit(0);
    }//GEN-LAST:event_lblCloseMouseReleased
    private void lblMinimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMouseReleased
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMouseReleased
    private void lblInfoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseReleased
        JOptionPane.showMessageDialog(this, lblAbout);
    }//GEN-LAST:event_lblInfoMouseReleased
    private void lblExitMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseReleased
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseReleased
    private void lblExecuteMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExecuteMouseReleased
        if (radioSave.isSelected()) {
            saveRGBToTxtFile(curR, curG, curB, saveFilename);
            JOptionPane.showMessageDialog(this, "Color saved in "+saveFilename);
        } else if (radioLoad.isSelected()) {
            int[] rgb = loadRGBFromTxtFile(saveFilename);
            curR = rgb[0];
            curG = rgb[1];
            curB = rgb[2];
            updatePreview();
            updateScrollBars();
            JOptionPane.showMessageDialog(this, "Color loaded from "+saveFilename);
        }
    }//GEN-LAST:event_lblExecuteMouseReleased

    private void scrollValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_scrollValueChanged
        if (!userUsing) return;
        curR = 255-scrollRed.getValue();
        curG = 255-scrollGreen.getValue();
        curB = 255-scrollBlue.getValue();
        updatePreview();
    }//GEN-LAST:event_scrollValueChanged

    private void saveRGBToTxtFile(int r, int g, int b, String filename) {
        Formatter fmt = null;
        try {
            fmt = new Formatter(filename);
            fmt.format("%d %d %d", r, g, b);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (fmt != null) fmt.close();
        }
    }
    
    private int[] loadRGBFromTxtFile(String filename) {
        Scanner sc = null;
        int[] rgb = null;
        try {
            sc = new Scanner(new File(filename));
            rgb = new int[] {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        } catch (Exception ex) {
            System.out.println(ex.toString());
        } finally {
            if (sc != null) sc.close();
        }
        return rgb;
    }
    
    private void updatePreview() {
        Color backColor = new Color(curR, curG, curB);
        Color foreColor = getOverlayColor(backColor);
        pnlPreview.setBackground(backColor);
        
        lblRedText.setForeground(foreColor);
        lblGreenText.setForeground(foreColor);
        lblBlueText.setForeground(foreColor);
        
        lblRedValue.setForeground(foreColor);
        lblRedValue.setText(": "+curR);
        lblGreenValue.setForeground(foreColor);
        lblGreenValue.setText(": "+curG);
        lblBlueValue.setForeground(foreColor);
        lblBlueValue.setText(": "+curB);
    }
    
    private void updateScrollBars() {
        userUsing = false;
        SwingUtilities.invokeLater(() -> {
            scrollRed.setValue(255-curR);
        });
        SwingUtilities.invokeLater(() -> {
            scrollGreen.setValue(255-curG);
        });
        SwingUtilities.invokeLater(() -> {
            scrollBlue.setValue(255-curB);
        });
        SwingUtilities.invokeLater(() -> {
            userUsing = true;
        });
    }
    
    private Color getOverlayColor(Color color) {
        float[] hsb = Color.RGBtoHSB(
                color.getRed(),
                color.getGreen(),
                color.getBlue(),
                null
        );
        int r = color.getRed() >= 220 ? 1 : 0;
        int g = color.getGreen() >= 220 ? 1 : 0;
        int b = color.getBlue() >= 220 ? 1 : 0;
        if (r+g+b >= 2) {
            hsb[1] = Math.max(0,hsb[1]+0.6f);
            hsb[2] = Math.min(1.0f, hsb[2]-0.6f);
        } else {
            hsb[1] = Math.max(0,hsb[1]-0.6f);
            hsb[2] = Math.min(1.0f, hsb[2]+0.6f);
        }
        return new Color(Color.HSBtoRGB(
                hsb[0],
                hsb[1],
                hsb[2]      
        ));
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new ColorChangerJamanNow().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblBlueText;
    private javax.swing.JLabel lblBlueValue;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblExecute;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblGreenText;
    private javax.swing.JLabel lblGreenValue;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel lblRedText;
    private javax.swing.JLabel lblRedValue;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JPanel pnlPreview;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JRadioButton radioLoad;
    private javax.swing.JRadioButton radioSave;
    private javax.swing.JScrollBar scrollBlue;
    private javax.swing.JScrollBar scrollGreen;
    private javax.swing.JScrollBar scrollRed;
    // End of variables declaration//GEN-END:variables
}
