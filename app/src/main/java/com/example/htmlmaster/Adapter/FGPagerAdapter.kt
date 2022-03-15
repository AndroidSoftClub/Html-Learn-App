package com.example.htmlmaster.Adapter

import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.PagerAdapter

class FGPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    var fragments = ArrayList<Fragment>()
    var names = ArrayList<String>()

     fun add(fragment: Fragment, name: String) {
        fragments.add(fragment)
        names.add(name)
    }

    override fun getCount() = fragments.size

    override fun getItem(position: Int) = fragments.get(position)

}