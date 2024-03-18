package na;

import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import l0.AbstractC4326r;
import wd.C6168C;

/* renamed from: na.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4765k extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C4765k f40001Z = new C4765k(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C4765k f40002h0 = new C4765k(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C4765k f40003i0 = new C4765k(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C4765k f40004j0 = new C4765k(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C4765k f40005k0 = new C4765k(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C4765k f40006l0 = new C4765k(5);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f40007Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4765k(int i10) {
        super(2);
        this.f40007Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f40007Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(Ng.H.v(R.string.conversation_menu_item_share, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
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
                AbstractC1607r1.b(K4.J.D(), null, a10, 0L, abstractC1725n, 48, 12);
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
                j4.b(Ng.H.v(R.string.conversation_menu_item_report, abstractC1725n), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            default:
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                AbstractC1607r1.b(U3.f.R(), null, a12, 0L, abstractC1725n, 48, 12);
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f40007Y) {
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
            case 4:
                D1 d12 = (D1) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                AbstractC3557B.c0("$this$setOnEach", d12);
                return D1.e(d12, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, false, false, false, null, booleanValue, null, false, null, -1, 61);
            default:
                D1 d13 = (D1) obj;
                String str = ((C6168C) obj2).f48321a;
                AbstractC3557B.c0("$this$setOnEach", d13);
                AbstractC3557B.c0("it", str);
                return D1.e(d13, null, null, null, str, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, null, false, false, false, null, false, null, false, null, -17, 63);
        }
    }
}
