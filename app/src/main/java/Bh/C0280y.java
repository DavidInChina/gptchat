package Bh;

import java.util.Set;
import wh.AbstractC6250o;

/* renamed from: Bh.y  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0280y implements M {

    /* renamed from: Y  reason: collision with root package name */
    public final C0272u f2398Y;

    /* renamed from: Z  reason: collision with root package name */
    public final AbstractC6250o f2399Z;

    /* renamed from: h0  reason: collision with root package name */
    public final xh.e f2400h0;

    /* renamed from: i0  reason: collision with root package name */
    public final boolean f2401i0;

    public C0280y(C0272u c0272u, AbstractC6250o abstractC6250o, xh.e eVar, boolean z10) {
        this.f2398Y = c0272u;
        this.f2399Z = abstractC6250o;
        this.f2400h0 = eVar;
        this.f2401i0 = z10;
    }

    @Override // Bh.M
    public final int c() {
        if (this.f2401i0) {
            return 1;
        }
        return 2;
    }

    @Override // Bh.M
    public final Set d() {
        return this.f2398Y.a();
    }

    @Override // Bh.M
    public final AbstractC6250o e() {
        return this.f2399Z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0280y.class != obj.getClass()) {
            return false;
        }
        C0280y c0280y = (C0280y) obj;
        if (this.f2401i0 == c0280y.f2401i0 && this.f2400h0.equals(c0280y.f2400h0) && this.f2398Y.equals(c0280y.f2398Y) && this.f2399Z.equals(c0280y.f2399Z)) {
            return true;
        }
        return false;
    }

    @Override // Bh.M
    public final xh.e getVisibility() {
        return this.f2400h0;
    }

    public final int hashCode() {
        int hashCode = this.f2398Y.hashCode();
        int hashCode2 = this.f2399Z.hashCode();
        return ((this.f2400h0.hashCode() + ((hashCode2 + ((hashCode + (C0280y.class.hashCode() * 31)) * 31)) * 31)) * 31) + (this.f2401i0 ? 1 : 0);
    }
}
