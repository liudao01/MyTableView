package android.mytableview;

import android.view.View;
import android.view.ViewGroup;

/**
 * desc
 * Created by liuml.
 * Created time 2018/5/7.
 */
public interface BaseTableAdapter {
    //获取行数
    public int getRowcount();

    //获取列数
    public int getColmunCount();

    //获取item的View
    public View getView(int row, int comun, View convertView, ViewGroup parent);

    //获取宽度
    public int getWidth(int column);

    //获取高度
    public int getHeight(int row);

    //获取item的type类型
    public int getItemViewType(int row, int column);

    //获取item的所有type数量
    public int getViewTypeCount();


}
