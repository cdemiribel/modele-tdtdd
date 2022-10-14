package tddstart;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private String name;
    private Map<String,String> hasmap; 
    public Dictionary(String name, Map hasmap){
        this.name=name;
        this.hasmap= new HashMap<>();
    }
    public String getName() {
        return name;
    }
    public boolean IsEmpty(Map m){
        if(m == null)
            return true;
        else
            return false;
    }
    
    public void addTranslation(String a, String b){
        hasmap.put(a,b);

    }

    public String getTranslation(String b){
        if(hasmap.containsKey(b))
            return hasmap.get(b);
        return  "";
    }
    
}
