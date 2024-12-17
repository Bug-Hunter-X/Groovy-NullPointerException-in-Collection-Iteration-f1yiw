```groovy
def myMethod(List<Integer> numbers) {
    if (numbers != null) {
        numbers.each { number ->
            println number * 2
        }
    } else {
        println "Input list is null"
    }
}

myMethod([1, 2, 3]) // Output: 2, 4, 6
myMethod(null) // Output: Input list is null
```