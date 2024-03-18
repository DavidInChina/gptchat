package Fe;

import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class y implements v {

    /* renamed from: c  reason: collision with root package name */
    public final boolean f5367c = true;

    /* renamed from: d  reason: collision with root package name */
    public final Map f5368d;

    public y(Map map) {
        j jVar = new j();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add((String) list.get(i10));
            }
            jVar.put(str, arrayList);
        }
        this.f5368d = jVar;
    }

    @Override // Fe.v
    public final Set a() {
        Set entrySet = this.f5368d.entrySet();
        AbstractC3557B.c0("<this>", entrySet);
        Set unmodifiableSet = Collections.unmodifiableSet(entrySet);
        AbstractC3557B.b0("unmodifiableSet(this)", unmodifiableSet);
        return unmodifiableSet;
    }

    @Override // Fe.v
    public final boolean b() {
        return this.f5367c;
    }

    @Override // Fe.v
    public final List c(String str) {
        AbstractC3557B.c0("name", str);
        return (List) this.f5368d.get(str);
    }

    @Override // Fe.v
    public final void d(wf.n nVar) {
        for (Map.Entry entry : this.f5368d.entrySet()) {
            nVar.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    @Override // Fe.v
    public final String e(String str) {
        List list = (List) this.f5368d.get(str);
        if (list != null) {
            return (String) kf.t.h2(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (this.f5367c != vVar.b()) {
            return false;
        }
        return AbstractC3557B.K(a(), vVar.a());
    }

    public final int hashCode() {
        int i10;
        Set a5 = a();
        if (this.f5367c) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        return a5.hashCode() + (i10 * 961);
    }

    @Override // Fe.v
    public final boolean isEmpty() {
        return this.f5368d.isEmpty();
    }

    @Override // Fe.v
    public final Set names() {
        Set keySet = this.f5368d.keySet();
        AbstractC3557B.c0("<this>", keySet);
        Set unmodifiableSet = Collections.unmodifiableSet(keySet);
        AbstractC3557B.b0("unmodifiableSet(this)", unmodifiableSet);
        return unmodifiableSet;
    }
}
