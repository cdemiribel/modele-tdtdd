package tddstart;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;

public class DictionaryTest {
    @Test public void testDictionaryName() {
        Dictionary dict = new Dictionary("Example"); 

        assertThat(dict.getName(), equalTo("Example"));
        }
    
    @Test public void testDictionnary(){
        Dictionary d = new Dictionary(null);

        assertThat(d.IsEmpty(), equalTo(false));
    }
}
