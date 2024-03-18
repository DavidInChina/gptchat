package x3;

import id.AbstractC3557B;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: x3.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6270B implements B3.h, B3.g {

    /* renamed from: n0  reason: collision with root package name */
    public static final TreeMap f48654n0 = new TreeMap();

    /* renamed from: Y  reason: collision with root package name */
    public final int f48655Y;

    /* renamed from: Z  reason: collision with root package name */
    public volatile String f48656Z;

    /* renamed from: h0  reason: collision with root package name */
    public final long[] f48657h0;

    /* renamed from: i0  reason: collision with root package name */
    public final double[] f48658i0;

    /* renamed from: j0  reason: collision with root package name */
    public final String[] f48659j0;

    /* renamed from: k0  reason: collision with root package name */
    public final byte[][] f48660k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int[] f48661l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f48662m0;

    public C6270B(int i10) {
        this.f48655Y = i10;
        int i11 = i10 + 1;
        this.f48661l0 = new int[i11];
        this.f48657h0 = new long[i11];
        this.f48658i0 = new double[i11];
        this.f48659j0 = new String[i11];
        this.f48660k0 = new byte[i11];
    }

    public static final C6270B a(int i10, String str) {
        AbstractC3557B.c0("query", str);
        TreeMap treeMap = f48654n0;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
            if (ceilingEntry != null) {
                treeMap.remove(ceilingEntry.getKey());
                C6270B c6270b = (C6270B) ceilingEntry.getValue();
                c6270b.getClass();
                c6270b.f48656Z = str;
                c6270b.f48662m0 = i10;
                return c6270b;
            }
            C6270B c6270b2 = new C6270B(i10);
            c6270b2.f48656Z = str;
            c6270b2.f48662m0 = i10;
            return c6270b2;
        }
    }

    @Override // B3.g
    public final void D(int i10, double d10) {
        this.f48661l0[i10] = 3;
        this.f48658i0[i10] = d10;
    }

    @Override // B3.g
    public final void T(int i10, long j6) {
        this.f48661l0[i10] = 2;
        this.f48657h0[i10] = j6;
    }

    @Override // B3.g
    public final void b(int i10, String str) {
        AbstractC3557B.c0("value", str);
        this.f48661l0[i10] = 4;
        this.f48659j0[i10] = str;
    }

    @Override // B3.g
    public final void b0(int i10, byte[] bArr) {
        this.f48661l0[i10] = 5;
        this.f48660k0[i10] = bArr;
    }

    @Override // B3.h
    public final void h(w wVar) {
        int i10 = this.f48662m0;
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                int i12 = this.f48661l0[i11];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 == 5) {
                                    byte[] bArr = this.f48660k0[i11];
                                    if (bArr != null) {
                                        wVar.b0(i11, bArr);
                                    } else {
                                        throw new IllegalArgumentException("Required value was null.".toString());
                                    }
                                }
                            } else {
                                String str = this.f48659j0[i11];
                                if (str != null) {
                                    wVar.b(i11, str);
                                } else {
                                    throw new IllegalArgumentException("Required value was null.".toString());
                                }
                            }
                        } else {
                            wVar.D(i11, this.f48658i0[i11]);
                        }
                    } else {
                        wVar.T(i11, this.f48657h0[i11]);
                    }
                } else {
                    wVar.s0(i11);
                }
                if (i11 != i10) {
                    i11++;
                } else {
                    return;
                }
            }
        }
    }

    @Override // B3.h
    public final String i() {
        String str = this.f48656Z;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final void j() {
        TreeMap treeMap = f48654n0;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f48655Y), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                AbstractC3557B.b0("queryPool.descendingKeySet().iterator()", it);
                while (true) {
                    int i10 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i10;
                }
            }
        }
    }

    @Override // B3.g
    public final void s0(int i10) {
        this.f48661l0[i10] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
