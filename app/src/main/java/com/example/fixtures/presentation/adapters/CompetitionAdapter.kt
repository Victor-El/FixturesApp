package com.example.fixtures.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.fixtures.Utils.loadUrl
import com.example.fixtures.databinding.ItemLeagueLayoutBinding
import com.example.fixtures.domain.models.Competition

class CompetitionAdapter: ListAdapter<Competition, CompetitionAdapter.CompetitionViewHolder>(CompetitionDiffUtil) {

    inner class CompetitionViewHolder(private val viewBinding: ItemLeagueLayoutBinding): RecyclerView.ViewHolder(viewBinding.root) {

        fun bind(competition: Competition) {
            viewBinding.let {
                it.competitionImage.loadUrl(competition.area.ensignUrl)
                it.competitionName.text = competition.name
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CompetitionViewHolder {
        val binding = ItemLeagueLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CompetitionViewHolder((binding))
    }

    override fun onBindViewHolder(holder: CompetitionViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

}

object CompetitionDiffUtil: DiffUtil.ItemCallback<Competition>() {
    override fun areItemsTheSame(oldItem: Competition, newItem: Competition): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Competition, newItem: Competition): Boolean {
        return oldItem == newItem
    }

}