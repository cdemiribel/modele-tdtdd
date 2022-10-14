package tddstart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Dictionary {
    private String name;
    private Map<String,Set<String>> hasmap; 
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
    
    public void addTranslation(String fr, String an){
        if(!hasmap.containsKey(fr)){
            Set<String> l =new TreeSet<>();
            l.add(an);
            hasmap.put(fr,l);
        }
        else{
            Set<String> k = hasmap.get(fr);
            k.add(an);
        }

    }

    public Set<String> getTranslation(String b){
        if(hasmap.containsKey(b))
            return hasmap.get(b);
        return null;
    }
    
}
