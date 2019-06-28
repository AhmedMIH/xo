package com.example.x0
import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.bu1
import kotlinx.android.synthetic.main.activity_main.bu2
import kotlinx.android.synthetic.main.activity_main.bu3
import kotlinx.android.synthetic.main.activity_main.bu4
import kotlinx.android.synthetic.main.activity_main.bu5
import kotlinx.android.synthetic.main.activity_main.bu6
import kotlinx.android.synthetic.main.activity_main.bu7
import kotlinx.android.synthetic.main.activity_main.bu8
import kotlinx.android.synthetic.main.activity_main.bu9
import java.util.*

import kotlin.collections.ArrayList
class MainActivity : AppCompatActivity() {
    var counplay=1
    var c1=0
    var c2=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    protected fun agan() {
        restgame()
    }
    @SuppressLint("SetTextI18n")
    protected  fun rest() {
        count11.text = Integer.toString(0)
        count22.text = Integer.toString(0)
        restgame()
        c1=0
        c2=0
    }
    protected fun stoptouch(){
        bu1.isEnabled=false
        bu2.isEnabled=false
        bu3.isEnabled=false
        bu4.isEnabled=false
        bu5.isEnabled=false
        bu6.isEnabled=false
        bu7.isEnabled=false
        bu8.isEnabled=false
        bu9.isEnabled=false
    }
    protected fun restgame() {
        bu1.setText("")
        bu1.setBackgroundResource(android.R.color.white)
        bu2.setText("")
        bu2.setBackgroundResource(android.R.color.white)
        bu3.setText("")
        bu3.setBackgroundResource(android.R.color.white)
        bu4.setText("")
        bu4.setBackgroundResource(android.R.color.white)
        bu5.setText("")
        bu5.setBackgroundResource(android.R.color.white)
        bu6.setText("")
        bu6.setBackgroundResource(android.R.color.white)
        bu7.setText("")
        bu7.setBackgroundResource(android.R.color.white)
        bu8.setText("")
        bu8.setBackgroundResource(android.R.color.white)
        bu9.setText("")
        bu9.setBackgroundResource(android.R.color.white)
        player1.clear()
        player2.clear()
        bu1.isEnabled = true
        bu2.isEnabled = true
        bu3.isEnabled = true
        bu4.isEnabled = true
        bu5.isEnabled = true
        bu6.isEnabled = true
        bu7.isEnabled = true
        bu8.isEnabled = true
        bu9.isEnabled = true
        counplay = 0
        ActivPlayer=1
    }
    protected fun buclick(view: View) {
        val sele = view as Button
        var callID = 0
        when (sele.id) {
            R.id.bu1 -> callID = 1
            R.id.bu2 -> callID = 2
            R.id.bu3 -> callID = 3
            R.id.bu4 -> callID = 4
            R.id.bu5 -> callID = 5
            R.id.bu6 -> callID = 6
            R.id.bu7 -> callID = 7
            R.id.bu8 -> callID = 8
            R.id.bu9 -> callID = 9
        }
        PlayGame(callID, sele)
        AutoPlay()

    }
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var ActivPlayer = 1
    fun PlayGame(callId: Int, sele: Button) {
        if (ActivPlayer == 1) {
            sele.text = "X"
            sele.setBackgroundResource(R.color.blue)
            player1.add(callId)
            ActivPlayer = 2
            counplay++
        } else {
            counplay++
            sele.text = "O"
            sele.setBackgroundResource(R.color.darkorange)
            player2.add(callId)
            ActivPlayer = 1
        }
        sele.isEnabled = false
        Winner()
    }
    @SuppressLint("SetTextI18n")
    fun Winner() {
        var winer = -1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winer = 1
            c1++
        }
        if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
            winer = 2
            c2++

        }
        if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
            winer = 1
            c1++
        }
        if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
            winer = 2
            c2++
        }
        if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
            winer = 1
            c1++
        }
        if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
            winer = 2
            c2++
        }
        if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
            winer = 1
            c1++
        }
        if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
            winer = 2
            c2++
        }
        if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
            winer = 1
            c1++
        }
        if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
            winer = 2
            c2++
        }
        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
            winer = 1
            c1++
        }
        if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
            winer = 2
            c2++
        }
        if (player1.contains(1) && player1.contains(5) && player1.contains(9)) {
            winer = 1
            c1++
        }
        if (player1.contains(3) && player1.contains(5) && player1.contains(7)) {
            winer = 1
            c1++
        }
        if (player2.contains(1) && player2.contains(5) && player2.contains(9)) {
            winer = 2
            c2++
        }
        if (player2.contains(3) && player2.contains(5) && player2.contains(7)) {
            winer = 2
            c2++
        }
        if (winer != -1) {
            if (winer == 1) {
                stoptouch()
                count11.text = Integer.toString(c1)
                count22.text = Integer.toString(c2)
                Toast.makeText(this, " Player 1  win the game", Toast.LENGTH_SHORT).show()
            } else if (winer==2) {
                stoptouch()
                count11.text = Integer.toString(c1)
                count22.text = Integer.toString(c2)
                Toast.makeText(this, " Player 2  win the game", Toast.LENGTH_SHORT).show()
            }
        }
        if(counplay==10 && winer==-1 ){
            stoptouch()
            count11.text = Integer.toString(c1)
            count22.text = Integer.toString(c2)
            Toast.makeText(this, "drew", Toast.LENGTH_SHORT).show()
        }

    }
    fun AutoPlay() {
        val emptyCells=ArrayList<Int>()
        for ( cellID in 1..9){

            if(!( player1.contains(cellID) || player2.contains(cellID))) {
                emptyCells.add(cellID)
            }
        }
        val r= Random()
        val randIndex=r.nextInt(emptyCells.size-1)+1
        var cellID= emptyCells[randIndex]
        val buSelect:Button?
        if(counplay<10){
            if (player1.contains(5) &&!(player1.contains(1)) && !(player2.contains(1))&&counplay!=9) {
                cellID= 1
            }
            if (player1.contains(5) && player1.contains(2) &&!(player2.contains(8))&& !(player1.contains(8))&&counplay!=9) {
                cellID = 8
            }
            if (player1.contains(5) && player1.contains(8) &&!(player2.contains(2))&& !(player1.contains(2))&&counplay!=9) {
                cellID = 2
            }
            if (player1.contains(5) && player1.contains(3) &&!(player2.contains(7))&& !(player1.contains(7))&&counplay!=9) {
                cellID = 7
            }
            if (player1.contains(5) && player1.contains(7) &&!(player2.contains(3)) && !(player1.contains(3))&&counplay!=9) {
                cellID = 3
            }
            if(player1.contains(4)&&player1.contains(6)&&!(player1.contains(5))&&!(player2.contains(5))&&counplay!=9){
                cellID=5
            }
            if (player1.contains(5) && player1.contains(4) &&!(player2.contains(6))&& !(player1.contains(6))&&counplay!=9) {
                cellID = 6
            }
            if (player1.contains(5) && player1.contains(6) &&!(player2.contains(4))&& !(player1.contains(4))&&counplay!=9) {
                cellID = 4
            }
            if (player1.contains(5) && player1.contains(9) &&!(player2.contains(3))&& !(player1.contains(3))&&counplay!=9) {
                cellID = 3
            }
            if(player1.contains(1)&&player1.contains(2)&&!(player1.contains(3))&&!(player2.contains(3))&&counplay!=9){
                cellID=3
            }
            if(player1.contains(1)&&player1.contains(3)&&!(player1.contains(2))&&!(player2.contains(2))&&counplay!=9){
                cellID=2
            }
            if(player1.contains(3)&&player1.contains(2)&&!(player1.contains(1))&&!(player2.contains(1))&&counplay!=9){
                cellID=1
            }
            if(player1.contains(1)&&player1.contains(4)&&!(player1.contains(7))&&!(player2.contains(7))&&counplay!=9){
                cellID=7
            }
            if(player1.contains(1)&&player1.contains(7)&&!(player1.contains(4))&&!(player2.contains(4))&&counplay!=9){
                cellID=4
            }
            if(player1.contains(7)&&player1.contains(4)&&!(player1.contains(1))&&!(player2.contains(1))&&counplay!=9){
                cellID=1
            }
            if(player1.contains(5)&&player1.contains(2)&&!(player1.contains(8))&&!(player2.contains(8))&&counplay!=9){
                cellID=8
            }
            if(player1.contains(8)&&player1.contains(2)&&!(player1.contains(5))&&!(player2.contains(5))&&counplay!=9){
                cellID=5
            }
            if(player1.contains(5)&&player1.contains(8)&&!(player1.contains(2))&&!(player2.contains(2))&&counplay!=9){
                cellID=2
            }
            if(player1.contains(9)&&player1.contains(6)&&!(player1.contains(3))&&!(player2.contains(3))&&counplay!=9){
                cellID=3
            }
            if(player1.contains(9)&&player1.contains(3)&&!(player1.contains(6))&&!(player2.contains(6))&&counplay!=9){
                cellID=6
            }
            if(player1.contains(3)&&player1.contains(6)&&!(player1.contains(9))&&!(player2.contains(9))&&counplay!=9){
                cellID=9
            }
            if(player1.contains(1)&&player1.contains(5)&&!(player1.contains(9))&&!(player2.contains(9))&&counplay!=9){
                cellID=9
            }
            if(player1.contains(1)&&player1.contains(9)&&!(player1.contains(6))&&!(player2.contains(6))&&counplay!=9){
                cellID=5
            }
            if(player1.contains(9)&&player1.contains(6)&&!(player1.contains(1))&&!(player2.contains(1))&&counplay!=9){
                cellID=1
            }
            if(player1.contains(3)&&player1.contains(5)&&!(player1.contains(7))&&!(player2.contains(7))&&counplay!=9){
                cellID=7
            }
            if(player1.contains(3)&&player1.contains(7)&&!(player1.contains(5))&&!(player2.contains(5))&&counplay!=9){
                cellID=5
            }
            if(player1.contains(7)&&player1.contains(5)&&!(player1.contains(3))&&!(player2.contains(3))&&counplay!=9){
                cellID=3
            }
            if(player1.contains(9)&&player1.contains(7)&&!(player1.contains(8))&&!(player2.contains(8))&&counplay!=9){
                cellID=8
            }
            if(player1.contains(9)&&player1.contains(8)&&!(player1.contains(7))&&!(player2.contains(7))&&counplay!=9){
                cellID=7
            }
        }
        if(counplay ==10 ) {
            cellID=0
            stoptouch()
        }
        when (cellID) {
            1 -> buSelect = bu1
            2 -> buSelect = bu2
            3 -> buSelect = bu3
            4 -> buSelect = bu4
            5 -> buSelect = bu5
            6 -> buSelect = bu6
            7 -> buSelect = bu7
            8 -> buSelect = bu8
            9 -> buSelect = bu9
            else -> {
                buSelect = null
            }
        }
        buSelect?.let { PlayGame(cellID, it) }
    }
}