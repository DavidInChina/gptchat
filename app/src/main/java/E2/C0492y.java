package E2;

/* renamed from: E2.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0492y {

    /* renamed from: a  reason: collision with root package name */
    public final Object f4420a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4421b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4422c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4423d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4424e;

    public C0492y(long j6, Object obj) {
        this(-1, -1, -1, j6, obj);
    }

    public final C0492y a(Object obj) {
        if (this.f4420a.equals(obj)) {
            return this;
        }
        long j6 = this.f4423d;
        return new C0492y(this.f4421b, this.f4422c, this.f4424e, j6, obj);
    }

    public final boolean b() {
        if (this.f4421b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0492y)) {
            return false;
        }
        C0492y c0492y = (C0492y) obj;
        if (this.f4420a.equals(c0492y.f4420a) && this.f4421b == c0492y.f4421b && this.f4422c == c0492y.f4422c && this.f4423d == c0492y.f4423d && this.f4424e == c0492y.f4424e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f4420a.hashCode() + 527) * 31) + this.f4421b) * 31) + this.f4422c) * 31) + ((int) this.f4423d)) * 31) + this.f4424e;
    }

    public C0492y(Object obj) {
        this(-1L, obj);
    }

    public C0492y(Object obj, long j6, int i10) {
        this(-1, -1, i10, j6, obj);
    }

    public C0492y(int i10, int i11, int i12, long j6, Object obj) {
        this.f4420a = obj;
        this.f4421b = i10;
        this.f4422c = i11;
        this.f4423d = j6;
        this.f4424e = i12;
    }
}
