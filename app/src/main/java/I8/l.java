package I8;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class l extends E {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8103a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ E f8104b;

    public l(E e10, int i10) {
        this.f8103a = i10;
        this.f8104b = e10;
    }

    @Override // I8.E
    public final Object b(P8.b bVar) {
        int i10 = this.f8103a;
        E e10 = this.f8104b;
        switch (i10) {
            case 0:
                return new AtomicLong(((Number) e10.b(bVar)).longValue());
            case 1:
                ArrayList arrayList = new ArrayList();
                bVar.a();
                while (bVar.P()) {
                    arrayList.add(Long.valueOf(((Number) e10.b(bVar)).longValue()));
                }
                bVar.k();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i11 = 0; i11 < size; i11++) {
                    atomicLongArray.set(i11, ((Long) arrayList.get(i11)).longValue());
                }
                return atomicLongArray;
            default:
                if (bVar.R0() == 9) {
                    bVar.A0();
                    return null;
                }
                return e10.b(bVar);
        }
    }

    @Override // I8.E
    public final void c(P8.c cVar, Object obj) {
        int i10 = this.f8103a;
        E e10 = this.f8104b;
        switch (i10) {
            case 0:
                e10.c(cVar, Long.valueOf(((AtomicLong) obj).get()));
                return;
            case 1:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.h();
                int length = atomicLongArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    e10.c(cVar, Long.valueOf(atomicLongArray.get(i11)));
                }
                cVar.k();
                return;
            default:
                if (obj == null) {
                    cVar.F();
                    return;
                } else {
                    e10.c(cVar, obj);
                    return;
                }
        }
    }
}
