package com.example.testbottomnavigationbar

import android.content.Context
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.transition.Transition
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.action_recents -> Toast.makeText(this, "Recents", Toast.LENGTH_SHORT).show()
                R.id.action_favorites -> Toast.makeText(this, "Favourites", Toast.LENGTH_SHORT).show()
                R.id.action_nearby -> Toast.makeText(this, "Nearby", Toast.LENGTH_SHORT).show()
            }
            return@setOnNavigationItemSelectedListener true
        }
    }

    override fun onResume() {
        super.onResume()

        /**
         * Set the background color of Bottom Navigation Bar
         */
        bottom_navigation.setItemBackgroundResource(R.color.colorRed)

        val imagePath = "https://www.metoffice.gov.uk/binaries/content/gallery/metofficegovuk/hero-images/weather/cloud/cumulus-cloud.jpg"


        /**
         * Set the background photo, downloaded from URL, of Bottom Navigation Bar
         */
//        Glide.with(this)
//                .asBitmap()
//                .load(imagePath)
//                .into(object : CustomTarget<Bitmap>(){
//                    override fun onResourceReady(bitmap: Bitmap, transition: Transition<in Bitmap>?) {
//                        bottom_navigation.itemBackground = BitmapDrawable(this@MainActivity.resources, bitmap)
//                    }
//                    override fun onLoadCleared(placeholder: Drawable?) {
//                        // this is called when imageView is cleared on lifecycle call or for
//                        // some other reason.
//                        // if you are referencing the bitmap somewhere else too other than this imageView
//                        // clear it here as you can no longer have the bitmap
//                    }
//                })
    }
}