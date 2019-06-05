package com.dev.chatlibrary;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
     ImageView iv_back;
     RecyclerView recyclerview_chathistory;
     CircleImageView iv_userprofile;


     Activity activity;

    public MainActivity(Activity activity) {
        this.activity=activity;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chatdesign);
    }

//method to apply background Image
    public void applyBackgroundImage(RecyclerView recyclerView,Drawable drawable) {
        recyclerView.setBackground(drawable);
    }

//method to change back image
    public void changeBackImage(Drawable drawable) {
        iv_back.setImageDrawable(drawable);
    }

//method to remove back image
   public static void removeBackImage(View v) {
       v.setVisibility(View.GONE);
    }



//method to remove profile picture
    public void removeProfileImage(CircleImageView circleImageView) {
        circleImageView.setImageResource(0);
    }
}
