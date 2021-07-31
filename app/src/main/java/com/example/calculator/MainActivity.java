package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.mariuszgromada.math.mxparser.*;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    MenuItem menuitem = findViewById(R.id.Acction_Search_Bar);
    nMaterialSearchBar.setMenuItem(menuitem);

            Button button_0,button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_point,button_equal,
            button_multiply, button_submission,button_plus,button_divide,button_radical,button_off,button_clear,button_sin,button_cos,button_tan
            ,button_right_braces,button_left_braces, button_fact,button_delete,button_power;
    TextView LCD_panel,LCD_panel2;
    //EditText LCD_panel2;
    //String MathSen ="";
    private static String removeLastChar(String str) {
        if(str.length()>0)
            str=str.substring(0,str.length()-1);
        return str;
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        //give all view in xml file

        button_0 = (Button)findViewById(R.id.zero_B);
        button_1 = (Button)findViewById(R.id.one_B);
        button_2 = (Button)findViewById(R.id.two_B);
        button_3 = (Button)findViewById(R.id.tree_B);
        button_4 = (Button)findViewById(R.id.four_B);
        button_5 = (Button)findViewById(R.id.five_B);
        button_6 = (Button)findViewById(R.id.six_B);
        button_7 = (Button)findViewById(R.id.seven_B);
        button_8 = (Button)findViewById(R.id.eight_B);
        button_9 = (Button)findViewById(R.id.nine_B);
        button_point = (Button)findViewById(R.id.point_B);
        button_clear = (Button)findViewById(R.id.clear_B);
        button_cos = (Button)findViewById(R.id.cos_B);
        button_delete = (Button)findViewById(R.id.Delete_B);
        button_divide = (Button)findViewById(R.id.divide_B);
        button_equal = (Button)findViewById(R.id.equal_B);
        button_left_braces = (Button)findViewById(R.id.bracesLeft_B);
        button_fact = (Button)findViewById(R.id.factoriel);
        button_multiply = (Button)findViewById(R.id.multiply_B);
        button_off = (Button)findViewById(R.id.off_B);
        button_plus = (Button)findViewById(R.id.plus_B);
        button_power = (Button)findViewById(R.id.power_B);
        button_radical = (Button)findViewById(R.id.Radical_B);
        button_right_braces = (Button)findViewById(R.id.bracesRight_B);
        button_sin = (Button)findViewById(R.id.Sin_B);
        button_submission = (Button)findViewById(R.id.submission_B);
        button_tan = (Button)findViewById(R.id.tan_B);
        LCD_panel = (TextView)findViewById(R.id.LCD);
        LCD_panel2 = (TextView) findViewById(R.id.BackLCD);

        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"0");
                LCD_panel2.setText(LCD_panel2.getText()+"0");
              //  MathSen += "0";
            }
        });
        button_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"1");
                LCD_panel2.setText(LCD_panel2.getText()+"1");
               // MathSen += "1";
            }
        });
        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"2");
                LCD_panel2.setText(LCD_panel2.getText()+"2");
               // MathSen += "2";
            }
        });
        button_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"3");
                LCD_panel2.setText(LCD_panel2.getText()+"3");
              //  MathSen += "3";
            }
        });
        button_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"4");
                LCD_panel2.setText(LCD_panel2.getText()+"4");
                //MathSen += "4";
            }
        });
        button_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"5");
                LCD_panel2.setText(LCD_panel2.getText()+"5");
                ///MathSen += "5";
            }
        });
        button_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"6");
                LCD_panel2.setText(LCD_panel2.getText()+"6");
               // MathSen += "6";
            }
        });
        button_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"7");
                LCD_panel2.setText(LCD_panel2.getText()+"7");
                //MathSen += "7";
            }
        });
        button_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"8");
                LCD_panel2.setText(LCD_panel2.getText()+"8");
                //MathSen += "8";
            }
        });
        button_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"9");
                LCD_panel2.setText(LCD_panel2.getText()+"9");
                //MathSen += "9";
            }
        });
        button_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"+");
                LCD_panel2.setText(LCD_panel2.getText()+"+");
                //MathSen += "+";
            }
        });
        button_submission.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"-");
                LCD_panel2.setText(LCD_panel2.getText()+"-");
                //MathSen += "-";
            }
        });
        button_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"×");
                LCD_panel2.setText(LCD_panel2.getText()+"*");
                //MathSen += "*";
            }
        });
        button_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"÷");
                LCD_panel2.setText(LCD_panel2.getText()+"/");
                //MathSen += "/";
            }
        });
       // String Mathsen;
        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText());

                //String MathSen ="";
                String MathSen = LCD_panel2.getText().toString();
                //LCD_panel2.setText(LCD_panel2.getText()+ MathSen);
                //calculator.StringToArray(MathSen);
                Expression e = new Expression(MathSen);
                String result = String.valueOf(e.calculate());
                LCD_panel.setText(null);
                LCD_panel.setText(result);
               // MathSen="";
            }
        });
        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+".");
                LCD_panel2.setText(LCD_panel2.getText()+".");

            }
        });
        button_power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"^");
                LCD_panel2.setText(LCD_panel2.getText()+"^");
                //MathSen += "^";
            }
        });
        button_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(null);
                LCD_panel2.setText(null);
            }
        });
        button_sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"sin(");
                LCD_panel2.setText(LCD_panel2.getText()+"sin(");
                //MathSen += "sin(";
            }
        });
        button_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"cos(");
                LCD_panel2.setText(LCD_panel2.getText()+"cos(");
                //MathSen += "cos(";
            }
        });
        button_tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"tan(");
                LCD_panel2.setText(LCD_panel2.getText()+"tan(");
                //MathSen += "tan(";
            }
        });
        button_fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"!");
                LCD_panel2.setText(LCD_panel2.getText()+"!");
                //MathSen += "log(";
            }
        });
        button_radical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"√(");
                LCD_panel2.setText(LCD_panel2.getText()+"sqrt(");
                //MathSen += "√";
            }
        });
        button_right_braces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+")");
                LCD_panel2.setText(LCD_panel2.getText()+")");
                //MathSen += ")";
            }
        });
        button_left_braces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(LCD_panel.getText()+"(");
                LCD_panel2.setText(LCD_panel2.getText()+"(");
                //MathSen += "(";
            }
        });
        button_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LCD_panel.setText(removeLastChar(LCD_panel.getText().toString()));
                LCD_panel2.setText(removeLastChar(LCD_panel2.getText().toString()));
            }
        });


    }
}
