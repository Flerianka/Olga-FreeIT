package FreeIT;

class task3 {
        public static void main(String[] args) {
            int s = 4500;
            int sec = s % 60;
            int m = (s - sec) / 60;
            int min = m % 60;
            int h = (m - min) / 60;
            int hh = h % 24;
            int dd = (h - hh) / 24;
            int d = dd % 7;
            int w = (dd - d) / 7;
            System.out.println(w + " недель " +  d + " дней " + hh + " часов " + min + " минут " + sec + " секунд");
        }
    }