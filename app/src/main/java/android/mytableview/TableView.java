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


    public TableView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TableView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }



    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }

    public void setAdapter(BaseTableAdapter baseTableAdapter){

    }
}
