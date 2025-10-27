import random
#Numero aleatoria desde -10 a 25
dias = []
def alea(li,ls):
  return random.randrange(li,ls+1)

def logica():
  
  for i in range(31):
    min = alea(-10,25)
    max = alea(min,25)
    dias.append((min,max))
    
def main():
  logica()
  for dia in dias:
    print(dia)
if __name__ == '__main__':
  main()