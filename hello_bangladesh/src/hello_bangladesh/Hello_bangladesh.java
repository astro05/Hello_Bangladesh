
package hello_bangladesh;


public class Hello_bangladesh {
    

    public static void main(String[] args) {
        
        
        intro intro = new intro();
        intro.setVisible(true);
        
        try{
            Thread.sleep(8000);
            intro.setVisible(false);
            login login = new login();
            login.setVisible(true);
            
            
        
        }
        catch(Exception e)
        {
            
        }
        
    }
    
}
