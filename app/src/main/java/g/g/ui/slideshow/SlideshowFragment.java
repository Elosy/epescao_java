package g.g.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


import g.g.R;
import g.g.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

	private FragmentSlideshowBinding binding;
	private TabLayout tabLayout;
	private ViewPager2 viewPager2;
	SlideshowTabAdapter slideshowTabAdapter;

	public View onCreateView(@NonNull LayoutInflater inflater,
							 ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_slideshow, container, false);;
		tabLayout = view.findViewById(R.id.tabLayout);
		viewPager2 = view.findViewById(R.id.viewPager);
		slideshowTabAdapter = new SlideshowTabAdapter(this);
		viewPager2.setAdapter(slideshowTabAdapter);
		tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
			@Override
			public void onTabSelected(TabLayout.Tab tab) {
				viewPager2.setCurrentItem(tab.getPosition());
			}

			@Override
			public void onTabUnselected(TabLayout.Tab tab) {

			}

			@Override
			public void onTabReselected(TabLayout.Tab tab) {

			}
		});

		viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
			@Override
			public void onPageSelected(int position) {
				super.onPageSelected(position); // todo video at 10:39
				tabLayout.getTabAt(position).select();
			}
		});

		binding = FragmentSlideshowBinding.inflate(inflater, container, false);

		return view;
	}

	@Override
	public void onDestroyView() {
		super.onDestroyView();
		binding = null;
	}
}
