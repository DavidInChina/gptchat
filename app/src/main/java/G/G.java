package G;

import E0.p0;
import E0.q0;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class G implements q0 {

    /* renamed from: a  reason: collision with root package name */
    public final D f5425a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f5426b = new LinkedHashMap();

    public G(D d10) {
        this.f5425a = d10;
    }

    @Override // E0.q0
    public final boolean a(Object obj, Object obj2) {
        D d10 = this.f5425a;
        return AbstractC3557B.K(d10.b(obj), d10.b(obj2));
    }

    @Override // E0.q0
    public final void b(p0 p0Var) {
        int i10;
        LinkedHashMap linkedHashMap = this.f5426b;
        linkedHashMap.clear();
        Iterator it = p0Var.f4088Y.iterator();
        while (it.hasNext()) {
            Object b10 = this.f5425a.b(it.next());
            Integer num = (Integer) linkedHashMap.get(b10);
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 0;
            }
            if (i10 == 7) {
                it.remove();
            } else {
                linkedHashMap.put(b10, Integer.valueOf(i10 + 1));
            }
        }
    }
}
