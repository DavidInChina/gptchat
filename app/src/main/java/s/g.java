package s;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class g implements Iterable {

    /* renamed from: Y  reason: collision with root package name */
    public c f45012Y;

    /* renamed from: Z  reason: collision with root package name */
    public c f45013Z;

    /* renamed from: h0  reason: collision with root package name */
    public final WeakHashMap f45014h0 = new WeakHashMap();

    /* renamed from: i0  reason: collision with root package name */
    public int f45015i0 = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r3.hasNext() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (((s.e) r7).hasNext() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f45015i0 != gVar.f45015i0) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = gVar.iterator();
        while (true) {
            e eVar = (e) it;
            if (!eVar.hasNext()) {
                break;
            }
            e eVar2 = (e) it2;
            if (!eVar2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) eVar.next();
            Object next = eVar2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public c f(Object obj) {
        c cVar = this.f45012Y;
        while (cVar != null && !cVar.f45003Y.equals(obj)) {
            cVar = cVar.f45005h0;
        }
        return cVar;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i10 = 0;
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                i10 += ((Map.Entry) eVar.next()).hashCode();
            } else {
                return i10;
            }
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b bVar = new b(this.f45012Y, this.f45013Z, 0);
        this.f45014h0.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public Object r(Object obj) {
        c f6 = f(obj);
        if (f6 == null) {
            return null;
        }
        this.f45015i0--;
        WeakHashMap weakHashMap = this.f45014h0;
        if (!weakHashMap.isEmpty()) {
            for (f fVar : weakHashMap.keySet()) {
                fVar.a(f6);
            }
        }
        c cVar = f6.f45006i0;
        if (cVar != null) {
            cVar.f45005h0 = f6.f45005h0;
        } else {
            this.f45012Y = f6.f45005h0;
        }
        c cVar2 = f6.f45005h0;
        if (cVar2 != null) {
            cVar2.f45006i0 = cVar;
        } else {
            this.f45013Z = cVar;
        }
        f6.f45005h0 = null;
        f6.f45006i0 = null;
        return f6.f45004Z;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            e eVar = (e) it;
            if (eVar.hasNext()) {
                sb2.append(((Map.Entry) eVar.next()).toString());
                if (eVar.hasNext()) {
                    sb2.append(", ");
                }
            } else {
                sb2.append("]");
                return sb2.toString();
            }
        }
    }
}
