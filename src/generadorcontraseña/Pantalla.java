/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadorcontraseña;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Geny
 */
public class Pantalla extends javax.swing.JFrame {
    private Gen generador;
    private int numPropSel;
    private int longitud;
    private final int LONGITUD_MAX;
    private final int LONGITUD_MIN;
    private boolean longitudCorregida;
    private NivelSeguridad nivel;
    
    /**
     * Creates new form Pantalla
     */
    public Pantalla() {
        initComponents();
        setResizable(false);
        tamPasswd.setFocusTraversalKeysEnabled(false);
        setTitle("Generador de contraseñas");
        setSize(670, 469);
        pack();
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/icono.png")).getImage());
        campoPassword.setBackground(new java.awt.Color(0,0,0,1));
        tamPasswd.setBackground(new java.awt.Color(0,0,0,1));
        generador = new Gen();
        numPropSel = 4;
        longitud = Integer.parseInt(tamPasswd.getText());   
        longitudCorregida = false;
        LONGITUD_MAX = 50;
        LONGITUD_MIN = 4;
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
        tamPasswd = new javax.swing.JTextField();
        btnDecremento = new javax.swing.JButton();
        checkNums = new javax.swing.JCheckBox();
        checkMayus = new javax.swing.JCheckBox();
        checkSim = new javax.swing.JCheckBox();
        btnIncremento = new javax.swing.JButton();
        campoPassword = new javax.swing.JTextField();
        checkMinus = new javax.swing.JCheckBox();
        btnGenerar = new javax.swing.JButton();
        btnCopiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(146, 208, 80));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 207, 446, 10));

        tamPasswd.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        tamPasswd.setForeground(new java.awt.Color(255, 255, 255));
        tamPasswd.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tamPasswd.setText("10");
        tamPasswd.setAutoscrolls(false);
        tamPasswd.setBorder(null);
        tamPasswd.setCaretColor(new java.awt.Color(204, 255, 255));
        tamPasswd.setOpaque(false);
        tamPasswd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tamPasswdFocusLost(evt);
            }
        });
        tamPasswd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tamPasswdKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tamPasswdKeyTyped(evt);
            }
        });
        getContentPane().add(tamPasswd, new org.netbeans.lib.awtextra.AbsoluteConstraints(122, 311, 100, 50));

        btnDecremento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDec.png"))); // NOI18N
        btnDecremento.setBorderPainted(false);
        btnDecremento.setContentAreaFilled(false);
        btnDecremento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDecremento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDec-hover.png"))); // NOI18N
        btnDecremento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnDec-clic.png"))); // NOI18N
        btnDecremento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecrementoActionPerformed(evt);
            }
        });
        getContentPane().add(btnDecremento, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 336, 48, 37));

        checkNums.setSelected(true);
        checkNums.setContentAreaFilled(false);
        checkNums.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkbox-deselected.png"))); // NOI18N
        checkNums.setRolloverEnabled(false);
        checkNums.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkbox-selected.png"))); // NOI18N
        checkNums.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkNumsActionPerformed(evt);
            }
        });
        getContentPane().add(checkNums, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 342, 100, 30));

        checkMayus.setSelected(true);
        checkMayus.setContentAreaFilled(false);
        checkMayus.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkMayus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkbox-deselected.png"))); // NOI18N
        checkMayus.setRolloverEnabled(false);
        checkMayus.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkbox-selected.png"))); // NOI18N
        checkMayus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMayusActionPerformed(evt);
            }
        });
        getContentPane().add(checkMayus, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 302, 120, 30));

        checkSim.setSelected(true);
        checkSim.setContentAreaFilled(false);
        checkSim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkbox-deselected.png"))); // NOI18N
        checkSim.setRolloverEnabled(false);
        checkSim.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkbox-selected.png"))); // NOI18N
        checkSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSimActionPerformed(evt);
            }
        });
        getContentPane().add(checkSim, new org.netbeans.lib.awtextra.AbsoluteConstraints(434, 342, 110, 30));

        btnIncremento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnInc.png"))); // NOI18N
        btnIncremento.setBorderPainted(false);
        btnIncremento.setContentAreaFilled(false);
        btnIncremento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIncremento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnInc-hover.png"))); // NOI18N
        btnIncremento.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnInc-clic.png"))); // NOI18N
        btnIncremento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncrementoActionPerformed(evt);
            }
        });
        getContentPane().add(btnIncremento, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 300, 48, 37));

        campoPassword.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        campoPassword.setForeground(new java.awt.Color(255, 255, 255));
        campoPassword.setBorder(null);
        campoPassword.setCaretColor(new java.awt.Color(204, 255, 255));
        campoPassword.setOpaque(false);
        campoPassword.setSelectedTextColor(new java.awt.Color(204, 204, 204));
        campoPassword.setSelectionColor(new java.awt.Color(0, 2, 72));
        getContentPane().add(campoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 132, 310, 50));

        checkMinus.setSelected(true);
        checkMinus.setContentAreaFilled(false);
        checkMinus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkbox-deselected.png"))); // NOI18N
        checkMinus.setRolloverEnabled(false);
        checkMinus.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/checkbox-selected.png"))); // NOI18N
        checkMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMinusActionPerformed(evt);
            }
        });
        getContentPane().add(checkMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 302, 110, 30));

        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnGen.png"))); // NOI18N
        btnGenerar.setToolTipText("Generar nueva contraseña");
        btnGenerar.setBorderPainted(false);
        btnGenerar.setContentAreaFilled(false);
        btnGenerar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGenerar.setFocusPainted(false);
        btnGenerar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnGen-clic.png"))); // NOI18N
        btnGenerar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnGen-hover.png"))); // NOI18N
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGenerar, new org.netbeans.lib.awtextra.AbsoluteConstraints(501, 131, 54, 53));

        btnCopiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCopiar.png"))); // NOI18N
        btnCopiar.setToolTipText("Copiar la contraseña");
        btnCopiar.setBorderPainted(false);
        btnCopiar.setContentAreaFilled(false);
        btnCopiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCopiar.setFocusPainted(false);
        btnCopiar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCopiar-clic.png"))); // NOI18N
        btnCopiar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnCopiar-hover.png"))); // NOI18N
        btnCopiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCopiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(437, 130, 54, 53));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        jLabel1.setMaximumSize(null);
        jLabel1.setMinimumSize(null);
        jLabel1.setPreferredSize(new java.awt.Dimension(670, 468));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 468));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCopiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopiarActionPerformed
        campoPassword.selectAll();
        campoPassword.copy();
    }//GEN-LAST:event_btnCopiarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        actualizarPassword();
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void verificarCheckBoxes(javax.swing.JCheckBox checkBox){
        if(!checkBox.isSelected()){
            if(numPropSel>1){
                numPropSel--;
                actualizarPassword();
            }else{
                checkBox.setSelected(true);
            }
        }else{
            numPropSel++;
            actualizarPassword();
        }
    }
    
    private void checkMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMinusActionPerformed
        verificarCheckBoxes(checkMinus);
    }//GEN-LAST:event_checkMinusActionPerformed

    private void checkMayusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMayusActionPerformed
        verificarCheckBoxes(checkMayus);
    }//GEN-LAST:event_checkMayusActionPerformed

    private void checkNumsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkNumsActionPerformed
        verificarCheckBoxes(checkNums);
    }//GEN-LAST:event_checkNumsActionPerformed

    private void checkSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSimActionPerformed
        verificarCheckBoxes(checkSim);
    }//GEN-LAST:event_checkSimActionPerformed

    private void tamPasswdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tamPasswdKeyTyped
        int caracter = evt.getKeyChar();
        //System.out.println(caracter);
        if(!(caracter>=48&&caracter<=57)){ // Ignorar lo que no sea un número
            evt.consume();
        }
    }//GEN-LAST:event_tamPasswdKeyTyped

    private void tamPasswdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tamPasswdKeyReleased
        if(evt.getKeyCode()==KeyEvent.VK_ENTER||evt.getKeyCode()==KeyEvent.VK_TAB){
            if(!tamPasswd.getText().equals("")){
                tamPasswd.transferFocus(); 
                //comprobarLongitud();
                actualizarPassword();
            }
            return;
        }
        try{
            longitud = Integer.parseInt(tamPasswd.getText());
      
            if(longitud>=LONGITUD_MAX) btnIncremento.setEnabled(false);
            else btnIncremento.setEnabled(true);

            if(longitud<=LONGITUD_MIN) btnDecremento.setEnabled(false);
            else btnDecremento.setEnabled(true);
        }catch(NumberFormatException ex){
            longitud = -1;
            btnIncremento.setEnabled(false);
            btnDecremento.setEnabled(false);
        }
        if(evt.getKeyCode()==KeyEvent.VK_UP){
            if(longitud<0) return; // si el campo está vacío, no hace nada
            if(longitud>=LONGITUD_MAX) return;
            if(verificarLongitud()){ 
                actualizarPassword();
                return; 
            }
            aumentarLongitud();
            actualizarPassword();
        }
        if(evt.getKeyCode()==KeyEvent.VK_DOWN){
            if(longitud<=LONGITUD_MIN) return;
            if(verificarLongitud()){
                actualizarPassword();
                return;
            }
            disminuirLongitud();
            actualizarPassword();
        }
    }//GEN-LAST:event_tamPasswdKeyReleased

    private void tamPasswdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tamPasswdFocusLost
        longitudCorregida = verificarLongitud();
    }//GEN-LAST:event_tamPasswdFocusLost

    private void btnIncrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncrementoActionPerformed
        if(!longitudCorregida) aumentarLongitud();  
        actualizarPassword();
        longitudCorregida = false;
    }//GEN-LAST:event_btnIncrementoActionPerformed

    private void btnDecrementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecrementoActionPerformed
        if(!longitudCorregida) disminuirLongitud();  
        actualizarPassword();
        longitudCorregida = false;
    }//GEN-LAST:event_btnDecrementoActionPerformed
    
    private boolean verificarLongitud(){    
        System.out.println("Longitud: " + longitud);
        if(longitud<LONGITUD_MIN){
            longitud = LONGITUD_MIN;
            tamPasswd.setText(String.valueOf(LONGITUD_MIN));
            btnDecremento.setEnabled(false);
            btnIncremento.setEnabled(true);
            return true;
        }
        if(longitud>LONGITUD_MAX){
            longitud = LONGITUD_MAX;
            tamPasswd.setText(String.valueOf(LONGITUD_MAX));
            btnDecremento.setEnabled(true);
            btnIncremento.setEnabled(false);
            return true;
        }
        return false;
    }
    
    public void aumentarLongitud(){
        tamPasswd.setText(String.valueOf(++longitud));
        if(longitud>=LONGITUD_MAX) btnIncremento.setEnabled(false);
        if(longitud>LONGITUD_MIN) btnDecremento.setEnabled(true);
    }
    
    public void disminuirLongitud(){
        tamPasswd.setText(String.valueOf(--longitud));
        if(longitud<=LONGITUD_MIN) btnDecremento.setEnabled(false);
        if(longitud<LONGITUD_MAX) btnIncremento.setEnabled(true);
    }
    
    private void actualizarPassword(){
        generador.definirPropiedades(Integer.parseInt(tamPasswd.getText()),checkMinus.isSelected(),checkMayus.isSelected(),checkNums.isSelected(),checkSim.isSelected());
        campoPassword.setText(generador.generarClave());
        nivel = new NivelSeguridad(longitud,checkMinus.isSelected(),checkMayus.isSelected(),checkNums.isSelected(),checkSim.isSelected());
        cambiarColorNivel(nivel.obtenerNivel());
    }
    
    private void cambiarColorNivel(int nivel){
        switch(nivel){
            case 1:
                jPanel1.setBackground(new Color(255,51,51));
                break;
            case 2:
                jPanel1.setBackground(new Color(255,153,51));
                break;
            case 3:
                jPanel1.setBackground(new Color(255,204,51));
                break;
            case 4:
                jPanel1.setBackground(new Color(146,208,80));
                break;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pantalla p = new Pantalla();
                p.setVisible(true);
                p.actualizarPassword();
            }
        });     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCopiar;
    private javax.swing.JButton btnDecremento;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnIncremento;
    private javax.swing.JTextField campoPassword;
    private javax.swing.JCheckBox checkMayus;
    private javax.swing.JCheckBox checkMinus;
    private javax.swing.JCheckBox checkNums;
    private javax.swing.JCheckBox checkSim;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tamPasswd;
    // End of variables declaration//GEN-END:variables
}