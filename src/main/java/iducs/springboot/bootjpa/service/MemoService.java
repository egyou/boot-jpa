package iducs.springboot.bootjpa.service;

import iducs.springboot.bootjpa.entity.MemoEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MemoService {
    int create(MemoEntity entity);
    Optional<MemoEntity> findById(Long seq);
    List<MemoEntity> findAll();
    int update(MemoEntity entity);
    int delete(MemoEntity entity);
}
