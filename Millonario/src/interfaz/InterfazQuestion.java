/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Question;
import java.awt.Color;
import java.util.List;
import logica.LogicQuestion;

/**
 *
 * @author Estudiante
 */
public class InterfazQuestion extends javax.swing.JFrame {

    int level = 1;
    int cantPreguntas = 0;
    int pregunta_aleatoria;
    LogicQuestion nuevaLogica = new LogicQuestion();
    List<Question> preguntas;

    /**
     * Creates new form InterfazQuestion
     */
    public InterfazQuestion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pregunta = new javax.swing.JTextField();
        jugar = new javax.swing.JButton();
        optionA = new javax.swing.JButton();
        optionB = new javax.swing.JButton();
        optionC = new javax.swing.JButton();
        optionD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preguntaActionPerformed(evt);
            }
        });

        jugar.setText("jButton1");
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        optionA.setText("jButton1");
        optionA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAActionPerformed(evt);
            }
        });

        optionB.setText("jButton2");
        optionB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionBActionPerformed(evt);
            }
        });

        optionC.setText("jButton1");
        optionC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionCActionPerformed(evt);
            }
        });

        optionD.setText("jButton1");
        optionD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pregunta)
                    .addComponent(optionA, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
                    .addComponent(optionB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optionC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optionD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(optionA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(optionB)
                .addGap(50, 50, 50)
                .addComponent(optionC)
                .addGap(53, 53, 53)
                .addComponent(optionD)
                .addGap(15, 15, 15)
                .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preguntaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_preguntaActionPerformed
public void buenas(){
    
}
    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        // TODO add your handling code here:
        preguntas = nuevaLogica.consultar(level);
        System.out.println("Tamaño de la lista " + preguntas.size());
        pregunta_aleatoria = (int) (Math.random() * preguntas.size());
        System.out.println("Pregunta generada " + pregunta_aleatoria);
        pregunta.setText(preguntas.get(pregunta_aleatoria).getAnswer());
        System.out.println(preguntas.get(pregunta_aleatoria).getAnswer());
        optionA.setText(preguntas.get(pregunta_aleatoria).getOptionA());
        optionB.setText(preguntas.get(pregunta_aleatoria).getOptionB());
        optionC.setText(preguntas.get(pregunta_aleatoria).getOptionC());
        optionD.setText(preguntas.get(pregunta_aleatoria).getOptionD());

        optionA.setBackground(Color.CYAN);
        optionB.setBackground(Color.CYAN);
        optionC.setBackground(Color.CYAN);
        optionD.setBackground(Color.CYAN);

    }//GEN-LAST:event_jugarActionPerformed

    private void optionAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionAActionPerformed
        // TODO add your handling code here:
      validarRespuesta();
    }//GEN-LAST:event_optionAActionPerformed

    private void optionBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionBActionPerformed
        // TODO add your handling code here:
        validarRespuesta();
    }//GEN-LAST:event_optionBActionPerformed

    private void optionCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionCActionPerformed
        // TODO add your handling code here:
        validarRespuesta();
    }//GEN-LAST:event_optionCActionPerformed

    private void optionDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionDActionPerformed
        // TODO add your handling code here:
        validarRespuesta();
    }//GEN-LAST:event_optionDActionPerformed

    public void validarRespuesta(){
  System.out.println(preguntas.get(pregunta_aleatoria).getOptionCorrect());
        if (optionA.getText().equals(preguntas.get(pregunta_aleatoria).getOptionCorrect())) {
            optionA.setBackground(Color.GREEN);
            
            optionB.setBackground(Color.red);
            optionC.setBackground(Color.red);
            optionD.setBackground(Color.red);
        } else {
            optionA.setBackground(Color.red);
        }
        if (optionB.getText().equals(preguntas.get(pregunta_aleatoria).getOptionCorrect())) {
            optionB.setBackground(Color.GREEN);
            
            optionA.setBackground(Color.red);
            optionC.setBackground(Color.red);
            optionD.setBackground(Color.red);
        } else {
            optionB.setBackground(Color.red);
        }
        if (optionC.getText().equals(preguntas.get(pregunta_aleatoria).getOptionCorrect())) {
            optionC.setBackground(Color.GREEN);
            
            optionB.setBackground(Color.red);
            optionA.setBackground(Color.red);
            optionD.setBackground(Color.red);
        } else {
            optionC.setBackground(Color.red);
        }if (optionD.getText().equals(preguntas.get(pregunta_aleatoria).getOptionCorrect())) {
             optionD.setBackground(Color.GREEN);
             
             optionB.setBackground(Color.red);
             optionC.setBackground(Color.red);
             optionA.setBackground(Color.red);
        }else{
             optionD.setBackground(Color.red);
        }
}
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
            java.util.logging.Logger.getLogger(InterfazQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazQuestion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jugar;
    private javax.swing.JButton optionA;
    private javax.swing.JButton optionB;
    private javax.swing.JButton optionC;
    private javax.swing.JButton optionD;
    private javax.swing.JTextField pregunta;
    // End of variables declaration//GEN-END:variables
}