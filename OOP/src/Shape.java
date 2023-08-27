class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 4;
    }

    // memanggil getCorner yang ada di shape (parentnya)
    int getParentCorner() {
        return super.getCorner();
    }
}