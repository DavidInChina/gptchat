package Qh;

/* renamed from: Qh.k  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1233k extends AbstractC1230h {
    @Override // Qh.AbstractC1234l
    public final boolean a(Object obj) {
        if (obj != null && d(obj)) {
            return true;
        }
        return false;
    }

    public abstract boolean d(Object obj);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return getClass().hashCode();
    }
}
