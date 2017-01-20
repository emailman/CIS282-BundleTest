package edu.dtcc.emailman.bundletest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCalcClick(View view) {
        Toast.makeText(this, "Calc Clicked", Toast.LENGTH_LONG).show();
        EditText etLength = (EditText) findViewById(R.id.etLength);
        EditText etWidth = (EditText) findViewById(R.id.etWidth);
        TextView tvArea = (TextView) findViewById(R.id.tvArea);
        TextView tvPerimeter = (TextView) findViewById(R.id.tvPerimeter);

        double length = 7;
        double width = 14;
        double area = length * width;
        double perimeter = 2 * (length + width);

        tvArea.setText("x");
        tvPerimeter.setText("y");

    }
}
