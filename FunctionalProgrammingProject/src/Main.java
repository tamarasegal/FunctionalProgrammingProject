import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void printSoldiers(Soldier [] b) {
        for (Soldier s : b) {
            System.out.print(s + ", ");
        }
        System.out.println();
    }
    //showing two ways to sort: comparable (if we can change the code) and comparator(if we cant) interfaces
    public static void main(String[] args) {
        Soldier[] battalion = {new Soldier(1234),
                new Soldier(5136),
                new Soldier(0000),
                new Soldier(9999)
        };
        printSoldiers(battalion);
        //sort the soldiers
        //LAMBDA WOOHOO!!! i've been waiting for this.
        //this is the most beautiful thing i've ever seen.
        Arrays.sort(battalion, (s1, s2) -> s1.getid() - s2.getid());
        printSoldiers(battalion);

    }
}