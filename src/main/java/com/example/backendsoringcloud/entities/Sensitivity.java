package com.example.backendsoringcloud.entities;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * This class represents the sensitivity Entity
 */
@Entity
public class Sensitivity implements Serializable {

    //Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull
    private int questionId;

    @NonNull
    private String gameName;

    private double sensitivityValue;

    @NonNull
    private String resolutionValue;

    @NonNull
    private String playerName;

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    @NonNull
    public String getGameName() {
        return gameName;
    }

    public void setGameName(@NonNull String gameName) {
        this.gameName = gameName;
    }

    public double getSensitivityValue() {
        return sensitivityValue;
    }

    public void setSensitivityValue(double sensitivityValue) {
        this.sensitivityValue = sensitivityValue;
    }

    @NonNull
    public String getResolutionValue() {
        return resolutionValue;
    }

    public void setResolutionValue(@NonNull String resolutionValue) {
        this.resolutionValue = resolutionValue;
    }

    @NonNull
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(@NonNull String playerName) {
        this.playerName = playerName;
    }

    public Sensitivity() {
    }

    public Sensitivity(@NonNull String gameName, double sensitivityValue, @NonNull String resolutionValue, @NonNull String playerName) {
        this.gameName = gameName;
        this.sensitivityValue = sensitivityValue;
        this.resolutionValue = resolutionValue;
        this.playerName = playerName;
    }

}
