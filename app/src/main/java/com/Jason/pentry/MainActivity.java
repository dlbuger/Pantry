package com.Jason.pentry;

import android.os.Bundle;
import com.Jason.pentry.model.*;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ShoppingList shoppingList = new ShoppingList();
    private Pantry pantry = new Pantry();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
