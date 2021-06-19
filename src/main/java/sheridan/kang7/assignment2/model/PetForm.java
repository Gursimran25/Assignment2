package sheridan.kang7.assignment2.model;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class PetForm implements Serializable {
    private int id = 0;
    @NotBlank
    @Size(max = 30)
    @Pattern(regexp = "[A-Za-z]*")
    private String petName = "";

    @NotBlank
    @Pattern(regexp = "(Cat|Dog|Rabbit)?")
    private String petKind = "";

    @NotNull
    public String petGender;
    private boolean vaccinated = false;
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
        return null;
    }

    public void setPetGender(String petGender) {
        this.petGender = petGender;
    }

    public Boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
