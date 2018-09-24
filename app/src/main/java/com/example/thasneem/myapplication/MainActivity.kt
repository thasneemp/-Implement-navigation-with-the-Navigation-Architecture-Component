package com.example.thasneem.myapplication

import android.net.Uri
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.Navigation.findNavController
import com.example.thasneem.myapplication.ui.main.BlankFragment
import com.example.thasneem.myapplication.ui.main.MainFragment

class MainActivity : AppCompatActivity(), MainFragment.OnFragmentInteractionListener, BlankFragment.OnFragmentInteractionListener{
    override fun onFragmentInteraction(uri: Uri) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }
    override fun onSupportNavigateUp()
           = findNavController(this,R.id.my_nav_host_fragment).navigateUp()
}
