package br.com.rgomes.microcervice.loja.controller;

import br.com.rgomes.microcervice.loja.dto.CompraDTO;
import br.com.rgomes.microcervice.loja.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping
    public void realizaCompra(@RequestBody CompraDTO compra){
        compraService.realizaCompra(compra);

    }
}
