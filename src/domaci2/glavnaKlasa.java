
package domaci2;

import java.util.*;
import java.lang.*;
import java.io.*;

public class glavnaKlasa {

    
    public static void main(String[] args) {
        
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite prvi string");
        String s1 = unos.nextLine();
        System.out.println("Unesite drugi string");
        String s2 = unos.nextLine();
        
        UrosManojlovic um = new UrosManojlovic(s1, s2);
        um.ispis();
        
    }
    
}
