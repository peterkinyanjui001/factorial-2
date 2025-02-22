EB3/61526/22

WANYOIKE PETER KINYANJUI

FACTORIAL TIME COMPLEXITY

Time Complexity Analysis of Recursive Factorial Function
Your recursive factorial function follows this pattern:

𝑓
𝑎
𝑐
𝑡
𝑜
𝑟
𝑖
𝑎
𝑙
(
𝑛
)
=
𝑛
×
𝑓
𝑎
𝑐
𝑡
𝑜
𝑟
𝑖
𝑎
𝑙
(
𝑛
−
1
)
factorial(n)=n×factorial(n−1)
This means the function makes one recursive call per decrement of n, leading to a recurrence relation:

𝑇
(
𝑛
)
=
𝑇
(
𝑛
−
1
)
+
𝑂
(
1
)
T(n)=T(n−1)+O(1)
Expanding this:

𝑇
(
𝑛
)
=
𝑇
(
𝑛
−
1
)
+
𝑂
(
1
)
T(n)=T(n−1)+O(1)
𝑇
(
𝑛
−
1
)
=
𝑇
(
𝑛
−
2
)
+
𝑂
(
1
)
T(n−1)=T(n−2)+O(1)
𝑇
(
𝑛
−
2
)
=
𝑇
(
𝑛
−
3
)
+
𝑂
(
1
)
T(n−2)=T(n−3)+O(1)
Repeating this process:

𝑇
(
𝑛
)
=
𝑂
(
1
)
+
𝑂
(
1
)
+
.
.
.
+
𝑂
(
1
)
(n times)
T(n)=O(1)+O(1)+...+O(1)(n times)
Thus, the time complexity is O(n). 

FIBONACCI TIME COMPLEXITY

Your Fibonacci function follows the recursive definition:

𝐹
(
𝑛
)
=
𝐹
(
𝑛
−
1
)
+
𝐹
(
𝑛
−
2
)
F(n)=F(n−1)+F(n−2)
This creates a binary recursion tree, where each call branches into two subproblems. The recurrence relation for time complexity is:

𝑇
(
𝑛
)
=
𝑇
(
𝑛
−
1
)
+
𝑇
(
𝑛
−
2
)
+
𝑂
(
1
)
T(n)=T(n−1)+T(n−2)+O(1)
This forms an exponential growth pattern, leading to:

𝑇
(
𝑛
)
=
𝑂
(
2
𝑛
)
T(n)=O(2 
n
 )
✅ Time Complexity: O(2ⁿ) (Exponential time, very slow for large n)
