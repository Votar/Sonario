package com.lvs.sonario.ui.news

import android.arch.lifecycle.ViewModelProviders
import android.support.v4.widget.SwipeRefreshLayout
import com.lvs.sonario.R
import com.lvs.sonario.base.BaseActivity
import kotlinx.android.synthetic.main.activity_ico_list.*

/**
 * Created by lipchenko on 25.01.18.
 */
class IcoListActivity : BaseActivity<IcoListContract.View, IcoListViewModel>(), IcoListContract.View {

    override val mLayoutId: Int
        get() = R.layout.activity_ico_list
    override val mViewModel: IcoListViewModel
        get() = ViewModelProviders.of(this).get(IcoListViewModel::class.java)

    val mRefresh: SwipeRefreshLayout by lazy { a_ico_list_refresh }

    override fun onStart() {
        super.onStart()
        mViewModel.load()
    }

    override fun showProgress() {
        mRefresh.isRefreshing = true
    }

    override fun hideProgress() {
        mRefresh.isRefreshing = false
    }

}