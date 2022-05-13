package com.zeta.springKafka.controller;

import com.zeta.springKafka.entity.Cliente;
import com.zeta.springKafka.service.ClienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/testKafka/")
@RequiredArgsConstructor
public class ApacheKafkaWebController {

      private final ClienteService clienteService;

      @PostMapping(value = "/cliente")
      public Cliente producerCliente(@RequestBody Cliente cliente) {
            return this.clienteService.save(cliente);
      }

}
