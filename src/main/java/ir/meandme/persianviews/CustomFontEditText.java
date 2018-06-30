package ir.meandme.persianviews;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatEditText;
import android.util.AttributeSet;


/**
 * Created by Mostafa on 12/28/2017.
 */

public class CustomFontEditText extends AppCompatEditText {


    private Context context;
    private AttributeSet attrs;
    private int defStyle;

    public CustomFontEditText(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public CustomFontEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        this.attrs = attrs;
        init();
    }

    public CustomFontEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.context = context;
        this.attrs = attrs;
        this.defStyle = defStyle;
        init();
    }

    private void init() {
        Typeface tf = ConfigAndURLs.getFontRegular(context);
        this.setTypeface(tf);
    }

    @Override
    public void setTypeface(Typeface tf, int style) {
        tf = ConfigAndURLs.getFontRegular(context);
        super.setTypeface(tf, style);
    }

    @Override
    public void setTypeface(Typeface tf) {
        tf = ConfigAndURLs.getFontRegular(context);
        super.setTypeface(tf);
    }
}