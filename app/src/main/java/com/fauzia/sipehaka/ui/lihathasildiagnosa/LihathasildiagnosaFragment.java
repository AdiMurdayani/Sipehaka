package com.fauzia.sipehaka.ui.lihathasildiagnosa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.fauzia.sipehaka.R;

public class LihathasildiagnosaFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_lihathasildiagnosa, container, false);
        final TextView textView = root.findViewById(R.id.textlihathasildiagnosa);

        return root;
    }
}
