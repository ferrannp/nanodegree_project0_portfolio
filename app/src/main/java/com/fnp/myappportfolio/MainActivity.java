package com.fnp.myappportfolio;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         *  backgroundTint property in the XML is only compatible with Lollipop.
         *
         *  Setting a custom theme for the button in the XML, makes the "onClick" func to fail with:
         *  @java.lang.IllegalStateException: Could not find a method onButtonClicked(View) in the
         *      activity class android.view.ContextThemeWrapper for onClick handler on view class
         *      android.support.v7.widget.AppCompatButton with id 'capstone'
         *
         */
        Button v = (Button) findViewById(R.id.capstone);
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[0]},
                new int[]{getResources().getColor(R.color.colorImportantButton)});
        ((AppCompatButton) v).setSupportBackgroundTintList(colorStateList);
    }

    /**
     * Defined in the XML
     */
    public void onButtonClicked(View view){
        Toast.makeText(this, getString(R.string.this_button_will_launch) + " "
                + ((Button)view).getText() + "!", Toast.LENGTH_SHORT).show();
    }
}
