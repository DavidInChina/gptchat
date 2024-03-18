package D;

import Qg.AbstractC1207j;
import Z.AbstractC1710f0;
import java.util.ArrayList;
import java.util.List;
import jf.y;
import nf.AbstractC4825e;

/* loaded from: classes.dex */
public final class f implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3179Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ List f3180Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f3181h0;

    public /* synthetic */ f(ArrayList arrayList, AbstractC1710f0 abstractC1710f0, int i10) {
        this.f3179Y = i10;
        this.f3180Z = arrayList;
        this.f3181h0 = abstractC1710f0;
    }

    public final Object a(k kVar) {
        y yVar = y.f36177a;
        int i10 = this.f3179Y;
        AbstractC1710f0 abstractC1710f0 = this.f3181h0;
        List list = this.f3180Z;
        switch (i10) {
            case 0:
                if (kVar instanceof d) {
                    list.add(kVar);
                } else if (kVar instanceof e) {
                    list.remove(((e) kVar).f3178a);
                }
                abstractC1710f0.setValue(Boolean.valueOf(!list.isEmpty()));
                return yVar;
            case 1:
                if (kVar instanceof h) {
                    list.add(kVar);
                } else if (kVar instanceof i) {
                    list.remove(((i) kVar).f3185a);
                }
                abstractC1710f0.setValue(Boolean.valueOf(!list.isEmpty()));
                return yVar;
            default:
                if (kVar instanceof p) {
                    list.add(kVar);
                } else if (kVar instanceof q) {
                    list.remove(((q) kVar).f3193a);
                } else if (kVar instanceof o) {
                    list.remove(((o) kVar).f3191a);
                }
                abstractC1710f0.setValue(Boolean.valueOf(!list.isEmpty()));
                return yVar;
        }
    }

    @Override // Qg.AbstractC1207j
    public final /* bridge */ /* synthetic */ Object c(Object obj, AbstractC4825e abstractC4825e) {
        int i10 = this.f3179Y;
        y yVar = y.f36177a;
        switch (i10) {
            case 0:
                a((k) obj);
                return yVar;
            case 1:
                a((k) obj);
                return yVar;
            default:
                a((k) obj);
                return yVar;
        }
    }
}
