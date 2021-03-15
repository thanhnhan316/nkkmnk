package com.example.calendar_lich;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView txvCalendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvCalendar = (TextView) findViewById(R.id.textCalendar);

        //chọn thư viện java.util
        //ngày tháng năm giờ...
        Calendar calendar = Calendar.getInstance();

        //cách 1
        //append có công dụng dư settext nhưng append có lưu lại khi chạy lần sau
          txvCalendar.append(calendar.getTime()+"\n");
//        txvCalendar.append("Ngày  :"+calendar.get(calendar.DATE)+"\n");
//        txvCalendar.append("Tháng :"+(calendar.get(calendar.MONTH)+1)+"\n");
//        txvCalendar.append("Năm   :"+calendar.get(calendar.YEAR)+"\n");

        //cách 2(Nhanh hơn)
        txvCalendar.append("Thứ: "+calendar.get(calendar.DAY_OF_WEEK)+"\n");

        SimpleDateFormat dinhdangngay = new SimpleDateFormat("dd/MM/yyyy");
        txvCalendar.append("Ngày tháng: "+dinhdangngay.format(calendar.getTime())+"\n");

        SimpleDateFormat dinhdanggio  = new SimpleDateFormat("hh:mm:ss a    ");
        txvCalendar.append("Giờ :"+dinhdanggio.format(calendar.getTime())+"\n");

    }
}