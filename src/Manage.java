import java.util.*;

public class Manage {
    private Map<String, Student> map;

    public Manage() {
        map = new HashMap<>();
    }

    public void add(String key, Student student) {
        map.put(key, student);
    }

    public boolean checkDiem(double diem) {
        return diem >= 0 && diem <= 10;
    }

    public void display() {
        System.out.println("Danh sach sinh vien");
        Set<String> set = map.keySet();
        boolean isNull = true;
        for (String key : set) {
            System.out.println(map.get(key));
            isNull = false;
        }
        if (isNull) {
            System.out.println("Null");
        }
    }

    public void delete(String key) {
        if (map.containsKey(key)) {
            System.out.println("delete " + map.get(key));
            map.remove(key);
            System.out.println("Success !");
        } else {
            System.out.println("Invalid Key !");
        }
    }

    public void edit(String key, Student student) {
        Set<String> set = map.keySet();
        for (String elementkey : set) {
            if (elementkey.equals(key)) {
                map.replace(key, student);
            }
        }
    }

    public boolean checkKey(String key) {
        return map.containsKey(key);
    }

    public void searchByMsv(String key) {
        if (checkKey(key)) {
            System.out.println(map.get(key));
        } else {
            System.out.println("Invalid key !");
        }
    }

    public void sort(int option) {
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        List<Map.Entry<String, Student>> entryList = new ArrayList<>(entries);
        Collections.sort(entryList, new Comparator<Map.Entry<String, Student>>() {
            @Override
            public int compare(Map.Entry<String, Student> o1, Map.Entry<String, Student> o2) {
                if (option == 1) {
                    return o1.getValue().getName().compareTo(o2.getValue().getName());
                } else if (option == 2) {
                    if (o1.getValue().getDiemTrungBinh() == o2.getValue().getDiemTrungBinh()) {
                        return (int) (o1.getValue().getDiemToan() - o2.getValue().getDiemToan());
                    } else {
                        return (int) (o1.getValue().getDiemTrungBinh() - o2.getValue().getDiemTrungBinh());
                    }
                } else {
                    return o1.getValue().getMsv().compareTo(o2.getValue().getMsv());
                }
            }
        });
        LinkedHashMap<String, Student> sortedMap = new LinkedHashMap<>(entryList.size());
        for (Map.Entry<String, Student> entry : entryList) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        Set<String> set = sortedMap.keySet();
        for (String key : set) {
            System.out.println(sortedMap.get(key));
        }

    }

    public void searchByDiemTrungBinh(int level) {
        Set<String> set = map.keySet();
        boolean isNull = true;
        switch (level) {
            case 1: // hoc luc yeu
                for (String key : set) {
                    if (map.get(key).getDiemTrungBinh() >= 0 && map.get(key).getDiemTrungBinh() < 5) {
                        System.out.println(map.get(key));
                        isNull = false;
                    }
                }
                if (isNull) {
                    System.out.println("Null");
                }
                break;
            case 2: // hoc luc trung binh
                for (String key : set) {
                    if (map.get(key).getDiemTrungBinh() >= 5 && map.get(key).getDiemTrungBinh() < 7) {
                        System.out.println(map.get(key));
                        isNull = false;
                    }
                }
                if (isNull) {
                    System.out.println("Null");
                }
                break;
            case 3: // hoc luc kha
                for (String key : set) {
                    if (map.get(key).getDiemTrungBinh() >= 7 && map.get(key).getDiemTrungBinh() < 8) {
                        System.out.println(map.get(key));
                        isNull = false;
                    }
                }
                if (isNull) {
                    System.out.println("Null");
                }
                break;
            case 4: // hoc luc gioi
                for (String key : set) {
                    if (map.get(key).getDiemTrungBinh() >= 8 && map.get(key).getDiemTrungBinh() <= 10) {
                        System.out.println(map.get(key));
                        isNull = false;
                    }
                }
                if (isNull) {
                    System.out.println("Null");
                }
                break;
        }
    }
}
