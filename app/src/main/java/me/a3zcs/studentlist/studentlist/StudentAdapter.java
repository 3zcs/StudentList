package me.a3zcs.studentlist.studentlist;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by root on 09/08/17.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {
    Context context;
    List<Student> students;

    public StudentAdapter(Context context, List<Student> students) {
        this.context = context;
        this.students = students;
    }

    @Override
    public StudentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row = LayoutInflater.from(context).inflate(R.layout.student_row,parent,false);
        StudentViewHolder viewHolder = new StudentViewHolder(row);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(StudentViewHolder holder, int position) {
        //TODO SHOW YOUR STUDENT IN THE LIST
    }

    @Override
    public int getItemCount() {
        return students.size();
    }

    class StudentViewHolder extends RecyclerView.ViewHolder{
        TextView name, course;

        public StudentViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.student_name);
            course = itemView.findViewById(R.id.student_course);
            //TODO MAKE YOUR ITEM CLICKABLE, DELETE CLICKED ITEM, AND UPDATE YOUR LIST

        }

    }
}
