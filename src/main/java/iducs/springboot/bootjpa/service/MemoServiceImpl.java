package iducs.springboot.bootjpa.service;

import iducs.springboot.bootjpa.domain.Memo;
import iducs.springboot.bootjpa.entity.MemoEntity;
import iducs.springboot.bootjpa.repository.MemoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemoServiceImpl implements MemoService {
    final
    MemoRepository memoRepository;

    public MemoServiceImpl(MemoRepository memoRepository) {
        this.memoRepository = memoRepository;
    }

    @Override
    public void create(Memo memo) {
        MemoEntity entity = dtoToEntity(memo);
        memoRepository.save(entity);
    }

    @Override
    public Memo readById(Long seq) {
        Memo memo = null;
        Optional<MemoEntity> result = memoRepository.findById(seq);
        if(result.isPresent()) {
            memo = entityToDTO(result.get());
        }
        else
            System.out.println("error");
        return memo;
    }

    @Override
    public List<Memo> readAll() {
        List<MemoEntity> listOfMemoentity = memoRepository.findAll();
        List<Memo> listOfMemo = new ArrayList<>();
        for (MemoEntity entity: listOfMemoentity) {
            Memo memo = entityToDTO(entity);
            listOfMemo.add(memo);
        }
        return listOfMemo;
    }

    @Override
    public void update(Memo memo) {
        MemoEntity entity = dtoToEntity(memo);
        memoRepository.save(entity);
    }

    @Override
    public void delete(Memo memo) {
        memoRepository.deleteById(memo.getSeq());
    }

    MemoEntity dtoToEntity(Memo memo) {
        return MemoEntity.builder()
                .seq(memo.getSeq())
                .memoText(memo.getMemoText())
                .build();
    }
    Memo entityToDTO(MemoEntity entity) {
        return Memo.builder()
                .seq(entity.getSeq())
                .memoText(entity.getMemoText())
                .build();
    }
}
