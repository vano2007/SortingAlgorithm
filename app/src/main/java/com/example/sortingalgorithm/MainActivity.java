package com.example.sortingalgorithm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // создание полей для вывода на экран нужных значений
    private EditText dataIn; // окно ввода данных
    private Button button; // кнопка сортировки данных
    private TextView dataSortOut; // окно вывода отсортированных данных

    // создание дополнительных полей
    private String data;

    // создание объекта класса Algorithm
    Algorithm algorithm = new Algorithm();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // присваивание переменным активити элементов представления activity_main
        dataIn = findViewById(R.id.dataIn); // окно ввода
        button = findViewById(R.id.button); // кнопка обработки
        dataSortOut = findViewById(R.id.dataSortOut); // окно вывода

        // выполнение действий при нажании кнопки
        button.setOnClickListener(listener); // обработка нажатия кнопки
    }
    // объект обработки нажатия всех кнопок
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) { // при нажатии кнопки во view записывается значение кнопки

            data = dataIn.getText().toString(); // запись введённого значения в строку data

            // вывод на экран отсортированных данных
            dataSortOut.setText(algorithm.sortData(data)); // сортировка любых данных стандартными средствами java
            //dataSortOut.setText(algorithm.sortIntData(data)); // сортировка "Пузырьком" только числовых входных данных
        }
    };
}