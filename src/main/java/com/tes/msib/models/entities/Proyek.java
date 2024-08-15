package com.tes.msib.models.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyek")
public class Proyek implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nama_proyek;

    private String client;

    private LocalDateTime tgl_mulai;

    private LocalDateTime tgl_selesai;

    private String pimpinan_proyek;

    @Column(name = "keterangan", columnDefinition = "TEXT")
    private String keterangan;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP", updatable = false)
    @CreationTimestamp
    private Timestamp created_at;


    public Proyek() {
    }

    public Proyek(Integer id, String nama_proyek, String client, LocalDateTime tgl_mulai, LocalDateTime tgl_selesai,
            String pimpinan_proyek, String keterangan, Timestamp created_at) {
        this.id = id;
        this.nama_proyek = nama_proyek;
        this.client = client;
        this.tgl_mulai = tgl_mulai;
        this.tgl_selesai = tgl_selesai;
        this.pimpinan_proyek = pimpinan_proyek;
        this.keterangan = keterangan;
        this.created_at = created_at;
    }

    public Integer getId() {
        return id;
    }

    public String getNama_proyek() {
        return nama_proyek;
    }

    public String getClient() {
        return client;
    }

    public LocalDateTime getTgl_mulai() {
        return tgl_mulai;
    }

    public LocalDateTime getTgl_selesai() {
        return tgl_selesai;
    }

    public String getPimpinan_proyek() {
        return pimpinan_proyek;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNama_proyek(String nama_proyek) {
        this.nama_proyek = nama_proyek;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setTgl_mulai(LocalDateTime tgl_mulai) {
        this.tgl_mulai = tgl_mulai;
    }

    public void setTgl_selesai(LocalDateTime tgl_selesai) {
        this.tgl_selesai = tgl_selesai;
    }

    public void setPimpinan_proyek(String pimpinan_proyek) {
        this.pimpinan_proyek = pimpinan_proyek;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

}
