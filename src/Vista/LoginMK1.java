/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author LUIS ANGEL
 */
public class LoginMK1 extends javax.swing.JInternalFrame {

    /**
     * Creates new form LoginMK1
     */
    public LoginMK1() {
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

        RIGHT = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        LEFT = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpClave = new javax.swing.JPasswordField();
        txtEmail = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        RIGHT.setBackground(new java.awt.Color(0, 102, 102));
        RIGHT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("copyright © company name All right reserved");
        RIGHT.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Atomica GYM");
        RIGHT.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        getContentPane().add(RIGHT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 530));

        LEFT.setBackground(new java.awt.Color(255, 255, 255));
        LEFT.setMinimumSize(new java.awt.Dimension(400, 500));
        LEFT.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 28)); // NOI18N
        jLabel1.setText("ATOMICA GYM");
        LEFT.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        jpClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpClaveActionPerformed(evt);
            }
        });
        LEFT.add(jpClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 300, 50));
        LEFT.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 300, 50));

        btnIniciar.setBackground(new java.awt.Color(0, 102, 102));
        btnIniciar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnIniciar.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciar.setText("Inciar Sesión");
        LEFT.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 150, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel2.setText("Password");
        LEFT.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 150, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel3.setText("User");
        LEFT.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 126, 150, 40));

        getContentPane().add(LEFT, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 400, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpClaveActionPerformed

    }//GEN-LAST:event_jpClaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel LEFT;
    public javax.swing.JPanel RIGHT;
    public javax.swing.JButton btnIniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JPasswordField jpClave;
    public javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
