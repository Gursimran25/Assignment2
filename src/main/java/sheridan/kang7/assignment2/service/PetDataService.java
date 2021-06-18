package sheridan.kang7.assignment2.service;

public interface PetDataService {
    void insertPetForm(PetForm form);
    List<PetForm> getAllPetForms();

    void deleteAllPetForms();

    void deletePetForm(int id);

    PetForm getPetForm(int id);

    void updatePetForm(PetForm, form);
}
