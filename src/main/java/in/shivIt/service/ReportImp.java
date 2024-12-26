package in.shivIt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import in.shivIt.reports.IReports;
@Service
public class ReportImp {
	@Autowired
	@Qualifier("excel")
  private IReports iReports;
  
  public void genrate() {
	// TODO Auto-generated method stub
     iReports.gneretReport();
}
}
