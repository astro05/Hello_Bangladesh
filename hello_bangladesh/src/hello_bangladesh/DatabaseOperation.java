/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello_bangladesh;

/**
 *
 * @author Sadman Jahin
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import static java.lang.ProcessBuilder.Redirect.to;
import java.sql.*; 
import javafx.scene.shape.Path;
import javax.swing.JOptionPane;

public class DatabaseOperation {
    private Connection con;
    private Statement stmt;
    private ResultSet rs;
    
    
    public DatabaseOperation()
    {
    
    }
    
    public void connect()
    {
        try
        {  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3307/voiceOfbangladesh","root","usbw");  
            stmt=con.createStatement();  
        }
        catch(Exception e)
        { 
            System.out.println(e);
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    public void getData()
    {
        try
        {
            rs=stmt.executeQuery("select * from registration");  
            while(rs.next())
            {
                System.out.println(rs.getString("Name")+"  "+rs.getString("Father's Name")+"  "+rs.getString("Mother's Name")); 
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }  
    }
    
    
    public void setData(String Name,String Fathersname,String MothersName, String NID,String PresentAddress,String PermanentAddress,String Gender,String DateOfBirth,String TIN,String PassportNo,String MobileNo,String Password)
    {
        
        try
        {
            String sql="insert into registration values('"+Name+"','"+Fathersname+"','"+MothersName+"','"+NID+"','"+PresentAddress+"','"+PermanentAddress+"','"+Gender+"','"+TIN+"','"+DateOfBirth+"','"+MobileNo+"','"+PassportNo+"','"+Password+"')";
            stmt.executeUpdate(sql);
            getData();
            //con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
     public void setData_report(String NID,String TYPE,String KIND, String DESCRIPTION,String SUGGESTION,String LINK)
    {
        
        try
        {
            String sql="insert into user_report values('"+NID+"','"+TYPE+"','"+KIND+"','"+DESCRIPTION+"','"+SUGGESTION+"','"+LINK+"')";
            stmt.executeUpdate(sql);
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    
    
    public boolean checkData(String USERID,String Password)
    {
       
        try
        {
            rs=stmt.executeQuery("select * from registration");  
            while(rs.next())
            { 
                if(rs.getString("NID").equals(USERID) && rs.getString("Password").equals(Password))
                {
                    return true;
                }
            }
            
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }  
        return false;
    }
    public void updateData(String NID,String PresentAddress,String MobileNo,String Password)
    {
        
        try
        {
        stmt.executeUpdate("UPDATE `registration` SET `Present Address`= '"+PresentAddress+"' ,`MobileNo`= '"+MobileNo+"' ,`Password`= '"+Password+"' WHERE NID=123");  
        
        
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
    public String[] getInfo(String NID)
    {
        String[] info=new String[5];
        try
        {
            rs=stmt.executeQuery("select * from registration where NID="+NID);  
            while(rs.next())
            {
                
                info[0]=rs.getString("Name");
                info[1]=rs.getString("PassportNo");
                info[2]=rs.getString("Present Address"); 
                info[3]=rs.getString("MobileNo");
                info[4]=rs.getString("Password"); 
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }  
        return info;
    }
    
    
    	public void insertImage(File image1,File image2,String Id,String Name) {
        
            
        PreparedStatement statement = null;
        FileInputStream inputStream1 = null;
        FileInputStream inputStream2 = null;
 
        try {
            
            inputStream1 = new FileInputStream(image1);
            inputStream2 = new FileInputStream(image2);
 
            statement = con.prepareStatement("insert into user_images(img_id,img_title, img_data1,img_data2) " + "values(?,?,?,?)");
            statement.setString(1, Id);
            statement.setString(2, Name);
            statement.setBinaryStream(3, (InputStream) inputStream1, (int)(image1.length()));
            statement.setBinaryStream(4, (InputStream) inputStream2, (int)(image2.length()));
 
            statement.executeUpdate();
 
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: - " + e);
            JOptionPane.showMessageDialog(null,e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQLException: - " + e);
            JOptionPane.showMessageDialog(null,e.getMessage());
        } finally {
 
            try {
                //con.close();
                statement.close();
            } catch (SQLException e) {
                System.out.println("SQLException Finally: - " + e);
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }
public void getSavedImages(){
        try {
            
            
            PreparedStatement pstm1 = con.prepareStatement("select * from user_images");
            ResultSet rs1 = pstm1.executeQuery();
            while(rs1.next()) {
                InputStream fis1,fis2;
                FileOutputStream fos1,fos2;
                String image_id;
                try {
                    fis1 = rs1.getBinaryStream("img_data1");
                    fis2=rs1.getBinaryStream("img_data2");
                    image_id=rs1.getString("img_id");
                    fos1= new FileOutputStream(new File("D:\\Informations\\"+image_id+".jpg"));
                    fos2= new FileOutputStream(new File("D:\\Informations\\"+image_id+"sig.jpg"));
                    int c;
                    while ((c = fis1.read()) != -1) {
                        fos1.write(c);
                    }
                    while ((c = fis2.read()) != -1) {
                        fos2.write(c);
                    }
                    fis1.close();
                    fos1.close();
                    fis2.close();
                    fos2.close();

                } catch (Exception ex) {
                    System.out.println(ex);
                }
            } 
            pstm1.close();
            con.close();
        } catch (Exception ex) {
            System.out.println("Exception Occured:"+ex);
            JOptionPane.showMessageDialog(null,ex.getMessage());
        }
    } 
byte[] displayImage(String NID)
{
    byte[] img=null;
    try{
    Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from user_images where img_id = "+NID);
                if(rs.next())
                {
                     img = rs.getBytes("img_data1");
 
                 }
    }
    catch(Exception e)
    {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null,e.getMessage());
    }
    return img;
}
    
    public static void main(String args[])
    {  
       //new Databasee();
       //DatabaseOperation operation1=new DatabaseOperation();
       //operation1.connect();
       //operation1.updateData("123", "Rampura", "000", "4567");
        //System.out.println(operation1.checkData("123", "1234"));
      // operation1.getData();
      // operation1.setData("Jahin","A","B","C","D","E","F","G","H","P","J","H");
     
    }  
}
