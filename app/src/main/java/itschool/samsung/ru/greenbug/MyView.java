package itschool.samsung.ru.greenbug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;

public class MyView extends View implements CompoundButton.OnCheckedChangeListener {

    int color;
    public MyView(Context context) {
        super(context);
        color = Color.GREEN;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(color);
    }

    public MyView(Context context, AttributeSet attrs) {
        this(context);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (color == Color.GREEN) color = Color.RED;
        else color = Color.GREEN;
        invalidate();
    }
}
