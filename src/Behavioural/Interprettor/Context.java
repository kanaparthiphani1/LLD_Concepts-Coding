package Behavioural.Interprettor;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String,Integer> contextMap ;

    public Context() {
        contextMap = new HashMap<>();
    }

    public void addCOntext(String a, Integer val){
        contextMap.put(a,val);
    }

    public Integer getContext(String a){
        return contextMap.get(a);
    }
}
