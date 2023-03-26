//package com.collegeproject.counterapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
//
//
//    TextView tvCount;
//    Button buttonAdd, buttonSub, buttonReset;
//    int count = 0;
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        tvCount = findViewById(R.id.tvCount);
//        buttonAdd = findViewById(R.id.buttonAdd);
//        buttonSub = findViewById(R.id.buttonSub);
//        buttonReset = findViewById(R.id.buttonReset);
//
//
//        //=========================================================================================
//        // Onclick event here
//
//        // buttonAdd code here
//
//        buttonAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // code here
//
////                count++; == count = count +1;
////                count = count + 1;
//                count++;
//                tvCount.setText(""+count);
//
//            }
//        });
//
//
//
//        // buttonSub code here
//
//        buttonSub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // code here
////                count--; = count = count -1;
//                // count = count - 1;
//                count--;
//                tvCount.setText(""+count);
//
//            }
//        });
//
//
//
//        // buttonReset code here
//
//        buttonReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//            // code here
//
//                count = 0;
//                tvCount.setText(""+count);
//
//            }
//        });
//
//    }
//
//}

//try for second

//package com.collegeproject.counterapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
//
//    TextView tvCount;
//    Button buttonAdd, buttonSub, buttonReset;
//    int count = 0;
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        tvCount = findViewById(R.id.tvCount);
//        buttonAdd = findViewById(R.id.buttonAdd);
//        buttonSub = findViewById(R.id.buttonSub);
//        buttonReset = findViewById(R.id.buttonReset);
//
//
//        //=========================================================================================
//        // Onclick event here
//
//        // buttonAdd code here
//
//        buttonAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // code here
//                count++;
//                tvCount.setText("" + count);
//            }
//        });
//
//        buttonSub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // code here
//
//                count--;
//                tvCount.setText("" + count);
//            }
//        });
//
//        buttonReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                // code here
//                count = 0;
//                tvCount.setText("" + count);
//            }
//        });
//
//    }
//
//}

// try for third time

//package com.collegeproject.counterapp;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//public class MainActivity extends AppCompatActivity {
//
//
//    TextView tvCount;
//    Button buttonAdd, buttonSub, buttonReset;
//    int count = 0;
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//
//        tvCount = findViewById(R.id.tvCount);
//        buttonAdd = findViewById(R.id.buttonAdd);
//        buttonSub = findViewById(R.id.buttonSub);
//        buttonReset = findViewById(R.id.buttonReset);
//
//
//        //=========================================================================================
//        // Onclick event here
//
//        // buttonAdd code here
//
//        buttonAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                count++;
//                tvCount.setText("" + count);
//
//            }
//        });
//
//        buttonSub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                count--;
//                tvCount.setText("" + count);
//
//            }
//        });
//
//        buttonReset.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                count = 0;
//                tvCount.setText("" + count);
//
//            }
//        });
//
//    }
//
//}

//fourth and final try

/*
package com.collegeproject.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvCount;
    Button buttonAdd, buttonSub, buttonReset;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCount = findViewById(R.id.tvCount);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonReset = findViewById(R.id.buttonReset);

        //=========================================================================================
        // Onclick event here

        // buttonAdd code here

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here
                // count = count + 1; == count++; are same to use

                count++;
                tvCount.setText("" + count);

            }
        });

        // buttonSub code here

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here
                //count = count - 1; or count--; are same to use

                count--;
                tvCount.setText("" + count);

            }
        });


        // buttonReset code here

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // code here

                count = 0;
                tvCount.setText("" + count);

            }
        });


    }

}*/

// Five time for second day

package com.collegeproject.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvCont;
    Button buttonAdd, buttonSub, buttonReset;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCont = findViewById(R.id.tvCount);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonReset = findViewById(R.id.buttonReset);

        //=========================================================================================
        // Onclick event here

        // buttonAdd code here


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                tvCont.setText("" + count);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
                tvCont.setText("" + count);
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count = 0;
                tvCont.setText("" + count);
            }
        });

    }

}
