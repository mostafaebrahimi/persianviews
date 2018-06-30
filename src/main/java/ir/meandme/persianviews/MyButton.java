package ir.meandme.persianviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;



/**
 * Created by Mostafa on 11/26/2016.
 */
public class MyButton extends AppCompatButton {

    public MyButton(Context context) {
        super(context);
        init();
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
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