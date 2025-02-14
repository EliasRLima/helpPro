/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.Analista;

import Chamados.Chamado;
import Dao.DaoAnalista;
import Dao.DaoChamado;
import Interfaces.Login.Login;
import interfaces.GerenteDeJanelas;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Atualizados extends javax.swing.JInternalFrame {

    /**
     * Creates new form Atualizados
     */
    ArrayList<Chamado> chamados;
    int index_atual = 0;
    DaoChamado dc = new DaoChamado();
    DaoAnalista dA = new DaoAnalista();
    int categoria = 0;
    GerenteDeJanelas gerenteDeJanelas;
    
    public Atualizados(GerenteDeJanelas gdj) {
        initComponents();
        btProx.setVisible(false);
        btAnt.setVisible(false);
        btSolu.setVisible(false);
        this.gerenteDeJanelas = gdj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btProx = new javax.swing.JButton();
        btAnt = new javax.swing.JButton();
        btSolu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        btBuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSolucao = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();

        btProx.setText("Próximo");

        btAnt.setText("Anterior");

        btSolu.setText("Enviar solução");
        btSolu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSoluActionPerformed(evt);
            }
        });

        jLabel4.setText("Cliente:");

        jLabel1.setText("Categoria:");

        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Escolha uma categoria", "Celulares e telefonia", "TVs", "Projetores", "Antenas, receptores e conversores", "Fotografia e filmadoras", "Computadores", "Notebook e netbook", "Ipad e tablet", "Impressoras e suplementos", "Videogames" }));

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        jLabel2.setText("Titulo:");

        txtTitulo.setFocusable(false);

        jLabel3.setText("Descrição:");

        txtDesc.setColumns(20);
        txtDesc.setRows(5);
        txtDesc.setFocusable(false);
        jScrollPane2.setViewportView(txtDesc);

        txtSolucao.setColumns(20);
        txtSolucao.setRows(5);
        jScrollPane1.setViewportView(txtSolucao);

        jLabel5.setText("Solução:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btAnt)
                        .addGap(18, 18, 18)
                        .addComponent(btSolu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btProx))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btBuscar))
                            .addComponent(jLabel2)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(txtCliente))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel5)))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSolu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProx)
                    .addComponent(btAnt))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSoluActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSoluActionPerformed
        NovaSolução ns = new NovaSolução(this.chamados.get(this.index_atual));
        this.gerenteDeJanelas.abrirJanelas(ns);
        this.dispose();
    }//GEN-LAST:event_btSoluActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        this.categoria = cbCategoria.getSelectedIndex();
        LimparTela();
        this.chamados = new ArrayList<Chamado>();
        setChamados();
        if(this.chamados.size() > 0){
            btSolu.setVisible(true);
            cbCategoria.setSelectedIndex(this.categoria);
            visualizar();
        }else{
            btProx.setVisible(false);
            btAnt.setVisible(false);
            btSolu.setVisible(false);
            //JOptionPane.showMessageDialog(null,"Não possui novos chamados nessa categoria!","AVISO",3);
        }
    }//GEN-LAST:event_btBuscarActionPerformed
    
    private void visualizar(){
        if(this.dc.estaConectado()){
            if(this.index_atual==0 && this.index_atual!=this.chamados.size()-1){
                btAnt.setVisible(false);
                btProx.setVisible(true);
            }
            else if(this.index_atual==(this.chamados.size()-1) && this.index_atual!=this.chamados.size()-1){
                btProx.setVisible(false);
                btAnt.setVisible(true);
            }else if(this.index_atual>0 && this.index_atual<this.chamados.size()-1){
               btProx.setVisible(true);
               btAnt.setVisible(true); 
            }else if(this.index_atual==0 && this.index_atual==this.chamados.size()-1){
                btAnt.setVisible(false);
                btProx.setVisible(false);
            }
            
            if(cbCategoria.getSelectedItem().toString().equals("Escolha uma categoria")){
                btSolu.setVisible(false);
            }else if(!cbCategoria.getSelectedItem().toString().equals("Escolha uma categoria")){
                btSolu.setVisible(true);
            }
            Chamado atual = this.chamados.get(this.index_atual);
            txtSolucao.setText(atual.getSolucao());
            txtTitulo.setText(atual.getTitulo());
            txtDesc.setText(atual.getDescricao());
            txtCliente.setText(dc.getNomeCliente(atual));
        }
    }
    
    private void setChamados(){
        if(this.dc.estaConectado() && this.dA.estaConectado()){
            ArrayList<Chamado> newchamados = dc.getAtualizados(this.categoria,this.dA.getID(Login.getAnalista()));
            if(newchamados != null && newchamados.size()>0){
                this.chamados = newchamados;
            }else{
                JOptionPane.showMessageDialog(null,"Você não possui chamados pendentes nessa categoria!","AVISO",3);
            }
            
        }
    }
    private void LimparTela(){
        this.chamados = null;
        this.index_atual = 0;
        btProx.setVisible(false);
        btAnt.setVisible(false);
        btSolu.setVisible(false);
        txtCliente.setText("");
        txtDesc.setText("");
        txtTitulo.setText("");
        txtSolucao.setText("");
        cbCategoria.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAnt;
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btProx;
    private javax.swing.JButton btSolu;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextArea txtSolucao;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
