package y;

import E0.AbstractC0459s;
import E0.AbstractC0466z;
import Z.AbstractC1710f0;
import Z.l1;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import w.C6077x;
import z.C6713n0;
import z.C6715o0;

/* renamed from: y.y  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6486y implements AbstractC0466z {

    /* renamed from: b  reason: collision with root package name */
    public final C6715o0 f50313b;

    /* renamed from: c  reason: collision with root package name */
    public final l1 f50314c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6460A f50315d;

    public C6486y(C6460A c6460a, C6715o0 c6715o0, AbstractC1710f0 abstractC1710f0) {
        this.f50315d = c6460a;
        this.f50313b = c6715o0;
        this.f50314c = abstractC1710f0;
    }

    @Override // l0.AbstractC4326r
    public final Object a(Object obj, wf.n nVar) {
        return nVar.invoke(obj, this);
    }

    @Override // E0.AbstractC0466z
    public final int c(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return rVar.S(i10);
    }

    @Override // E0.AbstractC0466z
    public final int d(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return rVar.l(i10);
    }

    @Override // E0.AbstractC0466z
    public final E0.O e(E0.P p10, E0.M m10, long j6) {
        E0.d0 o10 = m10.o(j6);
        C6460A c6460a = this.f50315d;
        C6713n0 a5 = this.f50313b.a(new C6485x(c6460a, 0, this), new C6077x(1, c6460a));
        c6460a.f50083f = a5;
        long a10 = c6460a.f50079b.a(Ng.H.c(o10.f4053Y, o10.f4054Z), ((Z0.k) a5.getValue()).f22804a, Z0.l.f22805Y);
        return p10.j0((int) (((Z0.k) a5.getValue()).f22804a >> 32), (int) (((Z0.k) a5.getValue()).f22804a & 4294967295L), kf.w.f37484Y, new C6484w(o10, a10, 0));
    }

    @Override // l0.AbstractC4326r
    public final /* synthetic */ AbstractC4326r g(AbstractC4326r abstractC4326r) {
        return AbstractC4194d.a(this, abstractC4326r);
    }

    @Override // E0.AbstractC0466z
    public final int h(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return rVar.m(i10);
    }

    @Override // E0.AbstractC0466z
    public final int i(AbstractC0459s abstractC0459s, E0.r rVar, int i10) {
        return rVar.c(i10);
    }

    @Override // l0.AbstractC4326r
    public final boolean l(wf.k kVar) {
        return ((Boolean) kVar.invoke(this)).booleanValue();
    }
}
