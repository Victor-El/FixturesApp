package com.example.fixtures.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.fixtures.R
import com.example.fixtures.databinding.FragmentAllFixturesBinding

class AllFixturesFragment: Fragment(R.layout.fragment_all_fixtures) {

    private var viewBinding: FragmentAllFixturesBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding = FragmentAllFixturesBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewBinding = null
    }

}