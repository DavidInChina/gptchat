package x8;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class B extends j0 implements Serializable {

    /* renamed from: Y  reason: collision with root package name */
    public final Comparator f49507Y;

    public B(Comparator comparator) {
        comparator.getClass();
        this.f49507Y = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f49507Y.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof B) {
            return this.f49507Y.equals(((B) obj).f49507Y);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49507Y.hashCode();
    }

    public final String toString() {
        return this.f49507Y.toString();
    }
}
