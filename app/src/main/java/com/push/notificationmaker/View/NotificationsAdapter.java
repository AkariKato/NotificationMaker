package com.push.notificationmaker.View;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Switch;
import android.widget.TextView;

import com.push.notificationmaker.Model.Notification;
import com.push.notificationmaker.R;

import java.util.Calendar;
import java.util.List;

/**
 * Created by Akari Kato on 2017/10/21.
 */

public class NotificationsAdapter extends ArrayAdapter{

    Context context;
    private LayoutInflater layoutInflater;



    public NotificationsAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List objects) {
        super(context, resource, objects);
        this.context = context;
        this.layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(final int position, View v, ViewGroup parent) {

        v = layoutInflater.inflate(R.layout.item_notification, null);
        final Notification item = (Notification) getItem(position);

        TextView time = (TextView) v.findViewById(R.id.time);
        time.setText(item.getTime().get(Calendar.HOUR_OF_DAY)+":"+item.getTime().get(Calendar.MINUTE));

        TextView title = (TextView) v.findViewById(R.id.title);
        title.setText(item.getTitle());

        TextView body = (TextView) v.findViewById(R.id.body);
        body.setText(item.getBody());

        Switch isOn = (Switch) v.findViewById(R.id.is_on);
        isOn.setChecked(item.isOn());

        return v;
    }


}
