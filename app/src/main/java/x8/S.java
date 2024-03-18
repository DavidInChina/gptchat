package x8;

import j$.util.Objects;
import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class S extends I implements Set {

    /* renamed from: h0  reason: collision with root package name */
    public static final /* synthetic */ int f49530h0 = 0;

    /* renamed from: Z  reason: collision with root package name */
    public transient N f49531Z;

    public static int T(int i10) {
        int max = Math.max(i10, 2);
        boolean z10 = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (highestOneBit * 0.7d < max) {
                highestOneBit <<= 1;
            }
            return highestOneBit;
        }
        if (max >= 1073741824) {
            z10 = false;
        }
        if (z10) {
            return 1073741824;
        }
        throw new IllegalArgumentException("collection too large");
    }

    public static S U(int i10, Object... objArr) {
        if (i10 != 0) {
            if (i10 != 1) {
                int T = T(i10);
                Object[] objArr2 = new Object[T];
                int i11 = T - 1;
                int i12 = 0;
                int i13 = 0;
                for (int i14 = 0; i14 < i10; i14++) {
                    Object obj = objArr[i14];
                    if (obj != null) {
                        int hashCode = obj.hashCode();
                        int u02 = M3.H.u0(hashCode);
                        while (true) {
                            int i15 = u02 & i11;
                            Object obj2 = objArr2[i15];
                            if (obj2 == null) {
                                objArr[i13] = obj;
                                objArr2[i15] = obj;
                                i12 += hashCode;
                                i13++;
                                break;
                            } else if (obj2.equals(obj)) {
                                break;
                            } else {
                                u02++;
                            }
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder(20);
                        sb2.append("at index ");
                        sb2.append(i14);
                        throw new NullPointerException(sb2.toString());
                    }
                }
                Arrays.fill(objArr, i13, i10, (Object) null);
                if (i13 == 1) {
                    Object obj3 = objArr[0];
                    Objects.requireNonNull(obj3);
                    return new x0(obj3);
                } else if (T(i13) < T / 2) {
                    return U(i13, objArr);
                } else {
                    int length = objArr.length;
                    if (i13 < (length >> 1) + (length >> 2)) {
                        objArr = Arrays.copyOf(objArr, i13);
                    }
                    return new q0(i12, i11, i13, objArr, objArr2);
                }
            }
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new x0(obj4);
        }
        return q0.f49601o0;
    }

    public static S V(Set set) {
        if ((set instanceof S) && !(set instanceof SortedSet)) {
            S s10 = (S) set;
            if (!s10.M()) {
                return s10;
            }
        }
        Object[] array = set.toArray();
        return U(array.length, array);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof S) && (this instanceof q0)) {
            S s10 = (S) obj;
            s10.getClass();
            if ((s10 instanceof q0) && hashCode() != obj.hashCode()) {
                return false;
            }
        }
        return A7.b.B0(this, obj);
    }

    @Override // x8.I
    public N f() {
        N n10 = this.f49531Z;
        if (n10 == null) {
            N i02 = i0();
            this.f49531Z = i02;
            return i02;
        }
        return n10;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return A7.b.Z0(this);
    }

    public N i0() {
        Object[] array = toArray(I.f49516Y);
        L l10 = N.f49523Z;
        return N.T(array.length, array);
    }

    /* renamed from: m0 */
    public abstract com.google.android.gms.internal.play_billing.C iterator();
}
