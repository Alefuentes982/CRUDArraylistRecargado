/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudalumnos;

import static crudalumnos.AlumnoDao.cargarDatosEnTabla;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;

/**
 *
 * @author Laboratorio
 */
public class CrudAlumnos extends javax.swing.JFrame {

    /**
     * Creates new form CrudAlumnos
     */
 
    public CrudAlumnos() {
        initComponents();
        AlumnoDao.llenar();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldRut = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldEdad = new javax.swing.JTextField();
        jButton1Agregar = new javax.swing.JButton();
        jButton2Buscar = new javax.swing.JButton();
        jButton3Eliminar = new javax.swing.JButton();
        jButton4Modificar = new javax.swing.JButton();
        jButton5Listar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1Visor = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAlumno = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText("CRUD DE ALUMNOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel2.setText("Rut:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel4.setText("Edad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        jTextFieldRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRutActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 220, -1));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 220, -1));

        jTextFieldEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEdadActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 220, -1));

        jButton1Agregar.setText("Agregar");
        jButton1Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AgregarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 80, -1));

        jButton2Buscar.setText("Buscar");
        jButton2Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 80, -1));

        jButton3Eliminar.setText("Eliminar");
        jButton3Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3EliminarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 80, -1));

        jButton4Modificar.setText("Modificar");
        jButton4Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ModificarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 80, -1));

        jButton5Listar.setText("Listar");
        jButton5Listar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ListarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5Listar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 80, -1));

        jTextArea1Visor.setColumns(20);
        jTextArea1Visor.setRows(5);
        jScrollPane1.setViewportView(jTextArea1Visor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 320, 70));

        tblAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Rut", "Nombre", "Telefono"
            }
        ));
        jScrollPane2.setViewportView(tblAlumno);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 440, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRutActionPerformed

    public void limpiar(){
    
        jTextFieldRut.setText("");
        jTextFieldNombre.setText("");
        jTextFieldEdad.setText("");
    }
    
    
    
    private void jButton1AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AgregarActionPerformed
        // TODO add your handling code here:
        //definicion de variables
        
        String rut = "";
        String nombre = "";
        Byte edad = 0;
        
        //lectura de datos
        rut=jTextFieldRut.getText();
        nombre=jTextFieldNombre.getText();
        edad=Byte.parseByte(jTextFieldEdad.getText());
        
        Alumno alumno = new Alumno(rut, nombre, edad);
        
        if (AlumnoDao.agregar(alumno) == true){
           JOptionPane.showMessageDialog(null, "Alumno ingresado exitosamente!!");
        }else{
           JOptionPane.showMessageDialog(null, "Datos de Alumno no agregados");

        }
        limpiar();

    }//GEN-LAST:event_jButton1AgregarActionPerformed

    private void jButton4ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ModificarActionPerformed
        // TODO add your handling code here:
        String rut = "";
        rut=jTextFieldRut.getText();
        
        Alumno alumnoExistente = AlumnoDao.buscar(rut);
        if (alumnoExistente != null){
            String nuevoNombre = jTextFieldNombre.getText();
            byte nuevaEdad = Byte.parseByte(jTextFieldEdad.getText());
            
            Alumno nuevoAlumno = new Alumno(rut, nuevoNombre, nuevaEdad);
            
            if (AlumnoDao.modificar(rut, nuevoAlumno)){
               JOptionPane.showMessageDialog(null, "Alumno modificado exitosamente!!");
            }else{
                 JOptionPane.showMessageDialog(null, "error, nos e pudo modificar registro!");
            }
        }else{
             JOptionPane.showMessageDialog(null, "No se encontro el Alumno");
        }

    }//GEN-LAST:event_jButton4ModificarActionPerformed

    private void jButton5ListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ListarActionPerformed
        // TODO add your handling code here:
       AlumnoDao.cargarDatosEnTabla(tblAlumno);        
        
        for(Alumno alumno : AlumnoDao.obtenerDatos()){
            
            jTextArea1Visor.append(alumno.toString()+"\n");
            
        }
        
    }//GEN-LAST:event_jButton5ListarActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEdadActionPerformed

    private void jButton2BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2BuscarActionPerformed
        // TODO add your handling code here:
        
        String rut = "";
        rut=jTextFieldRut.getText();
        
        Alumno alumno = AlumnoDao.buscar(rut);
        
        if(alumno != null){
            jTextFieldNombre.setText(alumno.getNombre());
            jTextFieldEdad.setText(String.valueOf(alumno.getEdad()));
        }else{
           JOptionPane.showMessageDialog(null, "error rut no existe");
        } 
        
        
    }//GEN-LAST:event_jButton2BuscarActionPerformed

    private void jButton3EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3EliminarActionPerformed
        // TODO add your handling code here:
        String rut = "";
        rut=jTextFieldRut.getText();
        
        if(AlumnoDao.eliminar(rut)){
           JOptionPane.showMessageDialog(null, "registro eliminado exitosamente");
        }else{
           JOptionPane.showMessageDialog(null, "no se puede eliminar registro, rut no existe");
        } 
    }//GEN-LAST:event_jButton3EliminarActionPerformed

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
            java.util.logging.Logger.getLogger(CrudAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudAlumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new CrudAlumnos().setVisible(true);
               CrudAlumnos frame = new CrudAlumnos();
            // Centrar la ventana en la pantalla
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1Agregar;
    private javax.swing.JButton jButton2Buscar;
    private javax.swing.JButton jButton3Eliminar;
    private javax.swing.JButton jButton4Modificar;
    private javax.swing.JButton jButton5Listar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1Visor;
    private javax.swing.JTextField jTextFieldEdad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldRut;
    private javax.swing.JTable tblAlumno;
    // End of variables declaration//GEN-END:variables
}
