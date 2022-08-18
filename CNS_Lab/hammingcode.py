message = input("Enter the binary message: ")
print("\nConverting to hamming code...\n")
m = len(message)
s = list(message)

#var to store the no. of bits in the hamming code and r va;
bits, r = 0,0

#calculating r
while(2**r <= m+r+1):
    r+=1
    
print("Value of r obtained is r = "+ str(r))

#size of the array
bits = m+r

#array to store value of parity bits
parity = [None]*r
#array to store value parity bits while checking code
code_check = [None]*r
#array to store the individual bits of hamming code
hmcode = [None]*bits

for i in range(r):
    hmcode[bits-(2**i)] = "r"+str(2**(i))
    
it = 0
for i in range(len(hmcode)):
    if hmcode[i] == None:
        hmcode[i] = s[it]
        it+=1
print("\nPlacing the parity bits in message...")
print(hmcode)

for i in range(r):
    inc = 2**i
    print("\nTake "+str(inc)+" drop "+str(inc))
    num1 = 0
    it = 0
    for j in range(bits-inc, -1, -inc):
        if it%2 == 0:
            for k in range(inc):
                if (j-k) >= 0:
                    print(hmcode[j-k], end = "..")
                    if hmcode[j-k] == '1':
                        num1+=1
            it+=1
        else:
            it+=1
            continue
        
    #checking if the parity is even or odd
    if num1%2 == 0:
        print("\nParity is even.")
        parity[i] = "0"
    else:
        print("\nParity is odd.")
        parity[i] = "1"
    
    num1 = 0
#setting the values of parity bits      
for i in range(r):
    hmcode[bits-(2**i)] = parity[i]
 
#displaying the hamming code message 
print("\nThe hamming code obtained is: ")
print(hmcode)
print("\nChecking the code")

for i in range(r):
    inc = 2**i
    print("\nTake "+str(inc)+" drop "+str(inc))
    num1 = 0
    it = 0
    for j in range(bits-(2**i), -1, -2**i):
        if it%2 == 0:
            for k in range(2**i):
                if (j-k) >= 0:
                    print(hmcode[j-k], end = "..")
                    if hmcode[j-k] == '1':
                        num1+=1
            it+=1
        else:
            it+=1
            continue
        
    #checking if the parity is even or odd
    if num1%2 == 0:
        print("\nParity is even.")
        code_check[i] = "0"
    else:
        print("\nParity is odd.")
        code_check[i] = "1"

print("\nAfter checking, values of parity bits are: ")        
print(code_check)
for elem in code_check:
    if elem != '0':
        print("The code is incorrect!")
else:
    print("The code is correct! Hamming code message is: " , end = "")
    print("".join(hmcode))