package br.ufg.inf.bes.as.sufg.modelos.divulgacaoevento;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/*
@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode */
public class Evento {
    /*
    @Id @GeneratedValue
    private long id;
    private @NonNull String assunto;
    private @NonNull TipoEvento tipo;
    private String descricao;
    @DateTimeFormat(pattern = "yyyy/MM/dd hh:mm:ss")
    private @NonNull Date datetimeDivulgacao;
    private @NonNull String solicitante;
    private @NonNull String emailSolicitante;
    private @NonNull FormaDivulgacao divulgacao;
    private @NonNull EscopoDivulgacao escopo;
    private AprovacaoDivulgacao aprovacao;
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private @NonNull Date dataExpiracao; */
}
