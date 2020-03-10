/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.NotasController;
import viewmodel.NotasViewModel;

/**
 *
 * @author jonathan
 */
public class NotasView extends javax.swing.JFrame implements java.util.Observer {

    /**
     * Creates new form NotasView
     */
    
    private NotasController controller;
    private NotasViewModel model;
    
    public NotasView() {
        initComponents();
    }

    public NotasController getController() {
        return controller;
    }

    public void setController(NotasController controller) {
        this.controller = controller;
    }

    public NotasViewModel getModel() {
        return model;
    }

    public void setModel(NotasViewModel model) {
        this.model = model;
        model.addObserver(this);
    }
    
    public void setTitleLbl(String text){
        this.groupTitle.setText(text);
    }
    
     @Override
   public void update(java.util.Observable updatedModel,Object parametros){
       //this.controller.setTableModel();
         //this.notasTable.setModel(this.controller.getModel().getNotas()); 
   }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        notasTable = new javax.swing.JTable();
        groupTitle = new javax.swing.JLabel();
        volverBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        notasTable.setModel(new javax.swing.table.DefaultTableModel(
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
        notasTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notasTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(notasTable);

        groupTitle.setFont(new java.awt.Font("DejaVu Sans", 0, 24)); // NOI18N
        groupTitle.setText("jLabel1");

        volverBtn.setText("Volver");
        volverBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(groupTitle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(volverBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(groupTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(volverBtn)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notasTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notasTableMouseClicked
       if(evt.getClickCount()==2){
               int row = this.notasTable.getSelectedRow();
                 int col = this.notasTable.getSelectedColumn();
           if(this.notasTable.isRowSelected(row)&&this.notasTable.isColumnSelected(col)){
                controller.Editar(row, this.getLocation());
           }
       }
    }//GEN-LAST:event_notasTableMouseClicked

    private void volverBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverBtnActionPerformed
        this.controller.goBack(this.getLocation());
    }//GEN-LAST:event_volverBtnActionPerformed

    /**
     * @param args the command line arguments
     */
   public void updateTable(){
       this.notasTable.setModel(this.controller.getModel().getNotas());
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel groupTitle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable notasTable;
    private javax.swing.JButton volverBtn;
    // End of variables declaration//GEN-END:variables
}

