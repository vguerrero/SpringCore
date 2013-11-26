package org.vmgs.corp.output;
 
import org.vmgs.corp.output.IOutputGenerator;
 
public class OutputHelper
{
	IOutputGenerator outputGenerator;
 
	public void generateOutput(){
		outputGenerator.generateOutput();
	}
 
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
}