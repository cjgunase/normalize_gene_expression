# normalize_gene_expression
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
