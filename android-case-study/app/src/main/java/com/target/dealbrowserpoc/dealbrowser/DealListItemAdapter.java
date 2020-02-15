package com.target.dealbrowserpoc.dealbrowser;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.target.dealbrowserpoc.dealbrowser.deals.DealItem;

public class DealListItemAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<DealItem> dealItems;
    private Context context;


    public static DealListItemAdapter newInstance(Context context, List<DealItem> items) {
        return new DealListItemAdapter(context, items);
    }

    protected DealListItemAdapter(Context ctx, List<DealItem> items) {
        super();
        context = ctx;
        inflater = LayoutInflater.from(context);
        dealItems = items;
    }

    @Override
    public int getCount() {
        return dealItems.size();
    }

    @Override
    public Object getItem(int position){
        try {
            return dealItems.get(position);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder holder;
        if(convertView == null) {
            view = inflater.inflate(R.layout.deal_list_item, parent, false);
            holder = new ViewHolder();
            holder.productImage = (ImageView)view.findViewById(R.id.deal_list_item_image_view);
            holder.title = (TextView)view.findViewById(R.id.deal_list_item_title);
            holder.price = (TextView)view.findViewById(R.id.deal_list_item_price);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder)view.getTag();
        }

        DealItem dealItem = dealItems.get(position);
        holder.productImage.setImageBitmap(dealItem.getProductImage(context));
        holder.title.setText(dealItem.title);
        holder.price.setText(dealItem.salePrice);

        return view;
    }

    private class ViewHolder {
        public ImageView productImage;
        public TextView title, price;
    }
}
