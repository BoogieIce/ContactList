package com.villaverde.contactlist.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.villaverde.contactlist.R;
import com.villaverde.contactlist.adapters.ContactAdapter;
import com.villaverde.contactlist.adapters.ContactAdapter;
import com.villaverde.contactlist.models.Contact;
import com.villaverde.contactlist.repositories.ContactRepository;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView= findViewById(R.id.contactlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ContactAdapter adapter=new ContactAdapter();

        List<Contact>contacts= ContactRepository.getContacts();
        adapter.setContacts(contacts);

        recyclerView.setAdapter(adapter);
    }
}
