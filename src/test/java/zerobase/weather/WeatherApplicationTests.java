package zerobase.weather;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest // 테스트용 클래스
class WeatherApplicationTests {

    @Test
    @DisplayName("같은 값인지 테스트")
    void equalTest(){
        assertEquals(1, 1);
    }

    @Test
    @DisplayName("널 값인지 테스트")
    void nullTest(){
        assertNull(null);
    }

    @Test
    @DisplayName("참인지 테스트")
    void trueTest(){
        assertTrue(1 == 1);
    }

}
