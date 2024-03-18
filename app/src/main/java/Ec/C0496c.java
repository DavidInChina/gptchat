package Ec;

import W.AbstractC1607r1;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import l0.AbstractC4326r;
import y.AbstractC6463a;

/* renamed from: Ec.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0496c extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0496c f4611Z = new C0496c(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0496c f4612h0 = new C0496c(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f4613Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0496c(int i10) {
        super(2);
        this.f4613Y = i10;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        switch (this.f4613Y) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                AbstractC1607r1.b(Gi.e.z(), Ng.H.v(R.string.whisper_close, abstractC1725n), a5, 0L, abstractC1725n, 0, 12);
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
                Yg.p.Companion.getClass();
                y.d(new H(new C(0, new Yg.p(AbstractC6463a.n("instant(...)")))), C0497d.f4614Y, C0497d.f4615Z, C0497d.f4616h0, C0497d.f4617i0, a10, abstractC1725n, 28080, 32);
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
                AbstractC1607r1.b(Gi.e.z(), Ng.H.v(R.string.whisper_close, abstractC1725n), a11, 0L, abstractC1725n, 0, 12);
                return;
        }
    }

    @Override // wf.n
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f4613Y) {
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
