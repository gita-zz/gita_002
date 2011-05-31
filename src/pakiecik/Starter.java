package pakiecik;

public class Starter {

    public static void main(String[] args) {
        new Starter();
    }
    
    public Starter() {
        System.out.println(" -> Startujemy :P");
        test();
    }
    
    private void test() {
        System.out.println(" -> taka sobie prywatna funkcja");
    }
    
    private String toStr() {
	     return " -> jest OK";
    } 
    
    
}
