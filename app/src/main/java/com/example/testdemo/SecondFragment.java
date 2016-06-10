package com.example.testdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView.FindListener;
import android.widget.Button;

import org.jetbrains.annotations.Nullable;

public class SecondFragment extends BackHandledFragment {

	private View mView;
	private Button btnBack;

	@Override
	public View onCreateView(LayoutInflater inflater,
							 @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		mView = inflater.inflate(R.layout.fragment_second, null);
		btnBack = (Button) mView.findViewById(R.id.btnBack);
		btnBack.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				getFragmentManager().popBackStack();
			}
		});
		return mView;
	}

	@Override
	protected boolean onBackPressed() {
		return false;
	}

}
