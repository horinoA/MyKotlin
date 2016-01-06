package com.example.horinoa.mykotlin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by horinoA on 2016/01/06.
 */
public class MyListAdapter extends ArrayAdapter<Forecast> {

    public MyListAdapter(Context context,  List<Forecast> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Forecast item = getItem(position);
        ViewHolder holder ;

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.listrow, null);
            holder = new ViewHolder();
            holder.title =  (TextView)convertView.findViewById(R.id.title);
            holder.txt = (TextView)convertView.findViewById(R.id.txt);
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)convertView.getTag();
        }

        holder.title.setText((CharSequence) item.getDateLabel());
        holder.txt.setText(item.getTelop());
        return convertView;
    }

    private static class ViewHolder{
        TextView title;
        TextView txt;
    }


}
