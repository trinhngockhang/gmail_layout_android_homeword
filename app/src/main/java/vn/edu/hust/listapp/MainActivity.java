package vn.edu.hust.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String[] items = {"Data-1", "Data-2", "Data-3", "Data-4", "Data-5",
            "Data-3", "Data-7", "Data-8", "Data-9", "Data-10", "Data-11",
            "Data-12", "Data-13", "Data-14", "Data-15"};

    Integer[] thumbs = { R.drawable.thumb1, R.drawable.thumb2, R.drawable.thumb3,
            R.drawable.thumb4, R.drawable.thumb5, R.drawable.thumb6,
            R.drawable.thumb7, R.drawable.thumb8, R.drawable.thumb9,
            R.drawable.thumb10, R.drawable.thumb11, R.drawable.thumb12,
            R.drawable.thumb13, R.drawable.thumb14, R.drawable.thumb15 };

    Integer[] walls = { R.drawable.wall1, R.drawable.wall2, R.drawable.wall3,
            R.drawable.wall4, R.drawable.wall5, R.drawable.wall6,
            R.drawable.wall7, R.drawable.wall8, R.drawable.wall9,
            R.drawable.wall10, R.drawable.wall11, R.drawable.wall12,
            R.drawable.wall13, R.drawable.wall14, R.drawable.wall15 };

    ImageView imageLarge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageLarge = findViewById(R.id.image_large);

        LinearLayout contentLayout = findViewById(R.id.content_layout);
        for (int i = 0; i < items.length; i++)
        {
            View viewItem = getLayoutInflater().inflate(R.layout.layout_item_1, null);
            ImageView imageThumbnail = viewItem.findViewById(R.id.image_thumbnail);
            TextView textCaption = viewItem.findViewById(R.id.text_caption);

            viewItem.setId(i);

            imageThumbnail.setImageResource(thumbs[i]);
            textCaption.setText(items[i]);

            contentLayout.addView(viewItem);

            viewItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int i = view.getId();
                    imageLarge.setImageResource(walls[i]);
                }
            });
        }

    }
}
