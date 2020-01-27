package www.bit.java.test;

import java.io.File; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.util.Properties;

 public class TestDemo { 
 public static void main(String[] args) throws IOException { 
Properties properties = new Properties() ; 
File file = new File("/Users/yuisama/Desktop/test.properties") ; 
properties.load(new FileInputStream(file)) ;
 System.out.println(properties.getProperty("xa")) ;
 }
 }
