package com.foxhis.chapter3;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class ConditonalImpl implements Condition{

	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		// TODO Auto-generated method stub
		Environment environment=context.getEnvironment();
		if(environment!=null)
		{
			return environment.containsProperty("name");
		}
		
		return false;
	}

}
