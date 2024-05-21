
package pos.system;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Bread_pos extends javax.swing.JFrame {

    
    public Bread_pos() {
        
          this.setExtendedState(JFrame.MAXIMIZED_BOTH);
          
        initComponents();
    }
    
     public void addTable(String Name, Double Price){
        
        String QTY = JOptionPane.showInputDialog(null, "Please Enter Your Quantity", "1");
        System.out.println(QTY);
        
        Double tqty = Double.valueOf(QTY);
        Double Tot_prc = Price * tqty ; 
        
        System.out.println(Tot_prc);
        
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        
        Vector v = new Vector();
        
        v.add(Name);
        v.add(QTY);
        v.add(Tot_prc);
        dt.addRow(v);
        
        cart_total();
        
        
    }
     
       
    public void cart_total(){
     
        int numofrow = jTable2.getRowCount();
        int total = 0;
                
                for (int i = 0; i < numofrow; i++){
                    
                    double value = Double.valueOf(jTable2.getValueAt (i, 2). toString());
                    
                    total += value ; 
                
                }
                
                DecimalFormat df = new DecimalFormat("00.00");
                String d1 = df.format(total);
                
                bili_tot2.setText(d1);
                
                double tx = Double.valueOf(tax.getText());
                double ds = Double.valueOf(dis.getText());
                
                double allTot = total  +  tx - ds ;
                
                full_tot.setText(String.valueOf(allTot));
    }
    
     public void bill2(){
    
          jTextPane2.setText(" \t           BREW HAVEN \n");
          jTextPane2.setText(jTextPane2.getText() + "                         123/ Novaliches road, \n");
          jTextPane2.setText(jTextPane2.getText() + "                         Philippines, Quezon City, \n");
          jTextPane2.setText(jTextPane2.getText() + "                            +63 1234567891 \n");
          jTextPane2.setText(jTextPane2.getText() + "---------------------------------------------------------------------\n");
          jTextPane2.setText(jTextPane2.getText() + "   Item  \t\t Qty\t\tPrice" +"\n");
          jTextPane2.setText(jTextPane2.getText() + "---------------------------------------------------------------------\n");
          
          
          DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
          
          
           for (int i = 0; i < jTable2.getRowCount(); i++) {
                
                String Name = dt.getValueAt(i, 0).toString();
                String Qty = dt.getValueAt(i, 1).toString();
                String Price = dt.getValueAt(i, 2).toString();
                
                jTextPane2.setText(jTextPane2.getText() + Name+"\t"+ Qty+"\t\t"+Price + "\n");
            }
           
            jTextPane2.setText(jTextPane2.getText() + "---------------------------------------------------------------------\n");
            jTextPane2.setText(jTextPane2.getText() + "  Sub Total  :\t\t\t " + bili_tot2.getText() + "\n");
            jTextPane2.setText(jTextPane2.getText() + "  Tax  :\t\t\t\t " + tax.getText() + "\n");
            jTextPane2.setText(jTextPane2.getText() + "  Sales Tax  :\t\t\t " + dis.getText() + "\n");
            jTextPane2.setText(jTextPane2.getText() + "---------------------------------------------------------------------\n");
            jTextPane2.setText(jTextPane2.getText() + "  Total  :\t                                                       " + full_tot.getText() + "\n");
            jTextPane2.setText(jTextPane2.getText() + "---------------------------------------------------------------------\n");
            
            Date dd = new Date();
            
            SimpleDateFormat datef = new SimpleDateFormat("yyyy-mm-dd");
            SimpleDateFormat timef = new SimpleDateFormat("yyyy-mm-dd");
                 String date = datef.format(dd);
                 String time = timef.format(dd);
                 
                 jTextPane2.setText(jTextPane2.getText() + "  Date :" + date + "\t\t  Time :" + time + "\n");
                 jTextPane2.setText(jTextPane2.getText() + "************************************************* \n");
                 jTextPane2.setText(jTextPane2.getText() + "\t      Thank you for your order.!\n");
                 jTextPane2.setText(jTextPane2.getText() + "************************************************* \n");
                 jTextPane2.setText(jTextPane2.getText() + "\t    BREW HAVEN COFFE SHOP\n" );
                 jTextPane2.setText(jTextPane2.getText() + "\t Contact : brewhaven@gmail.com\n" );
                 
                 
            
            
    }
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        h9 = new javax.swing.JButton();
        h1 = new javax.swing.JButton();
        h2 = new javax.swing.JButton();
        h3 = new javax.swing.JButton();
        h4 = new javax.swing.JButton();
        h6 = new javax.swing.JButton();
        h7 = new javax.swing.JButton();
        h8 = new javax.swing.JButton();
        h11 = new javax.swing.JButton();
        h12 = new javax.swing.JButton();
        h13 = new javax.swing.JButton();
        h14 = new javax.swing.JButton();
        h5 = new javax.swing.JButton();
        h10 = new javax.swing.JButton();
        h15 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        bili_tot2 = new javax.swing.JLabel();
        dis = new javax.swing.JTextField();
        tax = new javax.swing.JTextField();
        full_tot = new javax.swing.JLabel();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        bill2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        h9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (9).jpg"))); // NOI18N
        h9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h9ActionPerformed(evt);
            }
        });
        jPanel1.add(h9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 163, 156));

        h1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (1).jpg"))); // NOI18N
        h1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h1ActionPerformed(evt);
            }
        });
        jPanel1.add(h1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 163, 156));

        h2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (2).jpg"))); // NOI18N
        h2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h2ActionPerformed(evt);
            }
        });
        jPanel1.add(h2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 163, 156));

        h3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (3).jpg"))); // NOI18N
        h3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h3ActionPerformed(evt);
            }
        });
        jPanel1.add(h3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 163, 156));

        h4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (4).jpg"))); // NOI18N
        h4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h4ActionPerformed(evt);
            }
        });
        jPanel1.add(h4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 140, 163, 156));

        h6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (6).jpg"))); // NOI18N
        h6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h6ActionPerformed(evt);
            }
        });
        jPanel1.add(h6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 163, 156));

        h7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (7).jpg"))); // NOI18N
        h7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h7ActionPerformed(evt);
            }
        });
        jPanel1.add(h7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 390, 163, 156));

        h8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (8).jpg"))); // NOI18N
        h8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h8ActionPerformed(evt);
            }
        });
        jPanel1.add(h8, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 163, 156));

        h11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (11).jpg"))); // NOI18N
        h11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h11ActionPerformed(evt);
            }
        });
        jPanel1.add(h11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 660, 163, 156));

        h12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (12).jpg"))); // NOI18N
        h12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h12ActionPerformed(evt);
            }
        });
        jPanel1.add(h12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 660, 163, 156));

        h13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (13).jpg"))); // NOI18N
        h13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h13ActionPerformed(evt);
            }
        });
        jPanel1.add(h13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 660, 163, 156));

        h14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (14).jpg"))); // NOI18N
        h14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h14ActionPerformed(evt);
            }
        });
        jPanel1.add(h14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 660, 163, 156));

        h5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (5).jpg"))); // NOI18N
        h5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h5ActionPerformed(evt);
            }
        });
        jPanel1.add(h5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 140, 163, 156));

        h10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (10).jpg"))); // NOI18N
        h10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h10ActionPerformed(evt);
            }
        });
        jPanel1.add(h10, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 390, 163, 156));

        h15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-163x156 (15).jpg"))); // NOI18N
        h15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                h15ActionPerformed(evt);
            }
        });
        jPanel1.add(h15, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 660, 163, 156));

        jPanel4.setBackground(new java.awt.Color(25, 16, 15));

        jButton1.setBackground(new java.awt.Color(25, 16, 15,0));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-32x27 (1).jpg"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(25, 16, 15,0));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-32x31.jpg"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BREW HAVEN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1621, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 40));

        jPanel2.setBackground(new java.awt.Color(25, 16, 15));

        jButton17.setBackground(new java.awt.Color(25, 16, 15,0));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-32x27 (2).jpg"))); // NOI18N
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(25, 16, 15,0));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagess/image-32x27 (4).jpg"))); // NOI18N
        jButton18.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(690, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 50, 810));

        jTable2.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "    ITEM", "    QTY", "    PRICE"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 140, 320, 520));

        jSeparator1.setBackground(new java.awt.Color(251, 151, 36));
        jSeparator1.setForeground(new java.awt.Color(251, 151, 36));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 100, 10, 850));

        jTextPane2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextPane2.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTextPane2AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jTextPane2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1480, 140, 370, 520));

        jPanel3.setBackground(new java.awt.Color(160, 82, 45));

        jLabel44.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel44.setText("SUBTOTAL : ");

        jLabel45.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel45.setText("TAX :");

        jLabel46.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel46.setText("SALES TAX  ;");

        jLabel47.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel47.setText("TOTAL: ");

        bili_tot2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        dis.setText("3.60");
        dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disActionPerformed(evt);
            }
        });
        dis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                disKeyReleased(evt);
            }
        });

        tax.setText("18");
        tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxActionPerformed(evt);
            }
        });

        full_tot.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jButton19.setBackground(new java.awt.Color(251, 151, 36));
        jButton19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton19.setText("NEW");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(251, 151, 36));
        jButton20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton20.setText("PRINT");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        bill2.setBackground(new java.awt.Color(251, 151, 36));
        bill2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        bill2.setText("PLACE ORDER");
        bill2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bill2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(full_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(425, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addComponent(bili_tot2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel45)
                                .addGap(18, 18, 18)
                                .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel46)
                                .addGap(18, 18, 18)
                                .addComponent(dis, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 56, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bill2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bili_tot2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bill2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel45))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel46)
                                    .addComponent(dis, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel47)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(full_tot, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 680, 730, 210));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHESSECAKE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 830, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CROISSANT");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DONUTS");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BROWNIES");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 580, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LEMON BAR");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ECLAIR");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 830, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("CINNAMON");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 310, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MACARONS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 560, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("FRUIT TARTS");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 830, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("MUFFIN");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CHOCOLATE");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 560, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText(" PECAN PIE");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 830, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CUPCAKES");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CHOCOLATE");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 560, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TIRAMISU");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 830, -1, -1));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("120 PHP");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 340, -1, -1));

        jLabel19.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("100 PHP");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        jLabel20.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText(" --3 PCS--");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 880, -1, -1));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("  150 PHP");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, -1, -1));

        jLabel22.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("85 PHP");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 340, -1, -1));

        jLabel23.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("130 PHP");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, -1, -1));

        jLabel24.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("75 PHP");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 590, -1, -1));

        jLabel25.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("190 PHP");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 590, -1, -1));

        jLabel26.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("150 PHP");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, -1, 10));

        jLabel27.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("55 PHP");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 610, -1, -1));

        jLabel28.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("75 PHP");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 860, -1, -1));

        jLabel29.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("150 PHP");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 860, -1, -1));

        jLabel30.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("150 PHP");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 860, -1, -1));

        jLabel31.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("60 PHP");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 860, -1, -1));

        jLabel32.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("80 PHP");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 860, -1, -1));

        jLabel33.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("120 PHP");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, -1));

        jLabel34.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText(" --5 PCS--");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, -1, -1));

        jLabel35.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText(" --5 PCS--");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 610, -1, -1));

        jLabel36.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText(" --3 PCS--");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 360, -1, -1));

        jLabel37.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText(" --5 PCS--");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, -1, -1));

        jLabel38.setFont(new java.awt.Font("Times New Roman", 0, 10)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText(" --3 PCS--");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 880, -1, -1));

        jLabel39.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("SCONES");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        jLabel40.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("CAKE");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 580, -1, -1));

        jLabel41.setFont(new java.awt.Font("Times New Roman", 1, 21)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("ROLL");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void h10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h10ActionPerformed
       
         addTable("Chocolate Cake     ", 55.00);
    }//GEN-LAST:event_h10ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Employee_loginpage jf2 = new Employee_loginpage();
        jf2.show();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
      
         HAVEN_POS jf2 = new HAVEN_POS();
        jf2.show();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTextPane2AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTextPane2AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPane2AncestorAdded

    private void disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_disActionPerformed

    private void disKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_disKeyReleased
        // TODO add your handling code here:
        cart_total();
    }//GEN-LAST:event_disKeyReleased

    private void taxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxActionPerformed
        // TODO add your handling code here:
        cart_total();
    }//GEN-LAST:event_taxActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        DefaultTableModel dt = (DefaultTableModel) jTable2.getModel();
        dt.setRowCount(0);

        jTextPane2.setText("");

        bili_tot2.setText("");
        full_tot.setText("");
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

        try {

            jTextPane2.print();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void bill2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bill2ActionPerformed
        // TODO add your handling code here:

        bill2();
    }//GEN-LAST:event_bill2ActionPerformed

    private void h1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h1ActionPerformed
     
         addTable("Croissant      ", 100.00);
    }//GEN-LAST:event_h1ActionPerformed

    private void h2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h2ActionPerformed
       
         addTable("Scons          ", 120.00);
    }//GEN-LAST:event_h2ActionPerformed

    private void h3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h3ActionPerformed
      
         addTable("Cinnamon Roll  ", 150.00);
    }//GEN-LAST:event_h3ActionPerformed

    private void h4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h4ActionPerformed
       
         addTable("Muffin         ", 85.00);
    }//GEN-LAST:event_h4ActionPerformed

    private void h5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h5ActionPerformed
       
         addTable("Cupcakes       ", 120.00);
    }//GEN-LAST:event_h5ActionPerformed

    private void h6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h6ActionPerformed
      
        addTable("Donuts         ", 130.00);
    }//GEN-LAST:event_h6ActionPerformed

    private void h7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h7ActionPerformed
   
         addTable("Lemon Bar      ", 75.00);
    }//GEN-LAST:event_h7ActionPerformed

    private void h8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h8ActionPerformed
        
         addTable("Macarons       ", 190.00);
    }//GEN-LAST:event_h8ActionPerformed

    private void h9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h9ActionPerformed
       
         addTable("Chocolate Brownies", 150.00);
    }//GEN-LAST:event_h9ActionPerformed

    private void h11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h11ActionPerformed
      
         addTable("Cheesecake     ", 75.00);
    }//GEN-LAST:event_h11ActionPerformed

    private void h12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h12ActionPerformed
       
         addTable("Eclair           ", 150.00);
    }//GEN-LAST:event_h12ActionPerformed

    private void h13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h13ActionPerformed
        
         addTable("Fruit Tarts    ", 150.00);
    }//GEN-LAST:event_h13ActionPerformed

    private void h14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h14ActionPerformed
       
         addTable("Pecan Pie      ", 60.00);
    }//GEN-LAST:event_h14ActionPerformed

    private void h15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_h15ActionPerformed
      
         addTable("Tiramisu       ", 80.00);
    }//GEN-LAST:event_h15ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Bread_pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bread_pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bread_pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bread_pos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bread_pos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bili_tot2;
    private javax.swing.JButton bill2;
    private javax.swing.JTextField dis;
    private javax.swing.JLabel full_tot;
    private javax.swing.JButton h1;
    private javax.swing.JButton h10;
    private javax.swing.JButton h11;
    private javax.swing.JButton h12;
    private javax.swing.JButton h13;
    private javax.swing.JButton h14;
    private javax.swing.JButton h15;
    private javax.swing.JButton h2;
    private javax.swing.JButton h3;
    private javax.swing.JButton h4;
    private javax.swing.JButton h5;
    private javax.swing.JButton h6;
    private javax.swing.JButton h7;
    private javax.swing.JButton h8;
    private javax.swing.JButton h9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextField tax;
    // End of variables declaration//GEN-END:variables
}
