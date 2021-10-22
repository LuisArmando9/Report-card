package com.example.grades;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class GradeAdapter extends ArrayAdapter<ReportCard> {
    public GradeAdapter(@NonNull Context context,  @NonNull List<ReportCard> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView  = convertView;
        if(listItemView  == null){
            listItemView  = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        ReportCard currentReportCard = getItem(position);
        TextView reportCardTextView = listItemView.findViewById(R.id.text_view_report_card);
        reportCardTextView.setText(currentReportCard.toString());
        return listItemView ;

    }
}
