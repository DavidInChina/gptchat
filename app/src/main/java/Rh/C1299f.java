package Rh;

import yh.C6641v;

/* renamed from: Rh.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1299f extends AbstractC1293c {

    /* renamed from: k0  reason: collision with root package name */
    public static final /* synthetic */ int f15838k0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public final ClassLoader f15839j0;

    public C1299f(y7.b bVar, ClassLoader classLoader) {
        super(bVar, k1.f15921Y);
        this.f15839j0 = classLoader;
    }

    @Override // Rh.AbstractC1293c
    public final o1 b(String str) {
        try {
            return new n1(C6641v.l1(Class.forName(str, false, this.f15839j0)));
        } catch (ClassNotFoundException unused) {
            return new m1(str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002c A[RETURN] */
    @Override // Rh.AbstractC1293c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || C1299f.class != obj.getClass()) {
            return false;
        }
        ClassLoader classLoader = this.f15839j0;
        ClassLoader classLoader2 = ((C1299f) obj).f15839j0;
        if (classLoader2 != null) {
            if (classLoader == null || !classLoader.equals(classLoader2)) {
                return false;
            }
            return true;
        } else if (classLoader != null) {
            return false;
        }
    }

    @Override // Rh.AbstractC1293c
    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        ClassLoader classLoader = this.f15839j0;
        if (classLoader != null) {
            return hashCode + classLoader.hashCode();
        }
        return hashCode;
    }
}
