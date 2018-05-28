package br.ufg.inf.bes.as.sufg.controladores;

import br.ufg.inf.bes.as.sufg.modelos.divulgacaoevento.AprovacaoDivulgacao;
import br.ufg.inf.bes.as.sufg.modelos.divulgacaoevento.Evento;
import br.ufg.inf.bes.as.sufg.repositorios.AprovacaoDivulgacaoRepository;
import br.ufg.inf.bes.as.sufg.repositorios.EventoRepository;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Date;

@RestController
public class ControladorAprovacaoDivulgacao {
    private EventoRepository eventoRepository;
    private AprovacaoDivulgacaoRepository aprovacaoDivulgacaoRepository;

    public ControladorAprovacaoDivulgacao(EventoRepository evtRepo,
                                          AprovacaoDivulgacaoRepository aprRepo) {
        this.eventoRepository = evtRepo;
        this.aprovacaoDivulgacaoRepository = aprRepo;
    }

    @CrossOrigin(origins = "*")
    @PostMapping("/eventoes/aprovacao")
    public void aprovacao(@RequestBody String body) {
        JsonObject jsonObject = new JsonParser().parse(body).getAsJsonObject();
        long id = jsonObject.get("id").getAsLong();
        boolean aprovada = jsonObject.get("aprovada").getAsBoolean();
        String parecer = jsonObject.get("parecer").getAsString();
        Calendar cal= Calendar.getInstance();
        Date dataAvaliacao = cal.getTime();

        AprovacaoDivulgacao apr = new AprovacaoDivulgacao();
        apr.setAprovada(aprovada);
        apr.setDataAvaliacao(dataAvaliacao);
        apr.setParecer(parecer);

        Evento evt = eventoRepository.getOne(id);
        evt.setAprovacao(apr);
        eventoRepository.save(evt);
    }
}
