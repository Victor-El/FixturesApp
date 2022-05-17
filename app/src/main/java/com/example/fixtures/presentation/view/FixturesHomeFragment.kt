package com.example.fixtures.presentation.view

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.fixtures.R
import com.example.fixtures.databinding.FragmentFixturesHomeBinding
import com.example.fixtures.presentation.viewmodels.FixturesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FixturesHomeFragment: Fragment(R.layout.fragment_fixtures_home) {

    private val viewModel by activityViewModels<FixturesViewModel>()

    private var viewBinding: FragmentFixturesHomeBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding = FragmentFixturesHomeBinding.bind(view)

        viewModel.getFixtures().observe(viewLifecycleOwner) {
            Toast.makeText(requireContext(), "$it", Toast.LENGTH_SHORT).show()
            Log.d("DATA_LOG", it.toString())
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewBinding = null
    }

}