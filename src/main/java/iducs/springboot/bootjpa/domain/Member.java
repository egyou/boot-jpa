package iducs.springboot.bootjpa.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@EqualsAndHashCode
@ToString
@Data
public class Member {
    private Long seq;
    private String id;
    private String pw;
}
