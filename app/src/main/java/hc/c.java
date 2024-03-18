package Hc;

import A.C0046u0;
import A.C0053y;
import F.o;
import Gi.e;
import K4.J;
import L0.u;
import Pc.g;
import X1.m;
import Y1.d;
import Z.AbstractC1725n;
import Z.C1741v0;
import Z1.B;
import Z1.N;
import a2.C1920d;
import android.content.Context;
import e2.C2771c;
import e2.C2782n;
import e2.C2783o;
import e2.C2784p;
import e2.C2790v;
import gc.l;
import h0.C3288a;
import id.AbstractC3557B;
import j2.C3901c;
import j2.C3906h;
import java.util.Arrays;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p9.AbstractC5103e;
import p9.r;

/* loaded from: classes.dex */
public final class c extends N {

    /* renamed from: f  reason: collision with root package name */
    public static final float f7599f;

    /* renamed from: g  reason: collision with root package name */
    public static final float f7600g;

    /* renamed from: h  reason: collision with root package name */
    public static final float f7601h;

    /* renamed from: j  reason: collision with root package name */
    public static final float f7603j;

    /* renamed from: k  reason: collision with root package name */
    public static final float f7604k;

    /* renamed from: e  reason: collision with root package name */
    public static final g f7598e = Bi.c.i1(Pc.b.f13933k0);

    /* renamed from: i  reason: collision with root package name */
    public static final float f7602i = 44;

    /* renamed from: l  reason: collision with root package name */
    public static final long f7605l = androidx.compose.ui.graphics.a.c(4281611064L);

    /* renamed from: m  reason: collision with root package name */
    public static final long f7606m = androidx.compose.ui.graphics.a.c(4291085259L);

    static {
        float f6 = 20;
        f7599f = f6;
        float f10 = 56;
        f7600g = f10;
        f7601h = f6;
        float f11 = r.f42840d;
        f7603j = (3 * f11) + (4 * f10);
        f7604k = (f11 * 2) + f10;
    }

    public static final void g(c cVar, int i10, Class cls, AbstractC1725n abstractC1725n, int i11) {
        cVar.getClass();
        u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(-1159305243);
        X1.a aVar = new X1.a(i10);
        float f6 = f7600g;
        m d10 = new C2790v(new C3901c(f6)).d(new C2782n(new C3901c(f6)));
        C2783o i22 = R4.b.i2(r.f42841e);
        P4.a.e(aVar, null, d10.d(new C2784p(i22, i22, i22, i22)).d(new B(new C3901c(f7601h))).d(new X1.c(new C3906h(f7605l))).d(new Y1.b(new C1920d(cls, J.N((d[]) Arrays.copyOf(new d[0], 0))))), 0, rVar, 56, 24);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new o(cVar, i10, cls, i11, 25);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    @Override // Z1.N
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(Context context, AbstractC4825e abstractC4825e) {
        b bVar;
        int i10;
        if (abstractC4825e instanceof b) {
            bVar = (b) abstractC4825e;
            int i11 = bVar.f7597h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar.f7597h0 = i11 - Integer.MIN_VALUE;
                Object obj = bVar.f7595Y;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = bVar.f7597h0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    throw new RuntimeException();
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                C3288a c3288a = new C3288a(new l(this, 4, context), true, 1026586785);
                bVar.f7597h0 = 1;
                e.J(c3288a, bVar);
                return;
            }
        }
        bVar = new b(this, abstractC4825e);
        Object obj2 = bVar.f7595Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = bVar.f7597h0;
        if (i10 == 0) {
        }
    }

    public final void f(Context context, AbstractC1725n abstractC1725n, int i10) {
        AbstractC3557B.c0("context", context);
        u uVar = io.sentry.compose.b.f34309a;
        Z.r rVar = (Z.r) abstractC1725n;
        rVar.X(435603239);
        C2783o i22 = R4.b.i2(r.f42841e);
        A7.b.i(new C2784p(i22, i22, i22, i22).d(new X1.c(new C3906h(AbstractC5103e.f42773d))), C2771c.f28746c.k(), 0, R4.b.X(rVar, -1284069987, new C0046u0(context, 29, this)), rVar, 3072, 4);
        C1741v0 v10 = rVar.v();
        if (v10 != null) {
            v10.f22739d = new C0053y(this, context, i10, 19);
        }
    }
}
