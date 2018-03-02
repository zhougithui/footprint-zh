package com.zmy.instrument;

import java.lang.instrument.ClassDefinition;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;

/**
 * 两个中的任意一个方法就行
 * premain(agentArgs, inst)优先级更高，都存在的情况下premain(agentArgs)被忽略
 * @author q
 *
 */
public class BookstoreAgent {
	public static void premain(String agentArgs, Instrumentation inst) throws ClassNotFoundException, UnmodifiableClassException{
		// inst.addTransformer(new Transformer());
		ClassDefinition def = new ClassDefinition(TransClass.class,
				Transformer.getBytesFromFile(Transformer.classNumberReturns2));
		inst.redefineClasses(new ClassDefinition[] { def });
		System.out.println("transfer success");
	}
	public static void premain(String agentArgs){
		
	}
	
	public static void agentmain(String agentArgs, Instrumentation inst) throws UnmodifiableClassException{
		inst.addTransformer(new Transformer(), true); 
        inst.retransformClasses(TransClass.class); 
        System.out.println("Agent Main Done"); 
	}
	public static void agentmain(String agentArgs){
		
	}
}
