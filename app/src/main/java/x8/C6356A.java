package x8;

import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: x8.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6356A extends AbstractMap implements Serializable {

    /* renamed from: o0  reason: collision with root package name */
    public static final Object f49497o0 = new Object();

    /* renamed from: Y  reason: collision with root package name */
    public transient Object f49498Y;

    /* renamed from: Z  reason: collision with root package name */
    public transient int[] f49499Z;

    /* renamed from: h0  reason: collision with root package name */
    public transient Object[] f49500h0;

    /* renamed from: i0  reason: collision with root package name */
    public transient Object[] f49501i0;

    /* renamed from: j0  reason: collision with root package name */
    public transient int f49502j0;

    /* renamed from: k0  reason: collision with root package name */
    public transient int f49503k0;

    /* renamed from: l0  reason: collision with root package name */
    public transient C6378w f49504l0;

    /* renamed from: m0  reason: collision with root package name */
    public transient C6378w f49505m0;

    /* renamed from: n0  reason: collision with root package name */
    public transient C6381z f49506n0;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, x8.A] */
    public static C6356A a(int i10) {
        boolean z10;
        ?? abstractMap = new AbstractMap();
        if (i10 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            abstractMap.f49502j0 = M3.H.G(i10, 1);
            return abstractMap;
        }
        throw new IllegalArgumentException("Expected size must be >= 0");
    }

    public final Map b() {
        Object obj = this.f49498Y;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.f49502j0 & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (g()) {
            return;
        }
        this.f49502j0 += 32;
        Map b10 = b();
        if (b10 != null) {
            this.f49502j0 = M3.H.G(size(), 3);
            b10.clear();
            this.f49498Y = null;
            this.f49503k0 = 0;
            return;
        }
        Arrays.fill(j(), 0, this.f49503k0, (Object) null);
        Arrays.fill(k(), 0, this.f49503k0, (Object) null);
        Object obj = this.f49498Y;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(i(), 0, this.f49503k0, 0);
        this.f49503k0 = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsKey(obj);
        }
        if (d(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.containsValue(obj);
        }
        for (int i10 = 0; i10 < this.f49503k0; i10++) {
            if (M3.H.O(obj, k()[i10])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (g()) {
            return -1;
        }
        int v02 = M3.H.v0(obj);
        int c10 = c();
        Object obj2 = this.f49498Y;
        Objects.requireNonNull(obj2);
        int s02 = Df.H.s0(v02 & c10, obj2);
        if (s02 == 0) {
            return -1;
        }
        int i10 = ~c10;
        int i11 = v02 & i10;
        do {
            int i12 = s02 - 1;
            int i13 = i()[i12];
            if ((i13 & i10) == i11 && M3.H.O(obj, j()[i12])) {
                return i12;
            }
            s02 = i13 & c10;
        } while (s02 != 0);
        return -1;
    }

    public final void e(int i10, int i11) {
        Object obj = this.f49498Y;
        Objects.requireNonNull(obj);
        int[] i12 = i();
        Object[] j6 = j();
        Object[] k10 = k();
        int size = size();
        int i13 = size - 1;
        if (i10 < i13) {
            Object obj2 = j6[i13];
            j6[i10] = obj2;
            k10[i10] = k10[i13];
            j6[i13] = null;
            k10[i13] = null;
            i12[i10] = i12[i13];
            i12[i13] = 0;
            int v02 = M3.H.v0(obj2) & i11;
            int s02 = Df.H.s0(v02, obj);
            if (s02 == size) {
                Df.H.t0(v02, obj, i10 + 1);
                return;
            }
            while (true) {
                int i14 = s02 - 1;
                int i15 = i12[i14];
                int i16 = i15 & i11;
                if (i16 == size) {
                    i12[i14] = Df.H.g0(i15, i10 + 1, i11);
                    return;
                }
                s02 = i16;
            }
        } else {
            j6[i10] = null;
            k10[i10] = null;
            i12[i10] = 0;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C6378w c6378w = this.f49505m0;
        if (c6378w == null) {
            C6378w c6378w2 = new C6378w(this, 0);
            this.f49505m0 = c6378w2;
            return c6378w2;
        }
        return c6378w;
    }

    public final boolean g() {
        if (this.f49498Y == null) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.get(obj);
        }
        int d10 = d(obj);
        if (d10 == -1) {
            return null;
        }
        return k()[d10];
    }

    public final Object h(Object obj) {
        boolean g10 = g();
        Object obj2 = f49497o0;
        if (g10) {
            return obj2;
        }
        int c10 = c();
        Object obj3 = this.f49498Y;
        Objects.requireNonNull(obj3);
        int p02 = Df.H.p0(obj, null, c10, obj3, i(), j(), null);
        if (p02 == -1) {
            return obj2;
        }
        Object obj4 = k()[p02];
        e(p02, c10);
        this.f49503k0--;
        this.f49502j0 += 32;
        return obj4;
    }

    public final int[] i() {
        int[] iArr = this.f49499Z;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    public final Object[] j() {
        Object[] objArr = this.f49500h0;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final Object[] k() {
        Object[] objArr = this.f49501i0;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        C6378w c6378w = this.f49504l0;
        if (c6378w == null) {
            C6378w c6378w2 = new C6378w(this, 1);
            this.f49504l0 = c6378w2;
            return c6378w2;
        }
        return c6378w;
    }

    public final int l(int i10, int i11, int i12, int i13) {
        Object A10 = Df.H.A(i11);
        int i14 = i11 - 1;
        if (i13 != 0) {
            Df.H.t0(i12 & i14, A10, i13 + 1);
        }
        Object obj = this.f49498Y;
        Objects.requireNonNull(obj);
        int[] i15 = i();
        for (int i16 = 0; i16 <= i10; i16++) {
            int s02 = Df.H.s0(i16, obj);
            while (s02 != 0) {
                int i17 = s02 - 1;
                int i18 = i15[i17];
                int i19 = ((~i10) & i18) | i16;
                int i20 = i19 & i14;
                int s03 = Df.H.s0(i20, A10);
                Df.H.t0(i20, A10, s02);
                i15[i17] = Df.H.g0(i19, s03, i14);
                s02 = i18 & i10;
            }
        }
        this.f49498Y = A10;
        this.f49502j0 = Df.H.g0(this.f49502j0, 32 - Integer.numberOfLeadingZeros(i14), 31);
        return i14;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0102 -> B:40:0x00e8). Please submit an issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object put(Object obj, Object obj2) {
        int min;
        int i10;
        int i11;
        int i12;
        if (g()) {
            if (g()) {
                int i13 = this.f49502j0;
                int max = Math.max(i13 + 1, 2);
                int highestOneBit = Integer.highestOneBit(max);
                if (max > ((int) (1.0d * highestOneBit))) {
                    int i14 = highestOneBit << 1;
                    if (i14 <= 0) {
                        i14 = 1073741824;
                    }
                    highestOneBit = i14;
                }
                int max2 = Math.max(4, highestOneBit);
                this.f49498Y = Df.H.A(max2);
                this.f49502j0 = Df.H.g0(this.f49502j0, 32 - Integer.numberOfLeadingZeros(max2 - 1), 31);
                this.f49499Z = new int[i13];
                this.f49500h0 = new Object[i13];
                this.f49501i0 = new Object[i13];
            } else {
                throw new IllegalStateException("Arrays already allocated");
            }
        }
        Map b10 = b();
        if (b10 != null) {
            return b10.put(obj, obj2);
        }
        int[] i15 = i();
        Object[] j6 = j();
        Object[] k10 = k();
        int i16 = this.f49503k0;
        int i17 = i16 + 1;
        int v02 = M3.H.v0(obj);
        int c10 = c();
        int i18 = v02 & c10;
        Object obj3 = this.f49498Y;
        Objects.requireNonNull(obj3);
        int s02 = Df.H.s0(i18, obj3);
        if (s02 == 0) {
            if (i17 > c10) {
                if (c10 < 32) {
                    i12 = 4;
                } else {
                    i12 = 2;
                }
                c10 = l(c10, (c10 + 1) * i12, v02, i16);
            } else {
                Object obj4 = this.f49498Y;
                Objects.requireNonNull(obj4);
                Df.H.t0(i18, obj4, i17);
            }
        } else {
            int i19 = ~c10;
            int i20 = v02 & i19;
            int i21 = 0;
            while (true) {
                int i22 = s02 - 1;
                int i23 = i15[i22];
                if ((i23 & i19) == i20 && M3.H.O(obj, j6[i22])) {
                    Object obj5 = k10[i22];
                    k10[i22] = obj2;
                    return obj5;
                }
                int i24 = i23 & c10;
                int i25 = i20;
                int i26 = i21 + 1;
                if (i24 == 0) {
                    if (i26 >= 9) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                        if (!isEmpty()) {
                            i11 = 0;
                            while (i11 >= 0) {
                                linkedHashMap.put(j()[i11], k()[i11]);
                                int i27 = i11 + 1;
                                if (i27 < this.f49503k0) {
                                    i11 = i27;
                                }
                            }
                            this.f49498Y = linkedHashMap;
                            this.f49499Z = null;
                            this.f49500h0 = null;
                            this.f49501i0 = null;
                            this.f49502j0 += 32;
                            return linkedHashMap.put(obj, obj2);
                        }
                        i11 = -1;
                        while (i11 >= 0) {
                        }
                        this.f49498Y = linkedHashMap;
                        this.f49499Z = null;
                        this.f49500h0 = null;
                        this.f49501i0 = null;
                        this.f49502j0 += 32;
                        return linkedHashMap.put(obj, obj2);
                    } else if (i17 > c10) {
                        if (c10 < 32) {
                            i10 = 4;
                        } else {
                            i10 = 2;
                        }
                        c10 = l(c10, (c10 + 1) * i10, v02, i16);
                    } else {
                        i15[i22] = Df.H.g0(i23, i17, c10);
                    }
                } else {
                    i21 = i26;
                    s02 = i24;
                    i20 = i25;
                }
            }
        }
        int length = i().length;
        if (i17 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.f49499Z = Arrays.copyOf(i(), min);
            this.f49500h0 = Arrays.copyOf(j(), min);
            this.f49501i0 = Arrays.copyOf(k(), min);
        }
        i()[i16] = Df.H.g0(v02, 0, c10);
        j()[i16] = obj;
        k()[i16] = obj2;
        this.f49503k0 = i17;
        this.f49502j0 += 32;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map b10 = b();
        if (b10 != null) {
            return b10.remove(obj);
        }
        Object h10 = h(obj);
        if (h10 == f49497o0) {
            return null;
        }
        return h10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map b10 = b();
        if (b10 != null) {
            return b10.size();
        }
        return this.f49503k0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C6381z c6381z = this.f49506n0;
        if (c6381z == null) {
            C6381z c6381z2 = new C6381z(this);
            this.f49506n0 = c6381z2;
            return c6381z2;
        }
        return c6381z;
    }
}
