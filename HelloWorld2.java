import java.lang.*;
import java.util.*;
import java.text.*;


public class HelloWorld
{
    public static void main( String[] args )throws java.text.ParseException
    {





        // TEST - convert a windows string to a real path
        String windoze = "C:\\home\\Projects\\stuff";
        String clean   = null;

        clean = windoze.replace('\\', '/');

        log(clean);
                           
        





        /*
        // Output Date As Milliseconds, in a long,  From Jan 1  1970
          
        String sDateFormat   = "MMddyyyy"; 
        String today         = "07172002";
        String bday          = "07202002";  

        SimpleDateFormat sdf = new SimpleDateFormat(sDateFormat); 
        Date dateToday       = sdf.parse(today);
        Date dateBDay        = sdf.parse(bday);

        log("Todays Date IN MS: " + dateToday.getTime());
        log("Birthday IN MS: " + dateBDay.getTime() );
        */
        

        /*
        // Test - Initalizing String[]s
        String[] arrayString = new String[5];

        for ( int i = 0; i < 11; i ++)
        {
            arrayString[i] = "arrayString[" + i  + "]";
            log(arrayString[i]);
        }
        */



        /*
        // Test - Sorting Arrays
        String[] arrayTest = {"z", "a", "q"};
        Arrays.sort(arrayTest);

        for ( int z = 0; z < arrayTest.length; z++ )
            log("arrayTest[" + z + "] = " + arrayTest[z]);
        */


        /*
        // Test extracting stings from vectors
        Vector v = new Vector();
        String sTemp;
        for ( int a = 0; a < 5; a++)
        {
            v.addElement("Test Me!");
            sTemp = v.elementAt(a).toString();
            log(sTemp);

        }
        */




        /*
        // Test alternative ways of concatenating large strings.
        boolean isTrue = true;
        String sql;


        sql = "Im the first substring"  +  "Im the second substring" +
              "Im the third substring"  +  "IM the forth substring"; 
        */




        /*
        // Test using "null" in string arrays

        String[] arraySomeNulls = {
            "Hi", 
            null,
            "I'm"

        };



        for (int a = 0; a < arraySomeNulls.length; a++ )
        {
            if ( arraySomeNulls[a] == null )
                log("null found");
            else
                log("arraySomeNulls[" + a + "] = " + arraySomeNulls[a]);  
        }
       */



        /*
        // Test array dynamically build a string[]

        String[] arrayStrings = new String[10];

        for ( int b = 0; b < 10; b++)
        {
            arrayStrings[b] = "hi"; 
        }

        for ( int c = 0; c < arrayStrings.length; c++)
            log(arrayStrings[c]);


        String[] arrayB;

        arrayB = arrayStrings;
        */


        /*
        // Test Trimming A Null String
        String sTest = null;
        sTest = sTest.trim();
        // yes it will cause a null pointer exception
        */



    }// end function main()



    /*
    static public String[] vectorToStringArray(Vector v )
    {
        if ( (v == null)  || (v.size() < 1) )
            return(null);


        String[] arrayString;
        arrayString = new String[v.size()];
        String sTemp;

        for ( int p = 0; p < v.size(); p++ )
        {
            sTemp = (String) v.elementAt(p);  
            // throw an expception if null
            if ( sTemp != null )
                arrayString[p] = (String) v.elementAt(p);
        }

        log("vectorToStringArray(): arrayLenght= "  + arrayString.length );

        return(arrayString);

    }


    static public Vector trimVector(Vector v)
    {
        if ( (v == null) ||  (v.size() < 1) )
            return null;


        for ( int i = 0; i < v.size(); i++ )
        {
            if ( v.elementAt(i) == null )
            {
                v.removeElementAt(i);
                i--;

            }
        }

        return v;
    }
    */


    //-----------------------------------------------------------------------------
    static private void log( String sMsg)
    {
        System.out.println("-> TEST:  " + sMsg);
    }// end function log()
    //-----------------------------------------------------------------------------


}// end class HelloWorld
