/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author LUIS ANGEL
 */
public class Registro_Cliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registro_Cliente
     */
    public Registro_Cliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtEdad = new javax.swing.JTextField();
        txtNameCliente = new javax.swing.JTextField();
        cbxEstadia = new javax.swing.JComboBox<>();
        cbxPlan = new javax.swing.JComboBox<>();
        cbxPago = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnR = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        Fecha = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblclient = new javax.swing.JTable();
        txtIDCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 150, 40));
        jPanel1.add(txtNameCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 150, 40));

        cbxEstadia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 MES", "3 MESES ", "4 MESES", "6MESES", "9 MESESS", "12 MESES" }));
        jPanel1.add(cbxEstadia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 180, 40));

        cbxPlan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Plan Fitness ", "Plan Atomica", "Plan Familia Atomica" }));
        jPanel1.add(cbxPlan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 150, 40));

        cbxPago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YAPE", "PLIN", "DEBITO", "CREDITO", "EFECTIVO" }));
        cbxPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPagoActionPerformed(evt);
            }
        });
        jPanel1.add(cbxPago, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 150, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel1.setText("TIEMPO DE ESTADIA");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 190, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel2.setText("REGISTRO DE USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 210, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel3.setText("TIPO DE PAGO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 150, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel4.setText("EDAD");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 150, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setText("NOMBRE");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 150, 20));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setText("TIPO DE PLAN");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 150, 20));

        btnR.setText("REGISTRAR");
        btnR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRActionPerformed(evt);
            }
        });
        jPanel1.add(btnR, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 190, 140, 40));

        btnA.setText("ACTUALIZAR");
        jPanel1.add(btnA, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 270, 140, 40));

        btnC.setText("CONSULTAR");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        jPanel1.add(btnC, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, 140, 40));

        btnE.setText("ELIMINAR");
        jPanel1.add(btnE, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 440, 140, 40));

        Fecha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de Inicio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel1.add(Fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 180, 70));

        tblclient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblclient);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 720, 210));
        jPanel1.add(txtIDCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 150, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel8.setText("ID-CLIENTE");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCActionPerformed

    private void btnRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRActionPerformed

    private void cbxPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPagoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public com.toedter.calendar.JDateChooser Fecha;
    public javax.swing.JButton btnA;
    public javax.swing.JButton btnC;
    public javax.swing.JButton btnE;
    public javax.swing.JButton btnR;
    public javax.swing.JComboBox<String> cbxEstadia;
    public javax.swing.JComboBox<String> cbxPago;
    public javax.swing.JComboBox<String> cbxPlan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblclient;
    public javax.swing.JTextField txtEdad;
    public javax.swing.JTextField txtIDCliente;
    public javax.swing.JTextField txtNameCliente;
    // End of variables declaration//GEN-END:variables
}
