func solution(array []int) int {
    for i:=0; i<len(array) - 1; i++ {
        for j:=i+1; j<len(array); j++ {
            if array[i] > array[j] {
                tmp := array[i]
                array[i] = array[j]
                array[j] = tmp
            }
        }
    }
    
    return array[len(array) / 2]
}