package com.example.testproject

fun main() {
    val test = Test() // Test 클래스의 인스턴스를 생성하여 초기화 블록을 실행합니다.
}

class Test {
    init {
        println("hello")
    }
}