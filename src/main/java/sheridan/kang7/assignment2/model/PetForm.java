package sheridan.kang7.assignment2.model;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class PetForm implements Serializable {
    private int id = 0;
    private String petName;
    private String petKind;
    private String petGender;
    private Boolean vaccinated;
    public PetForm() {

    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetKind(String petKind) {
        this.petKind = petKind;
    }

    public String getPetKind() {
        return petKind;
    }

    public String getPetGender() {
        String petGender = null;
        return null;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public Boolean isVaccinated() {
        Boolean vaccinated = null;
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
