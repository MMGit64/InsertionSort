def insertionSort(arr):

    for i in range(1, len(arr)):            

        indexValue = arr[i]
        j = i - 1

        while j >= 0 and indexValue < arr[j]:   #while i-1 > 0  and  arr[i] < arr[i - 1]

            arr[j + 1] = arr[j]         #Elements from arr[0,..,i-1] that are larger than 'key' are moved one position ahead
            j -= 1

        arr[j + 1] = indexValue


numList = [90, 56, 8, 73, 26]
insertionSort(numList)

for i in range(len(numList)):
    print("%d" %numList[i])
        
