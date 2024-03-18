package E2;

import a1.C1915c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import l8.AbstractC4344b;
import p2.AbstractC5069w;
import p2.C5047B;
import p2.C5068v;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class G extends AbstractC0477i {

    /* renamed from: r  reason: collision with root package name */
    public static final p2.H f4139r;

    /* renamed from: k  reason: collision with root package name */
    public final AbstractC0469a[] f4140k;

    /* renamed from: l  reason: collision with root package name */
    public final p2.g0[] f4141l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f4142m;

    /* renamed from: n  reason: collision with root package name */
    public final C1915c f4143n;

    /* renamed from: o  reason: collision with root package name */
    public int f4144o = -1;

    /* renamed from: p  reason: collision with root package name */
    public long[][] f4145p = new long[0];

    /* renamed from: q  reason: collision with root package name */
    public F f4146q;

    /* JADX WARN: Type inference failed for: r4v0, types: [p2.w, p2.x] */
    static {
        C5068v c5068v = new C5068v();
        x8.L l10 = x8.N.f49523Z;
        x8.k0 k0Var = x8.k0.f49573j0;
        Collections.emptyList();
        x8.k0 k0Var2 = x8.k0.f49573j0;
        f4139r = new p2.H("MergingMediaSource", new AbstractC5069w(c5068v), null, new C5047B(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), p2.K.f41848N0, p2.D.f41769i0);
    }

    public G(AbstractC0469a... abstractC0469aArr) {
        C1915c c1915c = new C1915c(28);
        this.f4140k = abstractC0469aArr;
        this.f4143n = c1915c;
        this.f4142m = new ArrayList(Arrays.asList(abstractC0469aArr));
        this.f4141l = new p2.g0[abstractC0469aArr.length];
        new HashMap();
        AbstractC4344b.T(8, "expectedKeys");
        new x8.c0().C().X();
    }

    @Override // E2.AbstractC0469a
    public final AbstractC0490w a(C0492y c0492y, I2.d dVar, long j6) {
        AbstractC0469a[] abstractC0469aArr = this.f4140k;
        int length = abstractC0469aArr.length;
        AbstractC0490w[] abstractC0490wArr = new AbstractC0490w[length];
        p2.g0[] g0VarArr = this.f4141l;
        int c10 = g0VarArr[0].c(c0492y.f4420a);
        for (int i10 = 0; i10 < length; i10++) {
            abstractC0490wArr[i10] = abstractC0469aArr[i10].a(c0492y.a(g0VarArr[i10].n(c10)), dVar, j6 - this.f4145p[c10][i10]);
        }
        return new E(this.f4143n, this.f4145p[c10], abstractC0490wArr);
    }

    @Override // E2.AbstractC0469a
    public final p2.H g() {
        AbstractC0469a[] abstractC0469aArr = this.f4140k;
        if (abstractC0469aArr.length > 0) {
            return abstractC0469aArr[0].g();
        }
        return f4139r;
    }

    @Override // E2.AbstractC0477i, E2.AbstractC0469a
    public final void i() {
        F f6 = this.f4146q;
        if (f6 == null) {
            super.i();
            return;
        }
        throw f6;
    }

    @Override // E2.AbstractC0469a
    public final void k(v2.F f6) {
        this.f4358j = f6;
        this.f4357i = AbstractC5530A.l(null);
        int i10 = 0;
        while (true) {
            AbstractC0469a[] abstractC0469aArr = this.f4140k;
            if (i10 < abstractC0469aArr.length) {
                w(Integer.valueOf(i10), abstractC0469aArr[i10]);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // E2.AbstractC0469a
    public final void m(AbstractC0490w abstractC0490w) {
        E e10 = (E) abstractC0490w;
        int i10 = 0;
        while (true) {
            AbstractC0469a[] abstractC0469aArr = this.f4140k;
            if (i10 < abstractC0469aArr.length) {
                AbstractC0469a abstractC0469a = abstractC0469aArr[i10];
                AbstractC0490w abstractC0490w2 = e10.f4130Y[i10];
                if (abstractC0490w2 instanceof h0) {
                    abstractC0490w2 = ((h0) abstractC0490w2).f4353Y;
                }
                abstractC0469a.m(abstractC0490w2);
                i10++;
            } else {
                return;
            }
        }
    }

    @Override // E2.AbstractC0477i, E2.AbstractC0469a
    public final void o() {
        super.o();
        Arrays.fill(this.f4141l, (Object) null);
        this.f4144o = -1;
        this.f4146q = null;
        ArrayList arrayList = this.f4142m;
        arrayList.clear();
        Collections.addAll(arrayList, this.f4140k);
    }

    @Override // E2.AbstractC0469a
    public final void r(p2.H h10) {
        this.f4140k[0].r(h10);
    }

    @Override // E2.AbstractC0477i
    public final C0492y s(Object obj, C0492y c0492y) {
        if (((Integer) obj).intValue() != 0) {
            return null;
        }
        return c0492y;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [E2.F, java.io.IOException] */
    @Override // E2.AbstractC0477i
    public final void v(Object obj, AbstractC0469a abstractC0469a, p2.g0 g0Var) {
        Integer num = (Integer) obj;
        if (this.f4146q == null) {
            if (this.f4144o == -1) {
                this.f4144o = g0Var.j();
            } else if (g0Var.j() != this.f4144o) {
                this.f4146q = new IOException();
                return;
            }
            int length = this.f4145p.length;
            p2.g0[] g0VarArr = this.f4141l;
            if (length == 0) {
                this.f4145p = (long[][]) Array.newInstance(Long.TYPE, this.f4144o, g0VarArr.length);
            }
            ArrayList arrayList = this.f4142m;
            arrayList.remove(abstractC0469a);
            g0VarArr[num.intValue()] = g0Var;
            if (arrayList.isEmpty()) {
                l(g0VarArr[0]);
            }
        }
    }
}
