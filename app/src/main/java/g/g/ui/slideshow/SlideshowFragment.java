package g.g.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


import g.g.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

	private FragmentSlideshowBinding binding;

	public View onCreateView(@NonNull LayoutInflater inflater,
							 ViewGroup container, Bundle savedInstanceState) {
		SlideshowViewModel slideshowViewModel =
				new ViewModelProvider(this).get(SlideshowViewModel.class);

		binding = FragmentSlideshowBinding.inflate(inflater, container, false);
		View root = binding.getRoot();

		// Get reference to the TabLayout and ViewPager2
		TabLayout tabLayout = binding.tabLayout;
		ViewPager2 viewPager = binding.viewPager;

		// Create the adapter for ViewPager2
		TabPagerAdapter pagerAdapter = new TabPagerAdapter(requireActivity());

		// Set the adapter to the ViewPager2
		viewPager.setAdapter(pagerAdapter);

		// Link the TabLayout with the ViewPager2
		new TabLayoutMediator(tabLayout, viewPager,
				(tab, position) -> tab.setText("Tab " + (position + 1))
		).attach();

		return root;
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		binding = null;
	}
}
