package com.learnandroid.arrayadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Controller> controller = new ArrayList<Controller>(); // Inisialisasi Array List
    ArrayAdapter<Controller> adapter = null; // Inisialisasi Array Adapter
    ListView listView;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button      = (Button)findViewById(R.id.simpan);
        editText    = (EditText)findViewById(R.id.edittext);
        listView    = (ListView)findViewById(R.id.listview);

        adapter  = new ArrayAdapter<Controller>(this, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Controller c = new Controller();
                c.setIsi(editText.getText().toString());
                adapter.add(c);
            }
        });
    }
}
