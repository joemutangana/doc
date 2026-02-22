scores=[] 
sum=0
for i in range(5):
    score = float(input(f"Enter score {i+1}: "))
    scores.append(score)
    sum += scores[i]

lenght=len(scores)
average = sum/lenght
print(f"Average of Scores is {average}")
