package transp;

abstract class Transport {
    int year;
    boolean fly;
    boolean swim;
    int mileage;
    public void launch(){
        System.out.println("Двигатель запущен");
    }
}
