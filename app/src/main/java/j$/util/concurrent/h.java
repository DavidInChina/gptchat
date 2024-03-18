package j$.util.concurrent;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class h extends AbstractC3719a implements Iterator, Enumeration {

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f35292k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l[] lVarArr, int i10, int i11, ConcurrentHashMap concurrentHashMap, int i12) {
        super(lVarArr, i10, i11, concurrentHashMap);
        this.f35292k = i12;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f35292k) {
            case 0:
                l lVar = this.f35307b;
                if (lVar == null) {
                    throw new NoSuchElementException();
                }
                this.f35287j = lVar;
                a();
                return lVar.f35299b;
            default:
                l lVar2 = this.f35307b;
                if (lVar2 == null) {
                    throw new NoSuchElementException();
                }
                Object obj = lVar2.f35300c;
                this.f35287j = lVar2;
                a();
                return obj;
        }
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        switch (this.f35292k) {
            case 0:
                return next();
            default:
                return next();
        }
    }
}
