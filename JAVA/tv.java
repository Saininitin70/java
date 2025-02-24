abstract class greeks{
    abstract void turnon();
    abstract void turnoff();
}
class tv extends greeks{
    void turnon(){
        System.out.println("TV is turned on");
    }
    void turnoff(){
        System.out.println("TV is turned off");
    }
    public static void main(String args[]){
        greeks remote = new tv();
        remote.turnon();
        remote.turnoff();
    }
}