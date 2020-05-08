from zeep import Client

wsdl = 'http://localhost:8888/conversor?wsdl'

def CelparaFah:
    client = Client(wsdl=wsdl)
    print(client.service.celparafah(temp))

def FahparaCel:
    client = Client(wsdl=wsdl)
    print(client.service.FahparaCel(temp))


temp = input("Digite o valor em Graus C: ")
print("Fahrenheit:........")
celparaFah(temp);


tempc = input("Digite o valor em Graus F:")
print("Celsius:........")
fahparaCel(tempc);


