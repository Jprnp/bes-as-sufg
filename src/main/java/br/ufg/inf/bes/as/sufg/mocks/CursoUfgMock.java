package br.ufg.inf.bes.as.sufg.mocks;

import br.ufg.inf.bes.as.sufg.modelos.administracao.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CursoUfgMock {
    public static List<CursoDaUfg> getCursos( ) {
        ArrayList<CursoDaUfg> lista = new ArrayList<>();
        /*List<InstanciaAdministrativa> instancias = InstanciaAdministrativaMock.getInstancias();
        instancias.removeIf(c -> !c.getSigla().equals("INF"));

        CursoDaUfg curso = (CursoDaUfg)instancias.get(0);
        curso.setNivel(NivelCursoUfg.BACHARELADO);
        curso.setTipoResolucao(Resolucao.CONSUNI);
        curso.setResolucao(10);
        lista.add(curso);*/

        return lista;
    }
}
