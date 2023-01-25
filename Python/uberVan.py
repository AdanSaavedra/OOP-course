from car import Car


class uberVan(Car):
    typeCarAccepter = []
    seatsMaterial = []

    def __init__(self, license, driver, typeCarAccepted, seatsMaterial):
        super(uberVan, self).__init__(license, driver)
        self.typeCarAccepter = typeCarAccepted
        self.seatsMaterial = seatsMaterial
