package com.haerul.hitungluasmvp;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MainView {

    private int panjang, lebar;
    private EditText inputPanjang, inputLebar;
    private Button button;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        renderTampilan();

        presenter = new MainPresenter(MainActivity.this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                panjang = Integer.valueOf(inputPanjang.getText().toString());
                lebar = Integer.valueOf(inputLebar.getText().toString());
                presenter.hitungLuas(panjang, lebar);
            }
        });
    }

    void renderTampilan(){
        inputPanjang = findViewById(R.id.editText);
        inputLebar = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
    }

    @Override
    public void tampilkanLuas(MainModel mainModel) {
        
        new AlertDialog.Builder(MainActivity.this).setTitle("Luas").setMessage(String.valueOf(String.valueOf(mainModel.getLuas()))).show();
    }
}
