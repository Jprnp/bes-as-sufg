package br.ufg.inf.bes.as.sufg.modelos.divulgacaoevento;

import lombok.*;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Evento {
    @Id @GeneratedValue
    private long id;
    private @NonNull String assunto;
    private @NonNull TipoEvento tipo;
    private String descricao;
    private @NonNull Date datetimeDivulgacao;
    private @NonNull String solicitante;
    private @NonNull String emailSolicitante;
    private @NonNull FormaDivulgacao divulgacao;
    private @NonNull EscopoDivulgacao escopo;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private AprovacaoDivulgacao aprovacao;
    private @NonNull Date dataExpiracao;
    private long idInstancia;
    private long idAreaConhecimento;
}
