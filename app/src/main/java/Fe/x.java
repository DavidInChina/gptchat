package Fe;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class x implements w {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f5365a = true;

    /* renamed from: b  reason: collision with root package name */
    public final Map f5366b = new j();

    public x(int i10) {
    }

    @Override // Fe.w
    public final Set a() {
        Set entrySet = this.f5366b.entrySet();
        AbstractC3557B.c0("<this>", entrySet);
        Set unmodifiableSet = Collections.unmodifiableSet(entrySet);
        AbstractC3557B.b0("unmodifiableSet(this)", unmodifiableSet);
        return unmodifiableSet;
    }

    @Override // Fe.w
    public final boolean b() {
        return this.f5365a;
    }

    @Override // Fe.w
    public final List c(String str) {
        AbstractC3557B.c0("name", str);
        return (List) this.f5366b.get(str);
    }

    @Override // Fe.w
    public final void clear() {
        this.f5366b.clear();
    }

    @Override // Fe.w
    public final boolean d(String str) {
        AbstractC3557B.c0("name", str);
        return this.f5366b.containsKey(str);
    }

    @Override // Fe.w
    public final void e(String str, Iterable iterable) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, iterable);
        List h10 = h(str);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            m(str2);
            h10.add(str2);
        }
    }

    @Override // Fe.w
    public final void f(String str, String str2) {
        AbstractC3557B.c0("name", str);
        AbstractC3557B.c0("value", str2);
        m(str2);
        h(str).add(str2);
    }

    public final void g(v vVar) {
        AbstractC3557B.c0("stringValues", vVar);
        vVar.d(new Jb.c(17, this));
    }

    public final List h(String str) {
        Map map = this.f5366b;
        List list = (List) map.get(str);
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            l(str);
            map.put(str, arrayList);
            return arrayList;
        }
        return list;
    }

    public final String i(String str) {
        List c10 = c(str);
        if (c10 != null) {
            return (String) kf.t.h2(c10);
        }
        return null;
    }

    @Override // Fe.w
    public final boolean isEmpty() {
        return this.f5366b.isEmpty();
    }

    public final void j(String str) {
        this.f5366b.remove(str);
    }

    public final void k(String str, String str2) {
        AbstractC3557B.c0("value", str2);
        m(str2);
        List h10 = h(str);
        h10.clear();
        h10.add(str2);
    }

    public void l(String str) {
        AbstractC3557B.c0("name", str);
    }

    public void m(String str) {
        AbstractC3557B.c0("value", str);
    }

    @Override // Fe.w
    public final Set names() {
        return this.f5366b.keySet();
    }
}
