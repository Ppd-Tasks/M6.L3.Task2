package com.example.notesrealm.Model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Note : RealmObject {
    @PrimaryKey
    var date: String = ""
    var text: String = ""

    constructor()
    constructor(date: String, text: String) {
        this.date = date
        this.text = text
    }
}