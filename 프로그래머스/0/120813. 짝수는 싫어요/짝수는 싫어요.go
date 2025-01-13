func solution(n int) []int {
    var a []int
    
    for i := 1; i<=n; i+=2 {
        a = append(a, i)
    }
    
    return a
}