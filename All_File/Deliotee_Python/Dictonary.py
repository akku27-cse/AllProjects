info={
    "name":"deya",
    "age":20,
    "sub":("music","English"),
    "is_adutl":True,
    "hobbies":["dance","singing","reading"]
}
print(info)
'''
Points:
*.this is muteable,
*.It is pair of key and avalue
key cannot be a List
Key use only one


'''
info["age"]=21

print(info);


'''  key as a dictonary'''
detais={
    "name":"santu",
    "fullName":{
"firstName":"Santu",
"lastName":"Jana"
    },
    "age":23
}
print(detais["fullName"])

print(info.values())
print("return all apri as a toubple")
print(info.items())