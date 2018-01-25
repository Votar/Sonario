package com.lvs.sonario.ui.news

import com.lvs.sonario.base.BaseModel
import com.lvs.sonario.base.BaseView
import com.lvs.sonario.base.BaseViewModel

/**
 * Created by lipchenko on 25.01.18.
 */
interface IcoListContract {
    interface View : BaseView {
        fun showProgress()
        fun hideProgress()
    }

    interface ViewModel : BaseModel {
        fun load()
    }
}