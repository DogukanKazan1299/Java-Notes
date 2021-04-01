
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Bagla {
    
    private String kullanici_adi = "root";
    private String parola = "";
    private String db_ismi = "demo";
    private String host = "localhost";
    private int port = 3306;
    
    private Statement statement = null;
    
    private Connection con = null;
    
    
    public void calisanlariGetir(){
        
        String sorgu = "Select * from calisanlar";
        
        try{
            statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){
                int id=rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("ID : " +id + " Ad : " + ad + " Soyad : " + soyad + " Email : " + email);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Bagla.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void calisanEkle(){
        
        try {
            statement = con.createStatement();
            String ad = "Yeni";
            String soyad = "kisi";
            String email = "yenikisi@email.com";
            
            String sorgu = "Insert into calisanlar(ad,soyad,email) VALUES(" + "  ' " + ad + " ' ,"+"'" + soyad + "',"+"'"+email+ "')";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Bagla.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void calisanGuncelle(){
        
        try {
            statement = con.createStatement();
            
            String sorgu = "Update calisanlar Set email='benimemail@gmail.com' where id = 3";
            statement.executeUpdate(sorgu);
            
        } catch (SQLException ex) {
            Logger.getLogger(Bagla.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void calisanSil(){
        
        
        try {
            statement=con.createStatement();
            String sorgu = "Delete from calisanlar where id = 3";
            statement.executeUpdate(sorgu);
        } catch (SQLException ex) {
            Logger.getLogger(Bagla.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    
    
    public Bagla(){
        
        //"jdbc:mysql://localhost:3306/demo FORMAT
        
        String url = "jdbc:mysql://" + host + " :" + port + "/" + db_ismi;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı..");
        }
        
        try{
            con = DriverManager.getConnection(url,kullanici_adi,parola);
            System.out.println("Bağlantı Başarılı..");
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
        }
        
    }
    
    public static void main(String[] args){
        
        Bagla b = new Bagla();
        
        b.calisanlariGetir();
        
        b.calisanEkle();
        
        b.calisanlariGetir();
        
        System.out.println("-----------------------");
        
        b.calisanGuncelle();
        b.calisanlariGetir();
        
        
        //b.calisanSil();
        
        
    }
    
    
}
