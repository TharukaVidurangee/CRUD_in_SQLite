package com.example.sqlitedbaeroluggage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sqlitedbaeroluggage.databinding.ActivityAddTag2Binding

class AddTag : AppCompatActivity() {

    private lateinit var binding: ActivityAddTag2Binding
    private lateinit var db: TagDatabaseHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddTag2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        db = TagDatabaseHelper(this)

        binding.saveButton.setOnClickListener{
            val room = binding.roomEditText.text.toString()
            val bagtag = binding.tagEditText.text.toString()
            val tag = Tag(0, room, bagtag)
            db.insertTag(tag)
            finish()
            Toast.makeText(this, "Bag Tag saved", Toast.LENGTH_SHORT).show()
        }
    }
}