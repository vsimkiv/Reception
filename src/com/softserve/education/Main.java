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
import static com.softserve.education.lib.Printer.printRegistrationResult;
import static com.softserve.education.lib.Saver.*;
import static com.softserve.education.lib.Specializations.*;


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
                "doctors.txt", "FULL NAME\t\t\t\t\t\t\t\t\tSPECIALIZATION", "UTF-8");
        for (Doctor d: doctors) {
            save(fileDoctors, d);
        }


        int[] workingHours = {9, 10, 11, 12, 14, 15, 16, 17};

        List<Notation> schedule = new ArrayList<>();
        Path fileSchedule = createFile(
                "schedule.txt", "PATIENT\t\t\tDOCTOR\t\t\t\t\tDAY\t\tTIME", "UTF-8");

        Path filePatients = createFile(
                "patients.txt", "FULL NAME\t\t\t\t\tAGE\t\tPHONE\t\tTIME", "UTF-8");



        for (int i = 0; i<2; i++){
            Doctor doctor = chooseDoctor(doctors);
            DayOfWeek day = chooseDay();
            int hour = chooseTime(workingHours);

            Patient patient = new Patient();
            save(filePatients, patient);

            Notation notation = new Notation(patient.getFullNamePatient(), doctor.getFullNameDoc(), day, hour);
            schedule.add(notation);
            save(fileSchedule, notation);

            printRegistrationResult(notation);
        }
    }
}
