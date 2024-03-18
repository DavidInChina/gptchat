package na;

import F.C0535i;
import gb.C3234k;
import gb.C3235l;
import h0.C3288a;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.List;
import ta.C5705d;
import ta.C5721u;

/* renamed from: na.f0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4751f0 extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39975Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.k f39976Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ List f39977h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4751f0(List list, wf.k kVar, int i10) {
        super(1);
        this.f39975Y = i10;
        this.f39977h0 = list;
        this.f39976Z = kVar;
    }

    public final Object a(int i10) {
        int i11 = this.f39975Y;
        wf.k kVar = this.f39976Z;
        List list = this.f39977h0;
        switch (i11) {
            case 0:
                return kVar.invoke(list.get(i10));
            case 1:
                return kVar.invoke(list.get(i10));
            case 2:
                return kVar.invoke(list.get(i10));
            case 3:
                return kVar.invoke(list.get(i10));
            case 4:
                return kVar.invoke(list.get(i10));
            case 5:
            case 7:
            default:
                return kVar.invoke(list.get(i10));
            case 6:
                return kVar.invoke(list.get(i10));
            case 8:
                return kVar.invoke(list.get(i10));
            case 9:
                return kVar.invoke(list.get(i10));
            case 10:
                return kVar.invoke(list.get(i10));
            case 11:
                return kVar.invoke(list.get(i10));
            case 12:
                return kVar.invoke(list.get(i10));
            case 13:
                return kVar.invoke(list.get(i10));
            case 14:
                return kVar.invoke(list.get(i10));
            case 15:
                return kVar.invoke(list.get(i10));
            case 16:
                return kVar.invoke(list.get(i10));
            case 17:
                return kVar.invoke(list.get(i10));
            case 18:
                return kVar.invoke(list.get(i10));
            case 19:
                return kVar.invoke(list.get(i10));
            case 20:
                return kVar.invoke(list.get(i10));
            case 21:
                return kVar.invoke(list.get(i10));
            case 22:
                return kVar.invoke(list.get(i10));
            case 23:
                return kVar.invoke(list.get(i10));
        }
    }

    public final void c(F.B b10) {
        int i10 = this.f39975Y;
        wf.k kVar = this.f39976Z;
        List list = this.f39977h0;
        switch (i10) {
            case 5:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                C0535i c0535i = (C0535i) b10;
                c0535i.l0(list.size(), null, new C4751f0(C5705d.f45918q0, list, 4), new C3288a(new C5721u(list, kVar, 1), true, -632812321));
                return;
            default:
                AbstractC3557B.c0("$this$LazyColumn", b10);
                C0535i c0535i2 = (C0535i) b10;
                c0535i2.l0(list.size(), null, new C4751f0(C5705d.f45921t0, list, 6), new C3288a(new C5721u(list, kVar, 2), true, -632812321));
                return;
        }
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f39975Y) {
            case 0:
                return a(((Number) obj).intValue());
            case 1:
                return a(((Number) obj).intValue());
            case 2:
                return a(((Number) obj).intValue());
            case 3:
                return a(((Number) obj).intValue());
            case 4:
                return a(((Number) obj).intValue());
            case 5:
                c((F.B) obj);
                return yVar;
            case 6:
                return a(((Number) obj).intValue());
            case 7:
                c((F.B) obj);
                return yVar;
            case 8:
                return a(((Number) obj).intValue());
            case 9:
                return a(((Number) obj).intValue());
            case 10:
                return a(((Number) obj).intValue());
            case 11:
                return a(((Number) obj).intValue());
            case 12:
                return a(((Number) obj).intValue());
            case 13:
                return a(((Number) obj).intValue());
            case 14:
                return a(((Number) obj).intValue());
            case 15:
                return a(((Number) obj).intValue());
            case 16:
                return a(((Number) obj).intValue());
            case 17:
                return a(((Number) obj).intValue());
            case 18:
                return a(((Number) obj).intValue());
            case 19:
                return a(((Number) obj).intValue());
            case 20:
                return a(((Number) obj).intValue());
            case 21:
                return a(((Number) obj).intValue());
            case 22:
                return a(((Number) obj).intValue());
            case 23:
                return a(((Number) obj).intValue());
            case 24:
                C3235l c3235l = (C3235l) obj;
                AbstractC3557B.c0("data", c3235l);
                List list = this.f39977h0;
                Iterator it = list.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (!AbstractC3557B.K(((C3234k) it.next()).f31470a, c3235l.f31474c)) {
                            i10++;
                        }
                    } else {
                        i10 = -1;
                    }
                }
                this.f39976Z.invoke(new gb.b0(i10, list));
                return yVar;
            default:
                return a(((Number) obj).intValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4751f0(wf.k kVar, List list, int i10) {
        super(1);
        this.f39975Y = i10;
        this.f39976Z = kVar;
        this.f39977h0 = list;
    }
}
