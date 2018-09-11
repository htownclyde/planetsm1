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
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WeightStorage you = new WeightStorage(0, "name");
        System.out.println(you.getWeight());
        System.out.println(you.getName());
        System.out.print("Please enter your name: ");
        int newname = in.nextInt();
        you.setName(newname);
      EEEEE  System.out.print("Please enter your weight: ");
        int newweight = in.nextInt();
        you.setWeight(newweight);
        System.out.printf("New number: %s %d\n", you.getName(), you.getWeight());
        System.out.println(you.getWeight());
        System.out.println(you.getName());
        // TODO code application logic here
    }
    
}
