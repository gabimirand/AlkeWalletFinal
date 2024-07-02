package cl.Alkewallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.Alkewallet.model.Transaccion;
import cl.Alkewallet.repo.TransaccionRepository;

@Service
public class TransaccionService {
    @Autowired
    private TransaccionRepository transaccionRepository;

    public List<Transaccion> findByUsuarioId(Long usuarioId) {
        return transaccionRepository.findByUsuarioId(usuarioId);
    }

    public Transaccion save(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }
}

