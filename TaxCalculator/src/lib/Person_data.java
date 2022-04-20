package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Person_data {
    private String firstName;
    private String lastName;
    private String idNumber;
    private String address;

    private int yearJoined;
    private int monthJoined;
    private int dayJoined;
    private int monthWorkingInYear;

    private boolean isForeigner;
    private boolean gender; // true = Laki-laki, false = Perempuan

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearJoined() {
        return this.yearJoined;
    }

    public void setYearJoined(int yearJoined) {
        this.yearJoined = yearJoined;
    }

    public int getMonthJoined() {
        return this.monthJoined;
    }

    public void setMonthJoined(int monthJoined) {
        this.monthJoined = monthJoined;
    }

    public int getDayJoined() {
        return this.dayJoined;
    }

    public void setDayJoined(int dayJoined) {
        this.dayJoined = dayJoined;
    }

    public int getMonthWorkingInYear() {
        return this.monthWorkingInYear;
    }

    public void setMonthWorkingInYear(int monthWorkingInYear) {
        this.monthWorkingInYear = monthWorkingInYear;
    }

    public boolean isIsForeigner() {
        return this.isForeigner;
    }

    public boolean getIsForeigner() {
        return this.isForeigner;
    }

    public void setIsForeigner(boolean isForeigner) {
        this.isForeigner = isForeigner;
    }

    public boolean isGender() {
        return this.gender;
    }

    public boolean getGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}