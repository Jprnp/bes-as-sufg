package br.ufg.inf.bes.as.sufg.mocks;

import br.ufg.inf.bes.as.sufg.modelos.administracao.InstanciaAdministrativa;
import br.ufg.inf.bes.as.sufg.modelos.administracao.TipoInstancia;
import br.ufg.inf.bes.as.sufg.modelos.usuario.Usuario;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InstanciaAdministrativaMock {
    public static List<InstanciaAdministrativa> getInstancias( ) {
        ArrayList<InstanciaAdministrativa> lista = new ArrayList<>();

        InstanciaAdministrativa inst = new InstanciaAdministrativa();
        inst.setDataCriacao(new Date());
        inst.setEmail("");
        inst.setNome("Instituto de Informática");
        inst.setSigla("INF");
        inst.setTipo(TipoInstancia.UNIDADE);
        inst.setUrl("inf.ufg.br");
        lista.add(inst);

        return lista;
    }
}
