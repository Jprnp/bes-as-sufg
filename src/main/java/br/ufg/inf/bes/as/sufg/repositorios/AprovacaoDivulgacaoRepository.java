package br.ufg.inf.bes.as.sufg.repositorios;

import br.ufg.inf.bes.as.sufg.modelos.divulgacaoevento.AprovacaoDivulgacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface AprovacaoDivulgacaoRepository extends JpaRepository<AprovacaoDivulgacao, Long> {
}
