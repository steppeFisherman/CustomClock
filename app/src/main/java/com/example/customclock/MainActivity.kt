package com.example.customclock

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.example.customclock.databinding.ActivityMainBinding
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var destinationChangedListener: NavigationBarView.OnItemSelectedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navController = navHostFragment.navController
        // Make app bar display the label of current fragment
        val builder = AppBarConfiguration.Builder(
            R.id.mainFragment,
            R.id.templateFragment
        )
        val appBarConfiguration = builder.build()
        toolbar.setupWithNavController(navController, appBarConfiguration)

        supportActionBar?.title = navController.currentDestination?.label

        setBottomNavAnimation()
    }

    private fun setBottomNavAnimation() {

        binding.bottomNav.setupWithNavController(navController)
        binding.bottomNav.itemIconTintList = null

        val options = NavOptions.Builder()
            .setLaunchSingleTop(true)
            .setEnterAnim(R.anim.from_right)
            .setExitAnim(R.anim.to_right)
            .setPopEnterAnim(R.anim.from_left)
            .setPopExitAnim(R.anim.to_right)
            .setPopUpTo(R.id.nav_graph, inclusive = true, saveState = false)
            .build()

        destinationChangedListener = NavigationBarView.OnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.mainFragment -> {
                    navController.navigate(R.id.mainFragment, null, options)
                }

                R.id.templateFragment -> {
                    navController.navigate(R.id.templateFragment, null, options)
                }
            }
            true
        }

        binding.bottomNav.setOnItemSelectedListener(destinationChangedListener)
        binding.bottomNav.setOnItemReselectedListener { return@setOnItemReselectedListener }
    }
}