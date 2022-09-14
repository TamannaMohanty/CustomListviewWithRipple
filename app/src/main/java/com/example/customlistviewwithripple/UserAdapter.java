package com.example.customlistviewwithripple;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends BaseAdapter {

    Context context;
    List<UserPojo> userpojoList=new ArrayList<>();
    LayoutInflater layoutInflater;

    public UserAdapter(Context context,List<UserPojo> userpojoList){
        this.context=context;
        this.userpojoList=userpojoList;
        layoutInflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return userpojoList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View root=layoutInflater.inflate(R.layout.custom_user,null);
        ImageView imageView=root.findViewById(R.id.image_img);
        TextView countries=root.findViewById(R.id.countries_txt);
        TextView capital=root.findViewById(R.id.capital_txt);


        countries.setText(userpojoList.get(i).getCountries());
        capital.setText(userpojoList.get(i).getCapital());


        imageView.setImageResource(userpojoList.get(i).getImage());
        return root;
    }
}
