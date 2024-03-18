package Cd;

import Qg.F0;
import Qg.s0;
import W.AbstractC1607r1;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.ArrayList;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import p9.AbstractC5102d;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import v0.C5957j;
import v0.C5958k;

/* renamed from: Cd.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318c extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0318c f3042Z = new C0318c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0318c f3043h0 = new C0318c(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3044Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0318c(int i10) {
        super(2);
        this.f3044Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f3044Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC4326r a10 = AbstractC4194d.a((G0.X) a5, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42832c));
                C5953f c5953f = AbstractC3557B.f33081d;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Rounded.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = AbstractC5944H.f46870a;
                    r0.N n10 = new r0.N(r0.r.f44254b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new v0.n(8.0f, 6.82f));
                    arrayList.add(new v0.z(10.36f));
                    arrayList.add(new v0.s(0.0f, 0.79f, 0.87f, 1.27f, 1.54f, 0.84f));
                    arrayList.add(new v0.u(8.14f, -5.18f));
                    arrayList.add(new v0.s(0.62f, -0.39f, 0.62f, -1.29f, 0.0f, -1.69f));
                    arrayList.add(new v0.m(9.54f, 5.98f));
                    arrayList.add(new C5958k(8.87f, 5.55f, 8.0f, 6.03f, 8.0f, 6.82f));
                    arrayList.add(C5957j.f46979c);
                    C5952e.b(c5952e, arrayList, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    AbstractC3557B.f33081d = c5953f;
                }
                AbstractC1607r1.b(c5953f, Ng.H.v(R.string.voice_resume_description, abstractC1725n), a10, 0L, abstractC1725n, 0, 8);
                return;
            case 1:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC4326r a12 = AbstractC4194d.a((G0.X) a11, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42832c));
                C5953f c5953f2 = R4.b.f15045f;
                if (c5953f2 == null) {
                    C5952e c5952e2 = new C5952e("Rounded.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i12 = AbstractC5944H.f46870a;
                    r0.N n11 = new r0.N(r0.r.f44254b);
                    Wh.p p10 = R.a.p(0, 18.3f, 5.71f);
                    p10.h(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                    p10.n(12.0f, 10.59f);
                    p10.n(7.11f, 5.7f);
                    p10.h(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                    p10.h(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                    p10.n(10.59f, 12.0f);
                    p10.n(5.7f, 16.89f);
                    p10.h(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                    p10.h(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                    p10.n(12.0f, 13.41f);
                    p10.o(4.89f, 4.89f);
                    p10.h(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                    p10.h(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                    p10.n(13.41f, 12.0f);
                    p10.o(4.89f, -4.89f);
                    p10.h(0.38f, -0.38f, 0.38f, -1.02f, 0.0f, -1.4f);
                    p10.f();
                    C5952e.b(c5952e2, p10.f21239a, 0, n11, null, 1.0f, 0, 2, 1.0f);
                    c5953f2 = c5952e2.c();
                    R4.b.f15045f = c5953f2;
                }
                AbstractC1607r1.b(c5953f2, Ng.H.v(R.string.voice_state_end_description, abstractC1725n), a12, AbstractC5102d.f42765b, abstractC1725n, 0, 0);
                return;
            default:
                AbstractC4326r a13 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                F0 c10 = s0.c(new X("preview", K.f3015g, true, false, false, false, 8180));
                Ld.a aVar = Ld.b.f11043a;
                int i13 = Y.b.f22007c;
                R4.b.w(c10, aVar, aVar, C0319d.f3045Z, io.sentry.hints.i.c(Z0.g.f22792b), C0320e.f3048Y, a13, abstractC1725n, 200264, 64);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f3044Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
