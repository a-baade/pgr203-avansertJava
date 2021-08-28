import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class toRomanTest {
    IntToRoman roman;
    @BeforeEach
    public void inObject(){
        roman = new IntToRoman();
    }

    @Test
    public void shouldConvert1ToI() {assertEquals("I", roman.toRoman(1));
    }


}


