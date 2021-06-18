package sheridan.kang7.assignment2.repository;

import javax.persistence.*;

@Entity
@Table(name = "pet")
public class PetEntityJpa {
    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "pet_name")
    private String petName = "";

    @Column(name = "pet_kind")
    private String petKind = "";

    @Column(name = "pet_gender")
    private String petGender= "";

    @Column(name = "vaccinated")
    private Boolean vaccinated = false;

    public PetEntityJpa(){
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
    public String getPetName(){
        return petName;
    }
    public void setPetName(String petName){
        this.petName = petName;
    }
    public String getPetKind(){
        return petKind;
    }
    public void setPetKind(String petKind){
        this.petKind = petKind;
    }
    public String getPetGender() {
        return petGender;
    }
    public void setPetGender(String petGender){
        this.petGender = petGender;
    }
    public Boolean isVaccinated(){
        return vaccinated;
    }
    public void setVaccinated(Boolean vaccinated){
        this.vaccinated = vaccinated;
    }
}
