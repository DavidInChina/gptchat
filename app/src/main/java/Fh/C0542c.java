package Fh;

import Qh.AbstractC1239q;
import th.AbstractC5802j;
import yh.G1;
import yh.k1;
import yh.l1;

/* renamed from: Fh.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0542c implements k1 {

    /* renamed from: Y  reason: collision with root package name */
    public final j f5384Y;

    /* renamed from: Z  reason: collision with root package name */
    public final o f5385Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f5386h0;

    /* renamed from: i0  reason: collision with root package name */
    public final String f5387i0;

    public C0542c(j jVar, o oVar, int i10, String str) {
        this.f5384Y = jVar;
        this.f5385Z = oVar;
        this.f5386h0 = i10;
        this.f5387i0 = str;
    }

    public static j g(j jVar, o oVar, boolean z10, int i10, G1 g1) {
        int i11;
        int i12;
        int i13;
        if (z10) {
            i11 = 17;
            i12 = 0;
        } else {
            i11 = 18;
            i12 = 1;
        }
        j jVar2 = jVar;
        for (l1.a aVar : ((AbstractC1239q) g1).subList(i10, g1.size())) {
            int i14 = i10 << 16;
            int i15 = (i12 << 24) | i14;
            C0541b c0541b = jVar2;
            for (AbstractC5802j abstractC5802j : aVar.getDeclaredAnnotations()) {
                C0541b c0541b2 = (C0541b) c0541b;
                c0541b2.b(abstractC5802j, oVar, i15, "");
                c0541b = c0541b2;
            }
            if (!((l1.a) aVar.getUpperBounds().get(0)).c().c() && ((l1.a) aVar.getUpperBounds().get(0)).E0()) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            j jVar3 = c0541b;
            for (l1.a aVar2 : aVar.getUpperBounds()) {
                int i16 = i13 + 1;
                int i17 = i13 << 8;
                i13 = i16;
                jVar3 = (j) aVar2.k(new C0542c(jVar3, oVar, i17 | (i11 << 24) | i14, ""));
            }
            i10++;
            jVar2 = jVar3;
        }
        return jVar2;
    }

    @Override // yh.k1
    public final Object a(l1.a aVar) {
        l1.a mo119g = aVar.mo119g();
        String str = this.f5387i0;
        j f6 = f(aVar, str);
        return (j) mo119g.k(new C0542c(f6, this.f5385Z, this.f5386h0, str + '['));
    }

    @Override // yh.k1
    public final Object b(l1.a aVar) {
        String str = this.f5387i0;
        StringBuilder sb2 = new StringBuilder(str);
        for (int i10 = 0; i10 < aVar.l0().S(); i10++) {
            sb2.append('.');
        }
        j f6 = f(aVar, sb2.toString());
        l1.a mo119g = aVar.mo119g();
        if (mo119g != null) {
            return (j) mo119g.k(new C0542c(f6, this.f5385Z, this.f5386h0, str + '['));
        }
        return f6;
    }

    @Override // yh.k1
    public final Object c(l1.a aVar) {
        String str = this.f5387i0;
        StringBuilder sb2 = new StringBuilder(str);
        int i10 = 0;
        for (int i11 = 0; i11 < aVar.l0().S(); i11++) {
            sb2.append('.');
        }
        j f6 = f(aVar, sb2.toString());
        l1.a ownerType = aVar.getOwnerType();
        int i12 = this.f5386h0;
        o oVar = this.f5385Z;
        if (ownerType != null) {
            f6 = (j) ownerType.k(new C0542c(f6, oVar, i12, str));
        }
        for (l1.a aVar2 : aVar.y0()) {
            f6 = (j) aVar2.k(new C0542c(f6, oVar, i12, sb2.toString() + i10 + ';'));
            i10++;
        }
        return f6;
    }

    @Override // yh.k1
    public final Object d(l1.a aVar) {
        l1.a aVar2;
        G1 lowerBounds = aVar.getLowerBounds();
        if (lowerBounds.isEmpty()) {
            aVar2 = (l1.a) ((AbstractC1239q) aVar.getUpperBounds()).r();
        } else {
            aVar2 = (l1.a) ((AbstractC1239q) lowerBounds).r();
        }
        String str = this.f5387i0;
        j f6 = f(aVar, str);
        return (j) aVar2.k(new C0542c(f6, this.f5385Z, this.f5386h0, str + '*'));
    }

    @Override // yh.k1
    public final Object e(l1.a aVar) {
        return f(aVar, this.f5387i0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0542c.class != obj.getClass()) {
            return false;
        }
        C0542c c0542c = (C0542c) obj;
        if (this.f5386h0 == c0542c.f5386h0 && this.f5387i0.equals(c0542c.f5387i0) && this.f5384Y.equals(c0542c.f5384Y) && this.f5385Z.equals(c0542c.f5385Z)) {
            return true;
        }
        return false;
    }

    public final j f(l1.a aVar, String str) {
        C0541b c0541b = this.f5384Y;
        for (AbstractC5802j abstractC5802j : aVar.getDeclaredAnnotations()) {
            C0541b c0541b2 = (C0541b) c0541b;
            c0541b2.b(abstractC5802j, this.f5385Z, this.f5386h0, str);
            c0541b = c0541b2;
        }
        return c0541b;
    }

    public final int hashCode() {
        int hashCode = this.f5384Y.hashCode();
        int hashCode2 = this.f5385Z.hashCode();
        return this.f5387i0.hashCode() + ((((hashCode2 + ((hashCode + (C0542c.class.hashCode() * 31)) * 31)) * 31) + this.f5386h0) * 31);
    }
}
