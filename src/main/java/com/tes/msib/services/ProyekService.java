package com.tes.msib.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tes.msib.models.entities.Proyek;
import com.tes.msib.models.repositories.ProyekRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class ProyekService {

    @Autowired
    private ProyekRepo proyekRepo;

    public Proyek save(Proyek proyek){
        return proyekRepo.save(proyek);
    }

    public Proyek findOne(Integer id){
        return proyekRepo.findById(id).get();
    }

    public Iterable<Proyek> findAll(){
        return proyekRepo.findAll();     
    }

    public void removeOne(Integer id){
        proyekRepo.deleteById(id);
    }
}
