package br.ufg.inf.bes.as.sufg.controladores;

import br.ufg.inf.bes.as.sufg.modelos.divulgacaoevento.Evento;
import br.ufg.inf.bes.as.sufg.repositorios.EventoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class ControladorEvento {
    private EventoRepository eventoRepository;

    public ControladorEvento(EventoRepository repository) { this.eventoRepository = repository; }

    @CrossOrigin(origins = "*")
    @GetMapping("/eventoes/getAll")
    public Collection<Evento> Eventos() {
        return eventoRepository.findAll().stream()
                .collect(Collectors.toList());
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/eventoes/getAprovados")
    public Collection<Evento> EventosAprovados() {
        return eventoRepository.findAll().stream().filter(this::isAprovado)
                .collect(Collectors.toList());
    }

    private boolean isAprovado(Evento evt) {
        return evt.getAprovacao().isAprovada();
    }
}
