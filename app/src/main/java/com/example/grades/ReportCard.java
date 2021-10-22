package com.example.grades;

import androidx.annotation.NonNull;

public class ReportCard {
    private int englishGrade;
    private int historyGrade;
    private int computingGrade;
    private  int chemistryGrade;
    private int mathGrade;
    private int biologyGrade;


    private  String name;
    public ReportCard()
    {
        englishGrade =0;
        historyGrade = 0;
        computingGrade = 0;
        chemistryGrade = 0;
        mathGrade = 0;
        biologyGrade = 0;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setBiologyGrade(int biologyGrade) {
        this.biologyGrade = biologyGrade;
    }

    public void setChemistryGrade(int chemistryGrade) {
        this.chemistryGrade = chemistryGrade;
    }

    public void setComputingGrade(int computingGrade) {
        this.computingGrade = computingGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        this.historyGrade = historyGrade;
    }

    public int getBiologyGrade() {
        return biologyGrade;
    }

    public int getChemistryGrade() {
        return chemistryGrade;
    }

    public int getComputingGrade() {
        return computingGrade;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }
    public String getName() {
        return name;
    }


    @NonNull
    @Override
    public String toString() {
        StringBuilder string = new StringBuilder();
        string.append("Name:");
        string.append(getName());
        string.append(";");
        string.append("English grade: ");
        string.append(getEnglishGrade());
        string.append(";");
        string.append("Biology grade: ");
        string.append(getBiologyGrade());
        string.append(";");
        string.append("English grade: ");
        string.append(getEnglishGrade());
        string.append(";");
        string.append("History grade: ");
        string.append(getHistoryGrade());
        string.append(";");
        string.append("Math grade: ");
        string.append(getMathGrade());
        string.append(";");
        string.append("Computer grade: ");
        string.append(getComputingGrade());
        string.append(";");
        string.append(getChemistryGrade());
        string.append("Chemistry grade: ");
        string.append(";");
        return string.toString();
    }
}
