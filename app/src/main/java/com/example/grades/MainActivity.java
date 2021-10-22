package com.example.grades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private String[] names = {"Luis", "Armando", "Felipe", "Fernando", "Pedro", "Ramiro", "Kevin", "Montserrat", "Mariela", "Veronica", "Sandra", "Kenya"};
    private static final int REPORTS = 1000;
    private  int getPseudoRandomNumber(int start, int end){
        //456 is random number can any
        Random random = new Random(456);
        return random.nextInt(end-start+1) + start;
    }
    private ArrayList<ReportCard> findReports()
    {
        ArrayList<ReportCard> reports = new ArrayList<>();
        for(int i=0; i<REPORTS; i++) {
            ReportCard reportCard = new ReportCard();
            reportCard.setName(names[getPseudoRandomNumber(0, names.length-1)]);
            reportCard.setBiologyGrade(getPseudoRandomNumber(0, 100));
            reportCard.setChemistryGrade(getPseudoRandomNumber(0, 100));
            reportCard.setComputingGrade(getPseudoRandomNumber(0, 100));
            reportCard.setEnglishGrade(getPseudoRandomNumber(0, 100));
            reportCard.setMathGrade(getPseudoRandomNumber(0, 100));
            reportCard.setHistoryGrade(getPseudoRandomNumber(0, 100));
            reports.add(reportCard);
        }
        return reports;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GradeAdapter gradeAdapter = new GradeAdapter(this, findReports());
        ListView listView = (ListView) findViewById(R.id.rootView);
        listView.setAdapter(gradeAdapter);
    }

}