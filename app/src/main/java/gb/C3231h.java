package gb;

import ca.AbstractC2318j;
import ca.C2317i;
import ca.C2325q;
import ca.C2326r;
import fa.C2969F;
import fa.C2976e;
import ha.C3360c;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yf.AbstractC6583a;

/* renamed from: gb.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3231h extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C3231h f31436Z = new C3231h(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C3231h f31437h0 = new C3231h(1);

    /* renamed from: i0  reason: collision with root package name */
    public static final C3231h f31438i0 = new C3231h(2);

    /* renamed from: j0  reason: collision with root package name */
    public static final C3231h f31439j0 = new C3231h(3);

    /* renamed from: k0  reason: collision with root package name */
    public static final C3231h f31440k0 = new C3231h(4);

    /* renamed from: l0  reason: collision with root package name */
    public static final C3231h f31441l0 = new C3231h(5);

    /* renamed from: m0  reason: collision with root package name */
    public static final C3231h f31442m0 = new C3231h(6);

    /* renamed from: n0  reason: collision with root package name */
    public static final C3231h f31443n0 = new C3231h(7);

    /* renamed from: o0  reason: collision with root package name */
    public static final C3231h f31444o0 = new C3231h(8);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31445Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3231h(int i10) {
        super(1);
        this.f31445Y = i10;
    }

    public final C2317i a(AbstractC2318j abstractC2318j) {
        switch (this.f31445Y) {
            case 4:
                AbstractC3557B.c0("it", abstractC2318j);
                if (!(abstractC2318j instanceof C2317i)) {
                    return null;
                }
                return (C2317i) abstractC2318j;
            default:
                AbstractC3557B.c0("it", abstractC2318j);
                if (!(abstractC2318j instanceof C2317i)) {
                    return null;
                }
                return (C2317i) abstractC2318j;
        }
    }

    public final void c(k0 k0Var) {
        switch (this.f31445Y) {
            case 0:
                AbstractC3557B.c0("it", k0Var);
                return;
            case 1:
                AbstractC3557B.c0("it", k0Var);
                return;
            case 2:
                AbstractC3557B.c0("it", k0Var);
                return;
            default:
                AbstractC3557B.c0("it", k0Var);
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        C2326r c2326r;
        Kg.k kVar;
        List list;
        fa.q qVar;
        List list2;
        jf.y yVar = jf.y.f36177a;
        switch (this.f31445Y) {
            case 0:
                c((k0) obj);
                return yVar;
            case 1:
                c((k0) obj);
                return yVar;
            case 2:
                c((k0) obj);
                return yVar;
            case 3:
                c((k0) obj);
                return yVar;
            case 4:
                return a((AbstractC2318j) obj);
            case 5:
                C2317i c2317i = (C2317i) obj;
                AbstractC3557B.c0("it", c2317i);
                return Boolean.valueOf(c2317i.f26395d instanceof C2325q);
            case 6:
                C2317i c2317i2 = (C2317i) obj;
                AbstractC3557B.c0("it", c2317i2);
                com.google.android.gms.internal.play_billing.N n10 = c2317i2.f26395d;
                AbstractC3557B.a0("null cannot be cast to non-null type com.openai.feature.conversations.domain.conversation.ToolSummaryData.CustomActionData", n10);
                return ((C2325q) n10).f26412g;
            case 7:
                return a((AbstractC2318j) obj);
            default:
                C2317i c2317i3 = (C2317i) obj;
                AbstractC3557B.c0("toolItem", c2317i3);
                com.google.android.gms.internal.play_billing.N n11 = c2317i3.f26395d;
                if (n11 instanceof C2326r) {
                    c2326r = (C2326r) n11;
                } else {
                    c2326r = null;
                }
                if (c2326r != null && (qVar = c2326r.f26415i) != null && (list2 = qVar.f30076c) != null) {
                    kVar = kf.t.V1(list2);
                } else {
                    kVar = null;
                }
                if (kVar == null) {
                    kVar = Kg.d.f9815a;
                }
                ArrayList arrayList = new ArrayList();
                for (C2969F c2969f : c2317i3.f26393b) {
                    C3360c c3360c = c2969f.f30032y;
                    if (c3360c != null) {
                        list = c3360c.f32058b;
                    } else {
                        list = null;
                    }
                    if (list != null) {
                        arrayList.add(list);
                    }
                }
                ArrayList I12 = AbstractC6583a.I1(arrayList);
                ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(I12, 10));
                Iterator it = I12.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new C2976e((wd.Y) it.next()));
                }
                return Kg.p.b1(Kg.p.e1(kVar, kf.t.V1(arrayList2)));
        }
    }
}
