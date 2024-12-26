package in.shivIt.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.shivIt.conf.AppConf;
import in.shivIt.service.ReportImp;

public class Test {
public static void main(String[] args) {
ApplicationContext context=new AnnotationConfigApplicationContext(AppConf.class);
//   ReportImp imp=context.getBean(ReportImp.class);
//   imp.genrate();
}
}
