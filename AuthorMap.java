package day3assignment;

import java.util.*;
import java.util.Map.Entry;

public class AuthorMap {

	public static void main(String[] args) {
		

	   TreeMap<Integer, Author> authors = new TreeMap<Integer, Author>();
	
       authors.put(1 , new Author(101,"Harsh","jaipur"));
       authors.put(2 , new Author(102,"Abhishek","jaipur"));
       authors.put(3 , new Author(103,"Abhishek","jaipur"));
       authors.put(4 , new Author(104,"Simran","kota"));
       
       ArrayList<String> list=new ArrayList<String>();
       
       for(Entry<Integer, Author> keys : authors.entrySet())
       {

    	    List<String> au =  Arrays.asList(keys.getValue().getName());
    	    Set<String> uniqueWords = new HashSet<String>(au);
    	    list.addAll(uniqueWords);
       }
       
       
    	     Map<String, Integer> mp= new HashMap<String, Integer>();
               for(String word : list) {
            	   if(mp.get(word) == null)
            	   {
            		   mp.put(word, 1);
            	   }
            	   else
                   {
                       mp.put(word, mp.get(word)+1);
                   }
               }
               
               Set<Entry<String, Integer>> entrySet = mp.entrySet();
               for (Entry<String, Integer> entry : entrySet) 
               {               
                   if(entry.getValue() > 1)
                   {
                       System.out.println("Author : "+entry.getKey()+" "+entry.getValue()+" times.");
                   }
               }
	}
}
