package main

import (
	"fmt"
)

func main() {
	var a [101]int
	var max, index, i int
	for i = 1; i <= 100; i++ {
		fmt.Scan(&a[i])
	}
	max = a[1]
	index = 1
	for i = 2; i <= 100; i++ {
		if a[i] > max {
			max = a[i]
			index = i
		}
	}
	fmt.Printf("%d\n", max)
	fmt.Printf("%d\n", index)
}
