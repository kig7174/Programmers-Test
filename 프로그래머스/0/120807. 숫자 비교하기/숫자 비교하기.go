func solution(num1 int, num2 int) int {
    a := false
    if num1 == num2 {
        a = true
    }
    
    if a {
        return 1
    } else {
        return -1
    }
}