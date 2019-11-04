
/**
 * Creates an object of EmployeeNames and uses an initializer list to give 
 * the last names that wil be formatted into an acceptable name by the boss.
 * then the formatted array is printed out to see the acceptable names.
 *
 * @author Haley Sanchez
 * @version 12/15/18
 */
public class EmployeeNamesTester
{
    public static void main (String[]args)
    {
        EmployeeNames a = new EmployeeNames();
        String[] lNames = {"Jones", "Smith", "Lopez", "Hello", "Bye", "Haley",
        "Sanchez", "Rodriguez", "Moore", "Photos"};
        String[] formatted = a.convertName(lNames);
        for(int i = 0; i<= formatted.length-1; i++)
        {
            System.out.println(formatted[i]);
        }
    }
}
