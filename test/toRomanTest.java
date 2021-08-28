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

    @Test
    public void shouldConvert2ToII() {assertEquals("II", roman.toRoman(2));
    }

    @Test
    public void shouldConvert3ToIII() {assertEquals("III", roman.toRoman(3));
    }
    @Test
    public void shouldConvert4ToIV() {assertEquals("IV", roman.toRoman(4));
    }
    @Test
    public void shouldConvert5ToV() {assertEquals("V", roman.toRoman(5));
    }
    @Test
    public void shouldConvert8ToVIII() {assertEquals("VIII", roman.toRoman(8));
    }

    @Test
    public void shouldConvert9ToIX() {assertEquals("IX", roman.toRoman(9));
    }

    @Test
    public void shouldConvert10ToX() {assertEquals("X", roman.toRoman(10));
    }
    @Test
    public void shouldConvert37ToXXXVII() {assertEquals("XXXVII", roman.toRoman(37));
    }


}


