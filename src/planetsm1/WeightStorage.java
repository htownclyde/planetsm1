/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planetsm1;

/**
 *
 * @author clydejohnson
 */
public class WeightStorage {
    double weight;
    String name;

    WeightStorage(double d, String str) {
        weight = d;
        name = str;
    }
    public double getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }
    public void setName(str newname){
        name = newname;
    }
    public void setWeight(int newweight){
        weight = newweight;
    }
}