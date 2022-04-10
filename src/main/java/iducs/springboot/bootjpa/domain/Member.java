package iducs.springboot.bootjpa.domain;

import lombok.*;

@Data // @Data : @Getter, @Setter, @ToString, @EqualsAndHashCode 자동 생성 효과
@Builder(toBuilder = true)
public class Member {
    private Long seq;
    private String id;
    private String pw;
}
