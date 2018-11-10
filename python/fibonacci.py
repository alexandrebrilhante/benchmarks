import time

def fibonacci(n):
    return n if n < 2 else fibonacci(n-1) + fibonacci(n-2)

start = time.time()

print(fibonacci(25))
print(time.time() - start)
