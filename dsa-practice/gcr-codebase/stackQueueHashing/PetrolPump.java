class PetrolPump {
    int petrol, distance;

    PetrolPump(int p, int d) {
        petrol = p;
        distance = d;
    }
}

class CircularTour {

    static int findStart(PetrolPump[] arr) {
        int start = 0, deficit = 0, balance = 0;

        for (int i = 0; i < arr.length; i++) {
            balance += arr[i].petrol - arr[i].distance;

            if (balance < 0) {
                deficit += balance;
                start = i + 1;
                balance = 0;
            }
        }

        return (balance + deficit >= 0) ? start : -1;
    }
}
