package com.example.backendsoringcloud.entities;

import org.springframework.lang.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

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

    public Sensitivity() {
    }

    public Sensitivity(@NonNull String gameName, double sensitivityValue, @NonNull String resolutionValue) {
        this.gameName = gameName;
        this.sensitivityValue = sensitivityValue;
        this.resolutionValue = resolutionValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sensitivity that = (Sensitivity) o;
        return getQuestionId() == that.getQuestionId() && Double.compare(that.getSensitivityValue(), getSensitivityValue()) == 0 && getGameName().equals(that.getGameName()) && getResolutionValue().equals(that.getResolutionValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getQuestionId(), getGameName(), getSensitivityValue(), getResolutionValue());
    }

    @Override
    public String toString() {
        return "Sensitivity{" +
                "questionId=" + questionId +
                ", gameName='" + gameName + '\'' +
                ", sensitivityValue=" + sensitivityValue +
                ", resolutionValue='" + resolutionValue + '\'' +
                '}';
    }
}
