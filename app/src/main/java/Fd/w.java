package Fd;

import E.q0;
import Ng.H;
import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.ArrayList;
import l0.AbstractC4326r;
import r0.N;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import v0.C5957j;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final w f5286Z = new w(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final w f5287h0 = new w(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5288Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i10) {
        super(3);
        this.f5288Y = i10;
    }

    public final void a(q0 q0Var, AbstractC1725n abstractC1725n, int i10) {
        switch (this.f5288Y) {
            case 0:
                AbstractC3557B.c0("$this$TextButton", q0Var);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                C5953f c5953f = R4.b.f15041b;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Filled.Done", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i11 = AbstractC5944H.f46870a;
                    N n10 = new N(r0.r.f44254b);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new v0.n(9.0f, 16.2f));
                    arrayList.add(new v0.m(4.8f, 12.0f));
                    arrayList.add(new v0.u(-1.4f, 1.4f));
                    arrayList.add(new v0.m(9.0f, 19.0f));
                    arrayList.add(new v0.m(21.0f, 7.0f));
                    arrayList.add(new v0.u(-1.4f, -1.4f));
                    arrayList.add(new v0.m(9.0f, 16.2f));
                    arrayList.add(C5957j.f46979c);
                    C5952e.b(c5952e, arrayList, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    R4.b.f15041b = c5953f;
                }
                AbstractC1607r1.b(c5953f, H.v(R.string.assistant_notification_confirm, abstractC1725n), a5, 0L, abstractC1725n, 0, 12);
                j4.b(H.v(R.string.assistant_notification_confirm, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                AbstractC3557B.c0("$this$TextButton", q0Var);
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC1607r1.b(P4.a.P(), H.v(R.string.assistant_notification_dismiss, abstractC1725n), a10, 0L, abstractC1725n, 0, 12);
                j4.b(H.v(R.string.assistant_notification_dismiss, abstractC1725n), a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f5288Y) {
            case 0:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((q0) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
