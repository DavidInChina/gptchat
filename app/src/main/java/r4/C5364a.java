package r4;

import q1.AbstractC5260f;

/* renamed from: r4.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5364a extends AbstractC5260f {

    /* renamed from: h  reason: collision with root package name */
    public final int f44429h;

    public C5364a(int i10) {
        this.f44429h = i10;
        if (i10 > 0) {
            return;
        }
        throw new IllegalArgumentException("px must be > 0.".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5364a) {
            if (this.f44429h == ((C5364a) obj).f44429h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f44429h;
    }

    public final String toString() {
        return String.valueOf(this.f44429h);
    }
}
