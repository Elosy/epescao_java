package g.g.ui.slideshow.tabs;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import g.g.R;
import g.g.ui.slideshow.tabs.placeholder.PlaceholderContent.PlaceholderItem;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class FishQuantRankViewAdapter extends RecyclerView.Adapter<FishQuantRankViewAdapter.ViewHolder> {

	public String [] localDataSet;

	public static class ViewHolder extends RecyclerView.ViewHolder{
		private final TextView textView;


		public ViewHolder(@NonNull View itemView) {
			super(itemView);

			textView = (TextView) itemView.findViewById(R.id.userName);
		}

		public TextView getTextView(){
			return textView;
		}
	}

	public void CustomAdapter(String [] dataSet){
		localDataSet = dataSet;
	}

	@NonNull
	@Override
	public FishQuantRankViewAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
		View view = LayoutInflater.from(parent.getContext())
				.inflate(R.layout.fragment_fish_quant_rank, parent, false);
		return new ViewHolder(view);
	}

	@Override
	public void onBindViewHolder(@NonNull FishQuantRankViewAdapter.ViewHolder holder, int position) {
		holder.getTextView().setText(localDataSet[position]);
	}

	@Override
	public int getItemCount() {
		return localDataSet.length;
	}
}