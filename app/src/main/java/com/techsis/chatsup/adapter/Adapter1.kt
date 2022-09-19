package com.techsis.chatsup.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.techsis.chatsup.fragment.CollgsFragment
import com.techsis.chatsup.fragment.FamilyFragment
import com.techsis.chatsup.fragment.FriendsFragment

class Adapter1(fm: FragmentManager, lf: Lifecycle): FragmentStateAdapter(fm, lf){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> return FamilyFragment()
            1 -> return FriendsFragment()
            2 -> return CollgsFragment()

            else -> FamilyFragment()
        }

    }
}