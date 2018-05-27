package br.ufg.inf.bes.as.sufg.mocks;

import br.ufg.inf.bes.as.sufg.modelos.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioMock {
    public static List<Usuario> getUsers( ) {
        ArrayList<Usuario> lista = new ArrayList<Usuario>();

        Usuario usr = new Usuario();
        usr.setCpf("12345678903");
        usr.setEmail("teste@gmail.com");
        usr.setSenha("123456");
        lista.add(usr);

        usr = new Usuario();
        usr.setCpf("98765432103");
        usr.setEmail("hyagosouzza@gmail.com");
        usr.setSenha("1");
        usr.setNome("Hyago Souza");
        usr.setGerencia("INF");
        lista.add(usr);

        return lista;
    }
}
