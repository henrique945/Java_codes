/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author Henrique
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
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

        jTextFieldValor = new javax.swing.JTextField();
        jTextFieldIdData = new javax.swing.JTextField();
        jTextFieldIdHora = new javax.swing.JTextField();
        jTextFieldIdId = new javax.swing.JTextField();
        jComboBoxServico = new javax.swing.JComboBox<>();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jLabelCliente1 = new javax.swing.JLabel();
        jLabelCliente = new javax.swing.JLabel();
        jLabelClienteData = new javax.swing.JLabel();
        jLabelClienteHora = new javax.swing.JLabel();
        jLabelClienteValor = new javax.swing.JLabel();
        jLabelClienteServico = new javax.swing.JLabel();
        jScrollPaneComentario = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabelId = new javax.swing.JLabel();
        jLabelAgenda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextFieldValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 170, 30));
        getContentPane().add(jTextFieldIdData, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 170, 30));
        getContentPane().add(jTextFieldIdHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 170, 30));
        getContentPane().add(jTextFieldIdId, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 170, 30));

        jComboBoxServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limpeza de pele", "Micro agulhamento", "Massagem", " " }));
        getContentPane().add(jComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 170, -1));

        jComboBoxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Henrique", "Amanda", "Caio", " " }));
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 170, -1));

        jLabelCliente1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCliente1.setForeground(new java.awt.Color(204, 255, 204));
        jLabelCliente1.setText("Comentário");
        getContentPane().add(jLabelCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jLabelCliente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelCliente.setForeground(new java.awt.Color(204, 255, 204));
        jLabelCliente.setText("Cliente");
        getContentPane().add(jLabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jLabelClienteData.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClienteData.setForeground(new java.awt.Color(204, 255, 204));
        jLabelClienteData.setText("Data");
        getContentPane().add(jLabelClienteData, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        jLabelClienteHora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClienteHora.setForeground(new java.awt.Color(204, 255, 204));
        jLabelClienteHora.setText("Hora");
        getContentPane().add(jLabelClienteHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, -1, -1));

        jLabelClienteValor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClienteValor.setForeground(new java.awt.Color(204, 255, 204));
        jLabelClienteValor.setText("Valor R$");
        getContentPane().add(jLabelClienteValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jLabelClienteServico.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelClienteServico.setForeground(new java.awt.Color(204, 255, 204));
        jLabelClienteServico.setText("Serviço");
        getContentPane().add(jLabelClienteServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPaneComentario.setViewportView(jTextArea1);

        getContentPane().add(jScrollPaneComentario, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 390, 210));

        jButton1.setText("Agendar");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 390, -1));

        jLabelId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelId.setForeground(new java.awt.Color(204, 255, 204));
        jLabelId.setText("Id");
        getContentPane().add(jLabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        jLabelAgenda.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelAgenda.setForeground(new java.awt.Color(204, 255, 204));
        jLabelAgenda.setText("Agenda");
        getContentPane().add(jLabelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 20, 1100, 700));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/agenda_1.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-890, -200, 2210, 1070));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAgenda;
    private javax.swing.JLabel jLabelCliente;
    private javax.swing.JLabel jLabelCliente1;
    private javax.swing.JLabel jLabelClienteData;
    private javax.swing.JLabel jLabelClienteHora;
    private javax.swing.JLabel jLabelClienteServico;
    private javax.swing.JLabel jLabelClienteValor;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelId;
    private javax.swing.JScrollPane jScrollPaneComentario;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldIdData;
    private javax.swing.JTextField jTextFieldIdHora;
    private javax.swing.JTextField jTextFieldIdId;
    private javax.swing.JTextField jTextFieldValor;
    // End of variables declaration//GEN-END:variables
}
