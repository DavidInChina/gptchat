package p9;

import Z.AbstractC1725n;
import android.gov.nist.javax.sip.header.ParameterNames;
import id.AbstractC3557B;
import jf.y;
import t0.AbstractC5650i;

/* renamed from: p9.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5104f extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C5104f f42776Z = new C5104f(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C5104f f42777h0 = new C5104f(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f42778Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5104f(int i10) {
        super(2);
        this.f42778Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        switch (this.f42778Y) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj;
                int intValue = ((Number) obj2).intValue();
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((intValue & 11) == 2) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                    }
                }
                return yVar;
            default:
                AbstractC5650i abstractC5650i = (AbstractC5650i) obj;
                j jVar = (j) obj2;
                AbstractC3557B.c0("$this$null", abstractC5650i);
                AbstractC3557B.c0(ParameterNames.INFO, jVar);
                jVar.f42786a.g(abstractC5650i, abstractC5650i.g(), jVar.f42787b, jVar.f42788c);
                return yVar;
        }
    }
}
