## Author

- [@Akshay G Gouda](https://github.com/akshaygouda0707)

# Time and space Complexity

### Time complexity:

Suppose,You have two laptops one is Windows Os and Mac Os.
Your running an algorithm may be linear search,sorting..etc.

```
Time taken in Windows:10s.
Time taken in Mac os:1s.
```
### What is time complexity?

You will see above example , and yuh may think like time complexity is something time taken by the computer to execute the code.You directly say Mac os has better time complexity.
But look below.
```
Time complexity != Time taken
```
## Definition 
⭐
Function that gives the relationship about how the time will grow as the input grows.

Observe the below picture,
![Logo](https://media.licdn.com/dms/image/C4E12AQHEwCVQcg9AXg/article-cover_image-shrink_720_1280/0/1636528337192?e=2147483647&v=beta&t=-WO8y0NCQ3W_kTd9l5OjuQv0_7cf6_DvybUNvloILv4)

Time complexity according to size .

```
O(1)< O(log n) < O(n) < O(n2)
```
### how to find time complexity?
* Always look for the worst case
* Target the large data
* Always ignore the less dominating Terms
```
O(3n+n^2+9)
=n^2
=O(n2)
```

## Big-O Notation

Which means it will never exceeds the time complexity upper bound.
```
O(N3)--Upper Bound
```
## Big-Omega Notation
It is the reverse of Big-O.Which means the time complexity is atleast (N3).

```
⋔(n3)
```

Q1.What if we have lower bound and Upper bound n2?
```
O(n2) &&⋔(n2)
```
We combine the both and Introduce the Theta Notation.
```
⊖(n2)
```

## Space Complexity:
* Auxiliary space is the extra space or temporary space used by an algorithm.
* Space complexityof an algorithm is total space taken by the algorithm with repsect to input size.Space complexity includes both Auxiliary space and space used by input.

Example:
```
- Merg sort- Auxiliary space O(n)
- Bubble sort - O(1).
```

Question 1:
```
for(int i=1;i<=n;i++){
    for(int j=1;j<=k;j++){
        //some operation
    }
    i=i+k;
}

```
```
//outer loop * inner loop
kt * (1+kx)

where,
x=N-1

x=N-1/k
kt *N-1/k
=t*N-1 where,t=10s
=O(N) 

```


### 2 .Types of recursion
- linear
- Devide and conqure

```
linear--> F(N)=F(N-1)+F(N-2);

Devide and conqure--> F(N)=F(N/2)+O(1);
```

## Akra Bazzi formula:
we can solve any time complexit using akrabazzi formula.

[Click here](https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/13-complexities.md)

#### Merg sort-Important
```
Time complexity- O(nlogn)
```
#### Nth fibbonacci number -Important --[Golden Ratio]
```
- Time complexity-  O(1.6180)^n
```

### formula for nth fibbonaci number
By using below formula you can easily get nth fibo number

```
return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/Math.sqrt(5));

```
- output: 0 1 1 2 3 5 8 13 21 34 55
## 🔗 Social Links
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/akshay-g-gouda-1bb424202)
[![twitter](https://img.shields.io/badge/twitter-1DA1F2?style=for-the-badge&logo=twitter&logoColor=white)](https://twitter.com/Akshayg77841279)

