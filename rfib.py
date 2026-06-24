def fib(n):
    if n<=1:
      return n
    else:
      return (fib(n-1)+fib(n-2))
a=int(input("Terms="))
if a<=0:
	print("enter a postive number")
else:
	print("fibnocci sequence:")
	for i in range(a):
	    print(fib(i))
    
