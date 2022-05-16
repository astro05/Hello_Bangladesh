package hello_bangladesh;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sadman Jahin
 */
public class FileOperation {
    
    File fp;
    private String databaseLocation="D:\\Informations\\database.txt";
    FileOperation()
    {
        ;
    }
     FileOperation(String Name,String Fathersname,String MothersName, String NID,String PresentAddress,String PermanentAddress,String BirthCertificateNo,String TIN,String PassportNo,String MobileNo)
            
    {
         fp=new File("D:\\Informations\\"+Name+"info");
        fp.mkdirs();
        
         try
   {
       FileWriter f=new FileWriter(fp+"\\"+Name+"info.txt");
       Formatter format=new Formatter(f);
        format.format("%s %s %s %s %s %s %s %s %s %s\r\n",Name,Fathersname,MothersName,NID,PresentAddress,PermanentAddress,BirthCertificateNo,TIN,PassportNo,MobileNo);
        format.close();
   }
         catch(Exception e)
       {
           ;
       }
    }
    
    
    
    
    void writeInfoToFile(String userId,String password)
    {
        try
   {
       FileWriter f=new FileWriter(databaseLocation,true);
       Formatter format=new Formatter(f);
        format.format("%s %s\r\n",userId,password);
        format.close();
   }
         catch(Exception e)
       {
           ;
       }
    }
    
    boolean checkInfoFromFile(String name, String password)
    {
        
        try
        {
         java.io.File file=new java.io.File(databaseLocation);
        Scanner sc=new Scanner(file);
        while(sc.hasNext())
        {
        String fname=sc.next();
        String s=sc.next();
         if(fname.equals(name) && s.equals(password))
             return true;
        }
       }
       catch(FileNotFoundException e)
       {
           ;
       }
        return false;
    }
}
