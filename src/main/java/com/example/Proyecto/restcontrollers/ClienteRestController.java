package com.example.Proyecto.restcontrollers;

import com.example.Proyecto.entities.Cliente;
import com.example.Proyecto.services.ClienteService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Cliente")
public class ClienteRestController {

    @Autowired
    private ClienteService service;

    @GetMapping
    public List<Cliente> findAll() {
        return service.findAll();
    }

    @GetMapping("/findAllCustom")
    public List<Cliente> findAllCustom() {
        return service.findAllCustom();
    }

    @GetMapping("/{dni}")
    public Optional<Cliente> findByDni(@PathVariable String dni) {
        return service.findByDni(dni);
    }

    @PostMapping
    public Cliente add(@RequestBody Cliente c) {
        return service.add(c);
    }

    @PutMapping("/{dni}")
    public Cliente update(@PathVariable String dni, @RequestBody Cliente c) {
        c.setDni(dni);
        return service.update(c);
    }

    @DeleteMapping("/{dni}")
    public Cliente delete(@PathVariable String dni) {
        Cliente objCliente = new Cliente();
        objCliente.setDni(dni);
        objCliente.setDireccion_calle(null);
        return service.delete(objCliente);
    }
}

