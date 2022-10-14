package tddstart;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;

import static org.hamcrest.CoreMatchers.equalTo;

public class DictionaryTest {
    private Map<String,String> m = null;
    @Test public void testDictionaryName() {
        Dictionary dict = new Dictionary("Example",m); 

        assertThat(dict.getName(), equalTo("Example"));
        }
    
    @Test public void testDictionnary(){
        Dictionary d = new Dictionary(null,m);

        assertThat(d.IsEmpty(m), equalTo(true));
    }
    @Test public void testOneTranslation() {
        Dictionary d = new Dictionary("dic",m);
        d.addTranslation("contre", "against");
        assertThat(d.getTranslation("contre"), equalTo("against"));
        d.addTranslation("paix", "peace");
        assertThat(d.getTranslation("paix"), equalTo("peace"));
    }
}
