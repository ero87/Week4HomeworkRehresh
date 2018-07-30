package com.example.ero.week4homework2;

import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class InfoAdapter extends RecyclerView.Adapter<InfoAdapter.InfoViewHolder> {

    private static final String PAGER_DIALOG = "PAGER";
    public static final String BUNDLE_KEY = "bundle";
    private Context context;
    private String[] list;

    public InfoAdapter(Context context, String[] list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public InfoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        assert inflater != null;
        final View view = inflater.inflate(R.layout.info_item, parent, false);
        return new InfoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final InfoViewHolder holder, final int position) {
        Picasso.get().load(list[position]).into(holder.infoImage);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogFragment dialogFragment = new ImageDialogFragment();
                Bundle bundle = new Bundle();
                bundle.putInt(BUNDLE_KEY, position);
                dialogFragment.setArguments(bundle);
                FragmentManager fragment = ((InfoActivity) context).getFragmentManager();
                dialogFragment.setStyle(DialogFragment.STYLE_NO_TITLE, R.style.DialogFragmentTheme);
                dialogFragment.show(fragment, PAGER_DIALOG);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    public class InfoViewHolder extends RecyclerView.ViewHolder {
        private final ImageView infoImage;

        public InfoViewHolder(View itemView) {
            super(itemView);
            infoImage = itemView.findViewById(R.id.info_img_list);
        }
    }
}
