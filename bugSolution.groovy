```groovy
def calculate(a, b) {
  return (a ?: 0) + (b ?: 0) // Using the Elvis operator for null handling
}

println calculate(5, 3) // Output: 8
println calculate(null, 3) // Output: 3
println calculate(5, null) // Output: 5
println calculate(null, null) // Output: 0
```