/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing_register_login;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author dkzn1
 */
class User{
    private String kullanici_adi;
    private String parola;

    public User(String kullanici_adi, String parola) {
        this.kullanici_adi = kullanici_adi;
        this.parola = parola;
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }
    
    
}



public class AnaEkran extends javax.swing.JFrame {
    
    private static ArrayList<User> user_list = new ArrayList<User>();

    public static ArrayList<User> getUser_list() {
        return user_list;
    }

    public static void setUser_list(ArrayList<User> user_list) {
        AnaEkran.user_list = user_list;
    }
    
    

    /**
     * Creates new form AnaEkran
     */
    public AnaEkran() {
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

        registerloginpanel = new javax.swing.JPanel();
        register = new javax.swing.JButton();
        login = new javax.swing.JButton();
        loginpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullanıcı_adı_alanı = new javax.swing.JTextField();
        parola_alani = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registerloginpanel.setBackground(new java.awt.Color(255, 0, 51));

        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        login.setText("LOGIN,");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerloginpanelLayout = new javax.swing.GroupLayout(registerloginpanel);
        registerloginpanel.setLayout(registerloginpanelLayout);
        registerloginpanelLayout.setHorizontalGroup(
            registerloginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerloginpanelLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(152, Short.MAX_VALUE))
        );
        registerloginpanelLayout.setVerticalGroup(
            registerloginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerloginpanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(registerloginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register)
                    .addComponent(login))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        loginpanel.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("KULLANICI ADI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PAROLA");

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kullanıcı_adı_alanı)
                    .addComponent(parola_alani, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kullanıcı_adı_alanı, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(parola_alani, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(190, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(registerloginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(loginpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerloginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
       RegisterEkrani registerekrani = new RegisterEkrani();
       registerekrani.setVisible(true);
        
        
        
    }//GEN-LAST:event_registerActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        
        String kullanıcı_adı = kullanıcı_adı_alanı.getText();
        String parola = new String(parola_alani.getPassword());
        
        if(user_list.size()==0){
            JOptionPane.showMessageDialog(this,"Hiçbir kullanıcı bulunmamaktadır..");
        }
        else{
            for(User user:user_list){
                if(user.getKullanici_adi().equals(kullanıcı_adı) && user.getParola().equals(parola)){
                    JOptionPane.showMessageDialog(this,"HOŞGELDİNİZ" + kullanıcı_adı);
                    return;
                }
               
            }
            
            JOptionPane.showMessageDialog(this,"Böyle bir kullanıcı yoktur.Lütfen register olunuz...");
        }
        
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField kullanıcı_adı_alanı;
    private javax.swing.JButton login;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JPasswordField parola_alani;
    private javax.swing.JButton register;
    private javax.swing.JPanel registerloginpanel;
    // End of variables declaration//GEN-END:variables
}
