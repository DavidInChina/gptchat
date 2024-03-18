package androidx.glance.appwidget.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: f  reason: collision with root package name */
    public static final f0 f25213f = new f0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f25214a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f25215b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f25216c;

    /* renamed from: d  reason: collision with root package name */
    public int f25217d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25218e;

    public f0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f25214a = i10;
        this.f25215b = iArr;
        this.f25216c = objArr;
        this.f25218e = z10;
    }

    public final void a(int i10) {
        int[] iArr = this.f25215b;
        if (i10 > iArr.length) {
            int i11 = this.f25214a;
            int i12 = (i11 / 2) + i11;
            if (i12 >= i10) {
                i10 = i12;
            }
            if (i10 < 8) {
                i10 = 8;
            }
            this.f25215b = Arrays.copyOf(iArr, i10);
            this.f25216c = Arrays.copyOf(this.f25216c, i10);
        }
    }

    public final int b() {
        int p22;
        int i10 = this.f25217d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f25214a; i12++) {
            int i13 = this.f25215b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 5) {
                                ((Integer) this.f25216c[i12]).getClass();
                                p22 = AbstractC2055o.Z1(i14);
                            } else {
                                throw new IllegalStateException(C.b());
                            }
                        } else {
                            i11 = ((f0) this.f25216c[i12]).b() + (AbstractC2055o.m2(i14) * 2) + i11;
                        }
                    } else {
                        p22 = AbstractC2055o.V1(i14, (AbstractC2049i) this.f25216c[i12]);
                    }
                } else {
                    ((Long) this.f25216c[i12]).getClass();
                    p22 = AbstractC2055o.a2(i14);
                }
            } else {
                p22 = AbstractC2055o.p2(i14, ((Long) this.f25216c[i12]).longValue());
            }
            i11 = p22 + i11;
        }
        this.f25217d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        if (this.f25218e) {
            a(this.f25214a + 1);
            int[] iArr = this.f25215b;
            int i11 = this.f25214a;
            iArr[i11] = i10;
            this.f25216c[i11] = obj;
            this.f25214a = i11 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(F4.a aVar) {
        if (this.f25214a == 0) {
            return;
        }
        aVar.getClass();
        for (int i10 = 0; i10 < this.f25214a; i10++) {
            int i11 = this.f25215b[i10];
            Object obj = this.f25216c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                aVar.u(i12, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(C.b());
                            }
                        } else {
                            ((AbstractC2055o) aVar.f5033Z).D2(i12, 3);
                            ((f0) obj).d(aVar);
                            ((AbstractC2055o) aVar.f5033Z).D2(i12, 4);
                        }
                    } else {
                        aVar.p(i12, (AbstractC2049i) obj);
                    }
                } else {
                    aVar.v(i12, ((Long) obj).longValue());
                }
            } else {
                aVar.A(i12, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        int i10 = this.f25214a;
        if (i10 == f0Var.f25214a) {
            int[] iArr = this.f25215b;
            int[] iArr2 = f0Var.f25215b;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.f25216c;
                    Object[] objArr2 = f0Var.f25216c;
                    int i12 = this.f25214a;
                    for (int i13 = 0; i13 < i12; i13++) {
                        if (objArr[i13].equals(objArr2[i13])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f25214a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f25215b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f25216c;
        int i16 = this.f25214a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
