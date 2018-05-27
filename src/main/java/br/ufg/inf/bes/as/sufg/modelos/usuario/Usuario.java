package br.ufg.inf.bes.as.sufg.modelos.usuario;

import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.BitSet;
import java.util.Date;

@Entity
@Getter @Setter
@NoArgsConstructor
@ToString @EqualsAndHashCode
public class Usuario {
    @Id
    @GeneratedValue
    private long id;
    private @NonNull String email;
    private @NonNull String senha;
    private @NonNull String nome;
    private @NonNull String cpf;
    private BitSet foto;
    private @NonNull boolean admin = false;
    private @NonNull RecebeDivulgacao recebimento;
    private @NonNull Date timestampCadastramento;
    private @NonNull Date timestampAtualizacao;
    private @NonNull Date timestampExclusaoLogica;
    private String gerencia;
}
