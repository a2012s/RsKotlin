package com.xyz.leeeyou.zhihuribao.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.xyz.leeeyou.zhihuribao.R
import com.xyz.leeeyou.zhihuribao.utils.inflate

/**
 * ClassName: WeatherFragment
 * Description: 天气展示
 *
 * Author:      leeeyou
 * Date:        2017/4/24 13:46
 */
class WeatherFragment : BaseFragment() {
    override fun updateData() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun checkCanDoRefresh(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return container?.inflate(R.layout.fragment_weather)
    }

}