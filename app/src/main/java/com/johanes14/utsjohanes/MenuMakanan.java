package com.johanes14.utsjohanes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MenuMakanan extends AppCompatActivity {
    String[] ListviewMenu = new String[]{
            "Nasi Goreng","Bakso","Ayam Goreng","Ayam Bakar",
            "Mie Ayam","Sate Ayam"
    };

    String[] ListviewDescription = new String[]{
            "Nasi Goreng Sedap dengan tambahan telur dan ayam suwir","Bakso kuah nikmat yang didalamnya terdapat bakso sapi dan mie",
            "Ayam Goreng Crispy yang tentunya krenyes setelah dimakan","Ayam Bakar yang diberi bumbu manis","Mie Ayam murah kualitas premium",
            "Sate Ayam khas madura dengan siraman kuah kacang"
    };

    String[] ListviewPrice = new String[]{
            "10.000","15.000",
            "10.000","14.000","15.000",
            "20.000"
    };

    int[] ListviewImages = new int[]{
            R.drawable.nasigoreng,R.drawable.bakso,
            R.drawable.ayamgoreng,R.drawable.ayambakar,R.drawable.miayam,
            R.drawable.sateayam
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);

        ListView simpleListview = (ListView) findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter();
        simpleListview.setAdapter(adapter);

        simpleListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(),ViewItem.class);
                intent.putExtra("menu", ListviewMenu[i]);
                intent.putExtra("description", ListviewDescription[i]);
                intent.putExtra("price", ListviewPrice[i]);
                intent.putExtra("image", ListviewImages[i]);

                startActivity(intent);
            }
        });
    }

    private class
    CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return ListviewImages.length;
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
            View view1 = getLayoutInflater().inflate(R.layout.list_item, null);

            TextView menu = view1.findViewById(R.id.Menu);
            TextView price = view1.findViewById(R.id.Price);
            ImageView image = view1.findViewById(R.id.Images);

            menu.setText(ListviewMenu[i]);
            price.setText(ListviewPrice[i]);
            image.setImageResource(ListviewImages[i]);

            return view1;
        }
    }
}