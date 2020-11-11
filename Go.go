package main

import (
	"fmt"
)

func main() {
	var a, b, c int
	fmt.Scan(&a)
	fmt.Scan(&b)
	fmt.Scan(&c)
	if a > b && a > c {
		if b > c {
			fmt.Printf("%d\n", c)
			fmt.Printf("%d\n", b)
			fmt.Printf("%d\n", a)
		} else {
			fmt.Printf("%d\n", b)
			fmt.Printf("%d\n", c)
			fmt.Printf("%d\n", a)
		}
	} else if b > c && b > a {
		if a > c {
			fmt.Printf("%d\n", c)
			fmt.Printf("%d\n", a)
			fmt.Printf("%d\n", b)
		} else {
			fmt.Printf("%d\n", a)
			fmt.Printf("%d\n", c)
			fmt.Printf("%d\n", b)
		}
	} else {
		if a > b {
			fmt.Printf("%d\n", b)
			fmt.Printf("%d\n", a)
			fmt.Printf("%d\n", c)
		} else {
			fmt.Printf("%d\n", a)
			fmt.Printf("%d\n", b)
			fmt.Printf("%d\n", c)
		}
	}
	fmt.Printf("\n%d\n", a)
	fmt.Printf("%d\n", b)
	fmt.Printf("%d\n", c)
}
