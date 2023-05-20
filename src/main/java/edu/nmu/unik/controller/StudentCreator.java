package edu.nmu.unik.controller;

import edu.nmu.unik.model.Human;
import edu.nmu.unik.model.Sex;
import edu.nmu.unik.model.Student;

public class StudentCreator implements IEntityCreator<Student> {
    public Student createEntity(String firstName, String lastName, String patronymic, Sex gender) {
        return new Student(firstName, lastName, patronymic, gender);
    }

    @Override
    public Student createTypicalEntity() {
        return new Student(
            IEntityCreator.generateRandomWord(),
            IEntityCreator.generateRandomWord(),
            IEntityCreator.generateRandomWord(),
            IEntityCreator.generateRandomGender()
        );
    }
}
