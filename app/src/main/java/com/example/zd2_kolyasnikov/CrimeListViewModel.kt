package com.example.zd2_kolyasnikov

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    private val crimeRerository = CrimeRepository.get()
    val crimesListLiveData = crimeRerository.getCrimes()
}