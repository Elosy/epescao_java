package g.g.ui.slideshow.tabs;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import g.g.ui.slideshow.tabs.placeholder.PlaceholderContent.PlaceholderItem;
import g.g.databinding.FragmentFishTypesRankBinding;

import java.util.List;

/**
 * {@link RecyclerView.Adapter} that can display a {@link PlaceholderItem}.
 * TODO: Replace the implementation with code for your data type.
 */
public class FishTypesRankViewAdapter extends RecyclerView.Adapter<FishTypesRankViewAdapter.ViewHolder> {

	private final List<PlaceholderItem> mValues;

	public FishTypesRankViewAdapter(List<PlaceholderItem> items) {
		mValues = items;
	}

	@Override
	public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

		return new ViewHolder(FragmentFishTypesRankBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));

	}

	@Override
	public void onBindViewHolder(final ViewHolder holder, int position) {
		holder.mItem = mValues.get(position);
		holder.mIdView.setText(mValues.get(position).id);
		holder.mContentView.setText(mValues.get(position).content);
	}

	@Override
	public int getItemCount() {
		return mValues.size();
	}

	public class ViewHolder extends RecyclerView.ViewHolder {
		public final TextView mIdView;
		public final TextView mContentView;
		public PlaceholderItem mItem;

		public ViewHolder(FragmentFishTypesRankBinding binding) { // TODO remember this
			super(binding.getRoot());
			mIdView = binding.userName;
			mContentView = binding.count;
		}

		@Override
		public String toString() {
			return super.toString() + " '" + mContentView.getText() + "'";
		}
	}
}