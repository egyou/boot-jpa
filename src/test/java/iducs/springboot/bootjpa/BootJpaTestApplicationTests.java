package iducs.springboot.bootjpa;

import iducs.springboot.bootjpa.entity.MemoEntity;
import iducs.springboot.bootjpa.repository.MemoRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class BootJpaTestApplicationTests {
    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testClass() {
        IntStream.rangeClosed(1,100).forEach(i -> {
            MemoEntity memo = MemoEntity.builder().memoText("Memo  " + i).build();
            memoRepository.save(memo);
            //memoRepository.
        });
    }
    /*
    @Test
    void contextLoads() {
        int x = 10, y = 10;
        assertEquals(x, y);
    }
    public class Study{
        private int limit;
        public Study(int limit) {
            if(limit<0) {
                throw new IllegalArgumentException("limit은 0보다 커야한다.");
            }
            this.limit = limit;
        }
    }

    //Test
    @Test
    @DisplayName("study")
    void create_new() {
        //발생한 예외 확인 가능
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> new Study(-10));

        //사용자가 기대한 예외 메시지가 맞는지 확인 가능
        String message = exception.getMessage();
        assertEquals("limit은 0보다 커야한다", exception.getMessage());
    }

     */
}
