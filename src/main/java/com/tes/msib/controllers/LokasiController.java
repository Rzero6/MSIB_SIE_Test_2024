package com.tes.msib.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tes.msib.models.entities.Lokasi;
import com.tes.msib.services.LokasiService;

@CrossOrigin
@RestController
@RequestMapping("/api/lokasi")
public class LokasiController {
    
    
    @Autowired
    private LokasiService lokasiService;

    @PostMapping
    public Lokasi create(@RequestBody Lokasi lokasi) {
        return lokasiService.save(lokasi);
    }

    @GetMapping
    public Iterable<Lokasi> findAll() {
        return lokasiService.findAll();
    }

    @PutMapping("/{id}")
    public Lokasi update(@PathVariable("id") Integer id, @RequestBody Lokasi lokasi) {
        Lokasi exLokasi = lokasiService.findOne(id);
        if (exLokasi != null) {
            lokasi.setId(id);
            return lokasiService.save(lokasi);
        } else {
            throw new RuntimeException("Lokasi tidak ditemukan");
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        lokasiService.removeOne(id);
    }
}
