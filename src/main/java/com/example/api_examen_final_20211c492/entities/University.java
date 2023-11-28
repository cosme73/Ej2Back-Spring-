package com.example.api_examen_final_20211c492.entities;




import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "University")
public class University  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ycqtId;
    private String ycqtName;
    private String ycqtAddress;
    private String ycqtEmail;

    public University() {
    }

    public University(Long ycqtId, String ycqtName, String ycqtAddress, String ycqtEmail) {
        this.ycqtId = ycqtId;
        this.ycqtName = ycqtName;
        this.ycqtAddress = ycqtAddress;
        this.ycqtEmail = ycqtEmail;
    }

    public Long getYcqtId() {
        return ycqtId;
    }

    public void setYcqtId(Long ycqtId) {
        this.ycqtId = ycqtId;
    }

    public String getYcqtName() {
        return ycqtName;
    }

    public void setYcqtName(String ycqtName) {
        this.ycqtName = ycqtName;
    }

    public String getYcqtAddress() {
        return ycqtAddress;
    }

    public void setYcqtAddress(String ycqtAddress) {
        this.ycqtAddress = ycqtAddress;
    }

    public String getYcqtEmail() {
        return ycqtEmail;
    }

    public void setYcqtEmail(String ycqtEmail) {
        this.ycqtEmail = ycqtEmail;
    }
}
