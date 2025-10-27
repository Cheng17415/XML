my_str = 'a'
def changes(my_str: str):
  last_seen = my_str[0]
  changes = 0
  
  for c in my_str[1:]:
    if(last_seen.lower() != my_str[c].lower()):
      last_seen = my_str[c]
      changes+=1
  return changes
    

print(changes(my_str))