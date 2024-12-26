package in.shivIt.reports;

import org.springframework.stereotype.Component;

@Component("excel")
public class ExcelReports implements  IReports{
//	public ExcelReports() {
//	 System.out.println("ExcelReports Constructor");
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void gneretReport() {
		// TODO Auto-generated method stub
		System.out.println("ExcelReport");
		
	}

}
