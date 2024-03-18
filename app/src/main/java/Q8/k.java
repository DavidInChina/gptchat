package Q8;

import R8.s;
import S8.M;
import Z.AbstractC1725n;
import Z.r;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import id.AbstractC3557B;
import jf.y;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14510Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ s f14511Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.p f14512h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(s sVar, wf.p pVar, int i10) {
        super(3);
        this.f14510Y = i10;
        this.f14511Z = sVar;
        this.f14512h0 = pVar;
    }

    public final void a(M m10, AbstractC1725n abstractC1725n, int i10) {
        int i11 = 2;
        switch (this.f14510Y) {
            case 0:
                AbstractC3557B.c0("$this$Heading", m10);
                if ((i10 & 14) == 0) {
                    if (((r) abstractC1725n).g(m10)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                Ad.l.q(m10, this.f14511Z, this.f14512h0, new AppendedSemanticsElement(d.f14480i0, false), abstractC1725n, i10 & 14, 0);
                return;
            case 1:
                AbstractC3557B.c0("$this$cell", m10);
                if ((i10 & 14) == 0) {
                    if (((r) abstractC1725n).g(m10)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                Ad.l.q(m10, this.f14511Z, this.f14512h0, null, abstractC1725n, i10 & 14, 4);
                return;
            default:
                AbstractC3557B.c0("$this$cell", m10);
                if ((i10 & 14) == 0) {
                    if (((r) abstractC1725n).g(m10)) {
                        i11 = 4;
                    }
                    i10 |= i11;
                }
                if ((i10 & 91) == 18) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                Ad.l.q(m10, this.f14511Z, this.f14512h0, null, abstractC1725n, i10 & 14, 4);
                return;
        }
    }

    @Override // wf.o
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        y yVar = y.f36177a;
        switch (this.f14510Y) {
            case 0:
                a((M) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            case 1:
                a((M) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
            default:
                a((M) obj, (AbstractC1725n) obj2, ((Number) obj3).intValue());
                return yVar;
        }
    }
}
