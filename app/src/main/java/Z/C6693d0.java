package z;

/* renamed from: z.d0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6693d0 implements AbstractC6651A {

    /* renamed from: a  reason: collision with root package name */
    public final int f51227a;

    public C6693d0(int i10) {
        this.f51227a = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6693d0) || ((C6693d0) obj).f51227a != this.f51227a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f51227a;
    }

    @Override // z.AbstractC6651A, z.AbstractC6714o
    /* renamed from: a */
    public final AbstractC6656C0 mo121a(C6737z0 c6737z0) {
        return new Ii.q(this.f51227a);
    }
}
