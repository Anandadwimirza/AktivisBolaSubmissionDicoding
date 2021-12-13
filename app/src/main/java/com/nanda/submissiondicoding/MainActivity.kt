package com.nanda.submissiondicoding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.nanda.submissiondicoding.Club.Club
import com.nanda.submissiondicoding.Club.ClubsData
import com.nanda.submissiondicoding.adapter.ListClubAdapter
import com.nanda.submissiondicoding.activity.AccountFragment

class MainActivity : AppCompatActivity() {

    private lateinit var rvClubs: RecyclerView
    private val list: ArrayList<Club> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvClubs= findViewById(R.id.rv_clubs)
        rvClubs.setHasFixedSize(true)

        list.addAll(ClubsData.listData)
        showRecyclerList()


    }

    private fun showRecyclerList() {
        rvClubs.layoutManager = LinearLayoutManager(this)
        val listClubAdapter = ListClubAdapter(list)
        rvClubs.adapter = listClubAdapter
    }




override fun onCreateOptionsMenu(menu: Menu): Boolean {
    menuInflater.inflate(R.menu.menu_main, menu)
    return super.onCreateOptionsMenu(menu)
}

override fun onOptionsItemSelected(item: MenuItem): Boolean {
    setMode(item.itemId)
    return super.onOptionsItemSelected(item)
}

private fun setMode(selectedMode: Int) {
    when (selectedMode) {

        R.id.action_about -> {
            val about = Intent(this@MainActivity, AccountFragment::class.java)
            startActivity(about)
        }

      }
    }
}