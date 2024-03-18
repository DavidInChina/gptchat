package H0;

import Qg.AbstractC1207j;
import id.AbstractC3557B;
import java.util.List;
import na.B1;
import nf.AbstractC4825e;

/* loaded from: classes2.dex */
public final class p1 implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6987Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f6988Z;

    public /* synthetic */ p1(int i10, Object obj) {
        this.f6987Y = i10;
        this.f6988Z = obj;
    }

    @Override // Qg.AbstractC1207j
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f6987Y;
        Object obj2 = this.f6988Z;
        switch (i10) {
            case 0:
                ((G0) obj2).f6736Y.i(((Number) obj).floatValue());
                return yVar;
            case 1:
                ((B1) obj2).l(new J.c(5, ((Boolean) obj).booleanValue()));
                return yVar;
            case 2:
                Te.z zVar = (Te.z) obj;
                if (zVar instanceof Te.y) {
                    Te.y yVar2 = (Te.y) zVar;
                    int i11 = Xe.r.f21918q;
                    We.w wVar = (We.w) ((Xe.r) obj2).f21849h.get();
                    if (wVar != null) {
                        AbstractC3557B.c0("trackEvent", yVar2);
                        Xe.B b10 = (Xe.B) wVar.c().get(yVar2.f17209a.f21950e);
                        if (b10 != null) {
                            wVar.f21062d.a(new Te.j(wVar, b10, yVar2.f17208b), wVar.f21061c);
                        }
                    }
                }
                return yVar;
            default:
                List list = (List) obj;
                kh.e eVar = (kh.e) obj2;
                eVar.getClass();
                AbstractC3557B.c0("<set-?>", list);
                eVar.f37554d.setValue(list);
                return yVar;
        }
    }
}
