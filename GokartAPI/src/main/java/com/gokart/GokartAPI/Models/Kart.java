package com.gokart.GokartAPI.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "kart")
public class Kart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "kart_number")
    private int kartNumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getKartNumber() {
        return kartNumber;
    }

    public void setKartNumber(int kartNumber) {
        this.kartNumber = kartNumber;
    }
}