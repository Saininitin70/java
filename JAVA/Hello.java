class Person {
  
    void role() {
        System.out.println("I am a person.");
    }
}

class father extends Person {
  
    @Override
    void role() {
        System.out.println("I am a father.");
    }
}
class son extends Person {
    @Override
    void role() {
        System.out.println("hey buddy.");
    }

    
}
 public class Hello {
    public static void main (String[] args) {
      
       Person p=new son();
       p.role();
       
    }
}