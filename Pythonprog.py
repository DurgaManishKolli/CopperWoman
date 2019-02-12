Count = int(input('To print the even numbers upto a number, enter that number:')) 
print('The even numbers upto', Count, 'are', end = '') 
for Counter in range (0, Count+1, 1):
   if Counter % 2 == 0:
     print('', Counter, end = '') 
print('.')
