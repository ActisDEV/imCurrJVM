/*
 * The MIT License
 *
 * Copyright 2017 Denis Karev.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package dmk.ui;

import javax.swing.*;
import java.io.*;
import java.util.*;

import dmk.lang.*;
/**
 *
 * @author Денис
 */
public class Main extends javax.swing.JFrame {

    JFileChooser fileChooser = new JFileChooser(); //выбор файлов
    
    File inputFile;
    File outputFile;
    File cryptFile;
    
    String inputPath; //путь до файла ввода
    String outputPath; //путь до файла вывода
    String cryptPath; //путь до файла шифрования
    String inputText; //вводимый текст
    String outputLine;
    String encLine;
    String decLine;
    String SYMBOL = "!#+";
       
    int x; //для счёта строк в файле вывода
    int y; //для счёта строк в файле шифрования
    int z; //для счёта строк в файле дешифрования
    int countSymbols;
    
    /**
     * Creates new form Main
     */
    public Main() {
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

        mainPanel = new javax.swing.JPanel();
        inputPanel = new javax.swing.JPanel();
        inputField = new javax.swing.JTextField();
        chooseFileIN = new javax.swing.JButton();
        inputButton = new javax.swing.JButton();
        clearButtonIN = new javax.swing.JButton();
        outputPanel = new javax.swing.JPanel();
        outputField = new javax.swing.JTextField();
        chooseFileOUT = new javax.swing.JButton();
        outputButton = new javax.swing.JButton();
        clearButtonOUT = new javax.swing.JButton();
        menuPanel = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        creditsButton = new javax.swing.JButton();
        settingsButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("imCurrJVM");

        mainPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "imCurrJVM by Actis", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 204))); // NOI18N

        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(Translations.BORDER_INPUT_TEXT));

        inputField.setToolTipText(Translations.TOOLTIP_INPUT_FIELD);

        chooseFileIN.setText(Translations.CHOOSE_FILE);
        chooseFileIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileINActionPerformed(evt);
            }
        });

        inputButton.setText(Translations.INPUT);
        inputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputButtonActionPerformed(evt);
            }
        });

        clearButtonIN.setText(Translations.CLEAR);
        clearButtonIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonINActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chooseFileIN, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                    .addComponent(inputButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(inputField)
                    .addComponent(clearButtonIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chooseFileIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputButton, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clearButtonIN)
                .addContainerGap())
        );

        outputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(Translations.BORDER_OUTPUT_TEXT));

        outputField.setEditable(false);
        outputField.setToolTipText(Translations.TOOLTIP_OUTPUT_FIELD);

        chooseFileOUT.setText(Translations.CHOOSE_FILE);
        chooseFileOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileOUTActionPerformed(evt);
            }
        });

        outputButton.setText(Translations.OUTPUT);
        outputButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputButtonActionPerformed(evt);
            }
        });

        clearButtonOUT.setText(Translations.CLEAR);
        clearButtonOUT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonOUTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outputField)
                    .addComponent(chooseFileOUT, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                    .addComponent(outputButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearButtonOUT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, outputPanelLayout.createSequentialGroup()
                .addComponent(chooseFileOUT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(clearButtonOUT)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(Translations.BORDER_MENU_TEXT));

        exitButton.setText(Translations.EXIT);
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        creditsButton.setText(Translations.CREDITS);
        creditsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creditsButtonActionPerformed(evt);
            }
        });

        settingsButton.setText(Translations.SETTINGS);
        settingsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menuPanelLayout = new javax.swing.GroupLayout(menuPanel);
        menuPanel.setLayout(menuPanelLayout);
        menuPanelLayout.setHorizontalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(creditsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(settingsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        menuPanelLayout.setVerticalGroup(
            menuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPanelLayout.createSequentialGroup()
                .addComponent(settingsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(creditsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitButton)
                .addContainerGap())
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(menuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseFileINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileINActionPerformed
        fileChooser.showDialog(null, "Load");
        inputFile = fileChooser.getSelectedFile();
        inputPath = inputFile.getPath();
    }//GEN-LAST:event_chooseFileINActionPerformed

    private void inputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputButtonActionPerformed
        try (FileWriter inputWriter = new FileWriter(inputPath, true)) {
            inputText = inputField.getText();
            inputWriter.write("\r\n" + SYMBOL + "\r\n" + inputText + "\r\n"); //используем !#+ для поиска сообщения
        } catch (IOException ex1) {
            System.out.println(ex1.getMessage());
        }
    }//GEN-LAST:event_inputButtonActionPerformed

    private void chooseFileOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileOUTActionPerformed
        fileChooser.showDialog(null, "Load");
        outputFile = fileChooser.getSelectedFile();
        outputPath = outputFile.getPath();
    }//GEN-LAST:event_chooseFileOUTActionPerformed

    private void outputButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputButtonActionPerformed
        try (BufferedReader reader = new BufferedReader(new FileReader(outputPath))) {
            List<String> lines; //здесь и далее просто пихаем строки в список
            lines = new ArrayList<>();
            while ((outputLine = reader.readLine()) != null) {
                lines.add(outputLine);
                x++;
            }
            
            String[] linesAsArray; //преобразовывание списка в массив
            linesAsArray = lines.toArray(new String[lines.size()]);

            for (int i = 0; i <= x; i++) {
                if (SYMBOL.equals(linesAsArray[i])) {
                    outputField.setText(linesAsArray[i+1]);
                    break;
                } else {
                    outputField.setText("Err! No message!");
                }
            }
        } catch (IOException ex2) {
            System.out.println(ex2.getMessage());
        }
    }//GEN-LAST:event_outputButtonActionPerformed

    private void clearButtonINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonINActionPerformed
        inputText = null;
        inputField.setText("");
    }//GEN-LAST:event_clearButtonINActionPerformed

    private void clearButtonOUTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonOUTActionPerformed
        outputField.setText("");
    }//GEN-LAST:event_clearButtonOUTActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void settingsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingsButtonActionPerformed
        Settings settingsWindow = new Settings();
        settingsWindow.setVisible(true);
    }//GEN-LAST:event_settingsButtonActionPerformed

    private void creditsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creditsButtonActionPerformed
        Credits credits = new Credits();
        credits.setVisible(true);
    }//GEN-LAST:event_creditsButtonActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
        boolean fileExists = Lang.FileChecker();
        if (fileExists == true) {
            //
        } else {
            Lang.LangFileCreate();
        }
        Translations.setTranslations();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseFileIN;
    private javax.swing.JButton chooseFileOUT;
    private javax.swing.JButton clearButtonIN;
    private javax.swing.JButton clearButtonOUT;
    private javax.swing.JButton creditsButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton inputButton;
    private javax.swing.JTextField inputField;
    public static javax.swing.JPanel inputPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel menuPanel;
    private javax.swing.JButton outputButton;
    private javax.swing.JTextField outputField;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JButton settingsButton;
    // End of variables declaration//GEN-END:variables
}
