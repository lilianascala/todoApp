/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.java858.todoapp.gui;

import it.java858.todoapp.entity.Categoria;
import it.java858.todoapp.service.CategoriaService;
import it.java858.todoapp.service.event.CategoriaEventListener;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import sun.awt.X11.Screen;
import sun.awt.image.ToolkitImage;

/**
 *
 * @author tss
 */
public class Main extends javax.swing.JFrame implements 
        CategoriaEventListener{

    //private ToDo selectedTodo;
    
    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
       
        //this.setTitle("Gestione ToDo"); 
       CategoriaService.addCategoriaEventListener(this);
       Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
       int height = screenSize.height;
       int width = screenSize.width;
       this.setSize(width / 2, height / 2);
   
       //center jframe on screen
       this.setLocationRelativeTo(null);
       
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
        jTable1 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuEsci = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuCreaCategorie = new javax.swing.JMenuItem();
        mnuGestCategorie = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestione ToDo");

        jScrollPane1.setToolTipText("");
        jScrollPane1.setName(""); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");

        mnuEsci.setText("esci");
        mnuEsci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuEsciActionPerformed(evt);
            }
        });
        jMenu1.add(mnuEsci);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Categorie");

        mnuCreaCategorie.setText("crea categorie");
        mnuCreaCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCreaCategorieActionPerformed(evt);
            }
        });
        jMenu2.add(mnuCreaCategorie);

        mnuGestCategorie.setText("gestione categorie");
        mnuGestCategorie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGestCategorieActionPerformed(evt);
            }
        });
        jMenu2.add(mnuGestCategorie);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuEsciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuEsciActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mnuEsciActionPerformed

    private void mnuCreaCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCreaCategorieActionPerformed

        CategoriaEdit edit = new CategoriaEdit(new Categoria(), this, true);
        edit.setLocationRelativeTo(this);
        edit.setVisible(true);


    }//GEN-LAST:event_mnuCreaCategorieActionPerformed

    private void mnuGestCategorieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGestCategorieActionPerformed
        CategoriaCRUD crud = new CategoriaCRUD(this, true);
        crud.setLocationRelativeTo(this);
        crud.setVisible(true);


    }//GEN-LAST:event_mnuGestCategorieActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JMenuItem mnuCreaCategorie;
    private javax.swing.JMenuItem mnuEsci;
    private javax.swing.JMenuItem mnuGestCategorie;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onCreate(Categoria c) {
        JOptionPane.showMessageDialog(this, "Creato nuovacategoria");
    }

    @Override
    public void onUpdate(Categoria c) {
        JOptionPane.showMessageDialog(this,"Modificato la categoria");
    }

    @Override
    public void onDelete(Categoria c) {
        JOptionPane.showMessageDialog(this, "Cancellato la categoria");
    }
}
