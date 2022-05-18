package com.example.fixtures.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fixtures.Utils.loadUrl
import com.example.fixtures.databinding.ItemFixtureLayoutBinding
import com.example.fixtures.domain.models.Match
import java.text.SimpleDateFormat

class MatchAdapter: ListAdapter<Match, MatchAdapter.MatchViewHolder>(MatchDiffUtil) {

    inner class MatchViewHolder(private val viewBinding: ItemFixtureLayoutBinding): RecyclerView.ViewHolder(viewBinding.root) {

        fun bind(match: Match) {
            viewBinding.match.text = "${match.competition.name} - Matchday ${match.matchday}"
            viewBinding.awayName.text = match.awayTeam.name
            viewBinding.teamName.text = match.homeTeam.name
            /*viewBinding.awayImage.isVisible = false
            viewBinding.teamImage.isVisible = false*/

            val format = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(match.utcDate)
            viewBinding.time.text = SimpleDateFormat.getDateTimeInstance().format(format)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MatchViewHolder {
        val binding = ItemFixtureLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MatchViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MatchViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}

object MatchDiffUtil: DiffUtil.ItemCallback<Match>() {
    override fun areItemsTheSame(oldItem: Match, newItem: Match): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Match, newItem: Match): Boolean {
        return oldItem == newItem
    }
}