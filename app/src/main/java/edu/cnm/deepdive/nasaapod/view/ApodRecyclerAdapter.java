package edu.cnm.deepdive.nasaapod.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import edu.cnm.deepdive.nasaapod.R;
import edu.cnm.deepdive.nasaapod.model.pojo.ApodWithStats;
import edu.cnm.deepdive.nasaapod.view.ApodRecyclerAdapter.Holder;
import java.util.List;

public class ApodRecyclerAdapter extends RecyclerView.Adapter<Holder> {

  private final Context context;
  private final List<ApodWithStats> apods;

  public ApodRecyclerAdapter(Context context,
      List<ApodWithStats> apods) {
    this.context = context;
    this.apods = apods;
  }


  @NonNull
  @Override
  // hold this ViewHolder object and get it set up
  public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view = LayoutInflater.from(context).inflate(R.layout.item_apod, parent, false);
    return new Holder(view);
  }

  @Override
  // lines up different things and puts them in holders
  public void onBindViewHolder(@NonNull Holder holder, int position) {
    ApodWithStats apod = apods.get(position);
    holder.bind(position, apod);
  }

  @Override
  // checks how many items there are to display total
  public int getItemCount() {
    return apods.size();
  }

  class Holder extends RecyclerView.ViewHolder{

    public Holder(@NonNull View itemView) {
      super(itemView);
    }

    private void bind(int position, ApodWithStats apod) {


    }

  }

}
