package cl.Alkewallet.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.Alkewallet.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByUsername(String username);
}
