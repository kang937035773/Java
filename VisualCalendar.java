package test;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 可视化日历程序
 * @author Administrator
 *
 */

public class VisualCalendar {
	public static void main(String[] args) {
		System.out.println("请输入日期（按照格式:2030-3-10）:");
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.nextLine();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		try{
			Date date = format.parse(temp);
			Calendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			int day = calendar.get(calendar.DATE);
			calendar.set(calendar.DATE, 1);
			
			int maxDate = calendar.getActualMaximum(calendar.DATE);
			System.out.println("日\t一\t二\t三\t四\t五\t六");
			
			for(int i = 1; i < calendar.get(calendar.get(calendar.DAY_OF_WEEK)); i++){
				System.out.print('\t');
			}
			for(int i = 1; i <= maxDate; i++){
				if(i==day){
					System.out.print("*");
				}
				System.out.print(i + "\t");
				int w = calendar.get(calendar.DAY_OF_WEEK);
				if(w==calendar.SATURDAY){
					System.out.println();
				}
				calendar.add(calendar.DATE, 1);
			}
		}catch(ParseException e){
			e.printStackTrace();
		}
		
	}

}
