package com.example.touseeq_bhai_task_16_july;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.amulyakhare.textdrawable.TextDrawable;
import com.baoyachi.stepview.VerticalStepView;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.transferwise.sequencelayout.SequenceStep;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    VerticalStepView stepView;
    ListView listView;
    Toolbar toolbar;
    SequenceStep sequenceStep, sequenceStep2, sequenceStep3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task2e);

//        for live tracing screen
//        SupportMapFragment supportMapFragment = (SupportMapFragment) getSupportFragmentManager()
//                .findFragmentById(R.id.map);
//        supportMapFragment.getMapAsync(this);
//
//
//        TextDrawable textDrawable = TextDrawable.builder()
//                .buildRound("1", getResources().getColor(R.color.colorOrange));
//
//        imageView = findViewById(R.id.imageview_rider_count);
//        imageView.setImageDrawable(textDrawable);
        //ended for live tracking


//        TextDrawable textDrawable = TextDrawable.builder()
//                .buildRound("1", getResources().getColor(R.color.colorApp));
//
//        imageView = findViewById(R.id.img_rider_count);
//        imageView.setImageDrawable(textDrawable);
//
//
//        stepView = findViewById(R.id.stepView);
//
//        List<String> sources = new ArrayList<>();
//        sources.add("Order confirmed\nOrder Number:OT676786HJ");
//        sources.add("Preparing your order");
//        sources.add("Rider is Picking up your order\n100 King Street West Toronto ON Canada");
//        sources.add("Rider is nearby your place");
//        sources.add("Drop-Off package\n5000 Yonge Street, Toronto, ON, Canada");
////        sources.add("");
//
//
//        stepView.setStepsViewIndicatorComplectingPosition(sources.size() - 3)
//                .reverseDraw(false)
//                .setStepViewTexts(sources)
//                .setLinePaddingProportion(0.85f)
//                .setStepsViewIndicatorCompletedLineColor(ContextCompat.getColor(MainActivity.this, android.R.color.darker_gray))
//                .setStepsViewIndicatorUnCompletedLineColor(ContextCompat.getColor(MainActivity.this, R.color.colorApp))
//                .setStepViewComplectedTextColor(ContextCompat.getColor(MainActivity.this, android.R.color.black))
//                .setStepViewUnComplectedTextColor(ContextCompat.getColor(MainActivity.this, R.color.darkerGray))
//                .setStepsViewIndicatorCompleteIcon(ContextCompat.getDrawable(MainActivity.this, R.drawable.complted))
//                .setStepsViewIndicatorDefaultIcon(ContextCompat.getDrawable(MainActivity.this, R.drawable.default_icon))
//                .setBackgroundColor(getResources().getColor(R.color.lightGray));


//        listView = findViewById(R.id.listview);
//
//        ArrayList<ListItemModel> arrayList = new ArrayList<>();
//        arrayList.add(new ListItemModel(R.drawable.ic_baseline_account_circle_24,"My Account",R.drawable.ic_chevron_right));
//        arrayList.add(new ListItemModel(R.drawable.ic_baseline_account_circle_24,"My Account",R.drawable.ic_chevron_right));
//        arrayList.add(new ListItemModel(R.drawable.ic_baseline_account_circle_24,"My Account",R.drawable.ic_chevron_right));
//        arrayList.add(new ListItemModel(R.drawable.ic_baseline_account_circle_24,"My Account",R.drawable.ic_chevron_right));
//        arrayList.add(new ListItemModel(R.drawable.ic_baseline_account_circle_24,"My Account",R.drawable.ic_chevron_right));
//
//
//        ListAdapter listAdapter = new ListAdapter(MainActivity.this,R.layout.help,arrayList);
//        listView.setAdapter(listAdapter);


    }
}
