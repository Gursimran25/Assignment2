package sheridan.kang7.assignment2.service;

import sheridan.kang7.assignment2.model.PetForm;

import java.util.List;

public interface PetDataService {
    void insertPetForm(PetForm form);
    List<PetForm> getAllPetForms();

    void deleteAllPetForms();

    void deletePetForm(int id);

    PetForm getPetForm(int id);

    void updatePetForm(PetForm form);
}
