package com.softserve.education;

import com.softserve.education.entities.Doctor;
import com.softserve.education.entities.Notation;
import com.softserve.education.entities.Patient;

import java.io.IOException;
import java.nio.file.Path;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

import static com.softserve.education.lib.DialogContainer.*;
import static com.softserve.education.lib.Saver.createFile;
import static com.softserve.education.lib.Saver.save;
import static com.softserve.education.lib.Specializations.*;

/**
 * Doctor[] doctors - all doctors in the hospital
 */

public class Main {

    public static void main(String[] args) throws IOException {

        List<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Vavilov Dmytro Ivanovych", GASTROENTEROLOGIST));
        doctors.add(new Doctor("Demchenko Iryna Petrivna", GASTROENTEROLOGIST));
        doctors.add(new Doctor("Chorna Maria Sergiivna", OTOLARYNGOLIST));
        doctors.add(new Doctor("Kulchytskyy Artur Volodymyrovych", DERMATOLOGIST));
        doctors.add(new Doctor("Ivanytska Tetyana Antriivna", GYNECOLOGIST));
        doctors.add(new Doctor("Semenyuk Eugene Pavlovych", GYNECOLOGIST));
        doctors.add(new Doctor("Maiorov Vladyslav Vasyliovych", UROLOGIST));

        Path fileDoctors = createFile(
                "doctors.list.txt", "FULL NAME\t\t\t\t\t\t\t\t\tSPECIALIZATION", "UTF-8");
        for (Doctor d: doctors) {
            save(fileDoctors, d);
        }


        int[] workingHours = {9, 10, 11, 12, 14, 15, 16, 17};

        List<Notation> schedule = new ArrayList<>();
        Path fileSchedule = createFile(
                "total-schedule.txt", "ID\t\tPATIENT\t\t\tDOCTOR\t\t\t\t\tDAY\t\tTIME", "UTF-8");

        Path filePatients = createFile(
                "patient-list.txt", "FULL NAME\t\t\t\t\tAGE\t\tPHONE\t\tTIME", "UTF-8");



        for (int i = 0; i<2; i++){
            Doctor myDoctor = chooseDoctor(doctors);
            DayOfWeek day = chooseDay();
            int myHour = chooseTime(workingHours);

            Patient patient = new Patient();
            save(filePatients, patient);

            Notation notation = new Notation(patient.getFullNamePatient(), myDoctor.getFullNameDoc(), day, myHour);
            schedule.add(notation);
            save(fileSchedule, notation);
        }
    }
}
