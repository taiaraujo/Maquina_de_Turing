
import java.util.ArrayList;



public class mtTela extends javax.swing.JFrame {
    
    ArrayList <String> showFita = new ArrayList<>(); // guardar todos os estados da fita
    
    mtControle mt = new mtControle();
    String liberarMt;

    public mtTela() {
        initComponents();
    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ctValorLido = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ctValorEscrito = new javax.swing.JTextField();
        ctProximaPosicao = new javax.swing.JTextField();
        ctDirecao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ctPosicaoAtual = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btAddRegra = new javax.swing.JButton();
        ctEstadoInicial = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btAddRegra1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        ctEstadoFinal = new javax.swing.JTextField();
        btAddRegra2 = new javax.swing.JButton();
        ctAlf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btAlf1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btAlf = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        ctPalavra = new javax.swing.JTextField();
        btAddPalavra = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        showPalavra = new javax.swing.JLabel();
        btMaq = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jlEI = new javax.swing.JLabel();
        jlEF = new javax.swing.JLabel();
        jlalf = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 308, Short.MAX_VALUE)
        );

        jLabel14.setText("Estado(s) Final(is)");

        jLabel15.setText("Estado(s) Final(is)");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maquina de Turning");
        setBackground(new java.awt.Color(168, 225, 218));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Transições"));

        ctValorLido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctValorLidoActionPerformed(evt);
            }
        });

        jLabel10.setText("Proxima Posição");

        jLabel11.setText("Valor Escrito");

        jLabel12.setText("Direção");

        jLabel6.setText("Posição Atual");

        ctValorEscrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctValorEscritoActionPerformed(evt);
            }
        });

        ctProximaPosicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctProximaPosicaoActionPerformed(evt);
            }
        });

        ctDirecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctDirecaoActionPerformed(evt);
            }
        });

        jLabel8.setText("=");

        ctPosicaoAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPosicaoAtualActionPerformed(evt);
            }
        });

        jLabel9.setText("Valor Lido");

        btAddRegra.setText("Adicionar Regra");
        btAddRegra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddRegraActionPerformed(evt);
            }
        });

        ctEstadoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctEstadoInicialActionPerformed(evt);
            }
        });

        jLabel13.setText("Estado(s) Final(is)");

        btAddRegra1.setText("Adicionar Estado");
        btAddRegra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddRegra1ActionPerformed(evt);
            }
        });

        jLabel16.setText("Estado Inicial");

        ctEstadoFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctEstadoFinalActionPerformed(evt);
            }
        });

        btAddRegra2.setText("Adicionar Estado");
        btAddRegra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddRegra2ActionPerformed(evt);
            }
        });

        ctAlf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctAlfActionPerformed(evt);
            }
        });

        jLabel1.setText("Legenda: '*' - Inicio da Fita e '$' - Branco");

        btAlf1.setText("Limpar Transações");
        btAlf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlf1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Alfabeto");

        btAlf.setText("Adiconar Alfabeto");
        btAlf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(ctEstadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btAddRegra2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ctValorLido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(7, 7, 7)))))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(jLabel10)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(jLabel8)
                                    .addGap(18, 18, 18)
                                    .addComponent(ctProximaPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(57, 57, 57)
                                    .addComponent(ctValorEscrito, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(42, 42, 42)
                                    .addComponent(ctDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(ctEstadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(31, 31, 31)
                                        .addComponent(btAddRegra1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jLabel13)))
                                .addGap(24, 24, 24)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ctAlf, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btAlf1, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btAddRegra)
                                .addGap(7, 7, 7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btAlf)
                                .addContainerGap())))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ctPosicaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(548, 548, 548))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctPosicaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctValorLido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(ctProximaPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctValorEscrito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAddRegra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ctEstadoInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddRegra2)
                            .addComponent(ctEstadoFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btAddRegra1)
                            .addComponent(ctAlf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btAlf)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btAlf1))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar Palavra"));

        ctPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctPalavraActionPerformed(evt);
            }
        });

        btAddPalavra.setText("Adicionar Palavra");
        btAddPalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAddPalavraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(ctPalavra)
                .addGap(18, 18, 18)
                .addComponent(btAddPalavra))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(ctPalavra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(btAddPalavra))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Cabeçote"));

        jLabel2.setFont(new java.awt.Font("Bitstream Charter", 0, 10)); // NOI18N
        jLabel2.setText("Autora: Natália Araújo");

        status.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        status.setForeground(new java.awt.Color(226, 74, 74));
        status.setText("STATUS");

        showPalavra.setFont(new java.awt.Font("Bitstream Charter", 0, 18)); // NOI18N
        showPalavra.setForeground(new java.awt.Color(226, 78, 78));
        showPalavra.setText("PALAVRA");

        btMaq.setText("Maquinar");
        btMaq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMaqActionPerformed(evt);
            }
        });

        ta.setBackground(new java.awt.Color(199, 216, 216));
        ta.setColumns(20);
        ta.setFont(new java.awt.Font("Bitstream Charter", 0, 24)); // NOI18N
        ta.setRows(5);
        jScrollPane3.setViewportView(ta);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(showPalavra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btMaq))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(status)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showPalavra)
                    .addComponent(btMaq))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(status)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Mostrar Transições"));

        jlEI.setText("Estado Inicial");

        jlEF.setText("Estado Final");

        jlalf.setText("Alfabeto");

        ta1.setBackground(new java.awt.Color(199, 216, 216));
        ta1.setColumns(20);
        ta1.setFont(new java.awt.Font("Bitstream Charter", 0, 24)); // NOI18N
        ta1.setRows(5);
        jScrollPane4.setViewportView(ta1);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlalf)
                    .addComponent(jlEF)
                    .addComponent(jlEI))
                .addGap(66, 66, 66))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jlEI)
                        .addGap(18, 18, 18)
                        .addComponent(jlEF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlalf)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ctValorLidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctValorLidoActionPerformed

    }//GEN-LAST:event_ctValorLidoActionPerformed

    private void ctValorEscritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctValorEscritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctValorEscritoActionPerformed

    private void ctProximaPosicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctProximaPosicaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctProximaPosicaoActionPerformed

    private void ctDirecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctDirecaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctDirecaoActionPerformed

    private void ctPosicaoAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPosicaoAtualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPosicaoAtualActionPerformed

    private void ctPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctPalavraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctPalavraActionPerformed

    private void btAddPalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddPalavraActionPerformed
        // TODO add your handling code here:
        liberarMt = mt.recuperarPalavra(ctPalavra.getText()); // ler a palavra e mostra se pertence ao alfabeto
        showPalavra.setText(ctPalavra.getText()); // mostra em tela a palavra
        showFita.clear(); // limpa o show fita
        ctPalavra.setText(""); status.setText(""); ta.setText(""); //limpa as mensagens da tela
    }//GEN-LAST:event_btAddPalavraActionPerformed

    private void ctEstadoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctEstadoInicialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctEstadoInicialActionPerformed

    private void btAddRegra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddRegra1ActionPerformed
        // TODO add your handling code here:
        jlEF.setText(mt.recuperarEF(ctEstadoFinal.getText())); //recupera e escreve os estados finais
        ctEstadoFinal.setText("");
    }//GEN-LAST:event_btAddRegra1ActionPerformed

    private void ctEstadoFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctEstadoFinalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctEstadoFinalActionPerformed

    private void btAddRegra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddRegra2ActionPerformed
        // TODO add your handling code here:
        jlEI.setText(mt.recuperarEI(ctEstadoInicial.getText())); //recupera e escreve o estado inicial
        ctEstadoInicial.setText("");
    }//GEN-LAST:event_btAddRegra2ActionPerformed

    private void btMaqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMaqActionPerformed
        // CONTROLE : monitora o while / q = recebe os estados / resultado mostra resultado
           String controle = liberarMt, q = mt.estadoInicial, resultado; 
           int i = 0; //aux no showFita
           showFita.add(i, mt.fita+""); // recebe a fita antes de ir para a maquina
           mt.f = 1; // marca posição da fita
           mt.t = -1; // marca a posição das transações e controla o while
// ************************ MAQUINANDO TURING ************************************//
           while(!controle.equals("fim")){
               i++;   
               mt.t = mt.buscarT(q, mt.fita.get(mt.f)); //verifica se a transicao a seguir
               //caso haja transição
               if(mt.t != -1){
                    q = mt.posicaoProxima.get(mt.t); // q recebe novo estado
                    mt.fita.set(mt.f, mt.valorEscrever.get(mt.t)); //escreve-se na fita de acordo com a transição
                    showFita.add(i, mt.fita+""); // showFita recebe mais um estado da fita
                    if(mt.direcao.get(mt.t).equals("D")){ //caso se mova para direita
                        mt.f++;
                        if(mt.f == mt.fita.size()-1){ //chegando perto do fim da fita
                        mt.fita.add(mt.f+1, "$");
                    }}
                    if(mt.direcao.get(mt.t).equals("E")){mt.f--;} //caso se mova para a esquerda
                    
                    controle = mt.buscarEstadosF(q); //busca se foi  estado final
                    System.out.println(mt.fita);}
               //caso NÃO haja transição
               else{
                   controle = "fim"; //encerrar o while
               }
           }
// ************************ MAQUINOU TURING ************************************//          
           if(mt.t!= -1){resultado = "Palavra Aceita";}
           else{resultado = "Palavra Recusada";}
           status.setText(resultado);
           //para mostrar os estados da fita em tela 
           for(i=0; i<showFita.size();i++){
               ta.append(showFita.get(i)+"\n");
           }

    }//GEN-LAST:event_btMaqActionPerformed
   
    private void ctAlfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctAlfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctAlfActionPerformed

    private void btAddRegraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAddRegraActionPerformed
        //recuperar as transições e salvar em suas respctivas arrays
        mt.recuperarTransicao(ctPosicaoAtual.getText(), ctValorLido.getText(),
            ctProximaPosicao.getText(), ctValorEscrito.getText(), ctDirecao.getText());
        //limpar caixas de texto
        ctPosicaoAtual.setText("");
        ctValorLido.setText("");
        ctProximaPosicao.setText("");
        ctValorEscrito.setText("");
        ctDirecao.setText("");
        ta1.setText("");
        //mostrar as transações cadastradas em tela
        for (int z =0; z < mt.posicaoAtual.size(); z++){
            ta1.append("["+z +"]: " +mt.posicaoAtual.get(z)+" , "+ mt.valorLido.get(z) + " = " +
                    mt.posicaoProxima.get(z) + " , " + mt.valorEscrever.get(z) +
                    " , " + mt.direcao.get(z) + "\n");
        }

    }//GEN-LAST:event_btAddRegraActionPerformed

    private void btAlfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlfActionPerformed
        // salva o alfabeto
        jlalf.setText(mt.recuperarAlf(ctAlf.getText()));
        ctAlf.setText("");
    }//GEN-LAST:event_btAlfActionPerformed

    private void btAlf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlf1ActionPerformed
        // limpa as transições para ser inserida nova Maquina
        mt.clearT();
        ta1.setText("");
    }//GEN-LAST:event_btAlf1ActionPerformed

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mtTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mtTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mtTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mtTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mtTela().setVisible(true);
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAddPalavra;
    private javax.swing.JButton btAddRegra;
    private javax.swing.JButton btAddRegra1;
    private javax.swing.JButton btAddRegra2;
    private javax.swing.JButton btAlf;
    private javax.swing.JButton btAlf1;
    private javax.swing.JButton btMaq;
    private javax.swing.JTextField ctAlf;
    private javax.swing.JTextField ctDirecao;
    private javax.swing.JTextField ctEstadoFinal;
    private javax.swing.JTextField ctEstadoInicial;
    private javax.swing.JTextField ctPalavra;
    private javax.swing.JTextField ctPosicaoAtual;
    private javax.swing.JTextField ctProximaPosicao;
    private javax.swing.JTextField ctValorEscrito;
    private javax.swing.JTextField ctValorLido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel jlEF;
    private javax.swing.JLabel jlEI;
    private javax.swing.JLabel jlalf;
    private javax.swing.JLabel showPalavra;
    private javax.swing.JLabel status;
    private javax.swing.JTextArea ta;
    private javax.swing.JTextArea ta1;
    // End of variables declaration//GEN-END:variables


}
