package Praktikum3;

/**
 * Created by zain on 21/03/17.
 */
public class LIngkaranMain{
    public static void main(String[] args){
        lingkaran l = new lingkaran(3);
        l.setTinggi(10);
        l.displayMessage();
        lingkaran l2 = new lingkaran(4, 10);
        l2.displayMessage();
        lingkaran objekLstring = new lingkaran("4","5");
        objekLstring.displayMessage();
    }
}
