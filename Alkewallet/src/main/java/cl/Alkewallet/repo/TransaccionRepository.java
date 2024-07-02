package cl.Alkewallet.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.Alkewallet.model.Transaccion;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
    List<Transaccion> findByUsuarioId(Long usuarioId);
}
