package com.trinhnam12345z.trinhnam_chatapp_firebase.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.trinhnam12345z.trinhnam_chatapp_firebase.R;
import com.trinhnam12345z.trinhnam_chatapp_firebase.databinding.ActivityChatBinding;
import com.trinhnam12345z.trinhnam_chatapp_firebase.models.User;
import com.trinhnam12345z.trinhnam_chatapp_firebase.utilities.Constants;

public class ChatActivity extends AppCompatActivity {

    private ActivityChatBinding binding;
    private User receiverUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChatBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setListeners();
        loadReceiverDetail();
    }

    private void loadReceiverDetail(){
        receiverUser = (User) getIntent().getSerializableExtra(Constants.KEY_USER);
        binding.textName.setText(receiverUser.name);
    }

    private void setListeners(){
        binding.imageBack.setOnClickListener(v -> onBackPressed());

    }
}