package j$.util.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class g extends l {

    /* renamed from: e  reason: collision with root package name */
    final l[] f35291e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(l[] lVarArr) {
        super(-1, null, null);
        this.f35291e = lVarArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
        if ((r0 instanceof j$.util.concurrent.g) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002b, code lost:
        r0 = ((j$.util.concurrent.g) r0).f35291e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0034, code lost:
        return r0.a(r5, r6);
     */
    @Override // j$.util.concurrent.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final l a(Object obj, int i10) {
        int length;
        l k10;
        Object obj2;
        l[] lVarArr = this.f35291e;
        loop0: while (obj != null && lVarArr != null && (length = lVarArr.length) != 0 && (k10 = ConcurrentHashMap.k(lVarArr, (length - 1) & i10)) != null) {
            while (true) {
                int i11 = k10.f35298a;
                if (i11 != i10 || ((obj2 = k10.f35299b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    if (i11 >= 0) {
                        k10 = k10.f35301d;
                        if (k10 == null) {
                            break loop0;
                        }
                    } else {
                        break;
                    }
                }
            }
            return k10;
        }
        return null;
    }
}
