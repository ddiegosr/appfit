package com.uespi.appfit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.uespi.appfit.R;
import com.uespi.appfit.classes.Instructor;

import java.util.List;

public class InstructorAdapter extends RecyclerView.Adapter<InstructorAdapter.InstructorViewHolder> {

    private List<Instructor> instructors;
    private Context context;

    public InstructorAdapter(List<Instructor> instructors) {
        this.instructors = instructors;
    }

    @NonNull
    @Override
    public InstructorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        context = parent.getContext();
        View v = LayoutInflater.from(context).inflate(R.layout.instructor_item, parent, false);
        InstructorViewHolder ivh = new InstructorViewHolder(v);
        return ivh;
    }

    @Override
    public void onBindViewHolder(@NonNull InstructorViewHolder holder, int position) {
        holder.txtName.setText(instructors.get(position).getName());
        holder.txtDescription.setText(instructors.get(position).getDescription());
        holder.imgPhoto.setImageResource(instructors.get(position).getPhoto());
    }

    @Override
    public int getItemCount() {
        return instructors.size();
    }

    public class InstructorViewHolder extends RecyclerView.ViewHolder {
        private TextView txtName;
        private TextView txtDescription;
        private ImageView imgPhoto;
        private ConstraintLayout clInstructor;

        InstructorViewHolder(View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtDescription = itemView.findViewById(R.id.txtDescription);
            imgPhoto = itemView.findViewById(R.id.imgPhoto);
            clInstructor = itemView.findViewById(R.id.clInstructor);

            clInstructor.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int itemIndex = getLayoutPosition();
                    Instructor item = instructors.get(itemIndex);
                    Toast.makeText(context, item.getName(), Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
