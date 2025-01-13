func solution(num1 int, num2 int) int {
    a := float32(num1)
    b := float32(num2)
    c := float32(1000)
    return int(a / b * c)
}