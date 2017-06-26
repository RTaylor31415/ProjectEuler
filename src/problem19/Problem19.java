package problem19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem19 {
	static List<Integer> numbers2 = new ArrayList<>(Arrays.asList(0,31,28,31,30,31,30,31,31,30,31,30,31));
	public static void main(String[] args)
	{
		System.out.println(CountingSundays(1,1,1901,31,12,2000));
	}
	public static int CountingSundays(int day, int month, int year,int endday, int endmonth, int endyear)
	{
		int count=0;
		int weekday=CalculateWeekday(1,1,1900,1,1,1901);
		if(Leapyear(year))
		{
			numbers2.set(2, 29);
		}
		else
		{
			numbers2.set(2, 28);
		}
		while(day<endday||month<endmonth||year<endyear)
		{
			if(weekday==1&&day==1)
			{
				count++;
			}
			day++;
			weekday++;
			if(weekday>7)
			{
				weekday=1;
			}
			if(day>numbers2.get(month))
			{
				month++;
				day=1;
			}
			if(month>12)
			{
				
				month=1;
				year++;
				if(Leapyear(year))
				{
					numbers2.set(2, 29);
				}
				else
				{
					numbers2.set(2, 28);
				}
			}
			
		}
		return count;
	}
	public static boolean Leapyear(int year)
	{
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}
	public static int CalculateWeekday(int day, int month, int year, int endday, int endmonth, int endyear)
	{
		
		int weekday=2;
		if(Leapyear(year))
		{
			numbers2.set(2, 29);
		}
		else
		{
			numbers2.set(2, 28);
		}
		while(day<endday||month<endmonth||year<endyear)
		{
			day++;
			weekday++;
			if(weekday>7)
			{
				weekday=1;
			}
			if(day>numbers2.get(month))
			{
				month++;
				day=1;
			}
			if(month>12)
			{
				
				month=1;
				year++;
				if(Leapyear(year))
				{
					numbers2.set(2, 29);
				}
				else
				{
					numbers2.set(2, 28);
				}
			}
			
		}
		return weekday;
	}
}
