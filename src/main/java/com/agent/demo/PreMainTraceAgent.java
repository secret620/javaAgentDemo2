package com.agent.demo;

import com.agent.demo.DefineTransformer;

import java.lang.instrument.Instrumentation;

/**
 * @Description 表示 ：
 * @Author Shi You Qin
 * @Email secret620@163.com
 * @Date Create 17:09 2021/3/15
 **/
public class PreMainTraceAgent {
    public static void premain(String agentArgs, Instrumentation instrumentation){
        System.out.println("agentArgs : " + agentArgs);
        instrumentation.addTransformer(new DefineTransformer(), true);
    }
}
