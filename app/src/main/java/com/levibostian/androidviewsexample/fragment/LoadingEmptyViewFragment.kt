package com.levibostian.androidviewsexample.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.levibostian.androidviewsexample.R
import com.levibostian.loadingemptyviews.extensions.getColorSupport
import com.levibostian.loadingemptyviews.widgets.EmptyView
import com.levibostian.loadingemptyviews.widgets.LoadingView
import kotlinx.android.synthetic.main.fragment_loading_empty_view.*

class LoadingEmptyViewFragment : Fragment() {

    companion object {
        fun getInstance(): LoadingEmptyViewFragment {
            return LoadingEmptyViewFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_loading_empty_view, container, false)
    }

    override fun onStart() {
        super.onStart()

        setupView()
    }

    private fun setupView() {
        show_content_view_button.setOnClickListener {
            fragment_loading_empty_view.showContentView(true)
        }
        show_empty_view_button.setOnClickListener {
            fragment_loading_empty_view.showEmptyView(true)
        }
        show_loading_view_button.setOnClickListener {
            fragment_loading_empty_view.showLoadingView(true)
        }

        (fragment_loading_empty_view.loadingView as LoadingView).loadingTextView!!.setTextColor(activity!!.getColorSupport(android.R.color.holo_red_dark))
        fragment_loading_empty_view.animationDuration = 1000
    }

}