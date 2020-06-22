package com.example.keytracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var chains = 0
        var aember = 0
        var keys = 0

        // Need to generate chains map here

        fun forgeKey() {
            if (aember >= 6) {
                aember -= 6
                keys += 1
            } else d("Test", "Not enough aember!")  //Add this to on screen error message later
        }

        fun unForgeKey() {
            if (keys >= 1) {
                keys -= 1
                aember += 6
            } else d("Test","No key to unforge!")  //Add this to on screen error message later
        }

        // Test data

        fun testStuff() {
            aember = 0
            keys = 0

            d("Test", "Aember: $aember")
            d("Test", "Keys: $keys")

            forgeKey()

            d("Test", "After forging:")
            d("Test", "Aember: $aember")
            d("Test", "Keys: $keys")

            unForgeKey()
            d("Test", "After unforging:")
            d("Test", "Aember: $aember")
            d("Test", "Keys: $keys")
        }
        testStuff()
    }
}
