package w9;

import Ng.H;
import W.AbstractC1607r1;
import Z.AbstractC1710f0;
import Z.AbstractC1725n;
import Z.C1723m;
import Z.r;
import com.openai.chatgpt.R;
import hc.AbstractC3392g;
import id.AbstractC3557B;
import java.util.ArrayList;
import jf.y;
import k6.AbstractC4194d;
import kotlin.jvm.internal.o;
import l0.AbstractC4326r;
import l8.AbstractC4344b;
import nf.AbstractC4828h;
import r0.N;
import r0.P;
import tb.AbstractC5729c;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import v0.C5957j;
import v0.m;
import v0.u;
import wf.AbstractC6216a;
import wf.n;

/* renamed from: w9.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6148e extends o implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f48247Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f48248Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6148e(AbstractC1710f0 abstractC1710f0, int i10) {
        super(2);
        this.f48247Y = i10;
        this.f48248Z = abstractC1710f0;
    }

    public final void a(AbstractC1725n abstractC1725n, int i10) {
        C5953f c5953f;
        String str;
        io.sentry.hints.i iVar = C1723m.f22654Y;
        int i11 = this.f48247Y;
        AbstractC1710f0 abstractC1710f0 = this.f48248Z;
        switch (i11) {
            case 1:
                AbstractC4326r a5 = io.sentry.compose.b.a("MessageSpreadsheetContent");
                if ((i10 & 11) == 2) {
                    r rVar = (r) abstractC1725n;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                }
                r rVar2 = (r) abstractC1725n;
                rVar2.W(131413488);
                Object K10 = rVar2.K();
                if (K10 == iVar) {
                    K10 = R.a.o(abstractC1710f0, 23, rVar2);
                }
                rVar2.t(false);
                H.f((AbstractC6216a) K10, a5, false, null, null, null, null, null, null, AbstractC5729c.f46038a, rVar2, 805306374, 510);
                return;
            case 2:
                AbstractC4326r a10 = io.sentry.compose.b.a("CustomInstructionsEditFooter");
                if ((i10 & 11) == 2) {
                    r rVar3 = (r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                r rVar4 = (r) abstractC1725n;
                rVar4.W(-33487934);
                boolean g10 = rVar4.g(abstractC1710f0);
                Object K11 = rVar4.K();
                if (g10 || K11 == iVar) {
                    K11 = E9.f.x(abstractC1710f0, 15, rVar4);
                }
                rVar4.t(false);
                H.f((AbstractC6216a) K11, a10, false, null, null, null, null, null, null, AbstractC3392g.f32201g, rVar4, 805306368, 510);
                return;
            default:
                AbstractC4326r a11 = io.sentry.compose.b.a("DevSection");
                if ((i10 & 11) == 2) {
                    r rVar5 = (r) abstractC1725n;
                    if (rVar5.B()) {
                        rVar5.P();
                        return;
                    }
                }
                if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                    c5953f = AbstractC4828h.f40329k;
                    if (c5953f == null) {
                        C5952e c5952e = new C5952e("Filled.KeyboardArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = AbstractC5944H.f46870a;
                        N n10 = new N(r0.r.f44254b);
                        ArrayList arrayList = new ArrayList(32);
                        arrayList.add(new v0.n(7.41f, 15.41f));
                        arrayList.add(new m(12.0f, 10.83f));
                        arrayList.add(new u(4.59f, 4.58f));
                        arrayList.add(new m(18.0f, 14.0f));
                        arrayList.add(new u(-6.0f, -6.0f));
                        arrayList.add(new u(-6.0f, 6.0f));
                        arrayList.add(C5957j.f46979c);
                        C5952e.b(c5952e, arrayList, 0, n10, null, 1.0f, 0, 2, 1.0f);
                        c5953f = c5952e.c();
                        AbstractC4828h.f40329k = c5953f;
                    }
                } else {
                    c5953f = AbstractC4344b.f37862f;
                    if (c5953f == null) {
                        C5952e c5952e2 = new C5952e("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i13 = AbstractC5944H.f46870a;
                        N n11 = new N(r0.r.f44254b);
                        ArrayList arrayList2 = new ArrayList(32);
                        arrayList2.add(new v0.n(7.41f, 8.59f));
                        arrayList2.add(new m(12.0f, 13.17f));
                        arrayList2.add(new u(4.59f, -4.58f));
                        arrayList2.add(new m(18.0f, 10.0f));
                        arrayList2.add(new u(-6.0f, 6.0f));
                        arrayList2.add(new u(-6.0f, -6.0f));
                        arrayList2.add(new u(1.41f, -1.41f));
                        arrayList2.add(C5957j.f46979c);
                        C5952e.b(c5952e2, arrayList2, 0, n11, null, 1.0f, 0, 2, 1.0f);
                        c5953f = c5952e2.c();
                        AbstractC4344b.f37862f = c5953f;
                    }
                }
                if (((Boolean) abstractC1710f0.getValue()).booleanValue()) {
                    r rVar6 = (r) abstractC1725n;
                    str = AbstractC4194d.u(rVar6, 497524783, R.string.voice_debug_collapse, rVar6, false);
                } else {
                    r rVar7 = (r) abstractC1725n;
                    str = AbstractC4194d.u(rVar7, 497524882, R.string.voice_debug_expand, rVar7, false);
                }
                AbstractC1607r1.b(c5953f, str, a11, r0.r.f44261i, abstractC1725n, 3072, 4);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0070  */
    @Override // wf.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i10;
        float f6;
        int i11;
        int i12;
        int i13;
        int i14;
        y yVar = y.f36177a;
        switch (this.f48247Y) {
            case 0:
                Z0.j jVar = (Z0.j) obj;
                Z0.j jVar2 = (Z0.j) obj2;
                AbstractC3557B.c0("parentBounds", jVar);
                AbstractC3557B.c0("menuBounds", jVar2);
                float f10 = h.f48254a;
                float f11 = 1.0f;
                int i15 = jVar.f22802c;
                if (jVar2.f22800a < i15) {
                    int i16 = jVar.f22800a;
                    if (jVar2.f22802c <= i16) {
                        f6 = 1.0f;
                    } else if (jVar2.b() != 0) {
                        f6 = (((Math.min(i15, i14) + Math.max(i16, i10)) / 2) - i10) / jVar2.b();
                    }
                    i11 = jVar.f22803d;
                    if (jVar2.f22801b < i11) {
                        int i17 = jVar.f22801b;
                        if (jVar2.f22803d > i17) {
                            if (jVar2.a() != 0) {
                                f11 = (((Math.min(i11, i13) + Math.max(i17, i12)) / 2) - i12) / jVar2.a();
                            }
                        }
                        this.f48248Z.setValue(new P(androidx.compose.ui.graphics.a.h(f6, f11)));
                        return yVar;
                    }
                    f11 = 0.0f;
                    this.f48248Z.setValue(new P(androidx.compose.ui.graphics.a.h(f6, f11)));
                    return yVar;
                }
                f6 = 0.0f;
                i11 = jVar.f22803d;
                if (jVar2.f22801b < i11) {
                }
                f11 = 0.0f;
                this.f48248Z.setValue(new P(androidx.compose.ui.graphics.a.h(f6, f11)));
                return yVar;
            case 1:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            default:
                a((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
        }
    }
}
