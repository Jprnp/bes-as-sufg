package br.ufg.inf.bes.as.sufg.mocks;

import br.ufg.inf.bes.as.sufg.modelos.administracao.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class CursoUfgMock {
    public static List<CursoDaUfg> getCursos( ) {
        ArrayList<CursoDaUfg> lista = new ArrayList<>();

        CursoDaUfg curso = new CursoDaUfg();
        curso.setTipo(TipoInstancia.CURSO);
        curso.setNome("Engenharia de Software");
        curso.setSigla("ES");
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2008);
        cal.set(Calendar.MONTH, Calendar.JUNE);
        cal.set(Calendar.DAY_OF_MONTH, 27);
        curso.setDataCriacao(cal.getTime());
        curso.setEmail("es@inf.ufg.br");
        curso.setUrl("http://inf.ufg.br/engenharia-de-software");

        curso.setNivel(NivelCursoUfg.BACHARELADO);
        curso.setTipoResolucao(Resolucao.CONSUNI);
        curso.setResolucao(10);
        curso.setTurno(Turno.NOTURNO);
        lista.add(curso);

        return lista;
    }
}
