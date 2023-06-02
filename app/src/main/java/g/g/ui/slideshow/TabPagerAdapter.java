package g.g.ui.slideshow;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import g.g.ui.slideshow.tabs.FishQuantRankFragment;
import g.g.ui.slideshow.tabs.FishTypesRankFragment;

public class TabPagerAdapter extends FragmentStateAdapter {

	private static final int NUM_TABS = 2; // Number of tabs

	public TabPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
		super(fragmentActivity);
	}

	@NonNull
	@Override
	public Fragment createFragment(int position) {
		// Return the Fragment associated with the specified position
		switch (position) {
			case 0:
				return new FishTypesRankFragment();
			case 1:
				return new FishQuantRankFragment();
			default:
				return null;
		}
	}

	@Override
	public int getItemCount() {
		// Return the number of tabs
		return NUM_TABS;
	}
}
