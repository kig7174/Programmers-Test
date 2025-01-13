func solution(num1 int, num2 int) int {
    a, b := float32(num1), float32(num2)
    return int(a / b * 1000)
}