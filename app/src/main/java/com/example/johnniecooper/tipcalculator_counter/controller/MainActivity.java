package com.example.johnniecooper.tipcalculator_counter.controller;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.johnniecooper.tipcalculator_counter.R;
import com.example.johnniecooper.tipcalculator_counter.model.Calculator;

public class MainActivity extends AppCompatActivity {


    boolean billAmountPressed = false;
    boolean numberOfPeoplePressed = true;
    StringBuilder numOfPeopleToString = new StringBuilder();
    StringBuilder billTotalString = new StringBuilder("$");



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton one = (ImageButton) findViewById(R.id.one);
        ImageButton two = (ImageButton) findViewById(R.id.two);
        ImageButton three = (ImageButton) findViewById(R.id.three);
        ImageButton four = (ImageButton) findViewById(R.id.four);
        ImageButton five = (ImageButton) findViewById(R.id.five);
        ImageButton six = (ImageButton) findViewById(R.id.six);
        ImageButton seven = (ImageButton) findViewById(R.id.seven);
        ImageButton eight = (ImageButton) findViewById(R.id.eight);
        ImageButton nine = (ImageButton) findViewById(R.id.nine);
        ImageButton zero = (ImageButton) findViewById(R.id.zero);
        ImageButton decimal = (ImageButton) findViewById(R.id.decimal);
        ImageButton clear = (ImageButton) findViewById(R.id.clear);
        final Button calculateTip = (Button) findViewById(R.id.calculateTip);
        final EditText numberOfPeople = (EditText) findViewById(R.id.numOfPeople);
        final EditText billTotal = (EditText) findViewById(R.id.billTotal);
        final EditText otherPercentage = (EditText) findViewById(R.id.otherPercentage);



        billTotal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOfPeoplePressed = false;
                billAmountPressed = true;
                Log.d("INFO: ","Bill Pressed" +  Boolean.toString(billAmountPressed));
                Log.d("INFO: ","People Pressed" +  Boolean.toString(numberOfPeoplePressed));

            }
        });


        numberOfPeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOfPeoplePressed = true;
                billAmountPressed = false;
                Log.d("INFO:","Bill Pressed" + Boolean.toString(billAmountPressed));
                Log.d("INFO:","People Pressed" +  Boolean.toString(numberOfPeoplePressed));

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numberOfPeoplePressed) {
                    numOfPeopleToString.append("1");
                    numberOfPeople.setText(numOfPeopleToString);
                } else {
                    billTotalString.append("1");
                    billTotal.setText(billTotalString);
                }
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numberOfPeoplePressed) {
                    numOfPeopleToString.append("2");
                    numberOfPeople.setText(numOfPeopleToString);
                } else {
                    billTotalString.append("2");
                    billTotal.setText(billTotalString);
                }
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numberOfPeoplePressed) {
                    numOfPeopleToString.append("3");
                    numberOfPeople.setText(numOfPeopleToString);
                } else {
                    billTotalString.append("3");
                    billTotal.setText(billTotalString);
                }
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numberOfPeoplePressed) {
                    numOfPeopleToString.append("4");
                    numberOfPeople.setText(numOfPeopleToString);
                } else {
                    billTotalString.append("4");
                    billTotal.setText(billTotalString);
                }
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numberOfPeoplePressed) {
                    numOfPeopleToString.append("5");
                    numberOfPeople.setText(numOfPeopleToString);
                } else {
                    billTotalString.append("5");
                    billTotal.setText(billTotalString);
                }
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numberOfPeoplePressed) {
                    numOfPeopleToString.append("6");
                    numberOfPeople.setText(numOfPeopleToString);
                } else {
                    billTotalString.append("6");
                    billTotal.setText(billTotalString);
                }
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numberOfPeoplePressed) {
                    numOfPeopleToString.append("7");
                    numberOfPeople.setText(numOfPeopleToString);
                } else {
                    billTotalString.append("7");
                    billTotal.setText(billTotalString);
                }
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numberOfPeoplePressed) {
                    numOfPeopleToString.append("8");
                    numberOfPeople.setText(numOfPeopleToString);
                } else {
                    billTotalString.append("8");
                    billTotal.setText(billTotalString);
                }
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numberOfPeoplePressed) {
                    numOfPeopleToString.append("9");
                    numberOfPeople.setText(numOfPeopleToString);
                } else {
                    billTotalString.append("9");
                    billTotal.setText(billTotalString);
                }
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numberOfPeoplePressed) {
                    numOfPeopleToString.append("0");
                    numberOfPeople.setText(numOfPeopleToString);
                } else {
                    billTotalString.append("0");
                    billTotal.setText(billTotalString);
                }
            }
        });

        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numberOfPeoplePressed) {
                    numOfPeopleToString.append(".");
                    numberOfPeople.setText(numOfPeopleToString);
                } else {
                    billTotalString.append(".");
                    billTotal.setText(billTotalString);
                }
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (numberOfPeoplePressed) {
                    numOfPeopleToString.setLength(0);
                    numberOfPeople.setText(numOfPeopleToString);
                } else {
                    billTotalString.setLength(0);
                    billTotal.setText(billTotalString);
                }
            }
        });

        calculateTip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("IN ", "Button Clicked");
                int otherRadioButtonClicked = findViewById(R.id.other).getId();
                RadioGroup tipPercentage = (RadioGroup) findViewById(R.id.radioGroup);
                int radioButtonID = tipPercentage.getCheckedRadioButtonId();
                RadioButton percentageSelected = (RadioButton) findViewById(radioButtonID);
                String tipAmount = "0";

                Log.d("DEBUG: ", billTotal.getText().toString());
                Log.d("DEBUG: ", String.valueOf(billTotal.getText().length()));

                if (billTotal.getText().length() != 0 || numberOfPeople.getText().length() != 0) {

                    if (otherRadioButtonClicked == radioButtonID) {


                        if ((Float.parseFloat(otherPercentage.getText().toString())) < 1 || "".equals(otherPercentage.getText().toString())) {

                            showErrorAlert("Please enter a percentage higher the one!", otherPercentage.getId());

                        } else {

                            if ((Float.parseFloat(billTotalString.toString().substring(1)) < 1) || "".equals(billTotalString.toString())) {
                                showErrorAlert("Please enter a bill amount higher the one!", (int) billTotal.getId());
                            } else if ((Integer.parseInt(numOfPeopleToString.toString()) < 1) || "".equals(numOfPeopleToString.toString())) {
                                showErrorAlert("Please enter higher the one!", (int) numberOfPeople.getId());
                            } else {
                                Calculator tipCalculator = new Calculator(Integer.parseInt(numOfPeopleToString.toString()),
                                        Float.parseFloat(billTotalString.toString().substring(1)),
                                        (Float.parseFloat(otherPercentage.getText().toString()) / 100));
                                tipAmount = tipCalculator.calculateTip();

                                Intent displayTip = new Intent(getApplicationContext(), TipDisplayActivity.class);
                                displayTip.putExtra("tipAmount", tipAmount);
                                startActivity(displayTip);
                                Log.d("TIP AMOUNT: ", tipAmount);
                            }

                        }

                    } else {

                        if ((Float.parseFloat(billTotalString.toString().substring(1)) < 1) || (("".equals(billTotalString.toString())))) {
                            showErrorAlert("Please enter a bill amount higher the one!", (int) billTotal.getId());
                        } else if ((Integer.parseInt(numOfPeopleToString.toString()) < 1) || "".equals(numOfPeopleToString.toString())) {
                            showErrorAlert("Please enter higher the one!", (int) numberOfPeople.getId());
                        } else {

                            Calculator tipCalculator = new Calculator(Integer.parseInt(numOfPeopleToString.toString()),
                                    Float.parseFloat(billTotalString.toString().substring(1)),
                                    Float.parseFloat(percentageSelected.getText().toString().replace("%", ".")));

                            tipAmount = tipCalculator.calculateTip();
                            Intent displayTip = new Intent(getApplicationContext(), TipDisplayActivity.class);
                            displayTip.putExtra("tipAmount", tipAmount);
                            startActivity(displayTip);
                            Log.d("TIP AMOUNT: ", tipAmount);
                        }
                    }
                }
            }
        });

    }

    private void showErrorAlert(String errorMessage, final int fieldId) {
        new AlertDialog.Builder(this)
                .setTitle("Error")
                .setMessage(errorMessage)
                .setNeutralButton("Close",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which) {
                                findViewById(fieldId).requestFocus();
                            }
                        }).show();
    }
}

