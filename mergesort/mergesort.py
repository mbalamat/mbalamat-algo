def merge(a, b):
    i = 0
    j = 0
    merged = []
    for k in range(len(a + b)):
        if i < len(a) and j < len(b):
            if a[i] < b[j]:
                merged.append(a[i])
                i += 1
            else:
                merged.append(b[j])
                j += 1
        elif i >= len(a) and j < len(b):
            merged += b[j:]
            break
        else:
            merged += a[i:]
            break
    return merged

def mergeSort(a):
    n = len(a)
    if n == 1:
        return a #it is sorted
    mid = n // 2
    leftHalf = a[:mid]
    rightHalf = a[mid:]
    return merge(mergeSort(leftHalf), mergeSort(rightHalf))
