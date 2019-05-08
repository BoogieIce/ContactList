package com.villaverde.contactlist.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.villaverde.contactlist.R;
import com.villaverde.contactlist.models.Contact;
import com.villaverde.contactlist.repositories.ContactRepository;


public class DetailContactActivity extends AppCompatActivity {

    private Integer id;

    private ImageView pictureImage;
    private TextView fullnameText;
    private TextView emailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_contact);

        pictureImage = findViewById(R.id.picture_image);
        fullnameText = findViewById(R.id.fullname_text);
        emailText = findViewById(R.id.email_text);

        this.id = getIntent().getExtras().getInt("id");

        Contact contact = ContactRepository.getContactById(id);

        if(contact != null) {
            int resourceid = getResources().getIdentifier(
                    contact.getPicture(),
                    "drawable",
                    getPackageName()
            );
            pictureImage.setImageResource(resourceid);
            fullnameText.setText(contact.getFullname());
            emailText.setText(contact.getEmail());
        }
    }
}
