package com.tes.msib.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tes.msib.models.entities.Lokasi;
import com.tes.msib.models.repositories.LokasiRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class LokasiService {
    
    @Autowired
    private LokasiRepo lokasiRepo;

    public Lokasi save(Lokasi lokasi){
        return lokasiRepo.save(lokasi);
    }

    public Lokasi findOne(Integer id){
        return lokasiRepo.findById(id).get();
    }

    public Iterable<Lokasi> findAll(){
        return lokasiRepo.findAll();     
    }

    public void removeOne(Integer id){
        lokasiRepo.deleteById(id);
    }
}
