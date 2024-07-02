package cl.Alkewallet.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import cl.Alkewallet.service.TransaccionService;

@Controller
@RequestMapping("/transacciones")
public class TransaccionController {
    @Autowired
    private TransaccionService transaccionService;

    @GetMapping
    public String listTransacciones(Model model, Principal principal) {
        Long usuarioId = // Obtener ID del usuario autenticado
        List<Transaccion> transacciones = transaccionService.findByUsuarioId(usuarioId);
        model.addAttribute("transacciones", transacciones);
        return "transacciones";
    }

    // Otros métodos para depósito, retiro, etc.
}
