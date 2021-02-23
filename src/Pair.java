public final class Pair {

    private final LatLong x;

    private final LatLong y;

    public Pair(final LatLong x, final LatLong y) {
        this.x = x;
        this.y = y;
    }

    public LatLong getX() {
        return this.x;
    }

    public LatLong getY() {
        return this.y;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;

        final Pair pair = (Pair) o;

        if (!this.getX().equals(pair.getX())) return false;
        return this.getY().equals(pair.getY());
    }

    @Override
    public int hashCode() {
        int result = this.getX().hashCode();
        result = 31 * result + this.getY().hashCode();
        return result;
    }
}
