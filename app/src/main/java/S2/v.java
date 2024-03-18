package s2;

/* loaded from: classes2.dex */
public final class v {

    /* renamed from: c  reason: collision with root package name */
    public static final v f45196c = new v(-1, -1);

    /* renamed from: a  reason: collision with root package name */
    public final int f45197a;

    /* renamed from: b  reason: collision with root package name */
    public final int f45198b;

    static {
        new v(0, 0);
    }

    public v(int i10, int i11) {
        boolean z10;
        if ((i10 != -1 && i10 < 0) || (i11 != -1 && i11 < 0)) {
            z10 = false;
        } else {
            z10 = true;
        }
        Gi.e.l(z10);
        this.f45197a = i10;
        this.f45198b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f45197a != vVar.f45197a || this.f45198b != vVar.f45198b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f45197a;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f45198b;
    }

    public final String toString() {
        return this.f45197a + "x" + this.f45198b;
    }
}
