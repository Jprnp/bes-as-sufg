package br.ufg.inf.bes.as.sufg.repositorios;

import br.ufg.inf.bes.as.sufg.modelos.administracao.CursoDaUfg;
import br.ufg.inf.bes.as.sufg.modelos.administracao.InstanciaAdministrativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "*")
public interface CursoUfgRepository extends JpaRepository<CursoDaUfg, Long> {
}