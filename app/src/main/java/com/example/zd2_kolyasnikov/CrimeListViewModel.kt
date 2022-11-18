package com.example.zd2_kolyasnikov

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    private val crimeRepository = CrimeRepository.get()
    val crimesListLiveData = crimeRepository.getCrimes()
    fun addCrime(crime: Crime) {
        crimeRepository.addCrime(crime)
    }
}