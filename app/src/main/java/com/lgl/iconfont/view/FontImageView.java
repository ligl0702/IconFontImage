package com.lgl.iconfont.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.lgl.iconfont.R;


/**
 * Created by LGL on 2016/3/15.
 */
public class FontImageView extends TextView {

    public FontImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        if (isInEditMode()) return;
        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.fontimageview);
        String fontpath = a.getString(R.styleable.fontimageview_fontname);
        Typeface iconfont = null;
        if (fontpath == null) {
            iconfont = Typeface.createFromAsset(context.getAssets(), "iconfonts.ttf");
        } else {
            iconfont = Typeface.createFromAsset(context.getAssets(), fontpath + ".ttf");
        }
        setTypeface(iconfont);
    }


    public FontImageView(Context context) {
        super(context);
    }

    public FontImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setImage(String text) {
        setText(text);
    }

}
