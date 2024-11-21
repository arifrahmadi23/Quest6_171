package com.example.navigationcompose.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class RencanaStudyViewModel : ViewModel(){
    private val _krsState = MutableStateFlow(RencanaStudi())
    val krsStateUi: StateFlow<RencanaStudi> = _krsState.asStateFlow()

    fun setMataKuliah(mkPilihan: String) {
        _krsState.update {stateMK -> stateMK.copy(namaMK = mkPilihan)}
    }

    fun saveDataKRS(ls: MutableList<String>){
        _krsState.update {status -> status.copy(
            namaMK = ls[0],
            kelas = ls [1]
        )
        }
    }


}