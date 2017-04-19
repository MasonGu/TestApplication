package firstapp.android.mobile.testapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView1;
    private TextView mTextView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 装载布局文件
        setContentView(R.layout.activity_main);
        mTextView1 = (TextView) findViewById(R.id.textview1);
        mTextView2 = (TextView) findViewById(R.id.textview2);

        mTextView1.setText("今天天气真好.");
        mTextView2.setText("今天上班吗？");

        mTextView1.setTextColor(Color.YELLOW);
        mTextView1.setBackgroundColor(Color.BLUE);

        mTextView1.setTextSize(50);


    }
}
