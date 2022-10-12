package com.reto3_final.reto3_final.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "score")
public class Score implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private int score;
    private String message;


    @OneToOne
    @JsonIgnoreProperties("score")
    private Reservation reservation;


    public Score(){}


    public Score(Integer score, String message, Reservation reservation) {
        this.score = score;
        this.message = message;
        this.reservation = reservation;
    }


    public Score(Integer id, Integer score, String message) {
        this.id=id;
        this.score = score;
        this.message = message;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }


}

