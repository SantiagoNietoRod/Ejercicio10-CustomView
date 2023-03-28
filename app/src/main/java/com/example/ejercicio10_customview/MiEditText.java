package com.example.ejercicio10_customview;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class MiEditText extends androidx.appcompat.widget.AppCompatEditText {

    private EditText editText;

    public MiEditText(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        editText = findViewById(R.id.campo);

        Drawable drawable = getContext().getDrawable(R.drawable.image);
       // drawable.setBounds(0,0,drawable.getIntrinsicWidth(),drawable.getIntrinsicHeight());
        editText.setCompoundDrawablesWithIntrinsicBounds(drawable, null, null, null);
        editText.setCompoundDrawablePadding(10);
    }





    /*private String contenido;
    private boolean style;

    public MiEditText(Context context) {
        super(context);
        setContenido();
    }

    public MiEditText(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.MiEditText,0,0);
        int cont = typedArray.getIndexCount();

        try {

            for (int i = 0; i<cont; ++i){
                int attr = typedArray.getIndex(i);

                if (attr == R.styleable.MiEditText_contenido){
                    contenido = typedArray.getString(attr);
                    setContenido();

                }else if (attr == R.styleable.MiEditText_sytle){
                    style = typedArray.getBoolean(attr, false);
                    setStyle();
                }
            }

            contenido = String.valueOf(typedArray.getText(R.styleable.MiEditText_contenido));
            style = typedArray.getBoolean(R.styleable.MiEditText_sytle,true);

        }finally {
            typedArray.recycle();
        }
    }

    public MiEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setContenido();
    }

    private void setContenido(){
        if (this.contenido != null){
            setText(this.contenido);
        }
    }

    private void setStyle(){

        if (this.style){
            setTextColor(Color.BLUE);
            setTextSize(30f);
        }
    }*/
}
