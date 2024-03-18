package H9;

import Ng.H;
import W.AbstractC1607r1;
import W.j4;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import java.util.List;
import l0.AbstractC4326r;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final q f7536Z = new q(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final q f7537h0 = new q(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final q f7538i0 = new q(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final q f7539j0 = new q(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final q f7540k0 = new q(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final q f7541l0 = new q(5);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f7542Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(int i10) {
        super(2);
        this.f7542Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f7542Y) {
            case 2:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.conversations_unarchive_button, abstractC1725n), a5, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 3:
                AbstractC4326r a10 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                AbstractC1607r1.a(kotlin.jvm.internal.m.F(R.drawable.archive, abstractC1725n), null, a10, 0L, abstractC1725n, 56, 12);
                return;
            case 4:
                AbstractC4326r a11 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                j4.b(H.v(R.string.conversations_delete_button, abstractC1725n), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 5:
                AbstractC4326r a12 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                AbstractC1607r1.b(M3.H.Q(), null, a12, 0L, abstractC1725n, 48, 12);
                return;
            default:
                AbstractC4326r a13 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar5 = (Z.r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                K8.d.c(Ad.l.W0(null, abstractC1725n, 31), a13, null, abstractC1725n, 8, 6);
                return;
        }
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f7542Y) {
            case 0:
                o oVar = (o) obj;
                List list = (List) obj2;
                AbstractC3557B.c0("$this$setOnEach", oVar);
                AbstractC3557B.c0("it", list);
                return o.e(oVar, false, list, null, false, 27);
            case 1:
                o oVar2 = (o) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                AbstractC3557B.c0("$this$setOnEach", oVar2);
                return o.e(oVar2, false, null, null, booleanValue, 15);
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 5:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
