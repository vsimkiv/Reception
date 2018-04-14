package com.softserve.education;

import com.softserve.education.entities.Doctor;
import com.softserve.education.entities.Patient;
import com.softserve.education.entities.RegisterNotation;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.softserve.education.lib.Selector.*;
import static com.softserve.education.lib.Specializations.*;
import static java.time.DayOfWeek.*;

/**
 * Doctor[] doctors - all doctors in the hospital
 */

public class Main {

    public static void main(String[] args) throws IOException {

        Doctor[] doctors = new Doctor[10];
        doctors[0] = new Doctor(1, "Vavilov Dmytro Ivanovych",
                GASTROENTEROLOGIST, new DayOfWeek[]{MONDAY, THURSDAY, SATURDAY});
        doctors[1] = new Doctor(2, "Demchenko Iryna Petrivna",
                GASTROENTEROLOGIST, new DayOfWeek[]{TUESDAY, WEDNESDAY, FRIDAY});
        doctors[2] = new Doctor(3, "Chorna Maria Sergiivna",
                OTOLARYNGOLIST, new DayOfWeek[]{MONDAY, WEDNESDAY, FRIDAY});
        doctors[3] = new Doctor(4, "Marchuk Nazar Igorovych",
                OTOLARYNGOLIST, new DayOfWeek[]{TUESDAY, THURSDAY, SATURDAY});
        doctors[4] = new Doctor(5, "Kulchytskyy Artur Volodymyrovych",
                DERMATOLOGIST, new DayOfWeek[]{MONDAY, TUESDAY, WEDNESDAY});
        doctors[5] = new Doctor(6, "Prokopiv Ivan Antonovych",
                DERMATOLOGIST, new DayOfWeek[]{THURSDAY, FRIDAY, SATURDAY});
        doctors[6] = new Doctor(7, "Ivanytska Tetyana Antriivna",
                GYNECOLOGIST, new DayOfWeek[]{MONDAY, THURSDAY, SATURDAY});
        doctors[7] = new Doctor(8, "Semenyuk Eugene Pavlovych",
                GYNECOLOGIST, new DayOfWeek[]{MONDAY, THURSDAY, SATURDAY});
        doctors[8] = new Doctor(9, "Maiorov Vladyslav Vasyliovych",
                UROLOGIST, new DayOfWeek[]{MONDAY, TUESDAY, WEDNESDAY});
        doctors[9] = new Doctor(10, "Melnyk Oleksandr Volodymyroch",
                UROLOGIST, new DayOfWeek[]{THURSDAY, FRIDAY, SATURDAY});

        List<RegisterNotation> schedule = new ArrayList<>();



        
        for (int i = 0; i < 2; i++) {
            System.out.println("Hello, enter your full name and age, please:");
            Patient patient = new Patient(new Scanner(System.in).nextLine(), new Scanner(System.in).nextInt());

            Doctor doctor = selectDoctor(selectSpecialist(doctors));
            String docName = doctor.getFullNameDoc();

            RegisterNotation notation = new RegisterNotation(i, patient.toString(), docName, selectDay(doctor), selectTime());
            schedule.add(notation);
        }



        List<String> lines = Arrays.asList("ID\t\tPATIENT\t\t\t\tDOCTOR\t\t\t\t\t\t\tDAY\t\tTIME");
        Path file = Paths.get("total-schedule.txt");
        Files.write(file, lines, Charset.forName("UTF-8"));

        System.out.println();
        for (RegisterNotation reg : schedule) {
            try {
                Files.write(file, (reg.toString() + "\n").getBytes(), StandardOpenOption.APPEND);
            }
            catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
