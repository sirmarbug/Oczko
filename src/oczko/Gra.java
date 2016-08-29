/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oczko;

import java.util.Random;

/**
 *
 * @author mariuszbugajski
 */
public class Gra extends javax.swing.JFrame {

    int pktG1, pktG2, okno;
    
    Karta [] gracz1; //komputer
    Karta [] gracz2; //gracz
    
    /**
     * Creates new form Gra
     */
    public Gra() {
        initComponents();
        this.gracz1 = new Karta[7];
        this.gracz2 = new Karta[7];
        this.okno = 0;
        
        // Inicjalizacja talii komputera
        for (int i = 0; i < 7; i++){
            this.gracz1[i] = new Karta();
        }
        
        // Inicjalizacja talii gracza
        for (int i = 0; i < 7; i++){
            this.gracz2[i] = new Karta();
        }
        
        Random r = new Random();
        
        //karty gracza
        for(int i = 0; i < 2; i++){
            this.addCardG2();
            /*this.gracz2[i] = new Karta(r.nextInt());
            System.out.println(gracz2[i].wartosc);*/
        }
        
        // Karty komputera
        for(int i = 0; i < 2; i++){
            this.addCardG1();
            /*this.gracz1[i] = new Karta(r.nextInt());
            System.out.println(gracz1[i].wartosc);*/
        }
        
        this.printScreen();
    }
    
    // Wyszukanie wolnego slotu komputera
    int scanG1(){
        int x = -1;
        int i;
        for (i = 0; i<7; i++){
            if(gracz1[i].nr == 0){
                x = i;
                break;
            }
        }
        return x;
    }

    //Wyszukanie wolnego slotu gracza
    int scanG2(){
        int x = -1;
        int i;
        for (i = 0; i<7; i++){
            if(gracz2[i].nr == 0){
                x = i;
                break;
            }
        }
        return x;
    }
    
    // Dodaj kartę komputerowi
    void addCardG1(){
        int x = this.scanG1();
        if (x == -1){
            System.out.println("Slot jest pełen");
        }else{
            Random r = new Random();
            this.gracz1[x] = new Karta(r.nextInt());
            System.out.println("Wartość dodanej karty komputera: " + gracz1[x].wartosc);
            System.out.println("Typ dodanej karty komputera: " + gracz1[x].typ);
        }
    }
    
    // Dodaj kartę graczowi
    void addCardG2(){
        int x = this.scanG2();
        if (x== -1){
            System.out.println("Slot jest pełen");
        }else{
            Random r = new Random();
            this.gracz2[this.scanG2()] = new Karta(r.nextInt());
            System.out.println("Wartość dodanej karty gracza: " + gracz2[x].wartosc);
            System.out.println("Typ dodanej karty gracza: " + gracz2[x].typ);
        }
    }
    
    int sumaG1(){
        this.pktG1 = 0;
        for (int i = 0; i < 7; i++){
            this.pktG1 = this.pktG1 + gracz1[i].wartosc;
        }
        return this.pktG1;
    }
    
    int sumaG2(){
        this.pktG2 = 0;
        for (int i = 0; i < 7; i++){
            this.pktG2 = this.pktG2 + gracz2[i].wartosc;
        }
        return this.pktG2;
    }
    
    // Sprawdzanie stanu gry
    void stanGry(){
        if(this.pktG1 > 21){
            this.okno = 3;
            this.printScreen();
        }
    }
    
    void printScreen(){
        //Wyświetlanie kart komputera
        if(this.gracz1[0].typ == 0){
            jLabel1.setVisible(false);
        }else{
            jLabel1.setVisible(true);
            jLabel1.setText(this.gracz1[0].wartosc + "");
        }
        
        if(this.gracz1[1].typ == 0){
            jLabel2.setVisible(false);
        }else{
            jLabel2.setVisible(true);
            jLabel2.setText(this.gracz1[1].wartosc + "");
        }
        
        if(this.gracz1[2].typ == 0){
            jLabel3.setVisible(false);
        }else{
            jLabel3.setVisible(true);
            jLabel3.setText(this.gracz1[2].wartosc + "");
        }
        
        if(this.gracz1[3].typ == 0){
            jLabel4.setVisible(false);
        }else{
            jLabel4.setVisible(true);
            jLabel4.setText(this.gracz1[3].wartosc + "");
        }
        
        if(this.gracz1[4].typ == 0){
            jLabel5.setVisible(false);
        }else{
            jLabel5.setVisible(true);
            jLabel5.setText(this.gracz1[4].wartosc + "");
        }
        
        if(this.gracz1[5].typ == 0){
            jLabel6.setVisible(false);
        }else{
            jLabel6.setVisible(true);
            jLabel6.setText(this.gracz1[5].wartosc + "");
        }
        
        if(this.gracz1[6].typ == 0){
            jLabel7.setVisible(false);
        }else{
            jLabel7.setVisible(true);
            jLabel7.setText(this.gracz1[6].wartosc + "");
        }
        
        //Wyświetlanie kart gracza
        if(this.gracz2[0].typ == 0){
            jLabel8.setVisible(false);
        }else{
            jLabel8.setVisible(true);
            jLabel8.setText(this.gracz2[0].wartosc + "");
        }
        
        if(this.gracz2[1].typ == 0){
            jLabel9.setVisible(false);
        }else{
            jLabel9.setVisible(true);
            jLabel9.setText(this.gracz2[1].wartosc + "");
        }
        
        if(this.gracz2[2].typ == 0){
            jLabel10.setVisible(false);
        }else{
            jLabel10.setVisible(true);
            jLabel10.setText(this.gracz2[2].wartosc + "");
        }
        
        if(this.gracz2[3].typ == 0){
            jLabel11.setVisible(false);
        }else{
            jLabel11.setVisible(true);
            jLabel11.setText(this.gracz2[3].wartosc + "");
        }
        
        if(this.gracz2[4].typ == 0){
            jLabel12.setVisible(false);
        }else{
            jLabel12.setVisible(true);
            jLabel12.setText(this.gracz2[4].wartosc + "");
        }
        
        if(this.gracz2[5].typ == 0){
            jLabel13.setVisible(false);
        }else{
            jLabel13.setVisible(true);
            jLabel13.setText(this.gracz2[5].wartosc + "");
        }
        
        if(this.gracz2[6].typ == 0){
            jLabel14.setVisible(false);
        }else{
            jLabel14.setVisible(true);
            jLabel14.setText(this.gracz2[6].wartosc + "");
        }
        
        // Suma pkt komputera
        jLabel15.setVisible(true);
        jLabel15.setText(this.sumaG1() + "");
        
        // Suma pkt gracza
        jLabel16.setVisible(true);
        jLabel16.setText(this.sumaG2() + "");
        
        if (this.okno == 3){
            
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel1.setLayout(null);

        jButton1.setText("Graj");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(460, 140, 75, 29);

        jButton2.setText("Wyjdź");
        jPanel1.add(jButton2);
        jButton2.setBounds(460, 210, 81, 29);

        jPanel2.setMinimumSize(new java.awt.Dimension(1366, 768));
        jPanel2.setLayout(null);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(70, 60, 180, 252);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(250, 0, 180, 252);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(480, 10, 180, 252);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(720, -10, 180, 252);
        jPanel2.add(jLabel5);
        jLabel5.setBounds(820, 0, 180, 252);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(960, 0, 180, 252);
        jPanel2.add(jLabel7);
        jLabel7.setBounds(1120, 20, 180, 252);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 380, 180, 252);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(240, 350, 180, 252);
        jPanel2.add(jLabel10);
        jLabel10.setBounds(420, 340, 180, 252);
        jPanel2.add(jLabel11);
        jLabel11.setBounds(610, 400, 180, 252);
        jPanel2.add(jLabel12);
        jLabel12.setBounds(840, 500, 180, 252);
        jPanel2.add(jLabel13);
        jLabel13.setBounds(980, 510, 180, 252);
        jPanel2.add(jLabel14);
        jLabel14.setBounds(1190, 500, 180, 252);

        jButton3.setText("Add PC");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(240, 630, 89, 29);

        jButton4.setText("Add G");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(420, 620, 82, 29);
        jPanel2.add(jLabel15);
        jLabel15.setBounds(520, 620, 90, 50);
        jPanel2.add(jLabel16);
        jLabel16.setBounds(640, 620, 90, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1366, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.addCardG1();
        this.printScreen();
        this.stanGry();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.addCardG2();
        this.printScreen();
        this.stanGry();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Gra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Gra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Gra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Gra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
