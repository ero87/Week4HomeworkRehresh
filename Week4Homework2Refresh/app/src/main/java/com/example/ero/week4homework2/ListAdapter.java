package com.example.ero.week4homework2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ListViewHolder> implements Filterable {

    private Context context;
    private List<ListModel> modelList;
    private List<ListModel> listFiltered;

    public ListAdapter(Context context, List<ListModel> modelList) {
        this.context = context;
        this.modelList = modelList;
        this.listFiltered = modelList;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        final View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter.ListViewHolder holder, final int position) {
        final ListModel model = listFiltered.get(position);
        holder.title.setText(model.getTitle());
        Picasso.get().load(model.getImageUrl()[0]).into(holder.image);
        holder.ratingBar.setRating(model.getRating());
        holder.ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                model.getRating();
                model.setRating(holder.ratingBar.getNumStars());
            }
        });

        if (listFiltered.get(position).isLiked) {
            holder.like.setImageResource(R.drawable.ic_fav24dp);
        }
        if (listFiltered.get(position).isToBasked) {
            holder.cart.setImageResource(R.drawable.ic_shopping_cart);
        }
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < UserProvider.list.size(); i++) {
                    if (UserProvider.list.get(i).getTitle().equals(listFiltered.get(position).getTitle())) {
                        UserProvider.position = i;
                    }
                }
                Intent intent = new Intent(context, InfoActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listFiltered.size();
    }

    public Filter getFilter() {
        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence constraint) {
                String chatString = constraint.toString();
                if (chatString.isEmpty()) {
                    listFiltered = modelList;
                } else {
                    List<ListModel> filteredList = new ArrayList<>();
                    for (ListModel row : modelList) {
                        if (row.getTitle().toLowerCase().contains(chatString.toLowerCase())) {
                            filteredList.add(row);
                        }
                    }
                    listFiltered = filteredList;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = listFiltered;
                filterResults.count = listFiltered.size();
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence constraint, FilterResults results) {
                listFiltered = (ArrayList<ListModel>) results.values;
                notifyDataSetChanged();
            }
        };
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        private final TextView title;
        private final ImageView image;
        private final RatingBar ratingBar;
        private final ImageButton cart;
        private final ImageButton like;

        public ListViewHolder(View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title);
            image = itemView.findViewById(R.id.my_image);
            ratingBar = itemView.findViewById(R.id.rating);
            cart = itemView.findViewById(R.id.cart);
            like = itemView.findViewById(R.id.favorite);
            likeListener();
            cartListener();
        }

        private void cartListener() {
            cart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!listFiltered.get(getAdapterPosition()).isToBasked()) {
                        cart.setImageResource(R.drawable.ic_shopping_cart);
                        UserProvider.list.get(getAdapterPosition()).setToBasked(true);
                    } else {
                        cart.setImageResource(R.drawable.ic_add_cart);
                        UserProvider.list.get(getAdapterPosition()).setToBasked(false);
                    }
                }
            });
        }

        private void likeListener() {
            like.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!listFiltered.get(getAdapterPosition()).isLiked()) {
                        like.setImageResource(R.drawable.ic_fav24dp);
                        UserProvider.list.get(getAdapterPosition()).setLiked(true);
                        ratingBar.setRating(5f);
                    } else {
                        like.setImageResource(R.drawable.ic_favorite);
                        UserProvider.list.get(getAdapterPosition()).setLiked(false);
                    }
                }
            });
        }
    }
}
