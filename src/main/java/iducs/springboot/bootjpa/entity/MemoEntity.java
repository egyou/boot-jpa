package iducs.springboot.bootjpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity // 해딩 클래스의 인스턴스들은 JPA로 관리되는 객체임
@Table(name="t_memo")   // 객체와 매핑할 테이블 지정
@ToString       // toString() 메소드를 자동으로 생성하는 Lombok 애노테이션
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class MemoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long seq;

    @Column(length = 100, nullable = false)
    private String memoText;

}
