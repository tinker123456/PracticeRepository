
import java.lang.*;
import java.util.*;
import java.text.*;
//import java.sql.Date;
import java.util.Date;


public class HelloWorld {
    public static void main( String[] args )throws java.text.ParseException
    {

/*
******************************************************************************* 
** String equalities with "
******************************************************************************* 
*/

String s1 = "blank";

if(s1.equals("blank")) {
   log("okay");
}

if(s1.equals("\"\"blank\"\"") ) {
    log("oy");
}








/*
******************************************************************************* 
** Find the date from 6 months ago
******************************************************************************* 

        Calendar c = Calendar.getInstance();
        c.set(Calendar.MILLISECOND, 0);
        c.set(Calendar.SECOND, 0); 
        c.set(Calendar.MINUTE, 0);  
        c.set(Calendar.HOUR, 0); 
        c.add(Calendar.MONTH, -6);

        System.out.println("6 months ago: " + c.getTime());
        java.util.Date sixmonthsago = c.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String sDate         = sdf.format(sixmonthsago);
        System.out.println("Six months ago: " + sDate);

*/


/*
******************************************************************************** 
*                             Try/Catch/Replace
********************************************************************************


        try{
            log("try executed");

        }// end try
        catch (Exception e){
            log("Exception thrown");
        }
        finally{
            log("finally executed");
        }



      /*
      ************************************************************************ 
      ** Replace in a string buffer
      ** *********************************************************************
      

        StringBuffer sb = new StringBuffer();
sb.append("The NSD record for staff member ${first_name} &nbsp; ${last_name} was updated by ${requestor}                                ");
sb.append("<br>                                                                                                                         ");
sb.append("<br>                                                                                                                         ");
sb.append("<br>                                                                                                                         ");
sb.append("<br>                                                                                                                         ");
sb.append("The Permanent Duty Assignment was changed from:                                                                              ");
sb.append("<br>                                                                                                                         ");
sb.append("<br>                                                                                                                         ");
sb.append("${old_address}                                                                                                               ");
sb.append("to:                                                                                                                          ");
sb.append("<br>                                                                                                                         ");
sb.append("<br>                                                                                                                         ");
sb.append("${new_address}                                                                                                               ");
sb.append("<br>                                                                                                                         ");
sb.append("<br>                                                                                                                         ");
sb.append("<br>                                                                                                                         ");
sb.append("<br>                                                                                                                         ");
sb.append("Please verify the new information on the NOAA Staff Directory website ${nsd_url}                                             ");
sb.append("<br>                                                                                                                         ");
sb.append("<br>                                                                                                                         ");
sb.append("If current data contains errors, please contact Production Control - 301-444-2700, or email to NOAA.Staff.Directory@noaa.gov.");
sb.append("<br>                                                                                                                         ");
sb.append("This message was generated by the NOAA Staff Directory.                                                                      ");
sb.append("<br>                                                                                                                         ");
sb.append("<br>                                                                                                                         ");
sb.append("${disclaimer}");


int index = sb.indexOf("{new_address}");
log("index ==" + index + " sb.length == " + sb.length() );
sb =  sb.delete(index, (index + 14));
log(" sb.length == " + sb.length() );
log("substring == " + sb.toString());
          
*/
        /*
                            
        *************************************************************************** 
        ** Convert A String To A Date 
        *************************************************************************** 
        *

        String date_string  = "2012-07-27 00:00:00";
        java.util.Date date = null;
        date_string         = (date_string == null) ? "" : date_string.trim();
        date_string         = (date_string.equals("&nbsp;")) ? "" : date_string;

        DateFormat df       = DateFormat.getDateInstance(DateFormat.SHORT);
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:MM:SS");

        try {
            if(date_string.indexOf("-") > -1) {
                date = sdf.parse(date_string);
            }
            else{
                date = df.parse(date_string);
            }


            
            System.out.println("Success in converting date_string " + date_string);
        }
        catch (Exception e) {
            //2012-07-27 00:00:00
            System.err.println("Failure converting this value to a date: " + date_string);
            e.printStackTrace();
        } 
         
        */ 

        /*
        ************************************************************************ 
        **  Testing what happens with null in condition that test for null
        ************************************************************************ 
        
   
        String somestring = null;
   
        // This will not throw a nullpointer exception if the first clause testing for null is in there, otherwise it will
        if( somestring != null && !somestring.trim().equalsIgnoreCase("null") ) {
            log("legacy testing code works");
        }
        
   
        */





        /*
         ************************************************************************ 
         *  Escape Out Single Quotes
         ************************************************************************
         
         
         String name = "Jim.O'Donne'l";
         log("Before: " + name);
         name       = name.replaceAll("'", "''");
         log("After: " + name);
         
         */


        /*
        ********************************************************************** 
        ** Size of an empty HashMap, zero
        ********************************************************************** 
        
        HashMap<String,String> hm = new HashMap<String,String>();
        log("hm.size() == " + hm.size());
        
        
        /*
        ********************************************************************** 
        ** Length of an empty String ( zero)
        ********************************************************************** 
        
        
        String s_test = "";
        log("s_test.length() == " + s_test.length());
        */

        /*
        *********************************************************************** 
        Can you put a null in a HashMap? 
        ********************************************************************** 
        
        HashMap <String,String> hm = new HashMap<String,String>();
        //Map<String,Object> lhm = new LinkedHashMap<String,Object>();
        
        hm.put("first_value", null);
        
        String first = hm.get("first_value");
        
        log("first == " + first);
        */
        /* 
        ********************************************************************** 
        ** NFC Organization Code 
        *********************************************************************** 
        **  Concatenated version: 5406\01\0005\01\010000 
        **  Component fields come from the person tabbel 
        **  The federal managers code & codes becomes the staff persons code 
        *********************************************************************** 
        **  nfc_lo_code         =  5406
        **  nfc_org_code        =  01
        **  nfc_office_code     =  0005
        **  nfc_division_code   =  01
        **  nfc_branch_code     =  010000 
        ********************************************************************** 
        
        
        String fullcode              = "540601000501010000";
        
        int length_nfc_lo_code       = 4; 
        int length_nfc_org_code      = 2; 
        int length_nfc_office_code   = 4; 
        int length_nfc_division_code = 2; 
        int length_nfc_branch_code   = 6; 
        
        int start_nfc_lo_code        = 0;
        int start_nfc_org_code       = 4;
        int start_nfc_office_code    = 6;
        int start_nfc_division_code  = 10;
        int start_nfc_branch_code    = 12;
        
        
        String nfc_lo_code           = fullcode.substring(start_nfc_lo_code,      (start_nfc_lo_code       + length_nfc_lo_code       ));       
        String nfc_org_code          = fullcode.substring(start_nfc_org_code,     (start_nfc_org_code      + length_nfc_org_code      ));
        String nfc_office_code       = fullcode.substring(start_nfc_office_code,  (start_nfc_office_code   + length_nfc_office_code   ));
        String nfc_division_code     = fullcode.substring(start_nfc_division_code,(start_nfc_division_code + length_nfc_division_code ));
        String nfc_branch_code       = fullcode.substring(start_nfc_branch_code,  (start_nfc_branch_code   + length_nfc_branch_code   ));
        
        log("nfc_lo_code       = " + nfc_lo_code      );
        log("nfc_org_code      = " + nfc_org_code     );
        log("nfc_office_code   = " + nfc_office_code  );
        log("nfc_division_code = " + nfc_division_code);
        log("nfc_branch_code   = " + nfc_branch_code  );
        
        */


        /*
        String msg = "Hello, this string has a \'\\\' in it.";
        log(msg); 
        */

        /*
        Date myvar       =  new java.sql.Date(System.currentTimeMillis());
     
        String anothervar = "Hello My Baby";
        StringBuffer s    = new StringBuffer();

        Map<String,Object> lhm = new HashMap<String,Object>();

        lhm.put("myvar",myvar);
        lhm.put("anotervar",anothervar);

        for (Map.Entry<String, Object> entry : lhm.entrySet()) {
            s.append(entry.getKey() + "/" + entry.getValue());
            s.append(", ");
            s.append("\n");          
            
        }

        s.deleteCharAt(s.lastIndexOf(",") );
        System.out.println(s);


        if (lhm.get("myvar") instanceof Integer) {
            log("myvar is an Integer " + lhm.get("myvar"));
        }
        else if (lhm.get("myvar") instanceof String) {
            log("myvar is a String " + lhm.get("myvar"));
        }
        else if (lhm.get("myvar") instanceof Date) {
            log("myvar is a Date " + lhm.get("myvar")); 
            SimpleDateFormat dateFormat = new SimpleDateFormat ("MM/dd/yyyy");
            String ds = dateFormat.format(lhm.get("myvar"));
            log("date: " + ds);




        }
        else if (lhm.get("myvar") == null) {
            log("myvar is null");
        }
         */



        /*
        // Will the short conditional work without a variable to catch a value?
        String somevalue = "NotNull";

        //max = (a > b) ? a : b;
        // Nope!
        //(somevalue != null) ? log("Not Null") : log("Null");
        
        if (somevalue != null) log("Not Null"); else log("Null");
        */


        /* 
        // When parsing on a period you need "\\." 
        String temp; char[] ctemp;
        StringBuffer sbUserName = new StringBuffer();
        String name    = "stephen.f.russell";
        String[] partsOfName    = name.split("\\.");

        log("partsOfName.length " + partsOfName.length);

        for( int i = 0 ; i < partsOfName.length; i++) {
            temp     = partsOfName[i].trim();
            ctemp    = temp.toCharArray();
            ctemp[0] = Character.toUpperCase(ctemp[0]);
            temp     = new String(ctemp);           
            temp     = (temp.length() < 2) ? temp + "." : temp;
            log(temp);
            sbUserName.append(temp);
            sbUserName.append(" ");
            
        }// end for loop

        log("sbUserName: " + sbUserName);
        */






        /*
        // TEST - convert a windows string to a real path
        String windoze = "C:\\home\\Projects\\stuff";
        String clean   = null;

        clean = windoze.replace('\\', '/');

        log(clean); 
        */

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

    }// end main()

    //-----------------------------------------------------------------------------
    static private void log( String sMsg) {
        System.out.println("-> TEST:  " + sMsg);
    }// end function log()
    //-----------------------------------------------------------------------------


}// end class HelloWorld
