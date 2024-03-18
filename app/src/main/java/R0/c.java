package R0;

import S0.C1349j;
import S0.C1350k;
import id.AbstractC3557B;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kf.q;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public int[] f15017a;

    /* renamed from: b  reason: collision with root package name */
    public Object[] f15018b;

    /* renamed from: c  reason: collision with root package name */
    public int f15019c;

    public final Object a(Object obj) {
        int i10;
        if (obj == null) {
            i10 = c();
        } else {
            i10 = b(obj.hashCode(), obj);
        }
        if (i10 >= 0) {
            return this.f15018b[(i10 << 1) + 1];
        }
        return null;
    }

    public final int b(int i10, Object obj) {
        int i11 = this.f15019c;
        if (i11 == 0) {
            return -1;
        }
        int a5 = a.a(i11, i10, this.f15017a);
        if (a5 < 0) {
            return a5;
        }
        if (AbstractC3557B.K(obj, this.f15018b[a5 << 1])) {
            return a5;
        }
        int i12 = a5 + 1;
        while (i12 < i11 && this.f15017a[i12] == i10) {
            if (AbstractC3557B.K(obj, this.f15018b[i12 << 1])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = a5 - 1; i13 >= 0 && this.f15017a[i13] == i10; i13--) {
            if (AbstractC3557B.K(obj, this.f15018b[i13 << 1])) {
                return i13;
            }
        }
        return ~i12;
    }

    public final int c() {
        int i10 = this.f15019c;
        if (i10 == 0) {
            return -1;
        }
        int a5 = a.a(i10, 0, this.f15017a);
        if (a5 < 0) {
            return a5;
        }
        if (this.f15018b[a5 << 1] == null) {
            return a5;
        }
        int i11 = a5 + 1;
        while (i11 < i10 && this.f15017a[i11] == 0) {
            if (this.f15018b[i11 << 1] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = a5 - 1; i12 >= 0 && this.f15017a[i12] == 0; i12--) {
            if (this.f15018b[i12 << 1] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    public final Object d(C1350k c1350k, C1349j c1349j) {
        int i10;
        int i11;
        int i12 = this.f15019c;
        if (c1350k == null) {
            i11 = c();
            i10 = 0;
        } else {
            i10 = c1350k.hashCode();
            i11 = b(i10, c1350k);
        }
        if (i11 >= 0) {
            int i13 = (i11 << 1) + 1;
            Object[] objArr = this.f15018b;
            Object obj = objArr[i13];
            objArr[i13] = c1349j;
            return obj;
        }
        int i14 = ~i11;
        int[] iArr = this.f15017a;
        if (i12 >= iArr.length) {
            int i15 = 8;
            if (i12 >= 8) {
                i15 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i15 = 4;
            }
            int[] copyOf = Arrays.copyOf(iArr, i15);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf);
            this.f15017a = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f15018b, i15 << 1);
            AbstractC3557B.b0("copyOf(this, newSize)", copyOf2);
            this.f15018b = copyOf2;
            if (i12 != this.f15019c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i14 < i12) {
            int[] iArr2 = this.f15017a;
            int i16 = i14 + 1;
            q.V2(i16, i14, i12, iArr2, iArr2);
            Object[] objArr2 = this.f15018b;
            q.W2(i16 << 1, i14 << 1, this.f15019c << 1, objArr2, objArr2);
        }
        int i17 = this.f15019c;
        if (i12 == i17) {
            int[] iArr3 = this.f15017a;
            if (i14 < iArr3.length) {
                iArr3[i14] = i10;
                Object[] objArr3 = this.f15018b;
                int i18 = i14 << 1;
                objArr3[i18] = c1350k;
                objArr3[i18 + 1] = c1349j;
                this.f15019c = i17 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final boolean equals(Object obj) {
        int i10;
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof c) {
                c cVar = (c) obj;
                int i11 = this.f15019c;
                if (i11 != cVar.f15019c) {
                    return false;
                }
                for (int i12 = 0; i12 < i11; i12++) {
                    Object[] objArr = this.f15018b;
                    int i13 = i12 << 1;
                    Object obj2 = objArr[i13];
                    Object obj3 = objArr[i13 + 1];
                    Object a5 = cVar.a(obj2);
                    if (obj3 == null) {
                        if (a5 == null) {
                            if (obj2 == null) {
                                i10 = cVar.c();
                            } else {
                                i10 = cVar.b(obj2.hashCode(), obj2);
                            }
                            if (i10 >= 0) {
                            }
                        }
                        return false;
                    } else if (!AbstractC3557B.K(obj3, a5)) {
                        return false;
                    }
                }
                return true;
            } else if (!(obj instanceof Map) || this.f15019c != ((Map) obj).size()) {
                return false;
            } else {
                int i14 = this.f15019c;
                for (int i15 = 0; i15 < i14; i15++) {
                    Object[] objArr2 = this.f15018b;
                    int i16 = i15 << 1;
                    Object obj4 = objArr2[i16];
                    Object obj5 = objArr2[i16 + 1];
                    Object obj6 = ((Map) obj).get(obj4);
                    if (obj5 == null) {
                        if (obj6 != null || !((Map) obj).containsKey(obj4)) {
                            return false;
                        }
                    } else if (!AbstractC3557B.K(obj5, obj6)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int[] iArr = this.f15017a;
        Object[] objArr = this.f15018b;
        int i11 = this.f15019c;
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            Object obj = objArr[i12];
            int i15 = iArr[i13];
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            i14 += i10 ^ i15;
            i13++;
            i12 += 2;
        }
        return i14;
    }

    public final String toString() {
        int i10 = this.f15019c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        int i11 = this.f15019c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            int i13 = i12 << 1;
            Object obj = this.f15018b[i13];
            if (obj != this) {
                sb2.append(obj);
            } else {
                sb2.append("(this Map)");
            }
            sb2.append('=');
            Object obj2 = this.f15018b[i13 + 1];
            if (obj2 != this) {
                sb2.append(obj2);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }
}
