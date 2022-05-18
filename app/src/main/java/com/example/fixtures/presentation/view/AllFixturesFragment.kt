package com.example.fixtures.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.fixtures.R
import com.example.fixtures.databinding.FragmentAllFixturesBinding
import com.example.fixtures.presentation.adapters.MatchAdapter
import com.example.fixtures.presentation.viewmodels.FixturesViewModel

class AllFixturesFragment: Fragment(R.layout.fragment_all_fixtures) {

    private var viewBinding: FragmentAllFixturesBinding? = null

    private lateinit var adapter: MatchAdapter

    private val viewModel by activityViewModels<FixturesViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding = FragmentAllFixturesBinding.bind(view)

        adapter = MatchAdapter()

        viewBinding?.let {
            it.matchesRecyclerView.adapter = adapter
        }

        viewModel.fixturesLiveData.observe(viewLifecycleOwner) {
            if (it.data != null && it.data.isNotEmpty()) {
                adapter.submitList(it.data)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewBinding = null
    }

}