/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author Charith
 */

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Connection {
    
    
    public static void initFirbase() throws IOException{
        FileInputStream refeshtoken=null;
        try{
                refeshtoken= new FileInputStream("e-driver.json");
        
                FirebaseOptions options =new FirebaseOptions.Builder()
                        .setCredentials(GoogleCredentials.fromStream(refeshtoken))
                        .setDatabaseUrl("https://e-drivers-ed3fc.firebaseio.com/")
                        .build();
                FirebaseApp.initializeApp(options);
        }
        catch(FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex);
            
        }
              
        
    }
}
