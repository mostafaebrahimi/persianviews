package ir.meandme.persianviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;

/**
 * Created by Mostafa on 11/26/2016.
 */
public class MyRadioButton extends AppCompatRadioButton {

    public MyRadioButton(Context context) {
        super(context);
        init();
    }

    public MyRadioButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }



    private void init() {
        if (!isInEditMode()) {
            Typeface tf = ConfigAndURLs.getFontRegular(getContext());
            setTypeface(tf);
        }
    }
}