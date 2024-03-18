package s;

import java.util.HashMap;

/* loaded from: classes2.dex */
public final class a extends g {

    /* renamed from: j0  reason: collision with root package name */
    public final HashMap f45001j0 = new HashMap();

    @Override // s.g
    public final c f(Object obj) {
        return (c) this.f45001j0.get(obj);
    }

    @Override // s.g
    public final Object r(Object obj) {
        Object r10 = super.r(obj);
        this.f45001j0.remove(obj);
        return r10;
    }

    public final Object s(Object obj, Object obj2) {
        c f6 = f(obj);
        if (f6 != null) {
            return f6.f45004Z;
        }
        HashMap hashMap = this.f45001j0;
        c cVar = new c(obj, obj2);
        this.f45015i0++;
        c cVar2 = this.f45013Z;
        if (cVar2 == null) {
            this.f45012Y = cVar;
            this.f45013Z = cVar;
        } else {
            cVar2.f45005h0 = cVar;
            cVar.f45006i0 = cVar2;
            this.f45013Z = cVar;
        }
        hashMap.put(obj, cVar);
        return null;
    }
}
