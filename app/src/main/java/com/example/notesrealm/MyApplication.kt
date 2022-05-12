package com.example.notesrealm

import android.app.Application
import com.example.notesrealm.Manager.RealmManager
import com.example.notesrealm.Model.Note
import io.realm.Realm
import io.realm.RealmConfiguration

class MyApplication : Application() {
    companion object {
        var instance: MyApplication? = null
        var notes = ArrayList<Note>()
    }

    override fun onCreate() {
        super.onCreate()
        initRealm()

    }

    fun initRealm() {
        Realm.init(this)
        val config = RealmConfiguration.Builder()
            .allowWritesOnUiThread(true)
            .deleteRealmIfMigrationNeeded()
            .build()
        Realm.setDefaultConfiguration(config)
        notes= RealmManager.instance!!.loadNote()
    }
}