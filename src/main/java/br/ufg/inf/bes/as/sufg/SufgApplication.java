package br.ufg.inf.bes.as.sufg;

import br.ufg.inf.bes.as.sufg.mocks.*;
import br.ufg.inf.bes.as.sufg.repositorios.CursoUfgRepository;
import br.ufg.inf.bes.as.sufg.repositorios.UsuarioRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SufgApplication {

    public static void main(String[] args) {
        SpringApplication.run(SufgApplication.class, args);
    }

    @Bean
    ApplicationRunner init(CursoUfgRepository cursoRepo, UsuarioRepository userRepo) {
        return args -> {
                CursoUfgMock.getCursos().stream().forEach( c -> {
                    cursoRepo.save(c);
                });
                UsuarioMock.getUsers().stream().forEach( c -> {
                    userRepo.save(c);
                });
            cursoRepo.findAll().forEach(System.out::println);
            userRepo.findAll().forEach(System.out::println);
        };
    }
}
