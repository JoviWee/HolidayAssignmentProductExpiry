package sg.edu.rp.c346.id20008787.assignmentproductexpiry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvIntro;
    TextView tvDesc;
    TextView tvStart;
    TextView tvPhone;
    Button btnClick1;
    TextView tvWebsite;
    Button btnClick2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvIntro = findViewById(R.id.tvIntro);
        tvDesc = findViewById(R.id.tvDesc);
        tvStart = findViewById(R.id.tvStart);
        tvPhone = findViewById(R.id.tvPhone);
        btnClick1 = findViewById(R.id.btnClick1);
        tvWebsite = findViewById(R.id.tvWebsite);
        btnClick2 = findViewById(R.id.btnClick2);

        btnClick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, itemListActivity.class);
                startActivity(intent);
            }
        });


        btnClick2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/JoviWee?tab=repositories"));
                startActivity(intent);
            }
        });

    }
}