//Declare the package containing WeightCalc
package planetsm1;
//Import the Scanner class for use
import java.util.Scanner;
/*
 * http://www.exploratorium.edu/ronh/weight/
 * @author clydejohnson
 */
//Create the WeightCalc class to execute desired methods
public class WeightCalc {
    /**
     * @param args the command line arguments
     */
    //Declare main
    public static void main( String[] args ) {
        //Create new scanner
        Scanner in = new Scanner( System.in );
        //Connects WeightStorage to WeightCalc so that WeightCalc can interact 
        WeightStorage you = new WeightStorage( 0.0 );
        //Prompt for user
        System.out.print( "Please enter your name: " );
        //Sets newname variable to next input by user
        String newname = in.nextLine();
        //Uses setName to set stored name to newname variable
        you.setName( newname );
        //Dialog describes program and uses getName to get user name
        System.out.printf( "\nWelcome, %s. With this program, you can input your weight to learn\nwhat it would be on our moon and other planets in the solar system.\n\n", you.getName() );
        //Prompt for user
        System.out.print("Please enter your weight: ");
        //Sets newweight variable to next input by user
        int newweight = in.nextInt();
        //Uses setWeight to set stored weight to newweight variable
        you.setWeight( newweight );
        //Creates a break between dialog and results
        System.out.println( "" );
        //Following printf commands call get[Planet] functions from WeightStorage and display them
        System.out.printf( "New weight on Mercury: %s pounds\n", you.getMercury() );
        System.out.printf( "New weight on Venus: %s pounds\n", you.getVenus() );
        System.out.printf( "New weight on the Moon: %s pounds\n", you.getMoon() );
        System.out.printf( "New weight on Mars: %s pounds\n", you.getMars() );
        System.out.printf( "New weight on Jupiter: %s pounds\n", you.getJupiter() );
        System.out.printf( "New weight on Saturn: %s pounds\n", you.getSaturn() );
        System.out.printf( "New weight on Uranus: %s pounds\n", you.getUranus() );
        System.out.printf( "New weight on Neptune: %s pounds\n", you.getNeptune() );
        System.out.printf( "New weight on Pluto: %s pounds\n", you.getPluto() );
        System.out.printf( "\nThank you for using the program, %s.\n", you.getName() );
    } 
}
