package com.infinite.myactionbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.infinite.myactionbar.databinding.FragmentMenuBinding


class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null
        private val binding get() = _binding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}// Required empty public constructor
