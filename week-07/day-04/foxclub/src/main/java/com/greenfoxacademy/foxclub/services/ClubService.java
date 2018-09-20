package com.greenfoxacademy.foxclub.services;
import com.greenfoxacademy.foxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ClubService {

    ArrayList<Fox> listOfFoxes = new ArrayList<>();

    ClubService() {
    }

    public void addFoxToList(Fox fox){
        listOfFoxes.add(fox);
    }

    public Fox getFoxFromList(String name) {
        for (int i = 0; i < listOfFoxes.size(); i++) {
            if (listOfFoxes.get(i).getName() == name) {
                return listOfFoxes.get(i);
            }
        }
        return null;
    }
}
