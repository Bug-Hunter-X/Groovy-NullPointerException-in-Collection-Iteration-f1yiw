```groovy
def myMethod(List<Integer> numbers) {
    numbers.each { number ->
        println number * 2
    }
}

myMethod([1, 2, 3]) // Works fine
myMethod(null) // Throws NullPointerException
```