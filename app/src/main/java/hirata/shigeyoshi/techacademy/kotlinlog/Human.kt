package hirata.shigeyoshi.techacademy.kotlinlog

import android.util.Log

open class Human: Animal, Thinkable {

    // プロパティ
    var hobby: String = ""

    /* // 引数付きコンストラクタ
    constructor(hobby: String) {
        this.hobby = hobby
    } */

    // 引数付コンストラクタ
    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }

    override fun say() {
        Log.d("kotlintest", "「私の名前は" + this.name + "です。年は" + this.age + "です。")
    }


    override fun think() {
        Log.d("kotlintest", "「私は" + this.hobby + "について考える。」")
    }

}