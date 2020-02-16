import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        System.out.println("Urodzony 17.02.2009");
        if (majority(17,2,2009))
        System.out.println("pełnoletni");
        else
        System.out.println("niepełnoletni");
    }//end main
    public static boolean majority(int day, int month, int year){
        LocalDate dateOfBrith, now;
        dateOfBrith = LocalDate.of(year,month,day);
        now = LocalDate.now();
        Period p = Period.between(dateOfBrith,now);
        if(p.getYears()>=18) return true;
        return false;

    }
}//end class
