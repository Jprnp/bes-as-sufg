package br.ufg.inf.bes.as.sufg.mocks;

import br.ufg.inf.bes.as.sufg.modelos.administracao.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class UnidadeAcademicaMock {
    public static List<UnidadeAcademica> getUnidades( ) {
        ArrayList<UnidadeAcademica> lista = new ArrayList<>();

        UnidadeAcademica unidade = new UnidadeAcademica();
        unidade.setTipo(TipoInstancia.UNIDADE);
        unidade.setNome("Instituto de Informatica");
        unidade.setSigla("INF");
        /*Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2008);
        cal.set(Calendar.MONTH, Calendar.JUNE);
        cal.set(Calendar.DAY_OF_MONTH, 27);
        unidade.setDataCriacao(cal.getTime());*/
        unidade.setEmail("email@inf.ufg.br");
        unidade.setUrl("inf.ufg.br");
        lista.add(unidade);

        unidade = new UnidadeAcademica();
        unidade.setTipo(TipoInstancia.UNIDADE);
        unidade.setNome("Faculdade de Artes Visuais");
        unidade.setSigla("FAV");
        /*Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2008);
        cal.set(Calendar.MONTH, Calendar.JUNE);
        cal.set(Calendar.DAY_OF_MONTH, 27);
        unidade.setDataCriacao(cal.getTime());*/
        unidade.setEmail("email@fav.ufg.br");
        unidade.setUrl("fav.ufg.br");
        lista.add(unidade);
        return lista;
    }
}
