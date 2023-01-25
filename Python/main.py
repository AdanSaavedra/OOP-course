from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola Mundo")

    car = Car("AM123", Account("Adan Saavedra", "ads2"))
    print(vars(car))
    print(vars(car.driver))
