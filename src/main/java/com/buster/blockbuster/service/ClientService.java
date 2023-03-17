package com.buster.blockbuster.service;

import com.buster.blockbuster.model.Client;
import com.buster.blockbuster.repository.IDao;

public class ClientService {
    private IDao<Client> clientIDao;

    public ClientService(IDao<Client> clientIDao){
        this.clientIDao = clientIDao;
    }

    public Client save(Client c){
        return clientIDao.save(c);
    }
}
