package org.vmgs.corp;

import org.vmgs.corp.output.IOutputGenerator;
import org.vmgs.corp.output.CsvOutputGenerator;
import org.vmgs.corp.output.OutputHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       //IOutputGenerator output = new CsvOutputGenerator();
	   System.out.println("\nTest Victor OK");
	   ApplicationContext context = 
    	   new ClassPathXmlApplicationContext(new String[] {"spring_beans.xml"});
 
    	OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	output.generateOutput();

    	//output.generateOutput();
    	//este es un cambio de prueba desde eclipse egit
    }
}
