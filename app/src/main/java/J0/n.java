package j0;

import java.util.ArrayList;
import java.util.Iterator;
import xf.AbstractC6438a;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class n implements Iterable, AbstractC6438a {

    /* renamed from: j0  reason: collision with root package name */
    public static final n f35909j0 = new n(0, 0, 0, null);

    /* renamed from: Y  reason: collision with root package name */
    public final long f35910Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f35911Z;

    /* renamed from: h0  reason: collision with root package name */
    public final int f35912h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int[] f35913i0;

    public n(long j6, long j10, int i10, int[] iArr) {
        this.f35910Y = j6;
        this.f35911Z = j10;
        this.f35912h0 = i10;
        this.f35913i0 = iArr;
    }

    public final n I(n nVar) {
        n nVar2 = f35909j0;
        if (nVar == nVar2) {
            return this;
        }
        if (this == nVar2) {
            return nVar;
        }
        int i10 = nVar.f35912h0;
        int i11 = this.f35912h0;
        if (i10 == i11) {
            int[] iArr = nVar.f35913i0;
            int[] iArr2 = this.f35913i0;
            if (iArr == iArr2) {
                return new n(this.f35910Y | nVar.f35910Y, this.f35911Z | nVar.f35911Z, i11, iArr2);
            }
        }
        if (this.f35913i0 == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                nVar = nVar.M(((Number) it.next()).intValue());
            }
            return nVar;
        }
        Iterator it2 = nVar.iterator();
        n nVar3 = this;
        while (it2.hasNext()) {
            nVar3 = nVar3.M(((Number) it2.next()).intValue());
        }
        return nVar3;
    }

    public final n M(int i10) {
        long j6;
        int i11;
        int i12 = this.f35912h0;
        int i13 = i10 - i12;
        long j10 = this.f35911Z;
        if (i13 >= 0 && i13 < 64) {
            long j11 = 1 << i13;
            if ((j10 & j11) == 0) {
                return new n(this.f35910Y, j10 | j11, i12, this.f35913i0);
            }
        } else {
            long j12 = this.f35910Y;
            if (i13 >= 64 && i13 < 128) {
                long j13 = 1 << (i13 - 64);
                if ((j12 & j13) == 0) {
                    return new n(j12 | j13, j10, i12, this.f35913i0);
                }
            } else {
                int[] iArr = this.f35913i0;
                if (i13 >= 128) {
                    if (!y(i10)) {
                        int i14 = ((i10 + 1) / 64) * 64;
                        int i15 = this.f35912h0;
                        ArrayList arrayList = null;
                        long j14 = j12;
                        while (true) {
                            if (i15 < i14) {
                                if (j10 != 0) {
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        if (iArr != null) {
                                            for (int i16 : iArr) {
                                                arrayList.add(Integer.valueOf(i16));
                                            }
                                        }
                                    }
                                    for (int i17 = 0; i17 < 64; i17++) {
                                        if (((1 << i17) & j10) != 0) {
                                            arrayList.add(Integer.valueOf(i17 + i15));
                                        }
                                    }
                                }
                                if (j14 == 0) {
                                    i11 = i14;
                                    j6 = 0;
                                    break;
                                }
                                i15 += 64;
                                j10 = j14;
                                j14 = 0;
                            } else {
                                j6 = j10;
                                i11 = i15;
                                break;
                            }
                        }
                        if (arrayList != null) {
                            iArr = kf.t.J2(arrayList);
                        }
                        return new n(j14, j6, i11, iArr).M(i10);
                    }
                } else if (iArr == null) {
                    return new n(j12, j10, i12, new int[]{i10});
                } else {
                    int m10 = Ng.H.m(iArr, i10);
                    if (m10 < 0) {
                        int i18 = -(m10 + 1);
                        int length = iArr.length;
                        int[] iArr2 = new int[length + 1];
                        kf.q.V2(0, 0, i18, iArr, iArr2);
                        kf.q.V2(i18 + 1, i18, length, iArr, iArr2);
                        iArr2[i18] = i10;
                        return new n(this.f35910Y, this.f35911Z, this.f35912h0, iArr2);
                    }
                }
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return P4.a.G0(new C3897m(this, null)).iterator();
    }

    public final n r(n nVar) {
        n nVar2 = f35909j0;
        if (nVar == nVar2) {
            return this;
        }
        if (this == nVar2) {
            return nVar2;
        }
        int i10 = nVar.f35912h0;
        int i11 = this.f35912h0;
        if (i10 == i11) {
            int[] iArr = nVar.f35913i0;
            int[] iArr2 = this.f35913i0;
            if (iArr == iArr2) {
                return new n(this.f35910Y & (~nVar.f35910Y), (~nVar.f35911Z) & this.f35911Z, i11, iArr2);
            }
        }
        Iterator it = nVar.iterator();
        n nVar3 = this;
        while (it.hasNext()) {
            nVar3 = nVar3.s(((Number) it.next()).intValue());
        }
        return nVar3;
    }

    public final n s(int i10) {
        int[] iArr;
        int m10;
        int i11 = this.f35912h0;
        int i12 = i10 - i11;
        if (i12 >= 0 && i12 < 64) {
            long j6 = 1 << i12;
            long j10 = this.f35911Z;
            if ((j10 & j6) != 0) {
                return new n(this.f35910Y, j10 & (~j6), i11, this.f35913i0);
            }
        } else if (i12 >= 64 && i12 < 128) {
            long j11 = 1 << (i12 - 64);
            long j12 = this.f35910Y;
            if ((j12 & j11) != 0) {
                return new n(j12 & (~j11), this.f35911Z, i11, this.f35913i0);
            }
        } else if (i12 < 0 && (iArr = this.f35913i0) != null && (m10 = Ng.H.m(iArr, i10)) >= 0) {
            int length = iArr.length;
            int i13 = length - 1;
            if (i13 == 0) {
                return new n(this.f35910Y, this.f35911Z, this.f35912h0, null);
            }
            int[] iArr2 = new int[i13];
            if (m10 > 0) {
                kf.q.V2(0, 0, m10, iArr, iArr2);
            }
            if (m10 < i13) {
                kf.q.V2(m10, m10 + 1, length, iArr, iArr2);
            }
            return new n(this.f35910Y, this.f35911Z, this.f35912h0, iArr2);
        }
        return this;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj == null || (obj instanceof CharSequence)) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) String.valueOf(obj));
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }

    public final boolean y(int i10) {
        int[] iArr;
        int i11 = i10 - this.f35912h0;
        boolean z10 = true;
        if (i11 >= 0 && i11 < 64) {
            if (((1 << i11) & this.f35911Z) != 0) {
                return true;
            }
            return false;
        } else if (i11 >= 64 && i11 < 128) {
            if (((1 << (i11 - 64)) & this.f35910Y) != 0) {
                return true;
            }
            return false;
        } else if (i11 > 0 || (iArr = this.f35913i0) == null) {
            return false;
        } else {
            if (Ng.H.m(iArr, i10) < 0) {
                z10 = false;
            }
            return z10;
        }
    }
}
