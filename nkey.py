my_dict={'name':'lucky','age':18,'city':'amalapuram'}
check=input("enter the key to check:")
if check in my_dict:
	print("key '{check}' exists in the dictionary with value:{my_dict[check]}")
else:
	print("key '{check}' doesnot exist in dictionary")
