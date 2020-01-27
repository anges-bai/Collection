package www.bit.java.test; 

import java.io.File; 
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties; 

public class TestDemo { 
public static void main(String[] args) throws IOException {
 Properties properties = new Properties() ; 
properties.setProperty("xa","Xi'An") ;

properties.setProperty("sh","ShangHai") ; 
File file = new File("/Users/yuisama/Desktop/test.properties") ; 
properties.store(new FileOutputStream(file),"testProperties") ; 
}
 }
