package L3;

/* loaded from: classes.dex */
public final class o extends q {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return o.class.getName().hashCode();
    }

    public final String toString() {
        return "Retry";
    }
}
