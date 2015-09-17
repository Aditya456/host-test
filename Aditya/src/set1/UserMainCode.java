package set1;

import java.text.*;
import java.util.*;

public class UserMainCode
{
	/*public static int output1;
	public static void reodevn(int input1)
	{
	-------------------------------------------------------------------------------------
7. Retrieve the odd numbers till given input number. add and subtract it consecutively and return the result.
Input:9
Output:1+3-5+7-9=-3

	List<Integer> l=new ArrayList<Integer>();
	for(int i=0;i<=input1;++i)
	{
		if(i%2!=0)
			l.add(i);
	}
	
	output1=l.get(0);
	for(int i=1;i<l.size();++i)
	{
		if(i%2!=0)
			output1+=l.get(i);
		else
			output1-=l.get(i);
	}

*/	
	
	/*8. Given date in dd-MM-yyyy format.return the month in full name format(January)
input:"23-01-2012"
output:January*/
	  /* public static String output1;
	   public static void month(String input1)
	   {
		   try
		   {
		   SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		   Date d=sdf.parse(input1);
		   SimpleDateFormat sdf1=new SimpleDateFormat("MMMM,EEEE");
		   output1=sdf1.format(d);
		   
		} 
		   
		   
		   catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   */
	
	/*Two dates are given as input in "yyyy-MM-dd" format. Find the number of months between the two dates
input1:"2012-12-01"
input2:"2012-01-03"
output:11*/
	
	/*public static int output1;
	public static void monthdiff(String input1,String input2)
	{
		try
		{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date d=sdf.parse(input1);
		Date d1=sdf.parse(input2);
		Calendar c=Calendar.getInstance();
		c.setTime(d);
		int m=c.get(Calendar.MONTH);
		int y=c.get(Calendar.YEAR);
		c.setTime(d1);
		int m1=c.get(Calendar.MONTH);
		int y1=c.get(Calendar.YEAR);
		output1=Math.abs(((y1-y)*12)+(m1-m));
    	}
		catch (ParseException e)
		{
			e.printStackTrace();
		}*/
		
		/*10. arraylist of string type which has name#mark1#mark2#mark3 format. 
		 retrieve the name of the student who has scored max marks(total of three)
input:{"arun#12#12#12","deepak#13#12#12"}
output:deepak*/
		
	/*	public static String output1;
		public static void name(String[] input1)
		{int sum;
	      HashMap<String,Integer> hs=new HashMap<String,Integer>();
	      for(int i=0;i<input1.length;++i)
	      {
	     	  
	    	  String s1=input1[i];
	    	  StringTokenizer st=new StringTokenizer(s1,"#");
	    	  String s2=st.nextToken();
	    	  int n1=Integer.parseInt(st.nextToken());
	    	  int n2=Integer.parseInt(st.nextToken());
	    	  int n3=Integer.parseInt(st.nextToken());
	    	  sum=n1+n2+n3;
	          hs.put(s2, sum);
	      }
	      output1=new String();
	      int max=0;
	      Iterator<String> i=hs.keySet().iterator();
	      while(i.hasNext())
	      {
	    	  String s3=i.next();
	    	  int j=hs.get(s3);      
			  if(j>max)
			  {
				  max=j;
				  output1=s3;
			  }	    	  
	      }
		}*/
	/*23.Find if a given pattern appears in both the input strings at same postions.
input1: "hh--ww--"
input2: "rt--er--"
output: true(false otherwise)*/
	
	/*public static boolean output1;
	public static void check(String input1,String input2)
	{
		int c=0,s=0, a[]=new int[5];
		int p=0,b[]=new int[5];
		int n1=input1.length();
		int n2=input2.length();
		char ch1[]=input1.toCharArray();
		char ch2[]=input2.toCharArray();
		
		if(n1==n2)
		{
		for(int i=0;i<input1.length();++i)
		{
		if(ch1[i]=='-')	
		{
			a[s]=i;
			++s;			
		}
		}
		
		for(int i=0;i<input2.length();++i)
		{
		if(ch2[i]=='-')	
		{
			b[p]=i;
			++p;
			
		}
		}
		
		if(s==p)
		{
		  for(int i=0;i<s;++i)
		  {
			  if(a[i]==b[i])
			  {
				  ++c;
				 
			  }
		  }
		}
		}
		
		if(c==s && c==p && c!=0 && p!=0 && s!=0)
		{
			output1=true;
		}*/
		
		/*----------------------------------------------------------------------------------------------------||
51) Input1=845.69, output=3:2;
    Input1=20.789; output=2:3;
    Input1=20.0; output=2:1;  
    output is in Hashmap format.
    Hint: count the no of digits.*/
	
	/*public static HashMap<Integer,Integer> output1;
	public static void count(float input1)
	{
		String s1= String.valueOf(input1);
		 output1=new HashMap<Integer, Integer>() ;
		
		StringTokenizer st=new StringTokenizer(s1,".");
		String s2=st.nextToken();
		String s3=st.nextToken();
		int n1=s2.length();
		int n2=s3.length();
		//System.out.println(n1);
		//System.out.println(n2);

		output1.put(n1, n2);*/
	
	/*public static ArrayList<String> output1;
	public static void dat(HashMap<String,String>input1)
	{
		
		output1=new ArrayList<String>();
		try
		{
		Iterator<String> i=input1.keySet().iterator();
		while(i.hasNext())
		{
			String s1=i.next();
			String s2=input1.get(s1);
			SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			Date d=sdf.parse(s2);
			Date d1=new Date();
			Calendar cal=Calendar.getInstance();
	        cal.setTime(d);
	        long l=cal.getTimeInMillis();
	        cal.setTime(d1);
	        long l1=cal.getTimeInMillis();
	        long l2=Math.abs(l1-l);
	        long a=l2/1000/60/60/24/365;
	        System.out.println(a);
		    if(a>=18)
		    {
		    	output1.add(s1);
		    }
			
			
		}
		}
		catch(Exception e)
		{
			
		}*/
	
	
	/* String 1 ="Desperation"
     String 2="a rope Ends it";
     check whether they are anagram.*/
	
	/*public static boolean output1;
	public static void anagram(String input1,String input2)
	{
		char ch1[]=input1.toCharArray();
		char ch2[]=input2.toCharArray();
		char ch3[]=new char[input2.length()];
		
		
		int n1=ch1.length;
		int c=0,a=0;
		
		
		for(int i=0;i<ch2.length;++i)
		{
			if(ch2[i]!=' ')
			{
			ch3[a]=ch2[i];
			++a;
			}
		}
		
		int n2=a;
				
		for(int i=0;i<n1;++i)
		{
			for(int j=0;j<n2;++j)
			{
				if(ch1[i]==ch3[j])
				{
					++c;
				}
			}
		}
		
		if(n1==n2 && n1-1==c && n2-1==c)
		{
			output1=true;
		}*/
	
	/*public static String output1;
	public static void cnstr(String input1)
	{
		
		int n1=(input1.length()-1)*2;
		StringBuffer sb=new StringBuffer();
		sb.append(input1);
		sb.reverse();
		
		output1=sb.substring(2).substring(0, 3).toString();
		/*for(int i=0;i<n1;++i)
		{
			if(i%2!=0)
		sb.insert(i, '-');
		}*/
	
		//output1=sb.toString();*/
		
		
	/*public static boolean output1;
	public static void numval(String input1)
	{
		int c=0;
		StringTokenizer st=new StringTokenizer(input1,"-");
		while(st.hasMoreTokens())
		{
			String s1=st.nextToken();
			String s2=st.nextToken();
			String s3=st.nextToken();
			
			if(s1.length()==3 && s2.length()==3 && s3.length()==4)
			{
				char ch[]=s1.toCharArray();
				char ch1[]=s2.toCharArray();
				char ch2[]=s3.toCharArray();
				for(int i=0;i<ch.length;++i)
				{
				if(!Character.isDigit(ch[i]))
					++c;
				}
				for(int i=0;i<ch1.length;++i)
				{
				if( !Character.isDigit(ch1[i]))
					++c;
				}
				for(int i=0;i<ch2.length;++i)
					{
					if(!Character.isDigit(ch2[i]))
						++c;
					}
				if(c==0)
					output1=true;
								
			}
		}
		*/
	
	
	/*public static int[] output1;
	public static void rep(int input1[],int[] input2)
	{
		List<Integer> l1=new ArrayList<Integer>();
		List<Integer> l2=new ArrayList<Integer>();
		List<Integer> l3=new ArrayList<Integer>();
		List<Integer> l4=new ArrayList<Integer>();
		
		for(int i=0;i<input1.length;++i)
		{
			l1.add(input1[i]);
		}
		for(int i=0;i<input2.length;++i)
		{
			l2.add(input2[i]);
		}
		l3.addAll(l1);
		l3.addAll(l2);
		
		l1.removeAll(l2);
		l1.addAll(l2);
		
		
		
		l3.removeAll(l1);
		
		System.out.println(l1);*/
	
	
	
	
	public static int[] output1;
	public static void remapp(int[] input1)
	{
		int c=0;
		output1=new int[input1.length];
		List<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<input1.length;++i)
		{
			if(input1[i]!=10)
			{
			 l.add(input1[i]);
			 ++c;
			}
		}
		
	   for(int i=0;i<c;++i)
		{
			
			output1[i]=l.get(i);
			
						
		}
	
	
	
	
	/*public static String output1;
	public static void app(String input1,String input2)
	{
		int c=0;
		StringBuffer sb1=new StringBuffer();
		//StringBuffer sb2=new StringBuffer();
		
		//sb1.append(input1);
		//sb2.append(input2);
		
		//int n1=0,n2=0;
		char ch1[]=input1.toCharArray();
		char ch2[]=input2.toCharArray();
		
		
		
		if(!input1.equalsIgnoreCase(input2))
		{
			for(int i=0;i<ch1.length;++i)
			{
				c=0;
				for(int j=0;j<ch2.length;++j)
				{
					if(ch1[i]==ch2[j])
					{
						c=1;
					}
						
				}
				if(c==1)
				{
					sb1.append(ch1[i]);
				}
				else
					sb1.append('+');
		
			
		}
		}
		output1=sb1.toString();*/
	
	/*public static int output1;
	public static void len(String input1)
	{
		int c=0;
		char ch1[]=input1.toCharArray();
		for(int i=0;i<ch1.length;++i)
		{
		c=0;	
			for(int j=i+1;j<ch1.length;++j)
			{
				if(ch1[i]==ch1[j])
				{
					ch1[j]=' ';
					++c;
				}
			}
			if(c>0)
			{
				ch1[i]=' ';
			}
		}
	
		c=0;
		
		for(int i=0;i<ch1.length;++i)
		{
			if(ch1[i]!=' ')
			{
				++c;;
			}
		}
		output1=c;*/
	
	
	/*public static float output1;
	public static void sum(HashMap<Integer,Float> input1)
	{
		float sum=0.0f;
		int c=0;
		Iterator<Integer> i=input1.keySet().iterator();
		while(i.hasNext())
		{
			int n1=i.next();
			if(n1%2==0)
			{
			float f1=input1.get(n1);
		    sum=sum+f1;
		    ++c;
			}
		}
		output1=sum/c;*/
	
	
	
	/*public static int output1;
	public static void dat(String input1)
	{
		try
		{
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date d1=sdf.parse(input1);
		Calendar c=Calendar.getInstance();
		c.setTime(d1);
		long l1=c.getTimeInMillis();
		
		Date d2=new Date();
		c.setTime(d2);
		long l2=c.getTimeInMillis();
		
		long l3=(l2-l1)/1000/60/60/24/365;
		output1=(int) l3;
		}
		
		catch(Exception e)
		{
			
		}*/
		
	}
	
	
}
	

