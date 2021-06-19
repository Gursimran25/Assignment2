package sheridan.kang7.assignment2.service;

import org.springframework.stereotype.Service;
import sheridan.kang7.assignment2.model.PetForm;
import sheridan.kang7.assignment2.repository.PetDataRepositoryJpa;
import sheridan.kang7.assignment2.repository.PetEntityJpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PetDataServiceJpaImpl implements PetDataService {
    private final PetDataRepositoryJpa petDataRepositoryJpa;

    PetDataServiceJpaImpl(PetDataRepositoryJpa petDataRepositoryJpa) {
        this.petDataRepositoryJpa = petDataRepositoryJpa;
    }
    private static void copyFormToEntity(PetForm form, PetEntityJpa pet) {
         pet.setPetName(form.getPetName());
         pet.setPetKind(form.getPetKind());
         pet.setPetGender(form.getPetGender());
         pet.setVaccinated(form.isVaccinated());
    }
    private static void copyEntityToForm(PetEntityJpa pet, PetForm form){
        form.setPetName(pet.getPetName());
        form.setPetKind(pet.getPetKind());
        form.setPetGender(pet.getPetGender());
        form.setVaccinated(pet.isVaccinated());
    }
    public void insertPetForm(PetForm form){
        PetEntityJpa pet = new PetEntityJpa();
        copyFormToEntity(form, pet);
        pet = petDataRepositoryJpa.save(pet);
        form.setId(pet.getId());
    }
    public List<PetForm> getAllPetForms(){
        List<PetForm> formList = new ArrayList<>();
        List<PetEntityJpa> petList = petDataRepositoryJpa.findAll();
        for(PetEntityJpa pet: petList){
            PetForm form = new PetForm();
            copyEntityToForm(pet, form);
            formList.add(form);
        }
        return formList;
    }
    public void deleteAllPetForms(){
        petDataRepositoryJpa.deleteAll();
    }
    public void deletePetForm(int id){
        petDataRepositoryJpa.deleteById(id);
    }
    public PetForm getPetForm(int id){
        Optional<PetEntityJpa> result = petDataRepositoryJpa.findById(id);
        if(result.isPresent()){
            PetForm form = new PetForm();
            PetEntityJpa pet = result.get();
            copyEntityToForm(pet, form);
            return form;
        }
        return null;
    }


    public void updatePetForm(PetForm form){
        Optional<PetEntityJpa> result = petDataRepositoryJpa.findById(form.getId());
        if(result.isPresent()){
            PetEntityJpa pet = result.get();
            copyFormToEntity(form, pet);
            petDataRepositoryJpa.save(pet);
        }
    }
}
