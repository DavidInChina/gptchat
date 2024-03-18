package ib;

import Dd.C0398t;
import Dd.K;
import E.AbstractC0434s;
import E0.C0453l;
import E0.N;
import F.AbstractC0528b;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import Kd.m;
import L0.u;
import Ng.H;
import W.I2;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import Z.r;
import androidx.compose.foundation.layout.FillElement;
import com.openai.chatgpt.R;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.List;
import jf.y;
import kotlin.jvm.internal.o;
import l0.C4310b;
import l0.C4323o;
import l8.AbstractC4344b;
import mh.C4663H;
import mh.C4688s;
import wd.C6209w;
import wf.p;
import y.AbstractC6463a;

/* loaded from: classes.dex */
public final class k extends o implements p {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f32935Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f32936Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, List list) {
        super(4);
        this.f32935Y = i10;
        this.f32936Z = list;
    }

    @Override // wf.p
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i10;
        int i11;
        y yVar = y.f36177a;
        C4323o c4323o = C4323o.f37719b;
        int i12 = 4;
        int i13 = this.f32935Y;
        List list = this.f32936Z;
        switch (i13) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                AbstractC1725n abstractC1725n = (AbstractC1725n) obj3;
                ((Number) obj4).intValue();
                AbstractC3557B.c0("$this$HorizontalPager", (H.y) obj);
                u uVar = io.sentry.compose.b.f34309a;
                C4663H c10 = me.saket.telephoto.zoomable.a.c(me.saket.telephoto.zoomable.a.d(new C4688s(3.0f, 4), abstractC1725n, 6, 2), abstractC1725n);
                FillElement fillElement = androidx.compose.foundation.layout.e.f24739c;
                r rVar = (r) abstractC1725n;
                rVar.W(733328855);
                N c11 = AbstractC0434s.c(C4310b.f37693Y, false, rVar);
                rVar.W(-1323940314);
                int i14 = rVar.P;
                AbstractC1732q0 p10 = rVar.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i15 = androidx.compose.ui.layout.a.i(fillElement);
                if (rVar.f22696a instanceof AbstractC1707e) {
                    rVar.Z();
                    if (rVar.f22695O) {
                        rVar.o(c0582k);
                    } else {
                        rVar.k0();
                    }
                    U3.f.n0(rVar, c11, C0583l.f5808f);
                    U3.f.n0(rVar, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar.f22695O || !AbstractC3557B.K(rVar.K(), Integer.valueOf(i14))) {
                        AbstractC6463a.q(i14, rVar, i14, c0581j);
                    }
                    AbstractC6463a.r(0, i15, new L0(rVar), rVar, 2058660585);
                    androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f24731a;
                    Bi.c.E(((C6209w) list.get(intValue)).f48469a, H.v(R.string.conversation_image_content_description, rVar), fillElement, c10, null, 0.0f, null, null, C0453l.f4075c, false, null, null, false, rVar, 100663680, 0, 7920);
                    rVar.W(-372027923);
                    if (!((Boolean) c10.f39405b.getValue()).booleanValue()) {
                        I2.b(bVar.a(c4323o, C4310b.f37697j0), 0L, 0.0f, 0L, 0, rVar, 0, 30);
                    }
                    AbstractC6463a.v(rVar, false, false, true, false);
                    rVar.t(false);
                    return yVar;
                }
                R4.b.r1();
                throw null;
            default:
                AbstractC0528b abstractC0528b = (AbstractC0528b) obj;
                int intValue2 = ((Number) obj2).intValue();
                AbstractC1725n abstractC1725n2 = (AbstractC1725n) obj3;
                int intValue3 = ((Number) obj4).intValue();
                if ((intValue3 & 14) == 0) {
                    if (!((r) abstractC1725n2).g(abstractC0528b)) {
                        i12 = 2;
                    }
                    i10 = intValue3 | i12;
                } else {
                    i10 = intValue3;
                }
                if ((intValue3 & 112) == 0) {
                    if (((r) abstractC1725n2).e(intValue2)) {
                        i11 = 32;
                    } else {
                        i11 = 16;
                    }
                    i10 |= i11;
                }
                if ((i10 & 731) == 146) {
                    r rVar2 = (r) abstractC1725n2;
                    if (rVar2.B()) {
                        rVar2.P();
                        return yVar;
                    }
                }
                Object obj5 = list.get(intValue2);
                int i16 = (i10 & 112) | (i10 & 14);
                u uVar2 = io.sentry.compose.b.f34309a;
                if (obj5 instanceof K) {
                    r rVar3 = (r) abstractC1725n2;
                    rVar3.W(-734312426);
                    K k10 = (K) obj5;
                    AbstractC4344b.F(intValue2, k10.f3521a.name(), k10.f3522b.toString(), rVar3, (i16 >> 3) & 14);
                    rVar3.t(false);
                } else if (obj5 instanceof m) {
                    r rVar4 = (r) abstractC1725n2;
                    rVar4.W(-734312115);
                    AbstractC4344b.F(intValue2, H.v(R.string.voice_debug_connection_state, rVar4), obj5.toString(), rVar4, (i16 >> 3) & 14);
                    rVar4.t(false);
                } else if (obj5 instanceof C0398t) {
                    r rVar5 = (r) abstractC1725n2;
                    rVar5.W(-734311780);
                    AbstractC4344b.F(intValue2, H.v(R.string.voice_debug_state_update, rVar5), ((C0398t) obj5).toString(), rVar5, (i16 >> 3) & 14);
                    rVar5.t(false);
                } else {
                    r rVar6 = (r) abstractC1725n2;
                    rVar6.W(-734311500);
                    rVar6.t(false);
                }
                return yVar;
        }
    }
}
