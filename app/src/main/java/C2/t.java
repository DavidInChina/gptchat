package C2;

import id.AbstractC3557B;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Comparator {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2630Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f2631Z;

    public /* synthetic */ t(int i10, Object obj) {
        this.f2630Y = i10;
        this.f2631Z = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = this.f2630Y;
        Object obj3 = this.f2631Z;
        switch (i10) {
            case 0:
                x xVar = (x) obj3;
                return xVar.f(obj2) - xVar.f(obj);
            default:
                wf.k[] kVarArr = (wf.k[]) obj3;
                AbstractC3557B.c0("$selectors", kVarArr);
                for (wf.k kVar : kVarArr) {
                    int n10 = r.f.n((Comparable) kVar.invoke(obj), (Comparable) kVar.invoke(obj2));
                    if (n10 != 0) {
                        return n10;
                    }
                }
                return 0;
        }
    }
}
