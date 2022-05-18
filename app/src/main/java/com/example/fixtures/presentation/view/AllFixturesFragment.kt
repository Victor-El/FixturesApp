package com.example.fixtures.presentation.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.setupWithNavController
import com.example.fixtures.R
import com.example.fixtures.databinding.FragmentAllFixturesBinding
import com.example.fixtures.presentation.adapters.MatchAdapter
import com.example.fixtures.presentation.viewmodels.FixturesViewModel

class AllFixturesFragment: Fragment(R.layout.fragment_all_fixtures) {

    private var viewBinding: FragmentAllFixturesBinding? = null

    private lateinit var adapter: MatchAdapter

    private val viewModel by activityViewModels<FixturesViewModel>()

    private val arg by navArgs<AllFixturesFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewBinding = FragmentAllFixturesBinding.bind(view)

        adapter = MatchAdapter()

        viewBinding?.let {
            it.toolbar.setupWithNavController(findNavController())
            it.matchesRecyclerView.adapter = adapter
        }

        viewModel.fixturesLiveData.observe(viewLifecycleOwner) {

            if (it.data != null && it.data.isNotEmpty()) {
                if (arg.competitionId != -1) {
                    viewBinding!!.toolbar.title = it.data.find { it.competition.id == arg.competitionId }?.competition?.name
                    adapter.submitList(it.data.filter { it.competition.id == arg.competitionId })
                    return@observe
                }
                adapter.submitList(it.data)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        viewBinding = null
    }

}