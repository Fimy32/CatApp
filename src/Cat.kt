class Cat (val name: String, var age: Int, var weight: Int) {

    public fun walk(distance: Int) : Boolean
    {
        if(weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    public fun eat(amount: Int) {
        for (i in 0..amount) {
            while (weight < 20) {
                weight += 1
            }
        }
    }

    override fun toString() : String {
        return "Name: $name Age: $age"
    }
}
