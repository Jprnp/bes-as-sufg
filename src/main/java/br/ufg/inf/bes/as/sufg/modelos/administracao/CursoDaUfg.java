package br.ufg.inf.bes.as.sufg.modelos.administracao;

import lombok.*;

import javax.persistence.Entity;

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
