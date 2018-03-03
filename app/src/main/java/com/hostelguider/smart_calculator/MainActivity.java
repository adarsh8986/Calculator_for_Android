package com.hostelguider.smart_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    EditText Display;
    Button Btn, C, Cc, B7, B8, B9, B2, B1, B3, B4, B5, B6, B0, D, Add, Mult, Sub, Div, Equal, Br1, Br2;
    boolean  add, sub, mult, div;
    double Var1=0.0, Var2=0.0, Var3=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Display = (EditText) findViewById(R.id.editText);
        Btn = (Button) findViewById(R.id.Back);
        C = (Button) findViewById(R.id.C);
        Cc = (Button) findViewById(R.id.Cc);
        B7 = (Button) findViewById(R.id.Seven);
        B8 = (Button) findViewById(R.id.Eight);
        B9 = (Button) findViewById(R.id.Nine);
        B1 = (Button) findViewById(R.id.One);
        B2 = (Button) findViewById(R.id.Two);
        B3 = (Button) findViewById(R.id.Three);
        B4 = (Button) findViewById(R.id.Four);
        B5 = (Button) findViewById(R.id.Five);
        B6 = (Button) findViewById(R.id.Six);
        B0 = (Button) findViewById(R.id.Zero);
        B6 = (Button) findViewById(R.id.Six);
        B0 = (Button) findViewById(R.id.Zero);
        D = (Button) findViewById(R.id.Dot);
        Add = (Button) findViewById(R.id.Add);
        Mult = (Button) findViewById(R.id.Mult);
        Div = (Button) findViewById(R.id.Div);
        Sub = (Button) findViewById(R.id.Sub);
        Equal = (Button) findViewById(R.id.Equal);
        Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i= Display.getText().length();
                if(i==0)
                {
                    Display.setText("");
                }
                else {
                    Display.setText(Display.getText().subSequence(0, i - 1));
                }
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i= Display.getText().length();
                if(i==0)
                {
                    Display.setText("");
                }
                else {
                    Display.setText(Display.getText().subSequence(0, i - 1));
                }
            }
        });
        Cc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText("");
            }
        });
        B7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText(Display.getText() + "7");
            }
        });
        B8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText(Display.getText() + "8");
            }
        });
        B9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText(Display.getText() + "9");
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText(Display.getText() + "1");
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText(Display.getText() + "2");
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText(Display.getText() + "3");
            }
        });
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText(Display.getText() + "4");
            }
        });
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText(Display.getText() + "5");
            }
        });
        B6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText(Display.getText() + "6");
            }
        });
        B0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText(Display.getText().toString() + B0.getText().toString());
            }
        });
        D.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Display.setText(Display.getText() + ".");
            }
        });
        Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Var1 = Double.parseDouble(Display.getText() + "");
                    add = true;
                    Display.setText("");
                } catch (Exception E) {
                    Display.setText("0");
                }
            }
        });

        Sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Var1 = Double.parseDouble(Display.getText() + "");
                    sub = true;
                    Display.setText("");
                } catch (Exception e) { Display.setText("0");

                }
            }
        });
        Div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Var1 = Double.parseDouble(Display.getText() + "");
                    div = true;
                    Display.setText("");
                } catch (Exception e) { Display.setText("0");
                }
            }
        });
        Mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Var1 = Double.parseDouble(Display.getText() + "");
                    mult = true;
                    Display.setText("");
                } catch (Exception e) { Display.setText("0");
                }
            }
        });
        Equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    if (sub == true) {
                        Var2 = Double.parseDouble(Display.getText() + "");
                        Var3 = Var1 - Var2;
                        Display.setText(Var3 + "");
                        sub = false;
                        Var1=0.0;Var2=0.0;Var3=0.0;
                    } else if (mult == true) {
                        Var2 = Double.parseDouble(Display.getText() + "");
                        Var3 = Var1 * Var2;
                        Display.setText(Var3 + "");
                        mult = false;
                        Var1=0.0;Var2=0.0;Var3=0.0;
                    } else if (div == true) {
                        Var2 = Double.parseDouble(Display.getText() + "");
                        Var3 = Var1 / Var2;
                        Display.setText(Var3 + "");
                        div = false;
                        Var1=0.0;Var2=0.0;Var3=0.0;
                    } else if (add == true) {
                        Var2 = Double.parseDouble(Display.getText() + "");
                        Var3 = Var1 + Var2;
                        Display.setText(Var3 + "");
                        add = false;
                        Var1=0.0;Var2=0.0;Var3=0.0;
                    }
                } catch (Exception e) { Display.setText("0");
                    Var1=0.0;Var2=0.0;Var3=0.0;

                }
            }
        });
    }
}




