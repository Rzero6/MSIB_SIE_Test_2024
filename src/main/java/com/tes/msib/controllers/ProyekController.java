package com.tes.msib.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tes.msib.models.entities.Proyek;
import com.tes.msib.services.ProyekService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin
@RestController
@RequestMapping("/api/proyek")
public class ProyekController {

    @Autowired
    private ProyekService proyekService;

    @PostMapping
    public Proyek create(@RequestBody Proyek proyek) {
        return proyekService.save(proyek);
    }

    @GetMapping
    public Iterable<Proyek> findAll() {
        return proyekService.findAll();
    }

    @PutMapping("/{id}")
    public Proyek update(@PathVariable("id") Integer id, @RequestBody Proyek proyek) {
        Proyek exProyek = proyekService.findOne(id);
        if (exProyek != null) {
            proyek.setId(id);
            return proyekService.save(proyek);
        } else {
            throw new RuntimeException("Proyek tidak ditemukan");
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id) {
        proyekService.removeOne(id);
    }
}
