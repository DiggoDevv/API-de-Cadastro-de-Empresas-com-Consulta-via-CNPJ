package br.com.rodrigo.Cadastro.Empresas.demo.repositories;

import br.com.rodrigo.Cadastro.Empresas.demo.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
    Optional<User> findByEmail(String email);
}
