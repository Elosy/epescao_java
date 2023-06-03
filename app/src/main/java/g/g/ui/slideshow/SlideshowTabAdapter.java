package g.g.ui.slideshow;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import g.g.ui.slideshow.tabs.FishQuantRankFragment;
import g.g.ui.slideshow.tabs.FishQuantRankViewAdapter;
import g.g.ui.slideshow.tabs.FishTypesRankFragment;
import g.g.ui.slideshow.tabs.FishTypesRankViewAdapter;
import g.g.ui.slideshow.tabs.placeholder.PlaceholderContent;

public class SlideshowTabAdapter extends FragmentStateAdapter {

	public SlideshowTabAdapter(@NonNull SlideshowFragment fragmentActivity) {
		super(fragmentActivity);
	}

	@NonNull
	@Override
	public Fragment createFragment(int position) {
		switch (position){
			// case 0 is default
			case 1: return new FishTypesRankFragment();
			default: return new FishQuantRankFragment();
		}
	}

	@Override
	public int getItemCount() {
		return 2;
	}
}
