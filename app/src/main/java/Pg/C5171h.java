package pg;

import Mf.B;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.List;
import l8.AbstractC4344b;

/* renamed from: pg.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5171h {

    /* renamed from: a  reason: collision with root package name */
    public static final C5171h f43145a = new Object();

    public final C5165b a(List list, B b10, Jf.n nVar) {
        List<Object> K22 = kf.t.K2(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : K22) {
            AbstractC5170g b11 = b(obj, null);
            if (b11 != null) {
                arrayList.add(b11);
            }
        }
        if (b10 != null) {
            return new C5187x(arrayList, b10.j().q(nVar));
        }
        return new C5165b(new Xf.f(7, nVar), arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kf.v] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v24, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [pg.h] */
    public final AbstractC5170g b(Object obj, B b10) {
        if (obj instanceof Byte) {
            return new C5167d(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new C5185v(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new C5174k(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C5183t(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            Character ch2 = (Character) obj;
            ch2.getClass();
            return new AbstractC5170g(ch2);
        } else if (obj instanceof Float) {
            return new C5166c(((Number) obj).floatValue());
        } else {
            if (obj instanceof Double) {
                return new C5166c(((Number) obj).doubleValue());
            }
            if (obj instanceof Boolean) {
                return new C5166c(((Boolean) obj).booleanValue());
            }
            if (obj instanceof String) {
                return new C5186w((String) obj);
            }
            boolean z10 = obj instanceof byte[];
            ?? r12 = kf.v.f37483Y;
            int i10 = 0;
            if (z10) {
                byte[] bArr = (byte[]) obj;
                AbstractC3557B.c0("<this>", bArr);
                int length = bArr.length;
                if (length != 0) {
                    if (length != 1) {
                        r12 = new ArrayList(bArr.length);
                        int length2 = bArr.length;
                        while (i10 < length2) {
                            r12.add(Byte.valueOf(bArr[i10]));
                            i10++;
                        }
                    } else {
                        r12 = AbstractC4344b.F0(Byte.valueOf(bArr[0]));
                    }
                }
                return a(r12, b10, Jf.n.f9127m0);
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                AbstractC3557B.c0("<this>", sArr);
                int length3 = sArr.length;
                if (length3 != 0) {
                    if (length3 != 1) {
                        r12 = new ArrayList(sArr.length);
                        int length4 = sArr.length;
                        while (i10 < length4) {
                            r12.add(Short.valueOf(sArr[i10]));
                            i10++;
                        }
                    } else {
                        r12 = AbstractC4344b.F0(Short.valueOf(sArr[0]));
                    }
                }
                return a(r12, b10, Jf.n.f9128n0);
            } else if (obj instanceof int[]) {
                int[] iArr = (int[]) obj;
                AbstractC3557B.c0("<this>", iArr);
                int length5 = iArr.length;
                ArrayList arrayList = r12;
                if (length5 != 0) {
                    if (length5 != 1) {
                        arrayList = kf.q.A3(iArr);
                    } else {
                        arrayList = AbstractC4344b.F0(Integer.valueOf(iArr[0]));
                    }
                }
                return a(arrayList, b10, Jf.n.f9129o0);
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                AbstractC3557B.c0("<this>", jArr);
                int length6 = jArr.length;
                if (length6 != 0) {
                    if (length6 != 1) {
                        r12 = new ArrayList(jArr.length);
                        int length7 = jArr.length;
                        while (i10 < length7) {
                            r12.add(Long.valueOf(jArr[i10]));
                            i10++;
                        }
                    } else {
                        r12 = AbstractC4344b.F0(Long.valueOf(jArr[0]));
                    }
                }
                return a(r12, b10, Jf.n.f9131q0);
            } else if (obj instanceof char[]) {
                char[] cArr = (char[]) obj;
                AbstractC3557B.c0("<this>", cArr);
                int length8 = cArr.length;
                if (length8 != 0) {
                    if (length8 != 1) {
                        r12 = new ArrayList(cArr.length);
                        int length9 = cArr.length;
                        while (i10 < length9) {
                            r12.add(Character.valueOf(cArr[i10]));
                            i10++;
                        }
                    } else {
                        r12 = AbstractC4344b.F0(Character.valueOf(cArr[0]));
                    }
                }
                return a(r12, b10, Jf.n.f9126l0);
            } else if (obj instanceof float[]) {
                float[] fArr = (float[]) obj;
                AbstractC3557B.c0("<this>", fArr);
                int length10 = fArr.length;
                if (length10 != 0) {
                    if (length10 != 1) {
                        r12 = new ArrayList(fArr.length);
                        int length11 = fArr.length;
                        while (i10 < length11) {
                            r12.add(Float.valueOf(fArr[i10]));
                            i10++;
                        }
                    } else {
                        r12 = AbstractC4344b.F0(Float.valueOf(fArr[0]));
                    }
                }
                return a(r12, b10, Jf.n.f9130p0);
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                AbstractC3557B.c0("<this>", dArr);
                int length12 = dArr.length;
                if (length12 != 0) {
                    if (length12 != 1) {
                        r12 = new ArrayList(dArr.length);
                        int length13 = dArr.length;
                        while (i10 < length13) {
                            r12.add(Double.valueOf(dArr[i10]));
                            i10++;
                        }
                    } else {
                        r12 = AbstractC4344b.F0(Double.valueOf(dArr[0]));
                    }
                }
                return a(r12, b10, Jf.n.f9132r0);
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                AbstractC3557B.c0("<this>", zArr);
                int length14 = zArr.length;
                if (length14 != 0) {
                    if (length14 != 1) {
                        r12 = new ArrayList(zArr.length);
                        int length15 = zArr.length;
                        while (i10 < length15) {
                            r12.add(Boolean.valueOf(zArr[i10]));
                            i10++;
                        }
                    } else {
                        r12 = AbstractC4344b.F0(Boolean.valueOf(zArr[0]));
                    }
                }
                return a(r12, b10, Jf.n.f9125k0);
            } else if (obj != null) {
                return null;
            } else {
                return new AbstractC5170g(null);
            }
        }
    }
}
