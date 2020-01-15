package me.tatarka.materialtabcompatissue;

import androidx.appcompat.app.AppCompatActivity;
import me.tatarka.lib.TabFragment;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.content, new TabFragment())
                    .commit();
        }
    }
}
