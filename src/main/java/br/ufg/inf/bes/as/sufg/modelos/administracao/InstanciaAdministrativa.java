package br.ufg.inf.bes.as.sufg.modelos.administracao;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class InstanciaAdministrativa {
    private @NonNull String sigla;
    private @NonNull String nome;
    private @NonNull TipoInstancia tipo;
    private @NonNull Date dataCriacao;
    private  Date dataEncerramento;
    private String email;
    private String url;
}
