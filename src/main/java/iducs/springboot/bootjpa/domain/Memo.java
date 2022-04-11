package iducs.springboot.bootjpa.domain;

import lombok.*;

@Data
@Builder
public class Memo {
    private Long seq;
    private String memoText;
}
