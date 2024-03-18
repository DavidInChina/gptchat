package na;

import E.AbstractC0434s;
import E.AbstractC0438w;
import W.AbstractC1547f0;
import W.AbstractC1607r1;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.ArrayList;
import l0.AbstractC4326r;
import l0.C4323o;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import v0.C5957j;

/* renamed from: na.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4735a extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4735a f39896Z = new C4735a(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4735a f39897h0 = new C4735a(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C4735a f39898i0 = new C4735a(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39899Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4735a(int i10) {
        super(3);
        this.f39899Y = i10;
    }

    public final void a(AbstractC0438w abstractC0438w, AbstractC1725n abstractC1725n, int i10) {
        C4323o c4323o = C4323o.f37719b;
        switch (this.f39899Y) {
            case 1:
                AbstractC3557B.c0("$this$BadgedBox", abstractC0438w);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC1547f0.a(a5, 0L, 0L, null, abstractC1725n, 0, 15);
                return;
            default:
                AbstractC3557B.c0("$this$BadgedBox", abstractC0438w);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 81) == 16) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC0434s.a(androidx.compose.foundation.layout.e.j(c4323o, D0.f39745a), abstractC1725n, 6);
                return;
        }
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f39899Y) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$Button", (E.q0) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((intValue & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                C5953f c5953f = A7.b.f721f;
                if (c5953f == null) {
                    C5952e c5952e = new C5952e("Outlined.KeyboardDoubleArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i10 = AbstractC5944H.f46870a;
                    long j6 = r0.r.f44254b;
                    r0.N n10 = new r0.N(j6);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new v0.n(18.0f, 6.41f));
                    arrayList.add(new v0.u(-1.41f, -1.41f));
                    arrayList.add(new v0.u(-4.59f, 4.58f));
                    arrayList.add(new v0.u(-4.59f, -4.58f));
                    arrayList.add(new v0.u(-1.41f, 1.41f));
                    arrayList.add(new v0.u(6.0f, 6.0f));
                    C5957j c5957j = C5957j.f46979c;
                    arrayList.add(c5957j);
                    C5952e.b(c5952e, arrayList, 0, n10, null, 1.0f, 0, 2, 1.0f);
                    r0.N n11 = new r0.N(j6);
                    ArrayList arrayList2 = new ArrayList(32);
                    arrayList2.add(new v0.n(18.0f, 13.0f));
                    arrayList2.add(new v0.u(-1.41f, -1.41f));
                    arrayList2.add(new v0.u(-4.59f, 4.58f));
                    arrayList2.add(new v0.u(-4.59f, -4.58f));
                    arrayList2.add(new v0.u(-1.41f, 1.41f));
                    arrayList2.add(new v0.u(6.0f, 6.0f));
                    arrayList2.add(c5957j);
                    C5952e.b(c5952e, arrayList2, 0, n11, null, 1.0f, 0, 2, 1.0f);
                    c5953f = c5952e.c();
                    A7.b.f721f = c5953f;
                }
                AbstractC1607r1.b(c5953f, Ng.H.v(R.string.conversations_scroll_to_bottom, abstractC1725n), a5, 0L, abstractC1725n, 0, 12);
                return yVar;
            case 1:
                a((AbstractC0438w) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0438w) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
