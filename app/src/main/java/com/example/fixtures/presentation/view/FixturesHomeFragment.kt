package com.example.fixtures.presentation.view

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.fixtures.R
import com.example.fixtures.databinding.FragmentFixturesHomeBinding
import com.example.fixtures.presentation.adapters.CompetitionAdapter
import com.example.fixtures.presentation.viewmodels.FixturesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FixturesHomeFragment: Fragment(R.layout.fragment_fixtures_home) {

    private val viewModel by activityViewModels<FixturesViewModel>()

    private var viewBinding: FragmentFixturesHomeBinding? = null

    private lateinit var adapter: CompetitionAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewBinding = FragmentFixturesHomeBinding.bind(view)

        adapter = CompetitionAdapter()
        viewBinding?.leaguesRecyclerView?.adapter = adapter

        viewModel.getFixtures().observe(viewLifecycleOwner) { viewData ->
            viewBinding?.let {
                if (viewData.data == null) {
                    if (viewData.errMsg != null) {
                        it.shimmer.isVisible = false
                        it.leaguesRecyclerView.isVisible = false
                    }
                    it.shimmer.isVisible = true
                    it.leaguesRecyclerView.isVisible = false
                } else {
                    adapter.submitList(viewData.data!!.map { it.competition }.distinct())
                    it.shimmer.isVisible = false
                    it.leaguesRecyclerView.isVisible = true
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewBinding = null
    }

}