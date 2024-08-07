package com.java.learn;

import java.util.HashMap;
import java.util.Map;

public class FindMyNumber {

	public static void main(String[] args) {
//		String str1 = "eight zero seven four six nine eight nine two four";
//		String str2 = "double nine eight nine double three double three five six";
		String str3 = "double two triple three triple four double five";

		Map<String, Integer> map = new HashMap<>();

		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("six", 6);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("nine", 9);
		map.put("zero", 0);
		
		String result="";
		String[] temp=str3.split(" ");
		int len=temp.length;
		for(int index=0;index<len;index++)
		{
			int value=map.getOrDefault(temp[index],-1);
			if(value==-1)
			{
				if(temp[index].equals("double") && index+1 <len)
				{
					 value=map.getOrDefault(temp[index+1],-1);
					 result+=value+""+value;
					 index++;
					 continue;
				}
				else if(temp[index].equals("triple") && index+1 <len)
				{
					value=map.getOrDefault(temp[index+1],-1);
					result+=value+""+value+""+value;
					index++;
					continue;
				}
			}
			result+=value;
		}
		if(result.length()==10) {
		 System.out.println("result number:"+result);
		}
		else
		{
			System.out.println("Invalid Input");
		}

	}

}
