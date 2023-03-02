package com.example.imageslider

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager


class MainActivity : AppCompatActivity() {
    // creating object of ViewPager
    var mViewPager: ViewPager? = null

    // images array
    var images = intArrayOf(
        R.drawable.cr, R.drawable.cr2, R.drawable.cr3, R.drawable.mes,
        R.drawable.mes3, R.drawable.mes4, R.drawable.mes2, R.drawable.rolls
    )

    // Creating Object of ViewPagerAdapter
    private var ViewPagerAdapter: ViewPagerAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initializing the ViewPager Object
        mViewPager = findViewById<View>(R.id.viewPagerMain) as ViewPager

        // Initializing the ViewPagerAdapter
        ViewPagerAdapter = ViewPagerAdapter(this@MainActivity, images)

        // Adding the Adapter to the ViewPager
        mViewPager!!.adapter = ViewPagerAdapter
    }
}
