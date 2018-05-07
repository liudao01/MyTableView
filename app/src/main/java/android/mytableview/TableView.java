package android.mytableview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

/**
 * desc
 * Created by liuml.
 * Created time 2018/5/7.
 */
public class TableView extends ViewGroup {
    public TableView(Context context) {
        super(context);
    }

    public TableView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TableView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public TableView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }
}
