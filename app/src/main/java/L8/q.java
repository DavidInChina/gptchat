package L8;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class q extends p {

    /* renamed from: b  reason: collision with root package name */
    public final K8.n f10828b;

    public q(K8.n nVar, LinkedHashMap linkedHashMap) {
        super(linkedHashMap);
        this.f10828b = nVar;
    }

    @Override // L8.p
    public final Object d() {
        return this.f10828b.i();
    }

    @Override // L8.p
    public final void f(Object obj, P8.b bVar, o oVar) {
        Object b10 = oVar.f10822i.b(bVar);
        if (b10 != null || !oVar.f10825l) {
            boolean z10 = oVar.f10819f;
            Field field = oVar.f10815b;
            if (z10) {
                s.b(obj, field);
            } else if (oVar.f10826m) {
                throw new RuntimeException(R.a.r("Cannot set value of 'static final' ", N8.c.d(field, false)));
            }
            field.set(obj, b10);
        }
    }

    @Override // L8.p
    public final Object e(Object obj) {
        return obj;
    }
}
