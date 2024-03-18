package Cb;

import W.AbstractC1607r1;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import l0.AbstractC4326r;
import l0.C4323o;

/* renamed from: Cb.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0311v extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0311v f2963Z = new C0311v(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0311v f2964h0 = new C0311v(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0311v f2965i0 = new C0311v(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C0311v f2966j0 = new C0311v(3);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2967Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0311v(int i10) {
        super(2);
        this.f2967Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f2967Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.design_logo_google, abstractC1725n), null, a5, 0L, abstractC1725n, 56, 12);
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.m(c4323o, p9.r.f42840d), abstractC1725n);
                L4.a.D(R.string.login_google, abstractC1725n, 0);
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
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.design_logo_apple, abstractC1725n), null, a10, 0L, abstractC1725n, 56, 12);
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.m(c4323o, p9.r.f42840d), abstractC1725n);
                L4.a.D(R.string.login_apple, abstractC1725n, 0);
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.email, abstractC1725n), null, a11, 0L, abstractC1725n, 56, 12);
                androidx.compose.foundation.layout.a.d(androidx.compose.foundation.layout.e.m(c4323o, p9.r.f42839c), abstractC1725n);
                L4.a.D(R.string.login_email, abstractC1725n, 0);
                return;
            case 3:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                L4.a.D(R.string.login, abstractC1725n, 0);
                return;
            default:
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                L4.a.v(Ad.l.W0(null, abstractC1725n, 31), a12, null, abstractC1725n, 8, 6);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f2967Y) {
            case 0:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
