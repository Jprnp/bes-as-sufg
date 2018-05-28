package br.ufg.inf.bes.as.sufg.controladores;

import br.ufg.inf.bes.as.sufg.modelos.administracao.InstanciaAdministrativa;
import br.ufg.inf.bes.as.sufg.modelos.administracao.UnidadeAcademica;
import br.ufg.inf.bes.as.sufg.modelos.usuario.Usuario;
import br.ufg.inf.bes.as.sufg.repositorios.CursoUfgRepository;
import br.ufg.inf.bes.as.sufg.repositorios.RegionalRepository;
import br.ufg.inf.bes.as.sufg.repositorios.UnidadeAcademicaRepository;
import br.ufg.inf.bes.as.sufg.repositorios.UsuarioRepository;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ControladorInstancia {
    private CursoUfgRepository cursoRepo;
    private UnidadeAcademicaRepository unidRepo;
    private RegionalRepository regionalRepo;

    public ControladorInstancia(CursoUfgRepository cRepo,
                                UnidadeAcademicaRepository uRepo,
                                RegionalRepository rRepo) {
        this.cursoRepo = cRepo;
        this.unidRepo = uRepo;
        this.regionalRepo = rRepo;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/instancias")
    public Collection<InstanciaAdministrativa> Instancias() {
        List<InstanciaAdministrativa> listaC = cursoRepo.findAll().stream()
                .collect(Collectors.toList());
        unidRepo.findAll().stream()
                .collect(Collectors.toList()).stream().forEach(c -> {
            listaC.add(c);
        });
        regionalRepo.findAll().stream()
                .collect(Collectors.toList()).stream().forEach(c -> {
            listaC.add(c);
        });
        return listaC;
    }
}
