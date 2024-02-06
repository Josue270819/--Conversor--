package Modelo;



import java.awt.Dimension;
import java.io.IOException;

public class Ventana extends javax.swing.JFrame {

    public Ventana() throws IOException {
        setSize(500, 500);
        setLocation(550, 100);
        setMinimumSize(new Dimension(610, 870));
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Sis_Base = new javax.swing.JComboBox<>();
        Convertir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Resultado = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Mos_Resul = new javax.swing.JTextArea();
        Limpiar_Conver = new javax.swing.JButton();
        Valor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Convertidor de Sistemas Numericos");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 10, 420, 60);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Selecione una conversion");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 140, 250, 30);

        Sis_Base.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Sis_Base.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione una opcion", "1. Binario a Decimal", "2. Binario a Octal", "3. Binario a Hexadecimal", "4. Decimal a Binario", "5. Decimal a Octal", "6. Decimal a Hexadecimal", "7. Octal a Binario", "8. Octal a Decimal", "9. Octal a Hexadecimal", "10. Hexadecimal a Binario", "11. Hexadecimal a Decimal", "12. Hexadecimal a Octal" }));
        Sis_Base.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Sis_BaseActionPerformed(evt);
            }
        });
        jPanel1.add(Sis_Base);
        Sis_Base.setBounds(320, 140, 220, 23);

        Convertir.setBackground(new java.awt.Color(204, 204, 255));
        Convertir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Convertir.setText("Convertir");
        Convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertirActionPerformed(evt);
            }
        });
        jPanel1.add(Convertir);
        Convertir.setBounds(20, 330, 140, 60);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Ingresa el numero a convertir");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 230, 260, 40);

        Resultado.setEditable(false);
        Resultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultadoActionPerformed(evt);
            }
        });
        jPanel1.add(Resultado);
        Resultado.setBounds(170, 320, 290, 80);

        Limpiar.setBackground(new java.awt.Color(0, 153, 153));
        Limpiar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Limpiar.setText("Limpiar Todo");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar);
        Limpiar.setBounds(130, 480, 160, 50);

        Guardar.setBackground(new java.awt.Color(255, 204, 51));
        Guardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        jPanel1.add(Guardar);
        Guardar.setBounds(320, 480, 110, 50);

        Mos_Resul.setEditable(false);
        Mos_Resul.setColumns(20);
        Mos_Resul.setRows(5);
        jScrollPane1.setViewportView(Mos_Resul);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(50, 580, 500, 250);

        Limpiar_Conver.setBackground(new java.awt.Color(0, 255, 51));
        Limpiar_Conver.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Limpiar_Conver.setText("Limpiar");
        Limpiar_Conver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Limpiar_ConverActionPerformed(evt);
            }
        });
        jPanel1.add(Limpiar_Conver);
        Limpiar_Conver.setBounds(470, 340, 110, 50);

        Valor.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Valor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorActionPerformed(evt);
            }
        });
        jPanel1.add(Valor);
        Valor.setBounds(310, 230, 260, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Sis_BaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Sis_BaseActionPerformed

    }//GEN-LAST:event_Sis_BaseActionPerformed

    private void ResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultadoActionPerformed

    }//GEN-LAST:event_ResultadoActionPerformed

    private void ConvertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertirActionPerformed

        int dec;
        String decimal, oct, bin, hexa;
        bin = Valor.getText().toString();
        oct = Valor.getText().toString();
        hexa = Valor.getText().toString();

        if (Sis_Base.getSelectedItem().equals("1. Binario a Decimal")) {
            
            dec = Integer.parseInt(bin, 2);
            Resultado.setText(String.valueOf(dec));
            
        } else if (Sis_Base.getSelectedItem().equals("2. Binario a Octal")) {
            
            dec = Integer.parseInt(bin, 2);
            bin = Integer.toOctalString(dec);
            Resultado.setText(String.valueOf(bin));
            
        } else if (Sis_Base.getSelectedItem().equals("3. Binario a Hexadecimal")) {
            
            dec = Integer.parseInt(bin, 2);
            bin = Integer.toHexString(dec).toUpperCase();
            Resultado.setText(String.valueOf(bin));
            
        } else if (Sis_Base.getSelectedItem().equals("4. Decimal a Binario")) {
            
            dec = Integer.parseInt(Valor.getText());
            decimal = Integer.toBinaryString(dec);
            Resultado.setText(String.valueOf(decimal));
            
        } else if (Sis_Base.getSelectedItem().equals("5. Decimal a Octal")) {
            
            dec = Integer.parseInt(Valor.getText());
            decimal = Integer.toOctalString(dec);
            Resultado.setText(String.valueOf(decimal));
            
        } else if (Sis_Base.getSelectedItem().equals("6. Decimal a Hexadecimal")) {
            
            dec = Integer.parseInt(Valor.getText());     
            decimal = Integer.toHexString(dec);
            Resultado.setText(String.valueOf(decimal).toUpperCase());
            
        } else if (Sis_Base.getSelectedItem().equals("7. Octal a Binario")) {
            
            dec = Integer.parseInt(oct, 8);
            oct = Integer.toBinaryString(dec);
            Resultado.setText(String.valueOf(oct));
            
        } else if (Sis_Base.getSelectedItem().equals("8. Octal a Decimal")) {
            
            dec = Integer.parseInt(oct, 8);
            Resultado.setText(String.valueOf(dec));
            
        } else if (Sis_Base.getSelectedItem().equals("9. Octal a Hexadecimal")) {
            
            dec = Integer.parseInt(oct, 8);
            oct = Integer.toHexString(dec).toUpperCase();
            Resultado.setText(String.valueOf(oct));
            
        } else if (Sis_Base.getSelectedItem().equals("10. Hexadecimal a Binario")) {
            
            dec = Integer.parseInt(hexa, 16);
            hexa = Integer.toBinaryString(dec);
            Resultado.setText(hexa);
            
        } else if (Sis_Base.getSelectedItem().equals("11. Hexadecimal a Decimal")) {

            dec = Integer.parseInt(hexa, 16);
            Resultado.setText(String.valueOf(dec));
            
        } else if (Sis_Base.getSelectedItem().equals("12. Hexadecimal a Octal")) {
            
            dec = Integer.parseInt(hexa, 16);
            hexa = Integer.toOctalString(dec);
            Resultado.setText(hexa);
        }
    }//GEN-LAST:event_ConvertirActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String valor = Valor.getText();
        String resul = Resultado.getText();
        String conv = (String) Sis_Base.getSelectedItem();
        Mos_Resul.append(conv);
        Mos_Resul.append("\n" + "El numero " + valor + " convertido es: " + resul + "\n\n");
    }//GEN-LAST:event_GuardarActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed
        Valor.setText("");
        Resultado.setText("");
        Mos_Resul.setText("");
    }//GEN-LAST:event_LimpiarActionPerformed

    private void Limpiar_ConverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Limpiar_ConverActionPerformed
        Valor.setText("");
        Resultado.setText("");
    }//GEN-LAST:event_Limpiar_ConverActionPerformed

    private void ValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorActionPerformed

    }//GEN-LAST:event_ValorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Convertir;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton Limpiar;
    private javax.swing.JButton Limpiar_Conver;
    private javax.swing.JTextArea Mos_Resul;
    public javax.swing.JTextField Resultado;
    private javax.swing.JComboBox<String> Sis_Base;
    private javax.swing.JTextField Valor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
