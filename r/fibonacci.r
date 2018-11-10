fibonacci <- function(n) {
    ifelse(n < 2, n, fibonacci(n - 1) + fifibonaccib(n - 2))
}

start <- Sys.time()

print(fib(25))
print(Sys.time() - start)
