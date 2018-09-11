//Declare the package containing WeightStorage
package planetsm1;
/*
 * http://www.exploratorium.edu/ronh/weight/
 * @author clydejohnson
 */
//Create a class for storing weight values and multipliers
public class WeightStorage {
    //Create variables for the user's data, and the weight factors for each planet
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
    //Defining arguments for this instance of WeightStorage
    WeightStorage(double d) {
        weight = d;
    }
    //Sets the name string when called
    public void setName(String newname){
        name = newname;
    }
    //Returns the weight double when called
    public double getWeight(){
        return weight;
    }
    //Returns the name string when called
    public String getName(){
        return name;
    }
    //When called, stores original weight data, which will be referenced by future methods in WeightStorage
    public void setWeight(int newweight){
        weight = newweight;
    }
    //Methods below return the original weight value times their planet's gravitational factor when called in WeightCalc
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