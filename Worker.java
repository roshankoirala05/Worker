/** 
     *@author- Roshan Koirala 
     *@since-Feb 28, 2014
     *The Worker class which contains instances that represents  person's name,ID,Skilled level,no of months  he worked and insurance option.
      */   

/**
*set up Worker class with instance variable name, id, level, option, months
*/
public class Worker
{
   private String name;
   private String id;
   private String level;
   private int option;
   private int months;
  
  /**
  * set up Worker Constructor to assingn the parameeter to the instance variable
  *@param- initname-takes the name of a person from test program
  *@param- initid-takes the id of a person from test program
  *@param- initlevel-takes the level of a person from test program
  *@param- initoption-takes the medical insurance optionn of a person from test program
  /* initialize month value to zero
  */
   public Worker(String initname,String initid, String initlevel, int initoption)
   {
      name = initname;
      id= initid;
      level = initlevel;
      option= initoption;
      months = 0;
   
   }
   
   /**
  * set up Worker Constructor to assign the parameter to the instance variable
  *@param- initname-takes the name of a person from test program
  *@param- initid-takes the id of a person from test program
   *@param- initoption-takes the medical insurance optionn of a person from test program
  * @setup-initialize month value to zero
  * @setup-initialize level to apprentice
  
  */

   public Worker(String initname, String initid, int initoption)
   {
      name= initname;
      id= initid;
      option= initoption;
      level = "apprentice";
      months = 0;
   }

   /**
  * set up Worker Constructor to which assigns value to various instance variable
  *@param- no parameter sent to the connstructor
   *@setup- initialize month value to zero
   *@setup-initialize id t o000000000
   *@setup-initialize name to anonymous
   *@setup-innitialize option to 1
  */

   public Worker()
   {
      name = "Anonymous";
      id= "000000000";
      level= "apprentice";
      months=0;
      option = 1;
   }
   /**
   *@setup setName method 
   *@param name1- a strinng that takes person name from test program
   */
   public void setName(String name1)
   {
      name= name1;
   
   }
   
   /**
   *@setup setid method 
   *@param id1- a string that takes person id from test program
   */

   public void setId(String id1)
   {
      id=id1;
   
   }
   
   /**
   *@setup setlevel method 
   *@param level1- a string that takes person level  from test program
   */

   public void setLevel(String level1)
   {
      level=level1;
   }


   /**
   *@setup setMonths method 
   *@param name1- a integer that takes total monnth from test program
   */

   public void setMonths(int months1)
   {
      months= months1;
   
   }
   
   /**
   *@setup setoption method 
   *@param option1- a integer that takes insurance option type from test program
   */

   public void setOption(int option1)
   {
      option=option1;
   
   }
   
   /**
   *@setup getName method 
   *@return name- returns person  name to the test program
   */

   public String getName()
   {
      return name;
   }
   
   /**
   *@setup getId method 
   *@return id- returns person id to the test program
   */
   public String getId()
   {
      return id;
   }
   
   /**
   *@setup getlevel method 
   *@return level- returns person  level to the test program
   */
   public String getLevel()
   {
      return level;
   }
   
   /**
   *@setup getmonth method 
   *@return months- returns total month to the test program
   */
   public int getMonths()
   {
      return months;
   }

   /**
   *@setup getoptionn method 
   *@return option- returns insurance option type to the test program
   */
   public int getOption()
   {
      return option;
   }

   /**
   *@setup promote method of boolean type 
   *@return true- returns return true if the level is promoted
   *@return false- returns false if thet level is not promoted
   */
   public boolean promote()
   {
      if(level.equals("apprentice") || level.equals("skilled"))
      {
         if(level.equals("apprentice"))
         { 
            level ="skilled";
         }
        if( level.equals("skilled"))
         {
            level = "expert";
         }
         return true;
      
      }
      else
      {
         return false;
      }
   }
   
   
   /**
   *@setup demote method of boolean type 
   *@return true- returns  true if the level is demoted
   *@return false- returns false if thet level is not demoted
   */
   public boolean demote()
   {
      if(level.equals("expert") || level.equals("skilled"))
      {
         if(level.equals("skilled"))
         {
            level = "apprentice";
         }

         if(level.equals("expert"))
         { 
            level ="skilled";
         }
          return true;
      
      }
      else
      {
         return false;
      }
   }

   /**
   *@setup calcInsuranceCost method of double type 
   *@return- the insurane cost of different type to test program 
    */

   public double calcInsuranceCost()
   {
      final double medical = 32.50, dental=10.0, vision =10;
      double inscost=0;
      if(option ==1)
      { 
         inscost= medical;
      }
      if(option==2)
      {
         inscost= medical+dental;
      }
      if(option ==3)
      {
         inscost= medical+vision;
      }
      if(option ==4)
      {
         inscost=medical+dental+vision;
      }
     return inscost; 
   }
   
   
   /**
   *@setup calcGrossPay method of double type 
   *@return- the total gross pay different level to test program 
    */
 
   public double calcGrossPay(double hoursworked)
   {
   double grosspay=0;
      if( hoursworked > 40)
      { 
         if(level.equals("expert"))
         {
            grosspay= ((40*30) + ((hoursworked-40)*45));
         }
         if(level.equals("skilled"))
         {
            grosspay= ((40*24) + ((hoursworked-40)*36));
         }
      
         if(level.equals("apprentice"))
         {
            grosspay= ((40*17)+ ((hoursworked-40)*25.5));
         }
      
      }
   
   
      if( hoursworked <= 40)
      { 
      
         if(level.equals("expert"))
         {
            grosspay= hoursworked*30;
         }
         if(level.equals("skilled"))
         {
           grosspay= hoursworked*24;
         }
      
         if(level.equals("apprentice"))
         {
            grosspay= hoursworked*17;
         }
      
      }
      return grosspay;
      
   }   

    /**
   *@setup calcleave method of integer type 
   *@return- the total leave days depending upon level and number of months worked 
    */

   public int calcLeave()
   {
      int leave=0;
      if(level.equals("apprentice"))
      {
      
         if(months>=0 && months<=23)
         {
            leave= 1;
         }
         if(months>=24 && months<=59)
         {
            leave= 2;
         }
         if(months>=60)
         {
           leave= 3;
         }
      
      }
   
   
      if(level.equals("skilled"))
      {
      
         if(months>=0 && months<=23)
         {
            leave= 2;
         }
         if(months>=24 && months<=59)
         {
            leave= 3;
         }
         if(months>=60)
         {
            leave= 4;
         }
         
      }
   
      if(level.equals("expert"))
      {
      
         leave= 5;
      
      }
     return leave; 
   }

 
 
     /**
   *@setup toString() method of of String type type 
   *@return- the string to the  test program when an object is called
    */

   public String toString()
   {
   String information;
   information = "Name = "+name+ "\nSocial Security Number =" +id+" \nLevel ="+level+"\nInsurance Option ="+option ;
   return information;
   }

}