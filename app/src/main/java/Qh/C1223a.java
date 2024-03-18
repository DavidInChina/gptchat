package Qh;

/* renamed from: Qh.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1223a extends AbstractC1230h {

    /* renamed from: b  reason: collision with root package name */
    public static final C1223a f14985b = new C1223a(true);

    /* renamed from: c  reason: collision with root package name */
    public static final C1223a f14986c = new C1223a(false);

    /* renamed from: a  reason: collision with root package name */
    public final boolean f14987a;

    public C1223a(boolean z10) {
        this.f14987a = z10;
    }

    public static C1223a d(boolean z10) {
        if (z10) {
            return f14985b;
        }
        return f14986c;
    }

    @Override // Qh.AbstractC1234l
    public final boolean a(Object obj) {
        return this.f14987a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1223a.class != obj.getClass()) {
            return false;
        }
        if (this.f14987a == ((C1223a) obj).f14987a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (C1223a.class.hashCode() * 31) + (this.f14987a ? 1 : 0);
    }

    public final String toString() {
        return Boolean.toString(this.f14987a);
    }
}
