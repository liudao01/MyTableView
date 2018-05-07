package android.mytableview;

import android.view.View;

import java.util.Stack;

/**
 * @author liuml
 * @explain item view的回收池
 * @time 2018/5/7 16:52
 */

public class Recycler {
    //栈
    private Stack<View> [] views;
    //打造一个回收池
    public  Recycler(int type){
        views = new Stack[type];
        for (int i = 0; i < type; i++) {
            views[i] = new Stack<View>();
        }
    }
    //入栈
    public void addRecycledView(View view,int type){

    }

    public View getRecycledView(int type){
        try{
            return views[type].pop();
        }catch (Exception e){
            return null;
        }
    }



}
