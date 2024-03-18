package Q8;

import R8.s;
import S8.M;
import Z.AbstractC1725n;
import Z.r;
import id.AbstractC3557B;
import jf.y;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14507Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.p f14508Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.p f14509h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(wf.p pVar, wf.p pVar2, int i10) {
        super(4);
        this.f14507Y = i10;
        this.f14508Z = pVar;
        this.f14509h0 = pVar2;
    }

    public final void a(M m10, s sVar, AbstractC1725n abstractC1725n, int i10) {
        int i11;
        int i12;
        int i13 = 16;
        int i14 = 2;
        switch (this.f14507Y) {
            case 0:
                AbstractC3557B.c0("$this$FormattedList", m10);
                AbstractC3557B.c0("it", sVar);
                if ((i10 & 14) == 0) {
                    if (((r) abstractC1725n).g(m10)) {
                        i14 = 4;
                    }
                    i11 = i10 | i14;
                } else {
                    i11 = i10;
                }
                if ((i10 & 112) == 0) {
                    if (((r) abstractC1725n).g(sVar)) {
                        i13 = 32;
                    }
                    i11 |= i13;
                }
                if ((i11 & 731) == 146) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                m.d(m10, sVar, this.f14508Z, this.f14509h0, abstractC1725n, (i11 & 14) | (i11 & 112));
                return;
            default:
                AbstractC3557B.c0("$this$FormattedList", m10);
                AbstractC3557B.c0("astListItem", sVar);
                if ((i10 & 14) == 0) {
                    if (((r) abstractC1725n).g(m10)) {
                        i14 = 4;
                    }
                    i12 = i10 | i14;
                } else {
                    i12 = i10;
                }
                if ((i10 & 112) == 0) {
                    if (((r) abstractC1725n).g(sVar)) {
                        i13 = 32;
                    }
                    i12 |= i13;
                }
                if ((i12 & 731) == 146) {
                    r rVar2 = (r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                m.d(m10, sVar, this.f14508Z, this.f14509h0, abstractC1725n, (i12 & 14) | (i12 & 112));
                return;
        }
    }

    @Override // wf.p
    public final /* bridge */ /* synthetic */ Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        y yVar = y.f36177a;
        switch (this.f14507Y) {
            case 0:
                a((M) obj, (s) obj2, (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
            default:
                a((M) obj, (s) obj2, (AbstractC1725n) obj3, ((Number) obj4).intValue());
                return yVar;
        }
    }
}
