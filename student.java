public class student implements Comparable<student> {
    String name;
    int rollNo;

    public student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "student [name=" + name + ", rollNo=" + rollNo + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollNo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        student other = (student) obj;
        if (rollNo != other.rollNo)
            return false;
        return true;
    }

    @Override
    public int compareTo(student that) {
        return this.rollNo - that.rollNo;
    }

}
