package me.a3zcs.studentlist.studentlist;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String MY_LIST = "studentList";
    RecyclerView mStudentList;
    List<Student> mStudentInfoList;
    LinearLayoutManager mLinearLayoutManager;
    StudentAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mStudentList = (RecyclerView) findViewById(R.id.student_list);

        if (savedInstanceState != null && savedInstanceState.containsKey(MY_LIST)){
            //TODO RETRIEVE YOUR LIST

        }else{
            mStudentInfoList = new ArrayList<>();
            mStudentInfoList.add(new Student("Ali","ABND"));
            mStudentInfoList.add(new Student("Ahmed","DAND"));
            mStudentInfoList.add(new Student("Khaled","FEND"));
        }

        mLinearLayoutManager = new LinearLayoutManager(this);
        mStudentList.setLayoutManager(mLinearLayoutManager);

        mAdapter = new StudentAdapter(this,mStudentInfoList);
        mStudentList.setAdapter(mAdapter);

    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //TODO YOUR STUDENT LIST
    }
}
