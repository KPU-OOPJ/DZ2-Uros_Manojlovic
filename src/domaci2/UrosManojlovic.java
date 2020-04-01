
package domaci2;


public class UrosManojlovic {
    private String s1;
    private String s2;
    
    public UrosManojlovic (String s1, String s2) {
    
        this.s1 = s1;
        this.s2 = s2;
    
        }
    
    public void setS1(String s1){
        this.s1 = s1;
    }
    public void setS2(String s2){
        this.s2 = s2;
    }
    
    
    public String getS1(){
        return s1;
    }
    public String getS2 (){
        return s2;
    }
    
    public void ispis(){
        
        System.out.println("Duzina prvog stringa iznosi: " + s1.length());
        System.out.println("Duzina drugog stringa iznosi: " + s2.length());
        String s = s1 + s2;
        System.out.println("Spojeni string izgleda ovako: \n" + s);
        
    }
}
