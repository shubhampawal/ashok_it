package in.shivIt.conf;

import java.awt.AWTException;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import in.shivIt.reports.PdfReports;
import in.shivIt.reports.Roboet;

@Configuration
@ComponentScan(basePackages = {"in.shivIt"})
public class AppConf {
	
	
public AppConf() {
	System.out.println("AppConf Constructor");
}

  @Bean
 public Roboet builRobot() {
	Roboet r=new Roboet();
	return r;
    }
}
