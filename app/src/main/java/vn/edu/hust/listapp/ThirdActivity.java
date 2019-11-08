package vn.edu.hust.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    List<ContactModel> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        contacts = new ArrayList<>();
        contacts.add(new ContactModel("Facebook", "We noticed an unusual login from a device or location you don't usually use", R.drawable.thumb1, "10:30PM"));
        contacts.add(new ContactModel("VLane", "vLance xin gửi tới bạn 2 công việc mới nhất, được khách hàng đăng lên trong ngày hôm nay", R.drawable.thumb2, "12:30PM"));
        contacts.add(new ContactModel("Netflix", "We noticed a new sign-in with your Netflix account", R.drawable.thumb3, "13:33PM"));
        contacts.add(new ContactModel("Slideshare", "You saved Giao trinh xử lý ảnh. Follow the author and get updates on their latest content and activities. ", R.drawable.thumb4, "05:31PM"));
        contacts.add(new ContactModel("MoMo", "Đừng quên ưu đãi miễn phí nạp tiền vào Ví 3 lần/tháng từ nguồn tiền Thẻ Ghi Nợ (Visa Debit) ", R.drawable.thumb5, "00:30PM"));
        contacts.add(new ContactModel("VLane", "We noticed an unusual login from a device or location you don't usually use", R.drawable.thumb6, "10:30PM"));
        contacts.add(new ContactModel("Facebook", "vLance xin gửi tới bạn 2 công việc mới nhất, được khách hàng đăng lên trong ngày hôm nay", R.drawable.thumb7, "13:10PM"));
        contacts.add(new ContactModel("VLane", "We noticed a new sign-in with your Netflix account", R.drawable.thumb8, "10:30PM"));
        contacts.add(new ContactModel("Facebook", "vLance xin gửi tới bạn 2 công việc mới nhất, được khách hàng đăng lên trong ngày hôm nay", R.drawable.thumb9, "15:31AM"));
        contacts.add(new ContactModel("VLane", "We noticed a new sign-in with your Netflix account", R.drawable.thumb10, "06:13PM"));
        contacts.add(new ContactModel("Facebook", "We noticed an unusual login from a device or location you don't usually use", R.drawable.thumb11, "09:30PM"));
        contacts.add(new ContactModel("VLane", "We noticed a new sign-in with your Netflix account", R.drawable.thumb12, "10:30PM"));
        contacts.add(new ContactModel("User13", "vLance xin gửi tới bạn 2 công việc mới nhất, được khách hàng đăng lên trong ngày hôm nay", R.drawable.thumb13, "10:30PM"));
        contacts.add(new ContactModel("Slideshare", "We noticed an unusual login from a device or location you don't usually use", R.drawable.thumb14, "05:50PM"));
        contacts.add(new ContactModel("Facebook", "We noticed a new sign-in with your Netflix account", R.drawable.thumb15, "10:30PM"));

        ListView listView = findViewById(R.id.list_view);
        ContactAdapter adapter = new ContactAdapter(contacts, this);
        listView.setAdapter(adapter);
    }
}
