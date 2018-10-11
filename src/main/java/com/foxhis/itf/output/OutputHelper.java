package com.foxhis.itf.output;

public class OutputHelper {

	public IOutputGenerator outputGenerator;
	
	public void generateOutput()
	{
		outputGenerator.generateOutput();
	}
	
	public void setOutputGenerator(IOutputGenerator outputGenerator){
		this.outputGenerator = outputGenerator;
	}
}
