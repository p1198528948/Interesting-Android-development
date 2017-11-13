package day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate01 {
	public static void main(String[] args) {
		SimpleDateFormat sim=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d=new Date();
		System.out.println(sim.format(d));
		System.out.println("============");
		long time=d.getTime();
		long time1=0;
		System.out.println(time);
		System.out.println(time1=time/1000);
		System.out.println("============");
		long year1=time1/(60*60*24*365);
		long year=time/(1000*60*60*24*365);
		System.out.println(year+"\t"+year1);
		System.out.println("============");
		
		String time2="2016-08-05 00:00:00";
		
		try {
			long endtime=sim.parse(time2).getTime();
			System.out.println(endtime+"\n++++++++++\n"+time);
			long st=(endtime-d.getTime())/1000;
			long st1=st/(60*60*24);
			System.out.println(sim.parse(time2)+"\n"+endtime+"\t"+st1);
		} catch (ParseException e) {
			e.printStackTrace();//shit+alt+z
		}
	}
}
