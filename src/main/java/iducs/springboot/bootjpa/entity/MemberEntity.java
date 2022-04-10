package iducs.springboot.bootjpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="t_member")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

}
