package webcamqr;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Inasistencias extends javax.swing.JFrame {
    
    int id_asignatura = 0;
    
    public Inasistencias() {
        initComponents();
        cargarAsignaturas();
        this.setResizable(false); // Deshabilitar maximizacion del jframe
        this.setLocationRelativeTo(null); // Centrar jframe
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
        tabla_ina = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        asignaturas = new javax.swing.JComboBox<>();
        hora = new javax.swing.JLabel();
        fechas = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tabla_ina.setBackground(java.awt.Color.orange);
        tabla_ina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario"
            }
        ));
        jScrollPane1.setViewportView(tabla_ina);

        jLabel1.setText("Inasistencias");

        asignaturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignaturasActionPerformed(evt);
            }
        });

        hora.setText("Hora");

        fechas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechasActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Fecha"
            }
        ));
        jScrollPane2.setViewportView(tabla);

        jLabel2.setText("Asistencias");

        jLabel3.setText("Inasistencias");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addComponent(asignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fechas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(149, 149, 149))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(hora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asignaturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(141, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void asignaturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignaturasActionPerformed
        Statement sentencia;
        ResultSet resultado;
        String consulta;
        consulta = "SELECT id_asignatura,hora_inicio,hora_fin FROM asignaturas WHERE nombre='"+asignaturas.getSelectedItem()+"'";
        
        try {
            
        sentencia = Conexion.obtener().createStatement();
        resultado = sentencia.executeQuery(consulta);
      
            if (resultado.next()){
                id_asignatura = resultado.getInt(1);
                cargarFechas();
                hora.setText("Hora: "+resultado.getString(2)+"-"+resultado.getString(3));
            }
        } catch (ClassNotFoundException | SQLException e) {
                            
        e.printStackTrace();
                        
        }
    }//GEN-LAST:event_asignaturasActionPerformed

    private void fechasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechasActionPerformed

            tabla(fechas.getSelectedItem());       
    }//GEN-LAST:event_fechasActionPerformed

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
            java.util.logging.Logger.getLogger(Inasistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inasistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inasistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inasistencias.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inasistencias().setVisible(true);
            }
        });
    }
    
    // Metodo para llenar la tabla
    public void tabla (Object fecha){
        
    DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
    DefaultTableModel modelo2 = (DefaultTableModel) tabla_ina.getModel();
    
    modelo.setRowCount(0);
    modelo2.setRowCount(0);
    
    if (fecha != null){
    
    Statement sentencia;
    ResultSet resultado;
    String consulta;
    
    consulta = "SELECT usuarios.apellido,asistencias.fecha FROM usuarios,asistencias WHERE ((usuarios.id_usuario=asistencias.id_usuario) AND (asistencias.id_asignatura_a="+id_asignatura+") AND (DATE(asistencias.fecha)='"+fecha+"'))";

    try {
    // Se crea un array que será una de las filas de la tabla.
    Object [] fila = new Object[2]; // Hay tres columnas en la tabla
    sentencia = Conexion.obtener().createStatement();
    resultado = sentencia.executeQuery(consulta);

        // Bucle para cada resultado en la consulta
        while (resultado.next())
        {
           // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
           for (int i=0;i<2;i++)
              fila[i] = resultado.getObject(i+1); // El primer indice en resultado es el 1, no el cero, por eso se suma 1.

           // Se añade al modelo la fila completa.
           modelo.addRow(fila);

        }
        
        consulta = "SELECT usuarios.apellido FROM usuarios WHERE NOT EXISTS (SELECT * FROM asistencias WHERE (usuarios.id_usuario=asistencias.id_usuario) AND (asistencias.id_asignatura_a="+id_asignatura+") AND (DATE(asistencias.fecha)='"+fecha+"')) AND FIND_IN_SET("+id_asignatura+",usuarios.id_asignatura_a)";
        resultado = sentencia.executeQuery(consulta);
        
        // Bucle para cada resultado en la consulta
        while (resultado.next())
        {
           // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
           
              fila[0] = resultado.getObject(1); // El primer indice en resultado es el 1, no el cero, por eso se suma 1.
              fila[1] = "-";
           // Se añade al modelo la fila completa.
           modelo2.addRow(fila);

        }
    }catch (ClassNotFoundException | SQLException e) {
                            
        e.printStackTrace();
                        
    }
    }
    }
    
    // Metodo para cargar las aulas en el combo box
    public void cargarAsignaturas(){
        Statement sentencia;
        ResultSet resultado;
        String consulta;
        consulta = "SELECT nombre FROM asignaturas ORDER BY id_asignatura ASC";
        
        try {
            
        sentencia = Conexion.obtener().createStatement();
        resultado = sentencia.executeQuery(consulta);
       
        while(resultado.next()){
            asignaturas.addItem(resultado.getString(1));
        }
        } catch (ClassNotFoundException | SQLException e) {
                            
        e.printStackTrace();
                        
        }
    }

    // Metodo para cargar las aulas en el combo box
    public void cargarFechas(){
        Statement sentencia;
        ResultSet resultado;
        String consulta;
        
        fechas.removeAllItems();
        
        consulta = "SELECT DATE_FORMAT(fecha,'%Y-%m-%d') AS 'date' FROM asistencias WHERE id_asignatura_a='"+id_asignatura+"' GROUP BY date ORDER BY fecha DESC";
        
        try {
            
        sentencia = Conexion.obtener().createStatement();
        resultado = sentencia.executeQuery(consulta);
       
        while(resultado.next()){
           fechas.addItem(resultado.getString(1));
        }
        } catch (ClassNotFoundException | SQLException e) {
                            
        e.printStackTrace();
                        
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> asignaturas;
    private javax.swing.JComboBox<String> fechas;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla_ina;
    // End of variables declaration//GEN-END:variables
}
