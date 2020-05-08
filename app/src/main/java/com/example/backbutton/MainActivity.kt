package com.example.backbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.findNavController
import com.example.backbutton.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // if we showing actionbar backbutton than we must be write this line
        val navController = this.findNavController(R.id.host_Fragment_Id)
        NavigationUI.setupActionBarWithNavController(this, navController)


    }
    // this the actionbar function in this line we must be write
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.host_Fragment_Id)
        return navController.navigateUp()
    }





    //this the option menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.over_flow_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId.equals(R.id.about_id)) {
            Toast.makeText(this, "Anout Clicked", Toast.LENGTH_SHORT).show()
        }
        if (item.itemId.equals(R.id.cantact_id)) {
            Toast.makeText(this, "Contact Clicked", Toast.LENGTH_SHORT).show()
        }
        if (item.itemId.equals(R.id.share_id)) {
            Toast.makeText(this, "Share Clicked", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
