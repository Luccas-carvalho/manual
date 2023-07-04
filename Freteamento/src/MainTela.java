
public class MainTela extends javax.swing.JFrame {

    private int idUsuario;

    public MainTela() {
        initComponents();

    }

    public MainTela(int idUsuario) {
        this();
        this.idUsuario = idUsuario;

        System.out.println("IDusu:" + idUsuario);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Company = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSolicitarFrete = new javax.swing.JButton();
        btnVisualizarProdutosPostados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(42, 41, 55));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Company.setFont(new java.awt.Font("Silicone Hv", 0, 36)); // NOI18N
        Company.setForeground(new java.awt.Color(255, 255, 255));
        Company.setText("FRETES Express");
        jPanel1.add(Company, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Produtos postados");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Solicitar frete");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        btnSolicitarFrete.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnSolicitarFrete.setForeground(new java.awt.Color(42, 41, 55));
        btnSolicitarFrete.setText("Solicitar");
        btnSolicitarFrete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarFreteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSolicitarFrete, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 150, 30));

        btnVisualizarProdutosPostados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnVisualizarProdutosPostados.setForeground(new java.awt.Color(42, 41, 55));
        btnVisualizarProdutosPostados.setText("Visualizar");
        btnVisualizarProdutosPostados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarProdutosPostadosActionPerformed(evt);
            }
        });
        jPanel1.add(btnVisualizarProdutosPostados, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSolicitarFreteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarFreteActionPerformed
        NovoFrete objNovoFrete = new NovoFrete(idUsuario);
        objNovoFrete.setVisible(true);

    }//GEN-LAST:event_btnSolicitarFreteActionPerformed

    private void btnVisualizarProdutosPostadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarProdutosPostadosActionPerformed
        VisualizarProdutos objVisualizarProdutos = new VisualizarProdutos();
        objVisualizarProdutos.setVisible(true);
    }//GEN-LAST:event_btnVisualizarProdutosPostadosActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Company;
    private javax.swing.JButton btnSolicitarFrete;
    private javax.swing.JButton btnVisualizarProdutosPostados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
