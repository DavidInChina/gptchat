package w9;

import L0.u;
import Z.AbstractC1725n;
import Z.r;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;
import z.AbstractC6657D;
import z.AbstractC6659E;
import z.AbstractC6696f;
import z.AbstractC6717p0;
import z.C6735y0;

/* renamed from: w9.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6145b extends o implements wf.o {

    /* renamed from: Z  reason: collision with root package name */
    public static final C6145b f48241Z = new C6145b(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C6145b f48242h0 = new C6145b(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48243Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6145b(int i10) {
        super(3);
        this.f48243Y = i10;
    }

    public final AbstractC6659E a(AbstractC6717p0 abstractC6717p0, AbstractC1725n abstractC1725n) {
        C6735y0 c6735y0;
        C6735y0 c6735y02;
        switch (this.f48243Y) {
            case 0:
                AbstractC3557B.c0("$this$animateFloat", abstractC6717p0);
                u uVar = io.sentry.compose.b.f34309a;
                r rVar = (r) abstractC1725n;
                rVar.W(1749591506);
                if (abstractC6717p0.b(Boolean.FALSE, Boolean.TRUE)) {
                    c6735y0 = AbstractC6696f.v(30, 0, null, 6);
                } else {
                    c6735y0 = AbstractC6696f.v(75, 0, null, 6);
                }
                rVar.t(false);
                return c6735y0;
            default:
                AbstractC3557B.c0("$this$animateFloat", abstractC6717p0);
                u uVar2 = io.sentry.compose.b.f34309a;
                r rVar2 = (r) abstractC1725n;
                rVar2.W(34708158);
                if (abstractC6717p0.b(Boolean.FALSE, Boolean.TRUE)) {
                    c6735y02 = AbstractC6696f.v(120, 0, AbstractC6657D.f51126b, 2);
                } else {
                    c6735y02 = AbstractC6696f.v(1, 74, null, 4);
                }
                rVar2.t(false);
                return c6735y02;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f48243Y) {
            case 0:
                ((Number) obj3).intValue();
                return a((AbstractC6717p0) obj, (AbstractC1725n) obj2);
            default:
                ((Number) obj3).intValue();
                return a((AbstractC6717p0) obj, (AbstractC1725n) obj2);
        }
    }
}
