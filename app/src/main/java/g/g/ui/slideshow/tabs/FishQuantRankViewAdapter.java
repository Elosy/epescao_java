package g.g.ui.slideshow.tabs;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

import g.g.R;

public class FishQuantRankViewAdapter extends RecyclerView.Adapter<FishQuantRankViewAdapter.ViewHolder> {
	private List<ListItem> TEST = Arrays.asList(new ListItem("asdasd", "12"), new ListItem("asd", "2"));

	public static class ViewHolder extends RecyclerView.ViewHolder {
		private final TextView textView;

		public ViewHolder(@NonNull View itemView) {
			super(itemView);

			textView = (TextView) itemView.findViewById(R.id.userName);
		}

		public TextView getTextView() {
			return textView;
		}
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
		holder.getTextView().setText(position);
	}

	@Override
	public int getItemCount() {
		return TEST.size();
	}
}