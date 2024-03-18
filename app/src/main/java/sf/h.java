package Sf;

import bg.AbstractC2197e;
import id.AbstractC3557B;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;
import kg.C4294f;

/* loaded from: classes.dex */
public final class h extends AbstractC1387f implements AbstractC2197e {

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f16610b;

    public h(C4294f c4294f, Object[] objArr) {
        super(c4294f);
        this.f16610b = objArr;
    }

    public final ArrayList a() {
        Object obj;
        Object[] objArr = this.f16610b;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj2 : objArr) {
            AbstractC3557B.Z(obj2);
            Class<?> cls = obj2.getClass();
            List list = AbstractC1385d.f16603a;
            if (Enum.class.isAssignableFrom(cls)) {
                obj = new v(null, (Enum) obj2);
            } else if (obj2 instanceof Annotation) {
                obj = new C1388g(null, (Annotation) obj2);
            } else if (obj2 instanceof Object[]) {
                obj = new h(null, (Object[]) obj2);
            } else if (obj2 instanceof Class) {
                obj = new r(null, (Class) obj2);
            } else {
                obj = new x(obj2, null);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }
}
