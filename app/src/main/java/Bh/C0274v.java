package Bh;

import java.util.Set;
import wh.AbstractC6236a;
import wh.AbstractC6250o;

/* renamed from: Bh.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0274v implements M {

    /* renamed from: Y  reason: collision with root package name */
    public final C0272u f2385Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6250o f2386Z;

    /* renamed from: h0  reason: collision with root package name */
    public final xh.e f2387h0;

    public C0274v(C0272u c0272u, AbstractC6236a abstractC6236a, xh.e eVar) {
        this.f2385Y = c0272u;
        this.f2386Z = abstractC6236a;
        this.f2387h0 = eVar;
    }

    @Override // Bh.M
    public final int c() {
        return 3;
    }

    @Override // Bh.M
    public final Set d() {
        return this.f2385Y.a();
    }

    @Override // Bh.M
    public final AbstractC6250o e() {
        return this.f2386Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0274v.class != obj.getClass()) {
            return false;
        }
        C0274v c0274v = (C0274v) obj;
        if (this.f2387h0.equals(c0274v.f2387h0) && this.f2385Y.equals(c0274v.f2385Y) && this.f2386Z.equals(c0274v.f2386Z)) {
            return true;
        }
        return false;
    }

    @Override // Bh.M
    public final xh.e getVisibility() {
        return this.f2387h0;
    }

    public final int hashCode() {
        int hashCode = this.f2385Y.hashCode();
        int hashCode2 = this.f2386Z.hashCode();
        return this.f2387h0.hashCode() + ((hashCode2 + ((hashCode + (C0274v.class.hashCode() * 31)) * 31)) * 31);
    }
}
