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
    private Map<String,String> translations; 
    private Map<String,List<String>> test; 
    public Dictionary(String name, Map hasmap){
        this.name=name;
        this.translations= new HashMap<>();
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
    
    public void addMultiTranslation(String fr, String an){
        if(!test.containsKey(fr)){
            List l =new ArrayList();
            l.add(an);
            test.put(fr,l);
        }
        else{
            List<String> k = test.get(fr);
            k.add(an);
        }

    }

    public List<String> getMultiTranslation(String b){
        if(translations.containsKey(b))
            return test.get(b);
        return null;
    }
    
    public void addTranslation(String fr, String an){
        if(!translations.containsKey(fr)){
            translations.put(fr,an);
        }

    }

    public String getTranslation(String b){
        if(translations.containsKey(b))
            return translations.get(b);
        return null;
    }
    
}
