package Rh;

/* loaded from: classes2.dex */
public final class C extends C4.g {

    /* renamed from: h0  reason: collision with root package name */
    public final String f15603h0;

    /* renamed from: i0  reason: collision with root package name */
    public final C4.g f15604i0;

    public C(String str, C4.g gVar) {
        this.f15603h0 = str;
        this.f15604i0 = gVar;
    }

    @Override // C4.g
    public final String a() {
        return this.f15604i0.a() + '$' + this.f15603h0.replace('/', '.');
    }

    @Override // C4.g
    public final boolean b() {
        if (this.f2681Z.isEmpty() && this.f15604i0.b()) {
            return false;
        }
        return true;
    }

    @Override // C4.g
    public final AbstractC1337y0 c() {
        boolean b10 = b();
        C4.g gVar = this.f15604i0;
        if (!b10 && !gVar.b()) {
            return new X(a());
        }
        return new T(a(), this.f2681Z, gVar.c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C.class != obj.getClass()) {
            return false;
        }
        C c10 = (C) obj;
        if (this.f15603h0.equals(c10.f15603h0) && this.f15604i0.equals(c10.f15604i0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15604i0.hashCode() + E9.f.v(this.f15603h0, C.class.hashCode() * 31, 31);
    }
}
