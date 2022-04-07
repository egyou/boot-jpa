package iducs.springboot.bootjpa.repository;

import iducs.springboot.bootjpa.entity.MemoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemoRepository extends JpaRepository<MemoEntity, Long> {

}
