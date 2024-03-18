package Rh;

/* loaded from: classes2.dex */
public final class D extends C4.g {

    /* renamed from: h0  reason: collision with root package name */
    public final String f15609h0;

    public D(String str) {
        this.f15609h0 = str;
    }

    @Override // C4.g
    public final String a() {
        return this.f15609h0.replace('/', '.');
    }

    @Override // C4.g
    public final boolean b() {
        return !this.f2681Z.isEmpty();
    }

    @Override // C4.g
    public final AbstractC1337y0 c() {
        if (b()) {
            return new U(a(), this.f2681Z);
        }
        return new X(a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || D.class != obj.getClass()) {
            return false;
        }
        if (this.f15609h0.equals(((D) obj).f15609h0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15609h0.hashCode() + (D.class.hashCode() * 31);
    }
}
