package in.shivIt.reports;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Pdf")
@Primary
public class PdfReports implements  IReports {

	@Override
	public void gneretReport() {
		// TODO Auto-generated method stub
		System.out.println("PdfReports");
	}

}
