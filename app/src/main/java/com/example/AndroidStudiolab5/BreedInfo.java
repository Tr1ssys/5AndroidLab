package com.example.AndroidStudiolab5;

import java.util.LinkedList;
import java.util.List;

public class BreedInfo {
    private static BreedInfo instance;
    private List<Breed> breeds;
    private static Breed currentBreed;
    private BreedInfo() {

    }
    public static BreedInfo createInstance(List<Breed> breeds) {
        if(instance == null) {
            instance = new BreedInfo();
            instance.setBreeds(breeds);
        }
            return instance;
    }

    private void setBreeds(List<Breed> breeds) {
        this.breeds = breeds;
    }
    public String getBreedId(String name) {
        for(Breed breed : breeds) {
            if(breed.getName() == name) {
                return breed.getId();
            }
        }
        return "";
    }

    public static BreedInfo getInstance() {
        return instance;
    }
    public List<String> getBreedNames() {
        List<String> names = new LinkedList<>();
        for(Breed breed : breeds) {
            names.add(breed.getName());
        }
        return names;
    }
    public void setBreed(String name) {
        for(Breed breed : breeds) {
            if(breed.getName() == name) {
                BreedInfo.setCurrentBreed(breed);
            }
        }
    }


    public static void setCurrentBreed(Breed breed) {
        BreedInfo.currentBreed = breed;
    }
}
