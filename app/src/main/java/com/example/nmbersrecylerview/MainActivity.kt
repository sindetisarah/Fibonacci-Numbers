package com.example.nmbersrecylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fibonacci(100)


    }
    fun fibonacci(maxNumber:Int):MutableList<Int>{
        var count=0;
        var firstNumber=0
        var secondNumber=1
        var sum = 0
        var fibNumbers= mutableListOf<Int>()

        while(count<=maxNumber){
            println(firstNumber)
            sum = firstNumber + secondNumber
            firstNumber = secondNumber
            secondNumber = sum
            count ++
            fibNumbers.plus(firstNumber)
        }
        return fibNumbers
        var rvNumbers=findViewById<RecyclerView>(R.id.rvNumbers)

        rvNumbers.layoutManager=
            LinearLayoutManager(baseContext,)
        var numbersAdapter=NumbersRecyclerViewAdapter(fibNumbers)
        rvNumbers.adapter=numbersAdapter

    }
    }
