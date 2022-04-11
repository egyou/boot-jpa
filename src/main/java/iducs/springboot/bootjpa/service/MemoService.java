package iducs.springboot.bootjpa.service;

import iducs.springboot.bootjpa.domain.Memo;
import iducs.springboot.bootjpa.entity.MemoEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface MemoService {
    void create(Memo memo);
    Memo readById(Long seq);
    List<Memo> readAll();
    void update(Memo memo);
    void delete(Memo memo);
}
