/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package n43_aplicacionescritorio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Persona;

/**
 *
 * @author Usuario
 */
public class Vista extends javax.swing.JFrame {

    ArrayList <Persona> listaPersonaes = new ArrayList <Persona>();
    int i = 0;
    String accion;
    boolean datoPrimero = false;
    
    public Vista() {
        initComponents();
        
        leerDatos();
        refrescar(0);

        activarDesactivarFlechas();

        this.btn_guardar.setEnabled(false);
        this.btn_cancelar.setEnabled(false);

        this.error_nombre.setVisible(false);
        this.error_apellido.setVisible(false);
        this.error_pais.setVisible(false);
        this.error_edad.setVisible(false);

        
    }


    public void vaciarCampos() {
        this.tf_nombre.setText("");
        this.tf_apellido.setText("");
        this.tf_pais.setText("");
        this.tf_edad.setText("");

        this.tf_nombre.setEditable(true);
        this.tf_apellido.setEditable(true);
        this.tf_pais.setEditable(true);
        this.tf_edad.setEditable(true);
    }

    public void refrescar(int i) {
        this.tf_nombre.setText(listaPersonaes.get(i).getNombre());
        this.tf_apellido.setText(listaPersonaes.get(i).getApellido());
        this.tf_pais.setText(listaPersonaes.get(i).getPais());
        this.tf_edad.setText(String.valueOf(listaPersonaes.get(i).getEdad()));

        //i = 0;
    }

    public void activarFlechasAlante(boolean ac) {
        this.btn_posterior.setEnabled(ac);
        this.btn_ultimo.setEnabled(ac);
    }

    public void activarFlechasAtras(boolean ac) {
        this.btn_anterior.setEnabled(ac);
        this.btn_primero.setEnabled(ac);
    }
    
    public void activarBotonesCentrales(boolean ac) {
        this.btn_insertar.setEnabled(ac);
        this.btn_eliminar.setEnabled(ac);
        this.btn_modificar.setEnabled(ac);
    }
    
    public void activarBotonesSuperiores(boolean ac) {
        this.btn_guardar.setEnabled(ac);
        this.btn_cancelar.setEnabled(ac);
    }
    
    public void activarDesactivarFlechas() {
        if (i == listaPersonaes.size() - 1 && listaPersonaes.size() > 1) {
            activarFlechasAlante(false);
            activarFlechasAtras(true);
        } else if (i == 0 && listaPersonaes.size() == 1) {
            activarFlechasAlante(false);
            activarFlechasAtras(false);
        } else if (i == 0) {
            activarFlechasAlante(true);
            activarFlechasAtras(false);
        }else {
            activarFlechasAlante(true);
            activarFlechasAtras(true);
        }
    }
    
    public void llenarDatoFantasma() {
        Persona miPersona = new Persona();
        miPersona.setNombre("");
        miPersona.setEdad(0);
        listaPersonaes.add(miPersona);
        this.btn_eliminar.setEnabled(false);
        this.btn_modificar.setEnabled(false);
        datoPrimero = true;
    }
    // lee del fichero de texto ficheroEscirbirPersona.txt
    private void leerDatos() {
        try {
            // indico donde esta el fichero (ruta) (2ª lin)
            // Pasar los datos a un buffer para leerlo desde la memoria ram (2ª lin)
            FileReader fichero = new FileReader("C:\\Users\\Usuario\\Desktop\\ADRIAN\\INFORMATICA\\DAW2\\SerjioJava\\ficheroEscribirPersona.txt");
            BufferedReader datos = new BufferedReader(fichero);
            
            String linea = datos.readLine();
            if (linea != null) {
                while(linea != null) {
                    Persona miPersona = new Persona();
                    String fila[] = linea.split(":");
                    miPersona.setNombre(fila[0]);
                    miPersona.setApellido(fila[1]);
                    miPersona.setPais(fila[2]);
                    miPersona.setEdad(Integer.valueOf(fila[3]));
                    listaPersonaes.add(miPersona);
                    linea = datos.readLine();
                }
            } else {
                JOptionPane.showMessageDialog(null,"El fichero aun no contiene datos");
                llenarDatoFantasma();
            }
            //this.TextArea.setText(texto);
            datos.close();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    
    // Escribe en el fichero de texto ficheroEscirbirPersona.txt
    private void escribirDatos() {
        try {
            FileWriter ficheroEscribir = new FileWriter("C:\\Users\\Usuario\\Desktop\\ADRIAN\\INFORMATICA\\DAW2\\SerjioJava\\ficheroEscribirPersona.txt");
            BufferedWriter datosEscribir = new BufferedWriter(ficheroEscribir);
            // recorrer ArrayList
            // escribir en fichero
            for(Persona miPersona:listaPersonaes) {
                datosEscribir.write(miPersona.toString());
                datosEscribir.newLine();
            }
            datosEscribir.close();
            //JOptionPane.showMessageDialog(null,"Guardado correctamente");
        } catch (IOException ex) {
            //JOptionPane.showMessageDialog(null,ex);
            JOptionPane.showMessageDialog(null,"Error al guardar");
        }
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        JpPersona = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tf_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_edad = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        btn_primero = new javax.swing.JButton();
        btn_anterior = new javax.swing.JButton();
        btn_posterior = new javax.swing.JButton();
        btn_ultimo = new javax.swing.JButton();
        btn_insertar = new javax.swing.JButton();
        error_nombre = new javax.swing.JLabel();
        error_edad = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tf_apellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_pais = new javax.swing.JTextField();
        error_apellido = new javax.swing.JLabel();
        error_pais = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpPersona.setBorder(javax.swing.BorderFactory.createTitledBorder("Registrar persona"));

        jLabel1.setText("nombre:");
        jLabel1.setToolTipText("Introduce el nombre");

        tf_nombre.setEditable(false);
        tf_nombre.setToolTipText("Debes de introducir un nombre");

        jLabel3.setText("edad");

        tf_edad.setEditable(false);

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png"))); // NOI18N
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_eliminar.setText("Eliminar");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        btn_modificar.setText("modificar");
        btn_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modificarActionPerformed(evt);
            }
        });

        btn_primero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/primer.png"))); // NOI18N
        btn_primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_primeroActionPerformed(evt);
            }
        });

        btn_anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enrere.png"))); // NOI18N
        btn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_anteriorActionPerformed(evt);
            }
        });

        btn_posterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/endavant.png"))); // NOI18N
        btn_posterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_posteriorActionPerformed(evt);
            }
        });

        btn_ultimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ultim.png"))); // NOI18N
        btn_ultimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ultimoActionPerformed(evt);
            }
        });

        btn_insertar.setText("Insertar");
        btn_insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insertarActionPerformed(evt);
            }
        });

        error_nombre.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        error_nombre.setForeground(new java.awt.Color(255, 51, 51));
        error_nombre.setText("Debes de introducir un nombre");

        error_edad.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        error_edad.setForeground(new java.awt.Color(255, 0, 51));
        error_edad.setText("Debes de introducir una edad");
        error_edad.setToolTipText("");

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jLabel2.setText("apellido");

        tf_apellido.setEditable(false);
        tf_apellido.setToolTipText("Debes de introducir un apellido");
        tf_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_apellidoActionPerformed(evt);
            }
        });

        jLabel6.setText("pais");

        tf_pais.setEditable(false);
        tf_pais.setToolTipText("Debes de introducir un pais");

        error_apellido.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        error_apellido.setForeground(new java.awt.Color(255, 51, 51));
        error_apellido.setText("Debes de introducir un apellido");

        error_pais.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        error_pais.setForeground(new java.awt.Color(255, 51, 51));
        error_pais.setText("Debes de introducir un pais");

        javax.swing.GroupLayout JpPersonaLayout = new javax.swing.GroupLayout(JpPersona);
        JpPersona.setLayout(JpPersonaLayout);
        JpPersonaLayout.setHorizontalGroup(
            JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpPersonaLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addComponent(btn_primero)
                .addGap(18, 18, 18)
                .addComponent(btn_anterior)
                .addGap(38, 38, 38)
                .addComponent(btn_posterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ultimo)
                .addGap(179, 179, 179))
            .addGroup(JpPersonaLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpPersonaLayout.createSequentialGroup()
                        .addComponent(btn_insertar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JpPersonaLayout.createSequentialGroup()
                        .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpPersonaLayout.createSequentialGroup()
                                    .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2))
                                    .addGap(39, 39, 39)
                                    .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                        .addComponent(tf_edad, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                        .addComponent(tf_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                        .addComponent(tf_pais, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))))
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(error_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(error_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(error_pais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(error_edad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_cancelar, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        JpPersonaLayout.setVerticalGroup(
            JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpPersonaLayout.createSequentialGroup()
                .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpPersonaLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btn_guardar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpPersonaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(error_nombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(tf_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(error_apellido))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tf_pais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(error_pais))
                        .addGap(8, 8, 8)))
                .addGap(5, 5, 5)
                .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpPersonaLayout.createSequentialGroup()
                        .addComponent(btn_cancelar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpPersonaLayout.createSequentialGroup()
                        .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(error_edad))
                        .addGap(48, 48, 48)
                        .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_insertar)
                            .addComponent(btn_modificar)
                            .addComponent(btn_eliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                        .addGroup(JpPersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_ultimo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_posterior, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_anterior, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_primero, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(49, 49, 49))))
        );

        btn_salir.setText("salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_salir))
                    .addComponent(JpPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btn_salir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // ocultar errores
        this.error_nombre.setVisible(false);
        this.error_apellido.setVisible(false);
        this.error_edad.setVisible(false);
        this.error_edad.setVisible(false);

        // que no haya campos vacios
        if (this.tf_nombre.getText().equals("") || this.tf_apellido.getText().equals("") || this.tf_pais.getText().equals("") || this.tf_edad.getText().equals("")) {
            if (tf_nombre.getText().equals("")) {
                this.error_nombre.setVisible(true);
            }
            
            if (tf_apellido.getText().equals("")) {
                this.error_apellido.setVisible(true);
            }
            
            if (tf_pais.getText().equals("")) {
                this.error_pais.setVisible(true);
            }
            
            if (this.tf_edad.getText().equals("")) {
                this.error_edad.setVisible(true);
            }
        } else {
            // insertar
            if (accion.equals("insertar")) {
                // crear una persona
                Persona persona = new Persona();

                // recuperar a la persona de los jtextfild
                String nombre = this.tf_nombre.getText();
                String apellido = this.tf_apellido.getText();
                String pais = this.tf_pais.getText();
                int edad = 0;
                boolean pasa = true;
                try {
                    edad = Integer.valueOf(this.tf_edad.getText());
                } catch (Exception e) {
                    while (pasa) {
                        JOptionPane.showMessageDialog(null, "No estas introduciendo un numero");
                        try {
                            edad = Integer.valueOf(JOptionPane.showInputDialog("Introduce la edad"));
                            pasa = false;
                        } catch (Exception ex) {
                            pasa = true;
                        }

                    }
                }

                // insertar a la persona
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setPais(pais);
                persona.setEdad(edad);
                try {
                    // comprobamos si es el primer dato para brrar la lista
                    if(datoPrimero) {
                        listaPersonaes.remove(0);
                        datoPrimero = false;
                    }
                    // insertar persona en array
                    this.listaPersonaes.add(persona);
                    // escribir array en el fichero
                    escribirDatos();
                    // ir al ultimo objeto de la lista
                    i = listaPersonaes.size() - 1;
                    refrescar(i);
                    
                    // restaurar botones
                    this.btn_insertar.setEnabled(true);
                    this.btn_modificar.setEnabled(true);
                    this.btn_eliminar.setEnabled(true);
                    this.btn_guardar.setEnabled(false);
                    this.btn_cancelar.setEnabled(false);
                    
                    // restaurar flechas
                    activarDesactivarFlechas();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }

            } else if (accion.equals("modificar")) {
                // modificar persona
                Persona persona = new Persona();
                
                String nombre = this.tf_nombre.getText();
                String apellido = this.tf_apellido.getText();
                String pais = this.tf_pais.getText();
                int edad = 0;
                boolean pasa = true;
                try {
                    edad = Integer.valueOf(this.tf_edad.getText());
                } catch (Exception e) {
                    while (pasa) {
                        JOptionPane.showMessageDialog(null, "No estas introduciendo un numero");
                        try {
                            edad = Integer.valueOf(JOptionPane.showInputDialog("Introduce la edad"));
                            pasa = false;
                        } catch (Exception ex) {
                            pasa = true;
                        }

                    }
                }
                
                // modificar a la persona
                persona.setNombre(nombre);
                persona.setApellido(apellido);
                persona.setPais(pais);
                persona.setEdad(edad);
                try {
                    listaPersonaes.set(i, persona);
                    
                    // escribir array en el fichero
                    escribirDatos();
                    
                    
                    JOptionPane.showMessageDialog(rootPane, "Persona modificada correctamente");

                    // restaurar botones (menos le posterior y el ultimo)
                    this.btn_insertar.setEnabled(true);
                    this.btn_modificar.setEnabled(true);
                    this.btn_eliminar.setEnabled(true);
                    this.btn_guardar.setEnabled(false);
                    this.btn_cancelar.setEnabled(false);

                    activarDesactivarFlechas();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                }
            }

            this.tf_nombre.setEditable(false);
            this.tf_apellido.setEditable(false);
            this.tf_pais.setEditable(false);
            this.tf_edad.setEditable(false);
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Estas seguro de que quieres eliminar este usuario", "Atencion", dialogButton);
        if (dialogResult == 0) {
            // Eliminar a la persona
            listaPersonaes.remove(i);
            JOptionPane.showMessageDialog(null, "Persona eliminada");
            
            // escribir fichero
            escribirDatos();
            
            if(listaPersonaes.size()>0) {
                // ir al ultimo objeto de la lista
                i = listaPersonaes.size() - 1;
                refrescar(i);
            } else {
                llenarDatoFantasma();
                i = listaPersonaes.size() - 1;
                refrescar(i);
            }
            activarDesactivarFlechas();
        } else {
            JOptionPane.showMessageDialog(null, "No se ha eliminado");
        }


    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void btn_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modificarActionPerformed
        this.tf_nombre.setEditable(true);
        this.tf_apellido.setEditable(true);
        this.tf_pais.setEditable(true);
        this.tf_edad.setEditable(true);

        this.btn_insertar.setEnabled(false);
        this.btn_modificar.setEnabled(false);
        this.btn_eliminar.setEnabled(false);
        this.btn_guardar.setEnabled(true);
        this.btn_cancelar.setEnabled(true);

        activarFlechasAlante(false);
        activarFlechasAtras(false);

        accion = "modificar";


    }//GEN-LAST:event_btn_modificarActionPerformed

    private void btn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_anteriorActionPerformed
        // boton anterior
        activarFlechasAlante(true);
        if (i == 1) {
            i = 0;
            activarFlechasAtras(false);
        } else {
            i = i - 1;
        }
        refrescar(i);
    }//GEN-LAST:event_btn_anteriorActionPerformed

    private void btn_ultimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ultimoActionPerformed
        // boton ultimo
        i = listaPersonaes.size() - 1;
        refrescar(i);

        activarFlechasAlante(false);
        activarFlechasAtras(true);
    }//GEN-LAST:event_btn_ultimoActionPerformed

    private void btn_posteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_posteriorActionPerformed
        // boton posterior
        activarFlechasAtras(true);
        if (i == listaPersonaes.size() - 2) {
            i = listaPersonaes.size() - 1;
            activarFlechasAlante(false);
        } else {
            i = i + 1;
        }
        refrescar(i);
    }//GEN-LAST:event_btn_posteriorActionPerformed

    private void btn_primeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_primeroActionPerformed
        i = 0;
        refrescar(i);
        
        //refrescar(0);
        activarFlechasAlante(true);
        activarFlechasAtras(false);
    }//GEN-LAST:event_btn_primeroActionPerformed

    private void btn_insertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insertarActionPerformed
        // TODO add your handling code here:
        vaciarCampos();
        this.btn_insertar.setEnabled(false);
        this.btn_modificar.setEnabled(false);
        this.btn_eliminar.setEnabled(false);
        this.btn_guardar.setEnabled(true);
        this.btn_cancelar.setEnabled(true);

        activarFlechasAlante(false);
        activarFlechasAtras(false);

        accion = "insertar";
    }//GEN-LAST:event_btn_insertarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        activarDesactivarFlechas();
        
        refrescar(i);
        this.tf_nombre.setEditable(false);
        this.tf_apellido.setEditable(false);
        this.tf_pais.setEditable(false);
        this.tf_edad.setEditable(false);

        this.error_nombre.setVisible(false);
        this.error_apellido.setVisible(false);
        this.error_pais.setVisible(false);
        this.error_edad.setVisible(false);
        
        this.btn_insertar.setEnabled(true);
        this.btn_modificar.setEnabled(true);
        this.btn_eliminar.setEnabled(true);
        this.btn_guardar.setEnabled(false);
        this.btn_cancelar.setEnabled(false);
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void tf_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_apellidoActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpPersona;
    private javax.swing.JButton btn_anterior;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_insertar;
    private javax.swing.JButton btn_modificar;
    private javax.swing.JButton btn_posterior;
    private javax.swing.JButton btn_primero;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_ultimo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel error_apellido;
    private javax.swing.JLabel error_edad;
    private javax.swing.JLabel error_nombre;
    private javax.swing.JLabel error_pais;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tf_apellido;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_pais;
    // End of variables declaration//GEN-END:variables
}
