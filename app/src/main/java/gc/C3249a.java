package gc;

import Ng.H;
import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import jf.y;
import l0.AbstractC4326r;
import r0.N;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;

/* renamed from: gc.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3249a extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3249a f31545Z = new C3249a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3249a f31546h0 = new C3249a(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31547Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3249a(int i10) {
        super(2);
        this.f31547Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f31547Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.settings_developer_overrides, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                C5953f c5953f = Bi.c.f2427c;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Outlined.ClearAll", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = AbstractC5944H.f46870a;
                    N n10 = new N(r0.r.f44254b);
                    Wh.p pVar = new Wh.p(0);
                    pVar.p(5.0f, 13.0f);
                    pVar.m(14.0f);
                    pVar.x(-2.0f);
                    pVar.n(5.0f, 11.0f);
                    pVar.x(2.0f);
                    pVar.f();
                    pVar.p(3.0f, 17.0f);
                    pVar.m(14.0f);
                    pVar.x(-2.0f);
                    pVar.n(3.0f, 15.0f);
                    pVar.x(2.0f);
                    pVar.f();
                    pVar.p(7.0f, 7.0f);
                    pVar.x(2.0f);
                    pVar.m(14.0f);
                    E9.f.C(pVar, 21.0f, 7.0f, 7.0f, 7.0f);
                    C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    Bi.c.f2427c = c5953f;
                }
                AbstractC1607r1.b(c5953f, null, a10, 0L, abstractC1725n, 48, 12);
                return;
            default:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Bi.c.e(Ad.l.W0(null, abstractC1725n, 31), a11, null, abstractC1725n, 8, 6);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f31547Y) {
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
