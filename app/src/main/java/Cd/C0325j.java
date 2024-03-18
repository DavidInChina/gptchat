package Cd;

import E.AbstractC0434s;
import E.AbstractC0441z;
import F.AbstractC0539m;
import G.C0550e;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import androidx.compose.ui.ZIndexElement;
import de.AbstractC2634i;
import de.C2631f;
import de.C2632g;
import de.C2635j;
import fa.AbstractC2965B;
import fa.C2976e;
import fa.C2979h;
import gb.C3234k;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l0.AbstractC4326r;
import l0.C4310b;
import l8.AbstractC4344b;
import wd.Y;
import y.AbstractC6463a;
import yf.AbstractC6583a;

/* renamed from: Cd.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325j extends kotlin.jvm.internal.o implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3059Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f3060Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f3061h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0325j(Object obj, int i10, Object obj2) {
        super(3);
        this.f3059Y = i10;
        this.f3060Z = obj;
        this.f3061h0 = obj2;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Iterable iterable;
        String str;
        wd.U u10;
        String str2;
        wd.U u11;
        boolean z10;
        boolean z11;
        boolean z12;
        float f6;
        int i10;
        jf.y yVar = jf.y.f36177a;
        int i11 = this.f3059Y;
        Object obj4 = this.f3061h0;
        Object obj5 = this.f3060Z;
        switch (i11) {
            case 0:
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj2;
                int intValue = ((Number) obj3).intValue();
                AbstractC3557B.c0("$this$BottomSheet", (AbstractC0441z) obj);
                AbstractC4326r a5 = io.sentry.compose.b.a("VoiceAttachmentsBottomSheet");
                if ((intValue & 81) == 16) {
                    Z.r rVar = (Z.r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return yVar;
                    }
                }
                X x10 = (X) obj5;
                List<AbstractC2965B> list = x10.f3036k;
                ArrayList arrayList = new ArrayList();
                for (AbstractC2965B abstractC2965B : list) {
                    if (abstractC2965B instanceof C2976e) {
                        Y y10 = ((C2976e) abstractC2965B).f30060b;
                        String str3 = y10.f48372a;
                        wd.X x11 = y10.f48376e;
                        if (x11 != null && (u11 = x11.f48371a) != null) {
                            str2 = u11.f48367a;
                        } else {
                            str2 = null;
                        }
                        iterable = AbstractC4344b.F0(new C3234k(str3, str2));
                    } else if (abstractC2965B instanceof C2979h) {
                        List<Y> list2 = ((C2979h) abstractC2965B).f30064b;
                        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list2, 10));
                        for (Y y11 : list2) {
                            String str4 = y11.f48372a;
                            wd.X x12 = y11.f48376e;
                            if (x12 != null && (u10 = x12.f48371a) != null) {
                                str = u10.f48367a;
                            } else {
                                str = null;
                            }
                            arrayList2.add(new C3234k(str4, str));
                        }
                        iterable = arrayList2;
                    } else {
                        iterable = kf.v.f37483Y;
                    }
                    kf.s.N1(iterable, arrayList);
                }
                AbstractC0539m.a(a5, null, null, false, null, null, null, false, new C6.a(x10, arrayList, (wf.k) obj4, 23), abstractC1725n, 0, 255);
                return yVar;
            default:
                int intValue2 = ((Number) obj).intValue();
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj2;
                int intValue3 = ((Number) obj3).intValue();
                if ((intValue3 & 14) == 0) {
                    if (((Z.r) abstractC1725n2).e(intValue2)) {
                        i10 = 4;
                    } else {
                        i10 = 2;
                    }
                    intValue3 |= i10;
                }
                if ((intValue3 & 91) == 18) {
                    Z.r rVar2 = (Z.r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                C0550e c0550e = (C0550e) obj5;
                C2631f c2631f = (C2631f) ((C2632g) c0550e.f5498c).f28228a.invoke(Integer.valueOf(intValue2));
                C2635j c2635j = (C2635j) obj4;
                float f10 = AbstractC2634i.f28237a;
                int i12 = c2631f.f28224a;
                wf.k kVar = c2635j.f28239a;
                int i13 = c2631f.f28225b;
                if (i12 < ((Number) kVar.invoke(Integer.valueOf(i13))).intValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i13 < ((Number) c2635j.f28240b.invoke(Integer.valueOf(c2631f.f28224a))).intValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c2631f.f28227d - i13 >= 1 && c2635j.f28241c) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z10 && z11) {
                    f6 = 2.0f;
                } else if (z10 && z12) {
                    f6 = 3.0f;
                } else if (!z10 && !z11 && !z12) {
                    f6 = 0.0f;
                } else {
                    f6 = 1.0f;
                }
                ZIndexElement zIndexElement = new ZIndexElement(f6);
                Z.r rVar3 = (Z.r) abstractC1725n2;
                rVar3.W(733328855);
                E0.N c10 = AbstractC0434s.c(C4310b.f37693Y, true, rVar3);
                rVar3.W(-1323940314);
                int i14 = rVar3.P;
                AbstractC1732q0 p10 = rVar3.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i15 = androidx.compose.ui.layout.a.i(zIndexElement);
                if (rVar3.f22696a instanceof AbstractC1707e) {
                    rVar3.Z();
                    if (rVar3.f22695O) {
                        rVar3.o(c0582k);
                    } else {
                        rVar3.k0();
                    }
                    U3.f.n0(rVar3, c10, C0583l.f5808f);
                    U3.f.n0(rVar3, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar3.f22695O || !AbstractC3557B.K(rVar3.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar3, i14, c0581j);
                    }
                    AbstractC6463a.r(0, i15, new L0(rVar3), rVar3, 2058660585);
                    ((C2632g) c0550e.f5498c).f28231d.invoke(Integer.valueOf(intValue2), rVar3, Integer.valueOf(intValue3 & 14));
                    rVar3.t(false);
                    AbstractC6463a.u(rVar3, true, false, false);
                    return yVar;
                }
                R4.b.r1();
                throw null;
        }
    }
}
