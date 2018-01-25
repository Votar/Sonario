package com.lvs.sonario.ui.news

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.lvs.sonario.base.BaseViewModel

/**
 * Created by lipchenko on 25.01.18.
 */
class IcoListViewModel : BaseViewModel<IcoListContract.View>(),
        IcoListContract.ViewModel {

    val icoList: LiveData<List<Int>> = MutableLiveData<List<Int>>()

    override fun load() {

    }
}