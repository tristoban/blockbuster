package com.buster.blockbuster.controller;


import com.buster.blockbuster.model.Client;
import com.buster.blockbuster.repository.impl.ClientDaoH2;
import com.buster.blockbuster.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class ClientController {

    private ClientService clientService = new ClientService(new ClientDaoH2());

    @PostMapping()
    public ResponseEntity<Client> registerClient(@ModelAttribute Client client, Model model){
        clientService.save(client);
        model.addAttribute("client", client);
        return ResponseEntity.ok(client);
    }

}
