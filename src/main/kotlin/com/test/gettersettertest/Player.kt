package com.test.gettersettertest

class Player(var age: Int, _weight: Int, _height: Int) {
    var weight = _weight
        get() {
            if(field < 0)
                return 0
            else
                return field
        }

    var height = _height
        get() {
            if(field < 0)
                return 0
            else
                return field
        }
}