package br.ufg.inf.bes.as.sufg.controladores;

import br.ufg.inf.bes.as.sufg.modelos.usuario.Usuario;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.stream.Collectors;

import br.ufg.inf.bes.as.sufg.repositorios.*;

@RestController
public class ControladorUsuario {
    private UsuarioRepository repository;

    private String email;
    private String senha;

    public ControladorUsuario( UsuarioRepository repository ) {
        this.repository = repository;
    }
    @CrossOrigin(origins = "*")
    @PostMapping("/login")
    public Collection<Usuario> Usuarios(@RequestBody String body) {
        JsonObject jsonObject = new JsonParser().parse(body).getAsJsonObject();
        this.email = jsonObject.get("email").getAsString();
        this.senha = jsonObject.get("senha").getAsString();

        return repository.findAll().stream()
                .filter(this::isValidado)
                .collect(Collectors.toList());
    }

    private boolean isValidado(Usuario usr) {
        System.out.println(usr.getEmail().equals(this.email) && usr.getSenha().equals(this.senha));
        return usr.getEmail().equals(this.email) && usr.getSenha().equals(this.senha);
    }
}
