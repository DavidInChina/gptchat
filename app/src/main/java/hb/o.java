package hb;

import G0.X;
import W.AbstractC1607r1;
import W.Z0;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import java.util.ArrayList;
import k6.AbstractC4194d;
import l0.AbstractC4326r;
import l0.C4323o;
import p9.AbstractC5103e;
import r0.N;
import u0.AbstractC5824b;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import v0.C5957j;
import v0.z;

/* loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32117Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ t f32118Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(t tVar, int i10) {
        super(2);
        this.f32117Y = i10;
        this.f32118Z = tVar;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C5953f c5953f;
        AbstractC5824b F10;
        long j6;
        C4323o c4323o = C4323o.f37719b;
        int i11 = this.f32117Y;
        t tVar = this.f32118Z;
        switch (i11) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("AudioMessageController");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                if (tVar.f32137i) {
                    c5953f = Bi.c.f2426b;
                    if (c5953f == null) {
                        C5952e c5952e = new C5952e("Filled.PlayArrow", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = AbstractC5944H.f46870a;
                        N n10 = new N(r0.r.f44254b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new v0.n(8.0f, 5.0f));
                        arrayList.add(new z(14.0f));
                        arrayList.add(new v0.u(11.0f, -7.0f));
                        arrayList.add(C5957j.f46979c);
                        C5952e.b(c5952e, arrayList, 0, n10, null, 1.0f, 0, 2, 1.0f);
                        c5953f = c5952e.c();
                        Bi.c.f2426b = c5953f;
                    }
                } else {
                    c5953f = A7.b.f719d;
                    if (c5953f == null) {
                        C5952e c5952e2 = new C5952e("Filled.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = AbstractC5944H.f46870a;
                        N n11 = new N(r0.r.f44254b);
                        Wh.p pVar = new Wh.p(0);
                        pVar.p(6.0f, 19.0f);
                        pVar.m(4.0f);
                        pVar.n(10.0f, 5.0f);
                        pVar.n(6.0f, 5.0f);
                        pVar.x(14.0f);
                        pVar.f();
                        pVar.p(14.0f, 5.0f);
                        pVar.x(14.0f);
                        pVar.m(4.0f);
                        pVar.n(18.0f, 5.0f);
                        pVar.m(-4.0f);
                        pVar.f();
                        C5952e.b(c5952e2, pVar.f21239a, 0, n11, null, 1.0f, 0, 2, 1.0f);
                        c5953f = c5952e2.c();
                        A7.b.f719d = c5953f;
                    }
                }
                AbstractC1607r1.b(c5953f, null, a5, 0L, abstractC1725n, 48, 12);
                return;
            default:
                AbstractC4326r a10 = io.sentry.compose.b.a("AudioMessageController");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                if (tVar.f32130b) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    rVar3.W(1569371973);
                    F10 = kotlin.jvm.internal.m.F(R.drawable.auto_stop, rVar3);
                    rVar3.t(false);
                } else {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    rVar4.W(1569372085);
                    F10 = kotlin.jvm.internal.m.F(R.drawable.auto_play, rVar4);
                    rVar4.t(false);
                }
                AbstractC5824b abstractC5824b = F10;
                Z.r rVar5 = (Z.r) abstractC1725n;
                rVar5.W(1569372249);
                if (tVar.f32130b) {
                    j6 = AbstractC5103e.f42774e;
                } else {
                    j6 = ((r0.r) rVar5.m(Z0.f19875a)).f44265a;
                }
                long j10 = j6;
                rVar5.t(false);
                AbstractC1607r1.a(abstractC5824b, null, AbstractC4194d.a((X) a10, androidx.compose.foundation.layout.e.j(c4323o, 20)), j10, rVar5, 440, 0);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f32117Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
