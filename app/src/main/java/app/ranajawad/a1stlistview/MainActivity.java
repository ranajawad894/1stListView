package app.ranajawad.a1stlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int[] images = {R.drawable.ugoke, R.drawable.murree, R.drawable.naran};
    String[] cities = {"Ugoke", "Murree", "Naran Kaghan"};
    String[] weather = {"25° C", "17° C", "2° C"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView)findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();

        listView.setAdapter(customAdapter);

    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view = getLayoutInflater().inflate(R.layout.list_items,null);
            ImageView imageView = (ImageView)view.findViewById(R.id.imageView);
            TextView textView = (TextView)view.findViewById(R.id.textView);
            TextView textView2 = (TextView)view.findViewById(R.id.textView2);

            imageView.setImageResource(images[i]);
            textView.setText(cities[i]);
            textView2.setText(weather[i]);
            return view;
        }
    }
}