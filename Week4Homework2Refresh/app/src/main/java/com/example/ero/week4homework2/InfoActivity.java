package com.example.ero.week4homework2;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.VideoView;

import com.squareup.picasso.Picasso;

public class InfoActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private ListModel listModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listModel = UserProvider.getUserPosition();

        final TextView largeText = findViewById(R.id.large_text);
        largeText.setText(listModel.getDescription());

        final CollapsingToolbarLayout collaps = findViewById(R.id.toolbar_layout);
        collaps.setTitle(listModel.getTitle());

        final ImageView imageBackground = findViewById(R.id.ifno_image);
        Picasso.get().load(listModel.getImageUrl()[0]).into(imageBackground);

        recycler = findViewById(R.id.recycler2);
        recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        final InfoAdapter adapter = new InfoAdapter(this, listModel.getImageUrl());
        recycler.setAdapter(adapter);

        final RatingBar ratingBar = findViewById(R.id.rating_info);
        ratingBar.setRating(listModel.getRating());

        showVideo();
    }

    private void showVideo() {
        final ImageButton play = findViewById(R.id.imageButton);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Dialog dialog = new Dialog(InfoActivity.this);
                dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
                dialog.setContentView(R.layout.video_item);
                final VideoView video = dialog.findViewById(R.id.video);
                video.setVideoURI(Uri.parse(listModel.getVideoUrl()));
                video.start();
                dialog.show();
            }
        });
    }
}
