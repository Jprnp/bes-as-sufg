package br.ufg.inf.bes.as.sufg.modelos.administracao;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class CursoDaUfg extends InstanciaAdministrativa {
    private @NonNull NivelCursoUfg nivel;
    private @NonNull Resolucao tipoResolucao;
    private @NonNull long resolucao;
    private @NonNull Turno turno;
}
