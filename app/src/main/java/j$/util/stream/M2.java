package j$.util.stream;

import j$.util.AbstractC3732p;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes3.dex */
final class M2 extends E2 {

    /* renamed from: d  reason: collision with root package name */
    private ArrayList f35477d;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f35477d.add(obj);
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final void k() {
        ArrayList arrayList = this.f35477d;
        boolean z10 = arrayList instanceof List;
        Comparator comparator = this.f35411b;
        if (z10) {
            ((List) arrayList).sort(comparator);
        } else {
            List.CC.$default$sort(arrayList, comparator);
        }
        AbstractC3818q2 abstractC3818q2 = this.f35690a;
        abstractC3818q2.l(this.f35477d.size());
        if (!this.f35412c) {
            ArrayList arrayList2 = this.f35477d;
            Objects.requireNonNull(abstractC3818q2);
            AbstractC3732p.q(arrayList2, new C3735a(abstractC3818q2, 2));
        } else {
            Iterator it = this.f35477d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (abstractC3818q2.n()) {
                    break;
                }
                abstractC3818q2.accept((AbstractC3818q2) next);
            }
        }
        abstractC3818q2.k();
        this.f35477d = null;
    }

    @Override // j$.util.stream.AbstractC3798m2, j$.util.stream.AbstractC3818q2
    public final void l(long j6) {
        if (j6 < 2147483639) {
            this.f35477d = j6 >= 0 ? new ArrayList((int) j6) : new ArrayList();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
