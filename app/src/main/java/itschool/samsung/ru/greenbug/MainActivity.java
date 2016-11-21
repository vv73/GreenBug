package itschool.samsung.ru.greenbug;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Switch aSwitch = (Switch) findViewById(R.id.switch1);
        MyView myView = (MyView) findViewById(R.id.view);
        aSwitch.setOnCheckedChangeListener(myView);
    }
}
