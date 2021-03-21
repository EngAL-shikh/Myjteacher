package com.example.myteacher;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BookRVAdapter extends RecyclerView.Adapter<BookRVAdapter.StudentViewHolder> {
    private ArrayList<book> books;

    public BookRVAdapter(ArrayList<book> books) {
        this.books = books;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_item_book, null, false);
        StudentViewHolder studentViewHolder= new StudentViewHolder(view);
        return studentViewHolder;


    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        book b=books.get(position);
        holder.textView.setText(b.getTitle());
    }

    @Override
    public int getItemCount() {
        return books.size();
    }


    class StudentViewHolder extends RecyclerView.ViewHolder {
        book s;
        TextView textView;

        public StudentViewHolder(@NonNull final View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.custom_tv_title);
        }
    }
}
