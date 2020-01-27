package www.bit.java.test; 

import java.util.Properties;

 public class TestDemo { 
public static void main(String[] args) { 
Properties properties = new Properties() ; 
properties.setProperty("xa","Xi'An") ; 
properties.setProperty("sh","ShangHai") ;
 System.out.println(properties.get("xa")) ;
 System.out.println(properties.get("bj")) ; 
}
 }
