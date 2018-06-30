package ir.meandme.persianviews;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Mostafa on 11/26/2016.
 */
public class MyButtonBold extends AppCompatButton {

    public MyButtonBold(Context context) {
        super(context);
        init();
    }

    public MyButtonBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyButtonBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }


    private void init() {
        if (!isInEditMode()) {
            Typeface tf = ConfigAndURLs.getFontBold(getContext());
            setTypeface(tf);
        }
    }
}