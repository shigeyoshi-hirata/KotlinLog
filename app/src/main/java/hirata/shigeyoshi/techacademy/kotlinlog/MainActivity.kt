package hirata.shigeyoshi.techacademy.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log     // ここを追加
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

           /* val dog = Dog("ポチ", 3)

            dog.move() */

            val human = Human("樋口 隆広", 29 ,"テックアカデミー")

            human.say()

            human.think()


            val human2 = Human("岡部倫太郎", 18, "平成最後の日")

            human2.say()

            human2.think()

    }
}
