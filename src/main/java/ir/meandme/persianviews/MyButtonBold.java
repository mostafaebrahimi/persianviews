package ir.meandme.persianviews;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by Mostafa on 11/26/2016.
 */
public class MyButtonBold extends Button {

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

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public MyButtonBold(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }


    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/IRANSansMobile_Bold.ttf");
            setTypeface(tf);
        }
    }
}