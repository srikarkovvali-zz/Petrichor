package ca.weihu.petrichor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class ExploreWeek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_explore_week);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

        ListView list = (ListView) findViewById(R.id.highlightWeekList);

        ArrayList<String> exploreWeek = new ArrayList<String>();

        exploreWeek.add("Day 1" + "\n" + "\t" + "Ate Apple" + "\n" + "\t"+ "Ate Orange" + "\n" + "\t"+ "Ate Banana");
        exploreWeek.add("Day 2");
        exploreWeek.add("Day 3");
        exploreWeek.add("Day 4");
        exploreWeek.add("Day 5");
        exploreWeek.add("Day 6");
        exploreWeek.add("Day 7");


// Now create adapter

        MyAdapter adapter = new MyAdapter(this, exploreWeek);

// NOw Set This Adapter to listview
        list.setAdapter(adapter);
    }


    public void onBtnBack(View view) {
        onBackPressed();
    }
}
