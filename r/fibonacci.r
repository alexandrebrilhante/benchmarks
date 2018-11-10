fibonacci <- function(n) {
    ifelse(n < 2, n, fibonacci(n - 1) + fibonacci(n - 2))
}

start <- Sys.time()

print(fibonacci(25))
print(Sys.time() - start)
