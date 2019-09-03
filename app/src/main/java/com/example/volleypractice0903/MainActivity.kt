package com.example.volleypractice0903

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IVolley {
    override fun onResponse(response: String) {
        //Show
        Toast.makeText(this@MainActivity,""+response,Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_get.setOnClickListener {
            MyVolleyRequest.getInstance(this@MainActivity, this@MainActivity)
                .getRequest("https://jsonplaceholder.typicode.com/todos/1")
        }

        btn_post.setOnClickListener {
            MyVolleyRequest.getInstance(this@MainActivity, this@MainActivity)
                .postRequest("https://jsonplaceholder.typicode.com/posts")
        }

        btn_put.setOnClickListener {
            MyVolleyRequest.getInstance(this@MainActivity, this@MainActivity)
                .putRequest("https://jsonplaceholder.typicode.com/posts/1")
        }

        btn_patch.setOnClickListener {
            MyVolleyRequest.getInstance(this@MainActivity, this@MainActivity)
                .patchRequest("https://jsonplaceholder.typicode.com/posts/1")
        }

        btn_delete.setOnClickListener {
            MyVolleyRequest.getInstance(this@MainActivity, this@MainActivity)
                .deleteRequest("https://jsonplaceholder.typicode.com/posts")
        }

        btn_image_loader.setOnClickListener {
            image_view.setImageUrl("https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwjvvNqF6bTkAhUFnKwKHYZ_B8wQjRx6BAgBEAQ&url=https%3A%2F%2Fwww.aljazeera.com%2Findepth%2Fopinion%2Fpalestinian-history-180216202248594.html&psig=AOvVaw2M3oBMPYXSeCoiANwUajSZ&ust=1567605861109811"
                    ,MyVolleyRequest.getInstance(this@MainActivity).imageLoader)
        }
    }

}
