package MicroTest111;

public class Micro1 extends javax.swing.JFrame {

    /**
     * Creates new form Micro1
     */
    public Micro1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ename = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        eadd = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        econtact = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        ebank = new javax.swing.JLabel();
        txtbank = new javax.swing.JComboBox<>();
        eloan = new javax.swing.JLabel();
        txtloantype = new javax.swing.JComboBox<>();
        einterest = new javax.swing.JLabel();
        txtinterest = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        eloanamt = new javax.swing.JLabel();
        txtloanamt = new javax.swing.JTextField();
        eduration = new javax.swing.JLabel();
        txtduration = new javax.swing.JTextField();
        calculate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        eresult = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("LOAN CALCULATOR SYSTEM");

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        ename.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ename.setText("Name :");

        txtname.setToolTipText("Enter Name");

        eadd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eadd.setText("Address :");

        jScrollPane1.setHorizontalScrollBar(null);

        txtadd.setColumns(20);
        txtadd.setRows(5);
        txtadd.setToolTipText("Enter Address");
        jScrollPane1.setViewportView(txtadd);

        econtact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        econtact.setText("Contact :");

        txtcontact.setToolTipText("Enter Phone Number");

        ebank.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ebank.setText("Select Bank :");

        txtbank.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtbank.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "State Bank of India", "HDFC Bank", "Axis Bank", "ICICI Bank" }));
        txtbank.setToolTipText("Select Bank");

        eloan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eloan.setText("Loan Type :");

        txtloantype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Home Loan (Avg 7-8.5%)", "Personal Loan (Avg 9.5-13.5%)", "Education Loan (Avg 7.5-9%)", "Vehicle Loan (Avg 10-13%)" }));
        txtloantype.setToolTipText("Select Loan Type");
        txtloantype.setName(""); // NOI18N

        einterest.setText("Interest Rate :");

        txtinterest.setToolTipText("Enter Rate of Interest");

        jLabel8.setText("%");

        eloanamt.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eloanamt.setText("Needed Loan Amount in INR :");

        txtloanamt.setToolTipText("Enter Loan Amount");

        eduration.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        eduration.setText("Duration in Months :");

        txtduration.setToolTipText("Enter Total Months of EMI");

        calculate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        calculate.setText("CALCULATE");
        calculate.setToolTipText("Click To Get Result!");
        calculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculateActionPerformed(evt);
            }
        });

        eresult.setColumns(20);
        eresult.setRows(5);
        eresult.setAutoscrolls(false);
        eresult.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        eresult.setCaretColor(new java.awt.Color(255, 255, 51));
        eresult.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        eresult.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        eresult.setEnabled(false);
        jScrollPane2.setViewportView(eresult);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(ebank)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtbank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(econtact)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(ename)
                                                    .addGap(30, 30, 30)
                                                    .addComponent(txtname))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(eadd)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(eloanamt)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtloanamt, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(eduration)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtduration, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(eloan)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtloantype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(65, 65, 65)
                                                .addComponent(einterest)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtinterest, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel8)))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(calculate)
                        .addGap(316, 316, 316))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(236, 236, 236))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ename)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(eadd)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(econtact))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ebank)
                    .addComponent(txtbank, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eloan)
                    .addComponent(txtloantype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(einterest)
                    .addComponent(txtinterest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eloanamt)
                    .addComponent(txtloanamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eduration)
                    .addComponent(txtduration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(calculate)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtbank.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void calculateActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        
        double finalinterest =0;
        double finalamt=0;
        double memi;
        
        String name = txtname.getText();
        String address = txtadd.getText();
        String phone = txtcontact.getText();
        
        
        double principal = Integer.parseInt(txtloanamt.getText());
        double emi = Integer.parseInt(txtduration.getText());
        double roi = Integer.parseInt(txtinterest.getText());
        
        finalinterest = (principal*roi*emi)/100.0;
        finalamt = finalinterest + principal;
        memi = finalamt/emi;
        
        if(evt.getSource() == calculate)
        {
            eresult.setText("-------------------- PERSONAL DETAILS --------------------\n\nName = "+name+
                    "\nAddress = "+address+
                    "\nPhone Number = "+phone+
                    "\n\n-------------------- LOAN DETAILS --------------------\n\nTotal Amount of Loan Needed = Rs. "+principal+
                    "\nTotal Number of Months = "+emi+
                    " Months\nRate of Interest = "+roi+
                    "%\nTotal Amount of Interest to be paid in "+emi+" Months = Rs. "+finalinterest+
                    "\nTotal Per Month EMI = Rs. "+memi+
                    "\nFinal Amount to be paid including interest = Rs. "+finalamt
            );
            
        }
        
    }                                         
  
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
            java.util.logging.Logger.getLogger(Micro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Micro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Micro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Micro1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Micro1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton calculate;
    private javax.swing.JLabel eadd;
    private javax.swing.JLabel ebank;
    private javax.swing.JLabel econtact;
    private javax.swing.JLabel eduration;
    private javax.swing.JLabel einterest;
    private javax.swing.JLabel eloan;
    private javax.swing.JLabel eloanamt;
    private javax.swing.JLabel ename;
    private javax.swing.JTextArea eresult;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea txtadd;
    private javax.swing.JComboBox<String> txtbank;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtduration;
    private javax.swing.JTextField txtinterest;
    private javax.swing.JTextField txtloanamt;
    private javax.swing.JComboBox<String> txtloantype;
    private javax.swing.JTextField txtname;
    // End of variables declaration                   
}