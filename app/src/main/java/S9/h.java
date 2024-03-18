package S9;

import ca.C2316h;
import ca.EnumC2323o;
import fa.C2969F;
import fa.EnumC2970G;
import fa.EnumC2971H;
import fa.y;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import x8.W;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class h extends N9.f {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f16421a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(C2969F c2969f) {
        super(c2969f);
        AbstractC3557B.c0("message", c2969f);
        ArrayList arrayList = new ArrayList();
        a(c2969f);
        this.f16421a = arrayList;
    }

    @Override // N9.f
    public final boolean a(C2969F c2969f) {
        AbstractC3557B.c0("message", c2969f);
        if (c2969f.f30011d == EnumC2971H.f30047Z) {
            if (c2969f.f30022o == EnumC2970G.f30034Y) {
                this.f16421a.add(c2969f);
            }
        }
        if (!W.O(c2969f) && !(c2969f.f30015h instanceof y)) {
            return false;
        }
        return true;
    }

    @Override // N9.f
    public final List b(EnumC2323o enumC2323o) {
        AbstractC3557B.c0("replaceInProgress", enumC2323o);
        ArrayList arrayList = this.f16421a;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C2316h((C2969F) it.next()));
        }
        return arrayList2;
    }
}
