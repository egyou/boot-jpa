package iducs.springboot.bootjpa;

import iducs.springboot.bootjpa.entity.MemoEntity;
import iducs.springboot.bootjpa.repository.MemoRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;
import java.util.stream.IntStream;

@SpringBootTest
public class MemoRepositoryTests {
    @Autowired
    MemoRepository memoRepository;

    @Test
    public void testClass() {
        IntStream.rangeClosed(1,100).forEach(i -> {
            MemoEntity memo = MemoEntity.builder().memoText("Memo  " + i).build();
            memoRepository.save(memo);

        });
    }
    @Test
    public void testSelect() {
        Long seq = 100L;
        Optional<MemoEntity> result = memoRepository.findById(seq);

        System.out.println("========================================");

        if(result.isPresent()) {
            MemoEntity memo = result.get();
            System.out.println(">>>>> " + memo.getSeq() + memo.getMemoText());
        }

    }
}
