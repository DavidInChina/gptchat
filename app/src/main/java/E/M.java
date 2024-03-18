package E;

import Z.AbstractC1725n;
import Z.C1723m;
import java.util.List;
import java.util.WeakHashMap;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class M extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final M f3785Z = new M(2);

    /* renamed from: h0  reason: collision with root package name */
    public static final M f3786h0 = new M(4);

    /* renamed from: i0  reason: collision with root package name */
    public static final M f3787i0 = new M(6);

    /* renamed from: j0  reason: collision with root package name */
    public static final M f3788j0 = new M(8);

    /* renamed from: k0  reason: collision with root package name */
    public static final M f3789k0 = new M(9);

    /* renamed from: l0  reason: collision with root package name */
    public static final M f3790l0 = new M(10);

    /* renamed from: m0  reason: collision with root package name */
    public static final M f3791m0 = new M(11);

    /* renamed from: n0  reason: collision with root package name */
    public static final M f3792n0 = new M(12);

    /* renamed from: o0  reason: collision with root package name */
    public static final M f3793o0 = new M(13);

    /* renamed from: p0  reason: collision with root package name */
    public static final M f3794p0 = new M(14);

    /* renamed from: q0  reason: collision with root package name */
    public static final M f3795q0 = new M(15);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3796Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ M(int i10) {
        super(3);
        this.f3796Y = i10;
    }

    public final Integer a(E0.r rVar, int i10, int i11) {
        switch (this.f3796Y) {
            case 0:
                return Integer.valueOf(rVar.c(i11));
            case 1:
                return Integer.valueOf(rVar.m(i11));
            case 2:
                return Integer.valueOf(rVar.m(i11));
            case 3:
                return Integer.valueOf(rVar.c(i11));
            case 4:
                return Integer.valueOf(rVar.S(i11));
            case 5:
                return Integer.valueOf(rVar.l(i11));
            case 6:
                return Integer.valueOf(rVar.l(i11));
            default:
                return Integer.valueOf(rVar.S(i11));
        }
    }

    public final Integer c(List list, int i10, int i11) {
        switch (this.f3796Y) {
            case 8:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, C0428l.f3884h0, C0428l.f3885i0, i10, i11, 1, 2));
            case 9:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, C0428l.f3886j0, C0428l.f3887k0, i10, i11, 1, 1));
            case 10:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, C0428l.f3888l0, C0428l.f3889m0, i10, i11, 1, 2));
            case 11:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, C0428l.f3890n0, C0428l.f3891o0, i10, i11, 1, 1));
            case 12:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, C0428l.f3892p0, C0428l.f3893q0, i10, i11, 2, 2));
            case 13:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, C0428l.f3894r0, C0428l.f3895s0, i10, i11, 2, 1));
            case 14:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, C0428l.f3896t0, C0428l.f3897u0, i10, i11, 2, 2));
            default:
                return Integer.valueOf(androidx.compose.foundation.layout.a.e(list, C0428l.f3898v0, C0428l.f3899w0, i10, i11, 2, 1));
        }
    }

    public final AbstractC4326r e(AbstractC4326r abstractC4326r, AbstractC1725n abstractC1725n) {
        io.sentry.hints.i iVar = C1723m.f22654Y;
        switch (this.f3796Y) {
            case 16:
                Z.r rVar = (Z.r) abstractC1725n;
                rVar.W(359872873);
                WeakHashMap weakHashMap = B0.f3736v;
                B0 c10 = G.c(rVar);
                rVar.W(1157296644);
                boolean g10 = rVar.g(c10);
                Object K10 = rVar.K();
                if (g10 || K10 == iVar) {
                    K10 = new T(c10.f3739c);
                    rVar.h0(K10);
                }
                rVar.t(false);
                T t10 = (T) K10;
                rVar.t(false);
                return t10;
            default:
                Z.r rVar2 = (Z.r) abstractC1725n;
                rVar2.W(359872873);
                WeakHashMap weakHashMap2 = B0.f3736v;
                B0 c11 = G.c(rVar2);
                rVar2.W(1157296644);
                boolean g11 = rVar2.g(c11);
                Object K11 = rVar2.K();
                if (g11 || K11 == iVar) {
                    K11 = new T(c11.f3742f);
                    rVar2.h0(K11);
                }
                rVar2.t(false);
                T t11 = (T) K11;
                rVar2.t(false);
                return t11;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f3796Y) {
            case 0:
                return a((E0.r) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 1:
                return a((E0.r) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 2:
                return a((E0.r) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 3:
                return a((E0.r) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 4:
                return a((E0.r) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 5:
                return a((E0.r) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 6:
                return a((E0.r) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 7:
                return a((E0.r) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 8:
                return c((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 9:
                return c((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 10:
                return c((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 11:
                return c((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 12:
                return c((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 13:
                return c((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 14:
                return c((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 15:
                return c((List) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 16:
                ((Number) obj3).intValue();
                return e((AbstractC4326r) obj, (AbstractC1725n) obj2);
            default:
                ((Number) obj3).intValue();
                return e((AbstractC4326r) obj, (AbstractC1725n) obj2);
        }
    }
}
