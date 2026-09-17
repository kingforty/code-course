def search(x, orderedList, l, r):
    if r >= l:
        mid = l + (r - l) // 2
        if orderedList[mid] == x:
            return mid
        if orderedList[mid] > x:
            return search(x, orderedList, l, mid - 1)
        return search(x, orderedList, mid + 1, r)
    return -1

def checker(v,orderedList):
    r = []
    for i in v:
        r.append(search(i,orderedList,0,len(orderedList)))
    return r

orderedList = [8,10,18,23,56,79]
v = [5,8,55,79,56]
result = checker(v,orderedList)
print(result)


