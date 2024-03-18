package L8;

import I8.E;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: L8.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0894a extends E {

    /* renamed from: c  reason: collision with root package name */
    public static final com.auth0.android.request.internal.i f10781c = new com.auth0.android.request.internal.i(1);

    /* renamed from: a  reason: collision with root package name */
    public final Class f10782a;

    /* renamed from: b  reason: collision with root package name */
    public final w f10783b;

    public C0894a(I8.n nVar, E e10, Class cls) {
        this.f10783b = new w(nVar, e10, cls);
        this.f10782a = cls;
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        if (bVar.R0() == 9) {
            bVar.A0();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        bVar.a();
        while (bVar.P()) {
            arrayList.add(this.f10783b.b(bVar));
        }
        bVar.k();
        int size = arrayList.size();
        Class cls = this.f10782a;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance(cls, size);
            for (int i10 = 0; i10 < size; i10++) {
                Array.set(newInstance, i10, arrayList.get(i10));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, size));
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        if (obj == null) {
            cVar.F();
            return;
        }
        cVar.h();
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f10783b.c(cVar, Array.get(obj, i10));
        }
        cVar.k();
    }
}
