package b0;

import id.AbstractC3557B;
import w.AbstractC6076w;
import w.C6073t;
import w.C6074u;

/* renamed from: b0.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2105i {

    /* renamed from: a  reason: collision with root package name */
    public final C6073t f25570a = new C6073t();

    public C2105i() {
        long[] jArr = AbstractC6076w.f47639a;
    }

    public final void a(Object obj, Object obj2) {
        boolean z10;
        Object obj3;
        C6073t c6073t = this.f25570a;
        int e10 = c6073t.e(obj);
        if (e10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            obj3 = null;
        } else {
            obj3 = c6073t.f47633c[e10];
        }
        if (obj3 != null) {
            if (obj3 instanceof C6074u) {
                ((C6074u) obj3).c(obj2);
            } else if (obj3 != obj2) {
                C6074u c6074u = new C6074u();
                c6074u.c(obj3);
                c6074u.c(obj2);
                obj2 = c6074u;
            }
            obj2 = obj3;
        }
        if (z10) {
            int i10 = ~e10;
            c6073t.f47632b[i10] = obj;
            c6073t.f47633c[i10] = obj2;
            return;
        }
        c6073t.f47633c[e10] = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0085, code lost:
        r7 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0095, code lost:
        r15 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Object obj, Object obj2) {
        int i10;
        C6074u c6074u;
        int i11;
        boolean z10;
        C6073t c6073t = this.f25570a;
        Object f6 = c6073t.f(obj);
        if (f6 == null) {
            return false;
        }
        int i12 = 1;
        if (f6 instanceof C6074u) {
            C6074u c6074u2 = (C6074u) f6;
            if (obj2 != null) {
                i10 = obj2.hashCode();
            } else {
                i10 = 0;
            }
            int i13 = i10 * (-862048943);
            int i14 = i13 ^ (i13 << 16);
            int i15 = i14 & 127;
            int i16 = c6074u2.f47644c;
            int i17 = (i14 >>> 7) & i16;
            int i18 = 0;
            loop0: while (true) {
                long[] jArr = c6074u2.f47642a;
                int i19 = i17 >> 3;
                int i20 = (i17 & 7) << 3;
                C6074u c6074u3 = c6074u2;
                long j6 = (((-i20) >> 63) & (jArr[i19 + i12] << (64 - i20))) | (jArr[i19] >>> i20);
                long j10 = (i15 * 72340172838076673L) ^ j6;
                long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j11 == 0) {
                        break;
                    }
                    i11 = ((Long.numberOfTrailingZeros(j11) >> 3) + i17) & i16;
                    c6074u = c6074u3;
                    if (AbstractC3557B.K(c6074u.f47643b[i11], obj2)) {
                        break loop0;
                    }
                    j11 &= j11 - 1;
                    c6074u3 = c6074u;
                }
                i18 += 8;
                i17 = (i17 + i18) & i16;
                c6074u2 = c6074u;
                i12 = 1;
            }
            if (i11 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                c6074u.h(i11);
            }
            if (z10 && c6074u.b()) {
                c6073t.i(obj);
            }
            return z10;
        } else if (AbstractC3557B.K(f6, obj2)) {
            c6073t.i(obj);
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
        if (r15.b() != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c9, code lost:
        if (r15 == r33) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
        r2.j(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ce, code lost:
        r1 = 8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Object obj) {
        long[] jArr;
        int i10;
        long j6;
        int i11;
        int i12;
        long[] jArr2;
        long j10;
        int i13;
        C6073t c6073t = this.f25570a;
        long[] jArr3 = c6073t.f47631a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i14 = 0;
            while (true) {
                long j11 = jArr3[i14];
                long j12 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i15 = 8;
                    int i16 = 8 - ((~(i14 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j11 & 255) < 128) {
                            int i18 = (i14 << 3) + i17;
                            Object obj2 = c6073t.f47632b[i18];
                            Object obj3 = c6073t.f47633c[i18];
                            if (obj3 instanceof C6074u) {
                                AbstractC3557B.a0("null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>", obj3);
                                C6074u c6074u = (C6074u) obj3;
                                Object[] objArr = c6074u.f47643b;
                                long[] jArr4 = c6074u.f47642a;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i12 = length;
                                if (length2 >= 0) {
                                    int i19 = 0;
                                    while (true) {
                                        long j13 = jArr4[i19];
                                        i11 = i14;
                                        j6 = j11;
                                        j10 = -9187201950435737472L;
                                        if ((((~j13) << 7) & j13 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i20 = 8 - ((~(i19 - length2)) >>> 31);
                                            for (int i21 = 0; i21 < i20; i21++) {
                                                if ((j13 & 255) < 128) {
                                                    int i22 = (i19 << 3) + i21;
                                                    if (objArr[i22] == obj) {
                                                        c6074u.h(i22);
                                                    }
                                                }
                                                j13 >>= 8;
                                            }
                                            if (i20 != 8) {
                                                break;
                                            }
                                        }
                                        if (i19 == length2) {
                                            break;
                                        }
                                        i19++;
                                        i14 = i11;
                                        j11 = j6;
                                    }
                                } else {
                                    i11 = i14;
                                    j6 = j11;
                                    j10 = -9187201950435737472L;
                                }
                            } else {
                                jArr2 = jArr3;
                                i12 = length;
                                i11 = i14;
                                j6 = j11;
                                j10 = j12;
                                AbstractC3557B.a0("null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1", obj3);
                            }
                        } else {
                            jArr2 = jArr3;
                            i12 = length;
                            i11 = i14;
                            j6 = j11;
                            j10 = j12;
                            i13 = i15;
                        }
                        j11 = j6 >> i13;
                        i17++;
                        i15 = i13;
                        j12 = j10;
                        jArr3 = jArr2;
                        length = i12;
                        i14 = i11;
                    }
                    jArr = jArr3;
                    int i23 = length;
                    int i24 = i14;
                    if (i16 == i15) {
                        length = i23;
                        i10 = i24;
                    } else {
                        return;
                    }
                } else {
                    jArr = jArr3;
                    i10 = i14;
                }
                if (i10 != length) {
                    i14 = i10 + 1;
                    jArr3 = jArr;
                } else {
                    return;
                }
            }
        }
    }
}
