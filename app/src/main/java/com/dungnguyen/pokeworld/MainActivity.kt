package com.dungnguyen.pokeworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.MenuItem
import androidx.annotation.IdRes
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.dungnguyen.pokeworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle

    private val navController by lazy {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navHostFragment.navController
    }

    private val appBarConfiguration by lazy {
        AppBarConfiguration(
            topLevelDestinationIds = setOf(
                R.id.pokedex_fragment,
                R.id.generations_fragment,
                R.id.moves_fragment,
                R.id.machines_fragment,
                R.id.items_fragment,
                R.id.berries_fragment,
                R.id.locations_fragment,
            )
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupActionBar()
        setupNavigationDrawer()
        navigateToFragment(R.id.pokedex_fragment)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        return item.onNavDestinationSelected(navController) || super.onOptionsItemSelected(item)
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    private fun setupActionBar() {
        setSupportActionBar(binding.toolbar)
//        binding.toolbar.setupWithNavController(navController, appBarConfiguration)

        actionBarDrawerToggle = ActionBarDrawerToggle(
            this, binding.drawerLayout, R.string.nav_open, R.string.nav_close
        )

        binding.drawerLayout.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    private fun setupNavigationDrawer() {
        binding.navigationView.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_pokedex -> {
                    navigateToFragment(R.id.pokedex_fragment)
                }

                R.id.nav_generations -> {
                    navigateToFragment(R.id.generations_fragment)
                }

                R.id.nav_moves -> {
                    navigateToFragment(R.id.moves_fragment)
                }

                R.id.nav_machines -> {
                    navigateToFragment(R.id.machines_fragment)
                }

                R.id.nav_items -> {
                    navigateToFragment(R.id.items_fragment)
                }

                R.id.nav_berries -> {
                    navigateToFragment(R.id.berries_fragment)
                }

                R.id.nav_locations -> {
                    navigateToFragment(R.id.locations_fragment)
                }
            }
            closeDrawers()
            return@setNavigationItemSelectedListener true
        }
    }

    private fun navigateToFragment(@IdRes id: Int) {
        navController.navigate(id)
    }

    private fun closeDrawers() {
        binding.drawerLayout.closeDrawers()
    }
}