package com.example.macbookair.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listView);
        final Intent intent = new Intent(MainActivity.this, contacts_information.class);
        listAdapter = new ListAdapter(this);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {

            intent.putExtra("name", Contacts.getNames()[position]);
            intent.putExtra("phone", Contacts.getPhone_numbers()[position]);
            intent.putExtra("image", Contacts.getImages()[position]);
            intent.putExtra("email", Contacts.getE_mails()[position]);

            startActivity(intent);
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return true;
    }


}
