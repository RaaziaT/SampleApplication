package com.raaziat.sampleapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.raaziat.sampleapplication.databinding.ItemViewBinding;


public class ImageViewAdapter extends RecyclerView.Adapter<ImageViewAdapter.ImageViewHolder> {

    String[] strings = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        ItemViewBinding itemViewBinding = DataBindingUtil.inflate(inflater, R.layout.item_view, parent, false);
        return new ImageViewHolder(itemViewBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.itemViewBinding.txtViewHeading.setText(strings[position]);
    }

    @Override
    public int getItemCount() {
        return strings.length;
    }

    public class ImageViewHolder extends RecyclerView.ViewHolder {

        ItemViewBinding itemViewBinding;

        public ImageViewHolder(ItemViewBinding itemViewBinding) {
            super(itemViewBinding.getRoot());
            this.itemViewBinding = itemViewBinding;
        }
    }
}
