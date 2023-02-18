package transp.military;
import transp.Transport;
class Tank extends Transport{
    int ammoCount;
    String commander;
    public void shot(){
        System.out.println(ammoCount > 0 ? "Выстрел сделан":"Нет патронов");
        if (ammoCount > 0) ammoCount--;
    }
}
