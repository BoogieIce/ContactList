package com.villaverde.contactlist.adapters;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.villaverde.contactlist.R;
import com.villaverde.contactlist.models.Contact;

import java.util.ArrayList;
import java.util.List;


public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ViewHolder> {


    private AppCompatActivity activity;
    private List<Contact> contacts;

    private static final String TAG=ContactAdapter.class.getSimpleName();

    private List<Contact> contacts;
     public ContactAdapter() {
        contacts = new ArrayList<>();
     }

     public void setContacts(List<Contact> contacts){
         this.contacts= contacts;
     }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

         Contact contact = this.contacts.get(position);
         viewHolder.fullnameText.setText(contact.getFullname());
        viewHolder.emailText.setText(contact.getEmail());

        Context context = viewHolder.itemView.getContext();
        int idRes = context.getResources().getIdentifier(contact.getPicture(), "drawable", context.getPackageName()

        );
        viewHolder.pictureImage.setImageResource(idRes);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener());

        @Override
                public void onClick(View v){
            Log.d(TAG, "onClick: " + contact);

            Intent intent=new Intent(v.getContext()).DetailContactActivity.class.getSimpleName();
            Intent.putExtra("id", contact.getId());
            activity.startActivity();

        }
    }

    @Override
    public int getItemCount() {
        return this.contacts.size();
    }



    class ViewHolder extends RecyclerView.ViewHolder {

         ImageView pictureImage;
         TextView fullnameText;
         TextView emailText;

        public ViewHolder(View itemView){
            super(itemView);
            pictureImage=itemView.findViewById(R.id.picture_image);
            fullnameText=itemView.findViewById(R.id.fullname_text);
            emailText=itemView.findViewById(R.id.email_text);
    }
    }
}
