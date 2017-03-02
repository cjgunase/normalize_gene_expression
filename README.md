# normalize_gene_expression


1. Sort data in each column independently in descending order to obtain a new sorted matrix  (somehow you have to remember their original order, you can use gene ID in first column).

2. Set each number in the same row (of sorted matrix) to the average of that row (namely the average of 12 columns in the same row)

3. Sort each column back to its original order.

4. After above procedure, each column should have the same average, and distribution.

Step 1 
for example, original data
G1       2         4     5
G2       3         2     4
G3       1         3     3

Sort each column in ascending/descending order, 
                         
G3      1       G2     2        G3     3
G1      2       G3     3        G2     4 
G2      3       G1     4        G1     5

and calculate the average of each row
                                                               Average of each row
G3      1       G2     2        G3     2                     2
G1      2       G3     3        G2     4                     3
G2      3       G1     4        G1     5                     4


Step 2
Set each number to the average of their row
G3      2       G2     2          G3     2                     
G1      3       G3     3          G2     3                     
G2      4       G1     4          G1     4                      

Step 3---sort each column back to original order to get the normalize data

G1       3         4      4
G2       4         2      3
G3       2         3      2
