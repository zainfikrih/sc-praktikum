package Praktikum4;

/**
 * Created by Zain Fikri H on 31/03/2017.
 */
public class Vehicle1 {
    double load, maxLoad;
    public Vehicle1 (double max){
        this.maxLoad = max;
    }
    public double getLoad(){
        return this.load;
    }
    public double getMaxLoad(){
        return this.maxLoad;
    }
    public boolean addBox(double weight){
        double temp = 0.0D;
        temp = this.load + weight;
        if(temp <= maxLoad){
            this.load = this.load + weight;
            return true;
        }else {
            return false;
        }
    }
}
