from car import Car

if __name__ == "__main__":
    print("Hola Mundo")
    car = Car()
    car.license = "AM123"
    car.driver = "Adan Saavedra"
    print(vars(car))

    car2 = Car()
    car2.license = "WEW232"
    car2.driver = "Anais Herrera"
    print(vars(car2))
