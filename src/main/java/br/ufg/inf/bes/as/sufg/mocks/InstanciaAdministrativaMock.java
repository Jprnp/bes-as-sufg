package br.ufg.inf.bes.as.sufg.mocks;

import br.ufg.inf.bes.as.sufg.modelos.administracao.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InstanciaAdministrativaMock {
    public static List<InstanciaAdministrativa> getInstancias( ) {
        ArrayList<InstanciaAdministrativa> lista = new ArrayList<InstanciaAdministrativa>();
        List<CursoDaUfg> cursos = CursoUfgMock.getCursos();
        cursos.stream().forEach( c -> {
            lista.add(c);
        });
        List<UnidadeAcademica> unidades = UnidadeAcademicaMock.getUnidades();
        unidades.stream().forEach( c -> {
            lista.add(c);
        });

        return lista;
    }
}
