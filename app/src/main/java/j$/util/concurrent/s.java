package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class s extends l {

    /* renamed from: e  reason: collision with root package name */
    s f35319e;

    /* renamed from: f  reason: collision with root package name */
    s f35320f;

    /* renamed from: g  reason: collision with root package name */
    s f35321g;

    /* renamed from: h  reason: collision with root package name */
    s f35322h;

    /* renamed from: i  reason: collision with root package name */
    boolean f35323i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(int i10, Object obj, Object obj2, s sVar, s sVar2) {
        super(i10, obj, obj2, sVar);
        this.f35319e = sVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.util.concurrent.l
    public final l a(Object obj, int i10) {
        return b(i10, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final s b(int i10, Object obj, Class cls) {
        if (obj != null) {
            s sVar = this;
            do {
                s sVar2 = sVar.f35320f;
                s sVar3 = sVar.f35321g;
                int i11 = sVar.f35298a;
                if (i11 <= i10) {
                    if (i11 >= i10) {
                        Object obj2 = sVar.f35299b;
                        if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                            return sVar;
                        }
                        if (sVar2 != null) {
                            if (sVar3 != null) {
                                if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                                    int i12 = ConcurrentHashMap.f35264g;
                                    int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                                    if (compareTo != 0) {
                                        if (compareTo >= 0) {
                                            sVar2 = sVar3;
                                        }
                                    }
                                }
                                s b10 = sVar3.b(i10, obj, cls);
                                if (b10 != null) {
                                    return b10;
                                }
                            }
                        }
                    }
                    sVar = sVar3;
                    continue;
                }
                sVar = sVar2;
                continue;
            } while (sVar != null);
            return null;
        }
        return null;
    }
}
