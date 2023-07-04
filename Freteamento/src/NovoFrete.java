
import DTO.UsuarioDTO;
import java.awt.Color;
import javax.swing.JOptionPane;

public class NovoFrete extends javax.swing.JFrame {

    private int idUsuario;

    public NovoFrete(int idUsuario) {
        this.idUsuario = idUsuario;
        initComponents();
        getContentPane().setBackground(Color.decode("#333333"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPesoProduto = new javax.swing.JTextField();
        btnOk = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tipoVeiculo = new javax.swing.JComboBox<>();
        txtPesoProduto1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(42, 41, 55));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Por favor informe o produto");

        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Por favor informe o peso do produto");

        txtPesoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoProdutoActionPerformed(evt);
            }
        });

        btnOk.setText("OK");
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Por favor escolha um tipo do veiculo");

        tipoVeiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caminhonete", "Furgão", "Caminhão" }));
        tipoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoVeiculoActionPerformed(evt);
            }
        });

        txtPesoProduto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoProduto1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Por favor informe a distância em KM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(163, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtPesoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOk)
                    .addComponent(jLabel3)
                    .addComponent(txtPesoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPesoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtPesoProduto1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void txtPesoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoProdutoActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkActionPerformed

        String produto, tipoVeiculoEscolhido;
        int distancia = 0, pesoProduto = 0;

        try {
            distancia = Integer.parseInt(txtPesoProduto1.getText());
          
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido para a distância.");
            return; 
        }

        try {
            pesoProduto = Integer.parseInt(txtPesoProduto.getText());
            
        } catch (NumberFormatException e) {
            
            JOptionPane.showMessageDialog(null, "Digite um número válido para o peso.");
            return;
        }

        produto = txtProduto.getText();
        tipoVeiculoEscolhido = tipoVeiculo.getSelectedItem().toString();

        ResultadoFrete resultado = CalculadoraFrete.calcularFrete(produto, tipoVeiculoEscolhido, distancia, pesoProduto);
        double valorTotalFrete = resultado.getValorTotalFrete();
        double taxa = resultado.getTaxa();

        String message = "Produto: " + produto + "\n"
                + "Peso: " + pesoProduto + "kg\n"
                + "Distância: " + distancia + "km\n"
                + "Veículo Escolhido: " + tipoVeiculoEscolhido + "\n"
                + "Valor para o Entregador: R$" + taxa + "\n"
                + "Valor do Frete: R$" + valorTotalFrete + "\n";

        JOptionPane.showMessageDialog(null, message);

        dispose();

    }//GEN-LAST:event_btnOkActionPerformed

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentHidden

    private void tipoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoVeiculoActionPerformed

    private void txtPesoProduto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoProduto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesoProduto1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                int idUsuario = 0;
                new NovoFrete(idUsuario).setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> tipoVeiculo;
    private javax.swing.JTextField txtPesoProduto;
    private javax.swing.JTextField txtPesoProduto1;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
