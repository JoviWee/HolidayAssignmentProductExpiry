package sg.edu.rp.c346.id20008787.assignmentproductexpiry;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.SortedList;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class itemListActivity extends AppCompatActivity {

    TextView tvAddProduct;
    EditText etProductName;
    EditText etExpiryDate;
    Button btnAdd;
    Button btnUpdate;
    Button btnDelete;
    TextView tvList;
    ListView lvProduct;
    ArrayList <String> expiration;
    ArrayAdapter <String> aaExpiration;
    Integer indexList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);

        tvAddProduct = findViewById(R.id.tvAddProduct);
        etProductName = findViewById(R.id.etProductName);
        etExpiryDate = findViewById(R.id.etExpiryDate);
        btnAdd = findViewById(R.id.btnAdd);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnDelete = findViewById(R.id.btnDelete);
        tvList = findViewById(R.id.tvList);
        lvProduct = findViewById(R.id.lvProduct);

        //create listview

        expiration = new ArrayList<>();

        aaExpiration = new ArrayAdapter<String>(this, android.R.layout.activity_list_item, expiration);
        lvProduct.setAdapter(aaExpiration);

        String text = "Product Expiry Date : \n ======================== \n";

        expiration.add("Expires 2021/07/22 HL Fresh Milk");
        expiration.add("Expires 2022/02/01 Campbell Mushroom Soup ");
        expiration.add("Expires 2022/05/05 Sardine Fish Can ");
        expiration.add("Expires 2021/07/05 Honey Picnic Ham ");
        expiration.add("Expires 2022/09/09 Luncheon Meat Can ");

        //add to listview
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etProductName.getText().toString();
                String date = etExpiryDate.getText().toString();

                expiration.add(name);
                expiration.add(date);
                aaExpiration.notifyDataSetChanged();
                etProductName.setText("");
                etExpiryDate.setText("");
            }
        });

        //update listview
        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etProductName.getText().toString();
                String date = etExpiryDate.getText().toString();
                if (name.equals(expiration) && date.equals(expiration)) {
                    expiration.set(indexList,name);
                    expiration.set(indexList,date);
                    aaExpiration.notifyDataSetChanged();
                }
            }
        });

        //remove listview
        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etProductName.getText().toString();

                if (name.equals(expiration)) {
                    expiration.remove(indexList);
                }
            }
        });


    }

}