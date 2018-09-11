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
    double mercuryfactor = .3;
    double venusfactor = .9;
    double moonfactor = .1;
    double marsfactor = .3;
    double jupiterfactor = 2.5;
    double saturnfactor = 1;
    double uranusfactor = .8;
    double neptunefactor = 1.1;
    double plutofactor = 0;

    WeightStorage(double d) {
        weight = d;
    }
    public void setName(String newname){
        name = newname;
    }
    public double getWeight(){
        return weight;
    }
    public String getName(){
        return name;
    }
    public void setWeight(int newweight){
        weight = newweight;
    }
    public double getMercury(){
        return weight*mercuryfactor;
        
    }
    public double getVenus(){
        return weight*venusfactor;
        
    }
    public double getMoon(){
        return weight*moonfactor;
        
    }
    public double getMars(){
        return weight*marsfactor;
        
    }
    public double getJupiter(){
        return weight*jupiterfactor;
        
    }
    public double getSaturn(){
        return weight*saturnfactor;
        
    }
    public double getUranus(){
        return weight*uranusfactor;
        
    }
    public double getNeptune(){
        return weight*neptunefactor;
        
    }
    public double getPluto(){
        return weight*plutofactor;   
    }
}