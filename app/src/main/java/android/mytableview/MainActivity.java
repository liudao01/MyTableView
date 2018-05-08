package android.mytableview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

public class MainActivity extends AppCompatActivity {

    public TableView tableView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tableView = findViewById(R.id.tableview);
    }

    class MyAdapter implements BaseTableAdapter {

        @Override
        public int getRowcount() {
            return 0;
        }

        @Override
        public int getColmunCount() {
            return 0;
        }

        @Override
        public View getView(int row, int comun, View convertView, ViewGroup parent) {
            return null;
        }

        @Override
        public int getWidth(int column) {
            return 0;
        }

        @Override
        public int getHeight(int row) {
            return 0;
        }

        @Override
        public int getItemViewType(int row, int column) {
            return 0;
        }

        @Override
        public int getViewTypeCount() {
            return 0;
        }
    }
}
