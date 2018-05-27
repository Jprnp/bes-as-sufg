package br.ufg.inf.bes.as.sufg.modelos.egresso;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Egresso {
    @Id @GeneratedValue
    private Long id;
    private @NonNull String nomeOficial;
    private String nomeMae;
    private Date dataNasc;
}
