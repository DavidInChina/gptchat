package bb;

import F.AbstractC0528b;
import Z.AbstractC1725n;
import cb.C2334C;
import cb.C2350T;
import java.util.List;

/* loaded from: classes.dex */
public final class W extends kotlin.jvm.internal.o implements wf.p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ List f25747Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2350T f25748Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f25749h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ boolean f25750i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(List list, C2350T c2350t, wf.k kVar, boolean z10) {
        super(4);
        this.f25747Y = list;
        this.f25748Z = c2350t;
        this.f25749h0 = kVar;
        this.f25750i0 = z10;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        int i12;
        AbstractC0528b abstractC0528b = (AbstractC0528b) obj;
        int intValue = ((Number) obj2).intValue();
        AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 14) == 0) {
            if (((Z.r) abstractC1725n).g(abstractC0528b)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | intValue2;
        } else {
            i10 = intValue2;
        }
        if ((intValue2 & 112) == 0) {
            if (((Z.r) abstractC1725n).e(intValue)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 731) == 146) {
            Z.r rVar = (Z.r) abstractC1725n;
            if (rVar.B()) {
                rVar.P();
                return jf.y.f36177a;
            }
        }
        C2334C c2334c = (C2334C) this.f25747Y.get(intValue);
        L0.u uVar = io.sentry.compose.b.f34309a;
        C2350T c2350t = this.f25748Z;
        wf.k kVar = this.f25749h0;
        boolean z10 = this.f25750i0;
        L4.a.d(c2350t.f26486a, c2334c, kVar, c2350t, intValue, z10, abstractC1725n, (((i10 & 112) | (i10 & 14)) << 9) & 57344);
        return jf.y.f36177a;
    }
}
