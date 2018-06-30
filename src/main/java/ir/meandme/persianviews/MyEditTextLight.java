package ir.meandme.persianviews;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;


/**
 * Created by Mostafa
 */
public class MyEditTextLight extends EditText {

    public MyEditTextLight(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public MyEditTextLight(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyEditTextLight(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/IRANSansMobile_Light.ttf");
            setTypeface(tf);
        }
    }

    @Override
    public void setText(CharSequence text, BufferType type) {
        if (text != null)
            text = FormatHelper.toPersianNumber(text.toString());
        super.setText(text, type);
    }

}