package com.geektech.homework25;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private EditText et_mail, et_password;
    private MaterialButton btn_next;
    private TextView forget_password, click_here, sign_in, welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_mail = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        btn_next = findViewById(R.id.btn_next);
        forget_password = findViewById(R.id.forget_password);
        click_here = findViewById(R.id.click_here);
        sign_in = findViewById(R.id.sign_in);
        welcome = findViewById(R.id.welcome);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (et_mail.getText().toString().equals("admin")
                        && et_password.getText().toString().equals("admin")) {
                    et_mail.setVisibility(view.GONE);
                    et_password.setVisibility(view.GONE);
                    btn_next.setVisibility(view.GONE);
                    forget_password.setVisibility(view.GONE);
                    click_here.setVisibility(view.GONE);
                    sign_in.setVisibility(view.GONE);
                    Toast.makeText(MainActivity.this, "OK", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "NO", Toast.LENGTH_SHORT).show();
                }
            }
        });
        et_password.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!et_password.getText().toString().isEmpty()) {
                    btn_next.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }else{
                    btn_next.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));

                }
            }
        });
        et_mail.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (!et_password.getText().toString().isEmpty()) {
                    btn_next.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.orange));
                }else{
                    btn_next.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.grey));
                }
            }
        });


    }

}