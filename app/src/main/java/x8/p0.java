package x8;

import j$.util.Objects;

/* loaded from: classes2.dex */
public final class p0 extends P {

    /* renamed from: l0  reason: collision with root package name */
    public static final p0 f49595l0 = new p0(0, null, new Object[0]);

    /* renamed from: i0  reason: collision with root package name */
    public final transient Object f49596i0;

    /* renamed from: j0  reason: collision with root package name */
    public final transient Object[] f49597j0;

    /* renamed from: k0  reason: collision with root package name */
    public final transient int f49598k0;

    public p0(int i10, Object obj, Object[] objArr) {
        this.f49596i0 = obj;
        this.f49597j0 = objArr;
        this.f49598k0 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f A[RETURN] */
    @Override // x8.P, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        Object obj2;
        if (obj != null) {
            Object[] objArr = this.f49597j0;
            if (this.f49598k0 == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                }
            } else {
                Object obj4 = this.f49596i0;
                if (obj4 != null) {
                    if (obj4 instanceof byte[]) {
                        byte[] bArr = (byte[]) obj4;
                        int length = bArr.length - 1;
                        int u02 = M3.H.u0(obj.hashCode());
                        while (true) {
                            int i10 = u02 & length;
                            int i11 = bArr[i10] & 255;
                            if (i11 == 255) {
                                break;
                            } else if (obj.equals(objArr[i11])) {
                                obj2 = objArr[i11 ^ 1];
                                break;
                            } else {
                                u02 = i10 + 1;
                            }
                        }
                    } else if (obj4 instanceof short[]) {
                        short[] sArr = (short[]) obj4;
                        int length2 = sArr.length - 1;
                        int u03 = M3.H.u0(obj.hashCode());
                        while (true) {
                            int i12 = u03 & length2;
                            int i13 = sArr[i12] & 65535;
                            if (i13 == 65535) {
                                break;
                            } else if (obj.equals(objArr[i13])) {
                                obj2 = objArr[i13 ^ 1];
                                break;
                            } else {
                                u03 = i12 + 1;
                            }
                        }
                    } else {
                        int[] iArr = (int[]) obj4;
                        int length3 = iArr.length - 1;
                        int u04 = M3.H.u0(obj.hashCode());
                        while (true) {
                            int i14 = u04 & length3;
                            int i15 = iArr[i14];
                            if (i15 == -1) {
                                break;
                            } else if (obj.equals(objArr[i15])) {
                                obj2 = objArr[i15 ^ 1];
                                break;
                            } else {
                                u04 = i14 + 1;
                            }
                        }
                    }
                }
            }
            if (obj2 != null) {
                return null;
            }
            return obj2;
        }
        obj2 = null;
        if (obj2 != null) {
        }
    }

    @Override // java.util.Map
    public final int size() {
        return this.f49598k0;
    }
}
