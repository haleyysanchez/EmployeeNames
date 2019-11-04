
/**
 * Uses methods to find the accepted names for the company's boss.
 * Uses arrays to store the last names and then the formatted name.
 * The first initial must be the last letter in the persons last name.
 * the middle initial is the second to last letter in the last name.
 *
 * @author Haley Sanchez
 * @version 12/15/18
 */
public class EmployeeNames
{
    private String[] fNames = new String[10];
    //a constructor for the EmployeeNames class
    public EmployeeNames()
    {
       String[] lNames = new String[10]; 
       String[] formatted = new String[10];
    }
    //gets the formatted name from the last name
    public static String[] convertName(String[] lNames)
    {
        String[] fNames = new String[10];
        for(int i = 0; i <= lNames.length-1; i++)
        {
            String name = lNames[i];
            String first = name.substring(name.length()-1);
            String mid = name.substring(name.length()-2,name.length()-1);
            String newName = first.toUpperCase()+". "+ mid.toUpperCase()
            +". "+lNames[i];
            fNames[i] = newName;
            
        } 
        return fNames;
    }
    
}
