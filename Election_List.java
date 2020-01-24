package Election;

import java.util.*;
//import java.util.Map.Entry;
import day3assignment.Author;

public class Election_List 
{
  
   public static void main(String[] args)
   {
	   HashSet<Election> parties = new HashSet<Election>();
	   parties.add(new Election(1, "BJP", "01-02-2020","Jaipur","Rajasthan","10-02-2020"));
	   parties.add(new Election(1, "Congress", "02-02-2020","Kota","Rajasthan","10-02-2020"));
	   parties.add(new Election(1, "BSP", "01-02-2020","Ajmer","Rajasthan","10-02-2020"));
	   parties.add(new Election(1, "Congress", "04-02-2020","Jaipur","Rajasthan","10-02-2020"));
	  
	 
	   //ArrayList<String> arrli = new ArrayList<String>();
	   
	   //HashSet<String> hs = new HashSet<String>(arrli);
			   
		   
	   for(Election e : parties) {
		   e.getName();
	   }
   
	   System.out.println(parties);
	   
	   List<String> arrlist = new ArrayList<String>();
	   ArrayList<String> cDate = new ArrayList<String>();
	   
	   for(Election e: parties)
	   {
		   if(arrlist.contains(e.getElection_date())) {
			   System.out.println("Parties with common date");
			   cDate.add(e.getElection_date());
		   }
		   arrlist.add(e.getElection_date());
	   }
 

	   for(Election e: parties)
	   {
		   if(cDate.contains(e.getElection_date()))
		   {
			   System.out.println(e);
		   }
	   }
	   
   }
}
