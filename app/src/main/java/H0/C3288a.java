package h0;

import A.C0053y;
import G.U;
import W.C1;
import W.C1564i2;
import Z.AbstractC1725n;
import Z.AbstractC1739u0;
import Z.C1741v0;
import id.AbstractC3557B;
import java.util.ArrayList;
import wf.AbstractC6217b;
import wf.AbstractC6218c;
import wf.AbstractC6219d;
import wf.AbstractC6220e;
import wf.AbstractC6221f;
import wf.AbstractC6222g;
import wf.AbstractC6223h;
import wf.i;
import wf.j;
import wf.l;
import wf.m;
import wf.n;
import wf.o;
import wf.p;
import wf.q;
import wf.r;
import wf.s;
import wf.t;
import wf.u;
import y.K;

/* renamed from: h0.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3288a implements n, o, p, q, r, s, t, u, AbstractC6217b, AbstractC6218c, AbstractC6219d, AbstractC6220e, AbstractC6221f, AbstractC6222g, AbstractC6223h, i, j, l, m {

    /* renamed from: Y  reason: collision with root package name */
    public final int f31677Y;

    /* renamed from: Z  reason: collision with root package name */
    public final boolean f31678Z;

    /* renamed from: h0  reason: collision with root package name */
    public Object f31679h0;

    /* renamed from: i0  reason: collision with root package name */
    public C1741v0 f31680i0;

    /* renamed from: j0  reason: collision with root package name */
    public ArrayList f31681j0;

    public C3288a(kotlin.jvm.internal.o oVar, boolean z10, int i10) {
        this.f31677Y = i10;
        this.f31678Z = z10;
        this.f31679h0 = oVar;
    }

    public final Object a(Object obj, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(this.f31677Y);
        i(rVar);
        if (rVar.g(this)) {
            i11 = R4.b.H(2, 1);
        } else {
            i11 = R4.b.H(1, 1);
        }
        Object obj2 = this.f31679h0;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj2);
        Ad.l.M(3, obj2);
        Object invoke = ((o) obj2).invoke(obj, rVar, Integer.valueOf(i11 | i10));
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C0053y(this, obj, i10, 6);
        }
        return invoke;
    }

    public final Object c(Object obj, Object obj2, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(this.f31677Y);
        i(rVar);
        if (rVar.g(this)) {
            i11 = R4.b.H(2, 2);
        } else {
            i11 = R4.b.H(1, 2);
        }
        Object obj3 = this.f31679h0;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj3);
        Ad.l.M(4, obj3);
        Object h10 = ((p) obj3).h(obj, obj2, rVar, Integer.valueOf(i11 | i10));
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new U(this, obj, obj2, i10, 4);
        }
        return h10;
    }

    public final Object e(Object obj, Object obj2, Object obj3, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(this.f31677Y);
        i(rVar);
        if (rVar.g(this)) {
            i11 = R4.b.H(2, 3);
        } else {
            i11 = R4.b.H(1, 3);
        }
        Object obj4 = this.f31679h0;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj4);
        Ad.l.M(5, obj4);
        Object n10 = ((q) obj4).n(obj, obj2, obj3, rVar, Integer.valueOf(i11 | i10));
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1564i2(this, obj, obj2, obj3, i10, 1);
        }
        return n10;
    }

    public final Object f(Object obj, Object obj2, Object obj3, Object obj4, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(this.f31677Y);
        i(rVar);
        if (rVar.g(this)) {
            i11 = R4.b.H(2, 4);
        } else {
            i11 = R4.b.H(1, 4);
        }
        Object obj5 = this.f31679h0;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj5);
        Ad.l.M(6, obj5);
        Object k10 = ((r) obj5).k(obj, obj2, obj3, obj4, rVar, Integer.valueOf(i10 | i11));
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C1(i10, 1, this, obj, obj2, obj3, obj4);
        }
        return k10;
    }

    public final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(this.f31677Y);
        i(rVar);
        if (rVar.g(this)) {
            i11 = R4.b.H(2, 5);
        } else {
            i11 = R4.b.H(1, 5);
        }
        Object obj6 = this.f31679h0;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'p5')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj6);
        Ad.l.M(7, obj6);
        Object l10 = ((s) obj6).l(obj, obj2, obj3, obj4, obj5, rVar, Integer.valueOf(i10 | i11));
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new K(this, obj, obj2, obj3, obj4, obj5, i10, 2);
        }
        return l10;
    }

    @Override // wf.p
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (AbstractC1725n) obj3, ((Number) obj4).intValue());
    }

    public final void i(AbstractC1725n abstractC1725n) {
        Z.r rVar;
        C1741v0 z10;
        if (this.f31678Z && (z10 = (rVar = (Z.r) abstractC1725n).z()) != null) {
            rVar.getClass();
            z10.f22736a |= 1;
            if (R4.b.S1(this.f31680i0, z10)) {
                this.f31680i0 = z10;
                return;
            }
            ArrayList arrayList = this.f31681j0;
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList();
                this.f31681j0 = arrayList2;
                arrayList2.add(z10);
                return;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (R4.b.S1((AbstractC1739u0) arrayList.get(i10), z10)) {
                    arrayList.set(i10, z10);
                    return;
                }
            }
            arrayList.add(z10);
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        int intValue = ((Number) obj2).intValue();
        Z.r rVar = (Z.r) ((AbstractC1725n) obj);
        rVar.X(this.f31677Y);
        i(rVar);
        if (rVar.g(this)) {
            i10 = R4.b.H(2, 0);
        } else {
            i10 = R4.b.H(1, 0);
        }
        int i11 = intValue | i10;
        Object obj3 = this.f31679h0;
        AbstractC3557B.a0("null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>", obj3);
        Ad.l.M(2, obj3);
        Object invoke = ((n) obj3).invoke(rVar, Integer.valueOf(i11));
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            Ad.l.M(2, this);
            v10.f22739d = this;
        }
        return invoke;
    }

    @Override // wf.r
    public final /* bridge */ /* synthetic */ Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return f(obj, obj2, obj3, obj4, (AbstractC1725n) obj5, ((Number) obj6).intValue());
    }

    @Override // wf.s
    public final /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Integer num) {
        return g(obj, obj2, obj3, obj4, obj5, (AbstractC1725n) obj6, num.intValue());
    }

    @Override // wf.q
    public final /* bridge */ /* synthetic */ Object n(Object obj, Object obj2, Object obj3, Object obj4, Integer num) {
        return e(obj, obj2, obj3, (AbstractC1725n) obj4, num.intValue());
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return a(obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
    }
}
