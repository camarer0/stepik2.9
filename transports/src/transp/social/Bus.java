package transp.social;
import transp.Transport;
class Bus extends Transport{
    protected int maxCount;
    protected String driver;
    protected int routNumber;
    public void makeStop(){
        System.out.println("Сделана остановка");
    }
}
