package planetsm1;
import java.util.Scanner;
/**
 *
 * @author clydejohnson
 */
public class WeightCalc {
    /**
     * @param args the command line arguments
     */
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        WeightStorage you = new WeightStorage( 0.0 );
        System.out.print( "Please enter your name: " );
        String newname = in.nextLine();
        you.setName( newname );
        System.out.printf( "\nWelcome, %s. With this program, you can input your weight to learn\nwhat it would be on our moon and other planets in the solar system.\n\n", you.getName() );
        you.setName( newname );
        System.out.print("Please enter your weight: ");
        int newweight = in.nextInt();
        you.setWeight( newweight );
        System.out.println( "" );
        System.out.printf( "New weight on Mercury: %s pounds\n", you.getMercury() );
        System.out.printf( "New weight on Venus: %s pounds\n", you.getVenus() );
        System.out.printf( "New weight on The Moon: %s pounds\n", you.getMoon() );
        System.out.printf( "New weight on Mars: %s pounds\n", you.getMars() );
        System.out.printf( "New weight on Jupiter: %s pounds\n", you.getJupiter() );
        System.out.printf( "New weight on Saturn: %s pounds\n", you.getSaturn() );
        System.out.printf( "New weight on Uranus: %s pounds\n", you.getUranus() );
        System.out.printf( "New weight on Neptune: %s pounds\n", you.getNeptune() );
        System.out.printf( "New weight on Pluto: %s pounds\n", you.getPluto() );
        System.out.printf( "\nThank you for using the program, %s.\n", you.getName() );
    } 
}
