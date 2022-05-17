package com.example.fixtures.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.fixtures.domain.models.Match
import com.example.fixtures.domain.usecases.GetFixturesUseCase
import com.example.fixtures.domain.valueobjects.ViewData
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FixturesViewModel @Inject constructor(
    private val getFixturesUseCase: GetFixturesUseCase
): ViewModel() {

    lateinit var fixturesLiveData: LiveData<ViewData<List<Match>>>

    fun getFixtures(): LiveData<ViewData<List<Match>>> {
        fixturesLiveData = getFixturesUseCase().asLiveData()
        return fixturesLiveData
    }

}