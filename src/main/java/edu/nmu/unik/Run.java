package edu.nmu.unik;

import edu.nmu.unik.controller.FacultyCreator;
import edu.nmu.unik.controller.HumanCreator;
import edu.nmu.unik.controller.UniversityCreator;
import edu.nmu.unik.model.*;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        HumanCreator humanCreator = new HumanCreator();
        Human head = humanCreator.createTypicalEntity();

        FacultyCreator facultyCreator = new FacultyCreator();
        Faculty faculty = facultyCreator.createTypicalEntity();
        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty);

        UniversityCreator universityCreator = new UniversityCreator();
        University university = universityCreator.createTypicalEntity();

        university.setHead(head);
        university.setFaculties(faculties);

    }
}