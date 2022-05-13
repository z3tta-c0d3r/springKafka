package com.zeta.springKafka.service;

import com.zeta.springKafka.entity.Cliente;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private static final Logger logger = LoggerFactory.getLogger(ClienteService.class);

    private final ClienteEventsService clienteEventsService;

    public Cliente save(Cliente cliente) {

        logger.debug("Received {}", cliente);
        this.clienteEventsService.publish(cliente);
        return cliente;

    }
}
