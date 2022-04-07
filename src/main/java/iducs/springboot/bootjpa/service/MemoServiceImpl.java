package iducs.springboot.bootjpa.service;

import iducs.springboot.bootjpa.entity.MemoEntity;
import iducs.springboot.bootjpa.repository.MemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemoServiceImpl implements MemoService {
    @Autowired
    MemoRepository memoRepository;

    @Override
    public int create(MemoEntity entity) {
        return 0;
    }

    @Override
    public Optional<MemoEntity> findById(Long seq) {
        return memoRepository.findById(seq);
    }

    @Override
    public List<MemoEntity> findAll() {
        return memoRepository.findAll();
    }

    @Override
    public int update(MemoEntity entity) {
        return 0;
    }

    @Override
    public int delete(MemoEntity entity) {
        return 0;
    }

}
