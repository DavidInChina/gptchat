package Vf;

import Jf.p;
import Nf.n;
import Nf.o;
import Sf.v;
import bg.AbstractC2203k;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kf.s;
import kf.x;
import kg.C4290b;
import kg.C4294f;
import pg.C5165b;
import pg.C5172i;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final Map f18948a = AbstractC4268D.a1(new C3959i("PACKAGE", EnumSet.noneOf(o.class)), new C3959i("TYPE", EnumSet.of(o.f12842i0, o.f12854u0)), new C3959i("ANNOTATION_TYPE", EnumSet.of(o.f12843j0)), new C3959i("TYPE_PARAMETER", EnumSet.of(o.f12844k0)), new C3959i("FIELD", EnumSet.of(o.f12846m0)), new C3959i("LOCAL_VARIABLE", EnumSet.of(o.f12847n0)), new C3959i("PARAMETER", EnumSet.of(o.f12848o0)), new C3959i("CONSTRUCTOR", EnumSet.of(o.f12849p0)), new C3959i("METHOD", EnumSet.of(o.f12850q0, o.f12851r0, o.f12852s0)), new C3959i("TYPE_USE", EnumSet.of(o.f12853t0)));

    /* renamed from: b  reason: collision with root package name */
    public static final Map f18949b = AbstractC4268D.a1(new C3959i("RUNTIME", n.f12832Y), new C3959i("CLASS", n.f12833Z), new C3959i("SOURCE", n.f12834h0));

    public static C5165b a(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof AbstractC2203k) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Iterable iterable = (EnumSet) f18948a.get(C4294f.e(((v) ((AbstractC2203k) it.next())).f16626b.name()).b());
            if (iterable == null) {
                iterable = x.f37485Y;
            }
            s.N1(iterable, arrayList2);
        }
        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new C5172i(C4290b.j(p.f9188u), C4294f.e(((o) it2.next()).name())));
        }
        return new C5165b(d.f18947Y, arrayList3);
    }
}
