package com.example.ero.week4homework2;


import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

public class GoodsFragment extends Fragment {

    private ListAdapter adapter;
    private RecyclerView recyclerView;
    private SearchView searchView;

    public GoodsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_goods, container, false);

        recyclerView = view.findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        adapter = new ListAdapter(getContext(), UserProvider.getUserList(getContext()));
        recyclerView.setAdapter(adapter);
        setHasOptionsMenu(true);
        return view;
    }

    public void upChangeCategory(String category) {
        recyclerView.setAdapter(new ListAdapter(getActivity(), UserProvider.getListCategory(category)));
        adapter.notifyDataSetChanged();
    }

    public void upChangeLike() {
        recyclerView.setAdapter(new ListAdapter(getActivity(), UserProvider.getFavList()));
    }

    public void upChangeCart() {
        recyclerView.setAdapter(new ListAdapter(getActivity(), UserProvider.getCartList()));
    }

    public void upChangeHome() {
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        SearchManager searchManager = (SearchManager) getActivity().getSystemService(Context.SEARCH_SERVICE);
        MenuItem searchItem = menu.findItem(R.id.action_search);
        if (searchItem != null) {
            searchView = (SearchView) searchItem.getActionView();
        }
        if (searchView != null) {
            searchView.setSearchableInfo(searchManager.getSearchableInfo(getActivity().getComponentName()));
            searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                @Override
                public boolean onQueryTextSubmit(String query) {
                    return false;
                }

                @Override
                public boolean onQueryTextChange(String newText) {
                    adapter.getFilter().filter(newText);
                    return false;
                }
            });
        }
    }
}
