package androidx.datastore.preferences.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: f  reason: collision with root package name */
    public static final o0 f25094f = new o0(0, new int[0], new Object[0], false);

    /* renamed from: a  reason: collision with root package name */
    public int f25095a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f25096b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f25097c;

    /* renamed from: d  reason: collision with root package name */
    public int f25098d = -1;

    /* renamed from: e  reason: collision with root package name */
    public boolean f25099e;

    public o0(int i10, int[] iArr, Object[] objArr, boolean z10) {
        this.f25095a = i10;
        this.f25096b = iArr;
        this.f25097c = objArr;
        this.f25099e = z10;
    }

    public static o0 b() {
        return new o0(0, new int[8], new Object[8], true);
    }

    public final int a() {
        int F10;
        int i10 = this.f25098d;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f25095a; i12++) {
            int i13 = this.f25096b[i12];
            int i14 = i13 >>> 3;
            int i15 = i13 & 7;
            if (i15 != 0) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 != 3) {
                            if (i15 == 5) {
                                ((Integer) this.f25097c[i12]).getClass();
                                F10 = AbstractC2031p.p(i14);
                            } else {
                                throw new IllegalStateException(D.b());
                            }
                        } else {
                            i11 = ((o0) this.f25097c[i12]).a() + (AbstractC2031p.C(i14) * 2) + i11;
                        }
                    } else {
                        F10 = AbstractC2031p.l(i14, (AbstractC2025j) this.f25097c[i12]);
                    }
                } else {
                    ((Long) this.f25097c[i12]).getClass();
                    F10 = AbstractC2031p.q(i14);
                }
            } else {
                F10 = AbstractC2031p.F(i14, ((Long) this.f25097c[i12]).longValue());
            }
            i11 = F10 + i11;
        }
        this.f25098d = i11;
        return i11;
    }

    public final void c(int i10, Object obj) {
        int i11;
        if (this.f25099e) {
            int i12 = this.f25095a;
            int[] iArr = this.f25096b;
            if (i12 == iArr.length) {
                if (i12 < 4) {
                    i11 = 8;
                } else {
                    i11 = i12 >> 1;
                }
                int i13 = i12 + i11;
                this.f25096b = Arrays.copyOf(iArr, i13);
                this.f25097c = Arrays.copyOf(this.f25097c, i13);
            }
            int[] iArr2 = this.f25096b;
            int i14 = this.f25095a;
            iArr2[i14] = i10;
            this.f25097c[i14] = obj;
            this.f25095a = i14 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void d(J0.a aVar) {
        if (this.f25095a == 0) {
            return;
        }
        aVar.getClass();
        for (int i10 = 0; i10 < this.f25095a; i10++) {
            int i11 = this.f25096b[i10];
            Object obj = this.f25097c[i10];
            int i12 = i11 >>> 3;
            int i13 = i11 & 7;
            if (i13 != 0) {
                if (i13 != 1) {
                    if (i13 != 2) {
                        if (i13 != 3) {
                            if (i13 == 5) {
                                aVar.X(i12, ((Integer) obj).intValue());
                            } else {
                                throw new RuntimeException(D.b());
                            }
                        } else {
                            ((AbstractC2031p) aVar.f8729Y).X(i12, 3);
                            ((o0) obj).d(aVar);
                            ((AbstractC2031p) aVar.f8729Y).X(i12, 4);
                        }
                    } else {
                        aVar.U(i12, (AbstractC2025j) obj);
                    }
                } else {
                    aVar.Y(i12, ((Long) obj).longValue());
                }
            } else {
                aVar.c0(i12, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        int i10 = this.f25095a;
        if (i10 == o0Var.f25095a) {
            int[] iArr = this.f25096b;
            int[] iArr2 = o0Var.f25096b;
            int i11 = 0;
            while (true) {
                if (i11 < i10) {
                    if (iArr[i11] != iArr2[i11]) {
                        break;
                    }
                    i11++;
                } else {
                    Object[] objArr = this.f25097c;
                    Object[] objArr2 = o0Var.f25097c;
                    int i12 = this.f25095a;
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
        int i10 = this.f25095a;
        int i11 = (527 + i10) * 31;
        int[] iArr = this.f25096b;
        int i12 = 17;
        int i13 = 17;
        for (int i14 = 0; i14 < i10; i14++) {
            i13 = (i13 * 31) + iArr[i14];
        }
        int i15 = (i11 + i13) * 31;
        Object[] objArr = this.f25097c;
        int i16 = this.f25095a;
        for (int i17 = 0; i17 < i16; i17++) {
            i12 = (i12 * 31) + objArr[i17].hashCode();
        }
        return i15 + i12;
    }
}
