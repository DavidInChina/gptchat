package ec;

import F.AbstractC0528b;
import Z.AbstractC1725n;
import com.openai.chatgpt.R;
import id.AbstractC3557B;

/* renamed from: ec.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2850b extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2850b f29203Z = new C2850b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2850b f29204h0 = new C2850b(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C2850b f29205i0 = new C2850b(2);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f29206Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2850b(int i10) {
        super(3);
        this.f29206Y = i10;
    }

    public final void a(AbstractC0528b abstractC0528b, AbstractC1725n abstractC1725n, int i10) {
        int i11 = 2;
        switch (this.f29206Y) {
            case 0:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(abstractC0528b)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                r9.y.L(androidx.compose.foundation.lazy.a.a(abstractC0528b), abstractC1725n, 0, 0);
                return;
            case 1:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(abstractC0528b)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                r9.y.L(androidx.compose.foundation.lazy.a.a(abstractC0528b), abstractC1725n, 0, 0);
                return;
            default:
                AbstractC3557B.c0("$this$item", abstractC0528b);
                L0.u uVar3 = io.sentry.compose.b.f34309a;
                if ((i10 & 14) == 0) {
                    if (((Z.r) abstractC1725n).g(abstractC0528b)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Bi.c.o(Ng.H.v(R.string.settings_data_account, abstractC1725n), androidx.compose.foundation.lazy.a.a(abstractC0528b), 0L, abstractC1725n, 0, 4);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f29206Y) {
            case 0:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((AbstractC0528b) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
