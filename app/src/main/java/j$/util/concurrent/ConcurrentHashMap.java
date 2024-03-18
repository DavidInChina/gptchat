package j$.util.concurrent;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* loaded from: classes3.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, v {

    /* renamed from: g  reason: collision with root package name */
    static final int f35264g = Runtime.getRuntime().availableProcessors();

    /* renamed from: h  reason: collision with root package name */
    private static final j$.sun.misc.a f35265h;

    /* renamed from: i  reason: collision with root package name */
    private static final long f35266i;

    /* renamed from: j  reason: collision with root package name */
    private static final long f35267j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f35268k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f35269l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f35270m;

    /* renamed from: n  reason: collision with root package name */
    private static final int f35271n;

    /* renamed from: o  reason: collision with root package name */
    private static final int f35272o;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a  reason: collision with root package name */
    volatile transient l[] f35273a;

    /* renamed from: b  reason: collision with root package name */
    private volatile transient l[] f35274b;
    private volatile transient long baseCount;

    /* renamed from: c  reason: collision with root package name */
    private volatile transient c[] f35275c;
    private volatile transient int cellsBusy;

    /* renamed from: d  reason: collision with root package name */
    private transient i f35276d;

    /* renamed from: e  reason: collision with root package name */
    private transient t f35277e;

    /* renamed from: f  reason: collision with root package name */
    private transient e f35278f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        ObjectStreamField objectStreamField = new ObjectStreamField("segments", o[].class);
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{objectStreamField, new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        j$.sun.misc.a h10 = j$.sun.misc.a.h();
        f35265h = h10;
        f35266i = h10.j(ConcurrentHashMap.class, "sizeCtl");
        f35267j = h10.j(ConcurrentHashMap.class, "transferIndex");
        f35268k = h10.j(ConcurrentHashMap.class, "baseCount");
        f35269l = h10.j(ConcurrentHashMap.class, "cellsBusy");
        f35270m = h10.j(c.class, "value");
        f35271n = h10.a(l[].class);
        int b10 = h10.b(l[].class);
        if (((b10 - 1) & b10) == 0) {
            f35272o = 31 - Integer.numberOfLeadingZeros(b10);
            return;
        }
        throw new ExceptionInInitializerError("array index scale not a power of two");
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i10) {
        this(i10, 0.75f, 1);
    }

    public ConcurrentHashMap(int i10, float f6, int i11) {
        if (f6 <= 0.0f || i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        long j6 = (long) (((i10 < i11 ? i11 : i10) / f6) + 1.0d);
        this.sizeCtl = j6 >= 1073741824 ? 1073741824 : l((int) j6);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
        if (r1.d(r25, r3, r5, r14) == false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x013f, code lost:
        if (r25.f35275c != r7) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0141, code lost:
        r25.f35275c = (j$.util.concurrent.c[]) java.util.Arrays.copyOf(r7, r8 << 1);
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00ba A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a(long j6, int i10) {
        long j10;
        l[] lVarArr;
        int length;
        l[] lVarArr2;
        boolean z10;
        boolean z11;
        int length2;
        boolean z12;
        int length3;
        int length4;
        c cVar;
        c[] cVarArr = this.f35275c;
        if (cVarArr == null) {
            j$.sun.misc.a aVar = f35265h;
            long j11 = f35268k;
            long j12 = this.baseCount;
            j10 = j12 + j6;
        }
        if (cVarArr == null || (length4 = cVarArr.length - 1) < 0 || (cVar = cVarArr[length4 & ThreadLocalRandom.b()]) == null) {
            z10 = true;
        } else {
            j$.sun.misc.a aVar2 = f35265h;
            long j13 = f35270m;
            long j14 = cVar.value;
            z10 = aVar2.d(cVar, j13, j14, j14 + j6);
            if (z10) {
                if (i10 <= 1) {
                    return;
                }
                j10 = j();
                if (i10 < 0) {
                    return;
                }
                while (true) {
                    int i11 = this.sizeCtl;
                    if (j10 < i11 || (lVarArr = this.f35273a) == null || (length = lVarArr.length) >= 1073741824) {
                        return;
                    }
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length) | 32768;
                    if (i11 < 0) {
                        if ((i11 >>> 16) != numberOfLeadingZeros || i11 == numberOfLeadingZeros + 1 || i11 == numberOfLeadingZeros + 65535 || (lVarArr2 = this.f35274b) == null || this.transferIndex <= 0) {
                            return;
                        }
                        if (f35265h.c(this, f35266i, i11, i11 + 1)) {
                            m(lVarArr, lVarArr2);
                        }
                    } else if (f35265h.c(this, f35266i, i11, (numberOfLeadingZeros << 16) + 2)) {
                        m(lVarArr, null);
                    }
                    j10 = j();
                }
            }
        }
        int b10 = ThreadLocalRandom.b();
        if (b10 == 0) {
            ThreadLocalRandom.f();
            b10 = ThreadLocalRandom.b();
            z10 = true;
        }
        boolean z13 = z10;
        while (true) {
            boolean z14 = false;
            while (true) {
                c[] cVarArr2 = this.f35275c;
                if (cVarArr2 != null && (length2 = cVarArr2.length) > 0) {
                    c cVar2 = cVarArr2[(length2 - 1) & b10];
                    if (cVar2 != null) {
                        if (!z13) {
                            z13 = true;
                        } else {
                            j$.sun.misc.a aVar3 = f35265h;
                            long j15 = f35270m;
                            long j16 = cVar2.value;
                            if (aVar3.d(cVar2, j15, j16, j16 + j6)) {
                                return;
                            }
                            if (this.f35275c == cVarArr2 && length2 < f35264g) {
                                if (!z14) {
                                    z14 = true;
                                } else if (this.cellsBusy == 0 && aVar3.c(this, f35269l, 0, 1)) {
                                    try {
                                        break;
                                    } finally {
                                    }
                                }
                            }
                        }
                        b10 = ThreadLocalRandom.a(b10);
                    } else if (this.cellsBusy == 0) {
                        c cVar3 = new c(j6);
                        if (this.cellsBusy == 0 && f35265h.c(this, f35269l, 0, 1)) {
                            try {
                                c[] cVarArr3 = this.f35275c;
                                if (cVarArr3 != null && (length3 = cVarArr3.length) > 0) {
                                    int i12 = (length3 - 1) & b10;
                                    if (cVarArr3[i12] == null) {
                                        cVarArr3[i12] = cVar3;
                                        z12 = true;
                                        if (!z12) {
                                            return;
                                        }
                                    }
                                }
                                z12 = false;
                                if (!z12) {
                                }
                            } finally {
                            }
                        }
                    }
                    z14 = false;
                    b10 = ThreadLocalRandom.a(b10);
                } else if (this.cellsBusy == 0 && this.f35275c == cVarArr2 && f35265h.c(this, f35269l, 0, 1)) {
                    try {
                        if (this.f35275c == cVarArr2) {
                            c[] cVarArr4 = new c[2];
                            cVarArr4[b10 & 1] = new c(j6);
                            this.f35275c = cVarArr4;
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z11) {
                            return;
                        }
                    } finally {
                    }
                } else {
                    j$.sun.misc.a aVar4 = f35265h;
                    long j17 = f35268k;
                    long j18 = this.baseCount;
                    if (aVar4.d(this, j17, j18, j18 + j6)) {
                        return;
                    }
                }
            }
        }
    }

    static final boolean b(l[] lVarArr, int i10, l lVar) {
        return f35265h.e(lVarArr, (i10 << f35272o) + f35271n, lVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (obj instanceof Comparable) {
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return cls;
            }
            Type[] genericInterfaces = cls.getGenericInterfaces();
            if (genericInterfaces == null) {
                return null;
            }
            for (Type type : genericInterfaces) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                        return cls;
                    }
                }
            }
            return null;
        }
        return null;
    }

    private final l[] e() {
        while (true) {
            l[] lVarArr = this.f35273a;
            if (lVarArr == null || lVarArr.length == 0) {
                int i10 = this.sizeCtl;
                if (i10 < 0) {
                    Thread.yield();
                } else if (f35265h.c(this, f35266i, i10, -1)) {
                    try {
                        l[] lVarArr2 = this.f35273a;
                        if (lVarArr2 != null) {
                            if (lVarArr2.length == 0) {
                            }
                            this.sizeCtl = i10;
                            return lVarArr2;
                        }
                        int i11 = i10 > 0 ? i10 : 16;
                        l[] lVarArr3 = new l[i11];
                        this.f35273a = lVarArr3;
                        i10 = i11 - (i11 >>> 2);
                        lVarArr2 = lVarArr3;
                        this.sizeCtl = i10;
                        return lVarArr2;
                    } catch (Throwable th2) {
                        this.sizeCtl = i10;
                        throw th2;
                    }
                }
            } else {
                return lVarArr;
            }
        }
    }

    static final void h(l[] lVarArr, int i10, l lVar) {
        f35265h.l(lVarArr, (i10 << f35272o) + f35271n, lVar);
    }

    static final int i(int i10) {
        return (i10 ^ (i10 >>> 16)) & Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final l k(l[] lVarArr, int i10) {
        return (l) f35265h.g(lVarArr, (i10 << f35272o) + f35271n);
    }

    private static final int l(int i10) {
        int numberOfLeadingZeros = (-1) >>> Integer.numberOfLeadingZeros(i10 - 1);
        if (numberOfLeadingZeros < 0) {
            return 1;
        }
        if (numberOfLeadingZeros < 1073741824) {
            return 1 + numberOfLeadingZeros;
        }
        return 1073741824;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v17, types: [j$.util.concurrent.l] */
    /* JADX WARN: Type inference failed for: r5v22, types: [j$.util.concurrent.l] */
    private final void m(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        int i10;
        int i11;
        boolean z10;
        ConcurrentHashMap<K, V> concurrentHashMap;
        g gVar;
        char c10;
        int i12;
        s sVar;
        ConcurrentHashMap<K, V> concurrentHashMap2 = this;
        l[] lVarArr4 = lVarArr;
        int length = lVarArr4.length;
        int i13 = f35264g;
        boolean z11 = true;
        int i14 = i13 > 1 ? (length >>> 3) / i13 : length;
        char c11 = 16;
        int i15 = i14 < 16 ? 16 : i14;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap2.f35274b = lVarArr5;
                concurrentHashMap2.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap2.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar2 = new g(lVarArr3);
        boolean z12 = true;
        int i16 = 0;
        int i17 = 0;
        boolean z13 = false;
        while (true) {
            if (z12) {
                int i18 = i17 - 1;
                if (i18 >= i16 || z13) {
                    i16 = i16;
                    i17 = i18;
                } else {
                    int i19 = concurrentHashMap2.transferIndex;
                    if (i19 <= 0) {
                        i17 = -1;
                    } else {
                        j$.sun.misc.a aVar = f35265h;
                        long j6 = f35267j;
                        int i20 = i19 > i15 ? i19 - i15 : 0;
                        int i21 = i16;
                        if (aVar.c(this, j6, i19, i20)) {
                            i17 = i19 - 1;
                            i16 = i20;
                        } else {
                            i16 = i21;
                            i17 = i18;
                        }
                    }
                }
                z12 = false;
            } else {
                int i22 = i16;
                s sVar2 = null;
                if (i17 < 0 || i17 >= length || (i12 = i17 + length) >= length2) {
                    i11 = i15;
                    i10 = length2;
                    gVar = gVar2;
                    concurrentHashMap = this;
                    if (z13) {
                        concurrentHashMap.f35274b = null;
                        concurrentHashMap.f35273a = lVarArr3;
                        concurrentHashMap.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    z10 = true;
                    j$.sun.misc.a aVar2 = f35265h;
                    long j10 = f35266i;
                    int i23 = concurrentHashMap.sizeCtl;
                    int i24 = i17;
                    if (aVar2.c(this, j10, i23, i23 - 1)) {
                        c10 = 16;
                        if (i23 - 2 != ((Integer.numberOfLeadingZeros(length) | 32768) << 16)) {
                            return;
                        }
                        i17 = length;
                        z12 = true;
                        z13 = true;
                    } else {
                        c10 = 16;
                        i17 = i24;
                    }
                } else {
                    l k10 = k(lVarArr4, i17);
                    if (k10 == null) {
                        z12 = b(lVarArr4, i17, gVar2);
                        c10 = c11;
                        i11 = i15;
                        i10 = length2;
                        z10 = z11;
                        concurrentHashMap = concurrentHashMap2;
                    } else {
                        int i25 = k10.f35298a;
                        if (i25 == -1) {
                            z12 = z11;
                            c10 = c11;
                            i11 = i15;
                            i10 = length2;
                            concurrentHashMap = concurrentHashMap2;
                            z10 = z12;
                        } else {
                            synchronized (k10) {
                                try {
                                    if (k(lVarArr4, i17) == k10) {
                                        if (i25 >= 0) {
                                            int i26 = i25 & length;
                                            s sVar3 = k10;
                                            for (s sVar4 = k10.f35301d; sVar4 != null; sVar4 = sVar4.f35301d) {
                                                int i27 = sVar4.f35298a & length;
                                                if (i27 != i26) {
                                                    sVar3 = sVar4;
                                                    i26 = i27;
                                                }
                                            }
                                            if (i26 == 0) {
                                                sVar = null;
                                                sVar2 = sVar3;
                                            } else {
                                                sVar = sVar3;
                                            }
                                            l lVar = k10;
                                            while (lVar != sVar3) {
                                                int i28 = lVar.f35298a;
                                                Object obj = lVar.f35299b;
                                                int i29 = i15;
                                                Object obj2 = lVar.f35300c;
                                                int i30 = length2;
                                                if ((i28 & length) == 0) {
                                                    sVar2 = new l(i28, obj, obj2, sVar2);
                                                } else {
                                                    sVar = new l(i28, obj, obj2, sVar);
                                                }
                                                lVar = lVar.f35301d;
                                                i15 = i29;
                                                length2 = i30;
                                            }
                                            i11 = i15;
                                            i10 = length2;
                                            h(lVarArr3, i17, sVar2);
                                            h(lVarArr3, i12, sVar);
                                            h(lVarArr4, i17, gVar2);
                                            gVar = gVar2;
                                        } else {
                                            i11 = i15;
                                            i10 = length2;
                                            if (k10 instanceof r) {
                                                r rVar = (r) k10;
                                                s sVar5 = null;
                                                s sVar6 = null;
                                                l lVar2 = rVar.f35317f;
                                                int i31 = 0;
                                                int i32 = 0;
                                                s sVar7 = null;
                                                while (lVar2 != null) {
                                                    r rVar2 = rVar;
                                                    int i33 = lVar2.f35298a;
                                                    g gVar3 = gVar2;
                                                    s sVar8 = new s(i33, lVar2.f35299b, lVar2.f35300c, null, null);
                                                    if ((i33 & length) == 0) {
                                                        sVar8.f35322h = sVar6;
                                                        if (sVar6 == null) {
                                                            sVar2 = sVar8;
                                                        } else {
                                                            sVar6.f35301d = sVar8;
                                                        }
                                                        i31++;
                                                        sVar6 = sVar8;
                                                    } else {
                                                        sVar8.f35322h = sVar5;
                                                        if (sVar5 == null) {
                                                            sVar7 = sVar8;
                                                        } else {
                                                            sVar5.f35301d = sVar8;
                                                        }
                                                        i32++;
                                                        sVar5 = sVar8;
                                                    }
                                                    lVar2 = lVar2.f35301d;
                                                    rVar = rVar2;
                                                    gVar2 = gVar3;
                                                }
                                                r rVar3 = rVar;
                                                g gVar4 = gVar2;
                                                l p10 = i31 <= 6 ? p(sVar2) : i32 != 0 ? new r(sVar2) : rVar3;
                                                l p11 = i32 <= 6 ? p(sVar7) : i31 != 0 ? new r(sVar7) : rVar3;
                                                h(lVarArr3, i17, p10);
                                                h(lVarArr3, i12, p11);
                                                lVarArr4 = lVarArr;
                                                gVar = gVar4;
                                                h(lVarArr4, i17, gVar);
                                            }
                                        }
                                        z12 = true;
                                    } else {
                                        i11 = i15;
                                        i10 = length2;
                                    }
                                    gVar = gVar2;
                                } finally {
                                }
                            }
                            concurrentHashMap = this;
                            c10 = 16;
                            z10 = true;
                        }
                    }
                    gVar = gVar2;
                }
                gVar2 = gVar;
                concurrentHashMap2 = concurrentHashMap;
                z11 = z10;
                i16 = i22;
                i15 = i11;
                length2 = i10;
                c11 = c10;
            }
        }
    }

    private final void n(l[] lVarArr, int i10) {
        int length = lVarArr.length;
        if (length < 64) {
            o(length << 1);
            return;
        }
        l k10 = k(lVarArr, i10);
        if (k10 == null || k10.f35298a < 0) {
            return;
        }
        synchronized (k10) {
            try {
                if (k(lVarArr, i10) == k10) {
                    s sVar = null;
                    l lVar = k10;
                    s sVar2 = null;
                    while (lVar != null) {
                        s sVar3 = new s(lVar.f35298a, lVar.f35299b, lVar.f35300c, null, null);
                        sVar3.f35322h = sVar2;
                        if (sVar2 == null) {
                            sVar = sVar3;
                        } else {
                            sVar2.f35301d = sVar3;
                        }
                        lVar = lVar.f35301d;
                        sVar2 = sVar3;
                    }
                    h(lVarArr, i10, new r(sVar));
                }
            } finally {
            }
        }
    }

    private final void o(int i10) {
        int length;
        int l10 = i10 >= 536870912 ? 1073741824 : l(i10 + (i10 >>> 1) + 1);
        while (true) {
            int i11 = this.sizeCtl;
            if (i11 >= 0) {
                l[] lVarArr = this.f35273a;
                if (lVarArr == null || (length = lVarArr.length) == 0) {
                    int i12 = i11 > l10 ? i11 : l10;
                    if (f35265h.c(this, f35266i, i11, -1)) {
                        try {
                            if (this.f35273a == lVarArr) {
                                this.f35273a = new l[i12];
                                i11 = i12 - (i12 >>> 2);
                            }
                        } finally {
                            this.sizeCtl = i11;
                        }
                    } else {
                        continue;
                    }
                } else if (l10 <= i11 || length >= 1073741824) {
                    return;
                } else {
                    if (lVarArr == this.f35273a && f35265h.c(this, f35266i, i11, ((Integer.numberOfLeadingZeros(length) | 32768) << 16) + 2)) {
                        m(lVarArr, null);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [j$.util.concurrent.l] */
    static l p(s sVar) {
        l lVar = null;
        l lVar2 = null;
        for (s sVar2 = sVar; sVar2 != null; sVar2 = sVar2.f35301d) {
            l lVar3 = new l(sVar2.f35298a, sVar2.f35299b, sVar2.f35300c);
            if (lVar2 == null) {
                lVar = lVar3;
            } else {
                lVar2.f35301d = lVar3;
            }
            lVar2 = lVar3;
        }
        return lVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j6;
        boolean z10;
        boolean z11;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j10 = 0;
        long j11 = 0;
        l lVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j6 = 1;
            if (readObject == null || readObject2 == null) {
                break;
            }
            j11++;
            lVar = new l(i(readObject.hashCode()), readObject, readObject2, lVar);
        }
        if (j11 == 0) {
            this.sizeCtl = 0;
            return;
        }
        long j12 = (long) ((((float) j11) / 0.75f) + 1.0d);
        int l10 = j12 >= 1073741824 ? 1073741824 : l((int) j12);
        l[] lVarArr = new l[l10];
        int i10 = l10 - 1;
        while (lVar != null) {
            l lVar2 = lVar.f35301d;
            int i11 = lVar.f35298a;
            int i12 = i11 & i10;
            l k10 = k(lVarArr, i12);
            if (k10 == null) {
                z10 = true;
            } else {
                Object obj2 = lVar.f35299b;
                if (k10.f35298a >= 0) {
                    int i13 = 0;
                    for (l lVar3 = k10; lVar3 != null; lVar3 = lVar3.f35301d) {
                        if (lVar3.f35298a == i11 && ((obj = lVar3.f35299b) == obj2 || (obj != null && obj2.equals(obj)))) {
                            z11 = false;
                            break;
                        }
                        i13++;
                    }
                    z11 = true;
                    if (!z11 || i13 < 8) {
                        z10 = z11;
                    } else {
                        long j13 = j10 + 1;
                        lVar.f35301d = k10;
                        l lVar4 = lVar;
                        s sVar = null;
                        s sVar2 = null;
                        while (lVar4 != null) {
                            long j14 = j13;
                            s sVar3 = new s(lVar4.f35298a, lVar4.f35299b, lVar4.f35300c, null, null);
                            sVar3.f35322h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.f35301d = sVar3;
                            }
                            lVar4 = lVar4.f35301d;
                            sVar2 = sVar3;
                            j13 = j14;
                        }
                        h(lVarArr, i12, new r(sVar));
                        j10 = j13;
                    }
                } else if (((r) k10).e(i11, obj2, lVar.f35300c) == null) {
                    j10 += j6;
                }
                z10 = false;
            }
            if (z10) {
                j10++;
                lVar.f35301d = k10;
                h(lVarArr, i12, lVar);
            }
            j6 = 1;
            lVar = lVar2;
        }
        this.f35273a = lVarArr;
        this.sizeCtl = l10 - (l10 >>> 2);
        this.baseCount = j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i10 = 0;
        int i11 = 1;
        while (i11 < 16) {
            i10++;
            i11 <<= 1;
        }
        int i12 = 32 - i10;
        int i13 = i11 - 1;
        o[] oVarArr = new o[16];
        for (int i14 = 0; i14 < 16; i14++) {
            oVarArr[i14] = new ReentrantLock();
        }
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("segments", oVarArr);
        putFields.put("segmentShift", i12);
        putFields.put("segmentMask", i13);
        objectOutputStream.writeFields();
        l[] lVarArr = this.f35273a;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a5 = qVar.a();
                if (a5 == null) {
                    break;
                }
                objectOutputStream.writeObject(a5.f35299b);
                objectOutputStream.writeObject(a5.f35300c);
            }
        }
        objectOutputStream.writeObject(null);
        objectOutputStream.writeObject(null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        l k10;
        l[] lVarArr = this.f35273a;
        long j6 = 0;
        loop0: while (true) {
            int i10 = 0;
            while (lVarArr != null && i10 < lVarArr.length) {
                k10 = k(lVarArr, i10);
                if (k10 == null) {
                    i10++;
                } else {
                    int i11 = k10.f35298a;
                    if (i11 == -1) {
                        break;
                    }
                    synchronized (k10) {
                        try {
                            if (k(lVarArr, i10) == k10) {
                                for (l lVar = i11 >= 0 ? k10 : k10 instanceof r ? ((r) k10).f35317f : null; lVar != null; lVar = lVar.f35301d) {
                                    j6--;
                                }
                                h(lVarArr, i10, null);
                                i10++;
                            }
                        } finally {
                        }
                    }
                }
            }
            lVarArr = d(lVarArr, k10);
        }
        if (j6 != 0) {
            a(j6, -1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x010e, code lost:
        if (r4 == 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0110, code lost:
        a(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0114, code lost:
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object compute(Object obj, BiFunction biFunction) {
        l lVar;
        Object obj2;
        Object obj3;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i10 = i(obj.hashCode());
        l[] lVarArr = this.f35273a;
        int i11 = 0;
        Object obj4 = null;
        int i12 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & i10;
                    l k10 = k(lVarArr, i13);
                    if (k10 == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            try {
                                if (b(lVarArr, i13, mVar)) {
                                    obj4 = biFunction.apply(obj, null);
                                    if (obj4 != null) {
                                        lVar = new l(i10, obj, obj4);
                                        i12 = 1;
                                    } else {
                                        lVar = null;
                                    }
                                    h(lVarArr, i13, lVar);
                                    i11 = 1;
                                }
                            } finally {
                            }
                        }
                        if (i11 != 0) {
                        }
                    } else {
                        int i14 = k10.f35298a;
                        if (i14 == -1) {
                            lVarArr = d(lVarArr, k10);
                        } else {
                            synchronized (k10) {
                                try {
                                    if (k(lVarArr, i13) == k10) {
                                        if (i14 >= 0) {
                                            l lVar2 = null;
                                            l lVar3 = k10;
                                            i11 = 1;
                                            while (true) {
                                                if (lVar3.f35298a == i10 && ((obj3 = lVar3.f35299b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    break;
                                                }
                                                l lVar4 = lVar3.f35301d;
                                                if (lVar4 == null) {
                                                    obj2 = biFunction.apply(obj, null);
                                                    if (obj2 != null) {
                                                        if (lVar3.f35301d != null) {
                                                            throw new IllegalStateException("Recursive update");
                                                        }
                                                        lVar3.f35301d = new l(i10, obj, obj2);
                                                        i12 = 1;
                                                    }
                                                } else {
                                                    i11++;
                                                    lVar2 = lVar3;
                                                    lVar3 = lVar4;
                                                }
                                            }
                                            Object apply = biFunction.apply(obj, lVar3.f35300c);
                                            if (apply != null) {
                                                lVar3.f35300c = apply;
                                                obj4 = apply;
                                            } else {
                                                l lVar5 = lVar3.f35301d;
                                                if (lVar2 != null) {
                                                    lVar2.f35301d = lVar5;
                                                } else {
                                                    h(lVarArr, i13, lVar5);
                                                }
                                                obj4 = apply;
                                                i12 = -1;
                                            }
                                        } else if (k10 instanceof r) {
                                            r rVar = (r) k10;
                                            s sVar = rVar.f35316e;
                                            s b10 = sVar != null ? sVar.b(i10, obj, null) : null;
                                            obj2 = biFunction.apply(obj, b10 == null ? null : b10.f35300c);
                                            if (obj2 != null) {
                                                if (b10 != null) {
                                                    b10.f35300c = obj2;
                                                } else {
                                                    rVar.e(i10, obj, obj2);
                                                    i12 = 1;
                                                }
                                            } else if (b10 != null) {
                                                if (rVar.f(b10)) {
                                                    h(lVarArr, i13, p(rVar.f35317f));
                                                }
                                                i12 = -1;
                                            }
                                            i11 = 1;
                                            obj4 = obj2;
                                        } else if (k10 instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                } finally {
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    n(lVarArr, i13);
                                }
                            }
                        }
                    }
                }
            }
            lVarArr = e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x00f2, code lost:
        if (r5 == null) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x00f4, code lost:
        a(1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f9, code lost:
        return r5;
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfAbsent(Object obj, Function function) {
        s b10;
        Object obj2;
        Object obj3;
        Object obj4;
        if (obj == null || function == null) {
            throw null;
        }
        int i10 = i(obj.hashCode());
        l[] lVarArr = this.f35273a;
        Object obj5 = null;
        int i11 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i12 = (length - 1) & i10;
                    l k10 = k(lVarArr, i12);
                    boolean z10 = true;
                    if (k10 == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            try {
                                if (b(lVarArr, i12, mVar)) {
                                    obj5 = function.apply(obj);
                                    h(lVarArr, i12, obj5 != null ? new l(i10, obj, obj5) : null);
                                    i11 = 1;
                                }
                            } finally {
                            }
                        }
                        if (i11 != 0) {
                        }
                    } else {
                        int i13 = k10.f35298a;
                        if (i13 == -1) {
                            lVarArr = d(lVarArr, k10);
                        } else if (i13 == i10 && (((obj3 = k10.f35299b) == obj || (obj3 != null && obj.equals(obj3))) && (obj4 = k10.f35300c) != null)) {
                            return obj4;
                        } else {
                            synchronized (k10) {
                                try {
                                    if (k(lVarArr, i12) == k10) {
                                        if (i13 >= 0) {
                                            l lVar = k10;
                                            i11 = 1;
                                            while (true) {
                                                if (lVar.f35298a == i10 && ((obj2 = lVar.f35299b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                    break;
                                                }
                                                l lVar2 = lVar.f35301d;
                                                if (lVar2 == null) {
                                                    Object apply = function.apply(obj);
                                                    if (apply == null) {
                                                        z10 = false;
                                                    } else if (lVar.f35301d != null) {
                                                        throw new IllegalStateException("Recursive update");
                                                    } else {
                                                        lVar.f35301d = new l(i10, obj, apply);
                                                    }
                                                    obj5 = apply;
                                                } else {
                                                    i11++;
                                                    lVar = lVar2;
                                                }
                                            }
                                            obj5 = lVar.f35300c;
                                        } else if (k10 instanceof r) {
                                            r rVar = (r) k10;
                                            s sVar = rVar.f35316e;
                                            if (sVar == null || (b10 = sVar.b(i10, obj, null)) == null) {
                                                obj5 = function.apply(obj);
                                                if (obj5 != null) {
                                                    rVar.e(i10, obj, obj5);
                                                } else {
                                                    z10 = false;
                                                }
                                            } else {
                                                z10 = false;
                                                obj5 = b10.f35300c;
                                            }
                                            i11 = 2;
                                        } else if (k10 instanceof m) {
                                            throw new IllegalStateException("Recursive update");
                                        }
                                    }
                                    z10 = false;
                                } finally {
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    n(lVarArr, i12);
                                }
                                if (!z10) {
                                    return obj5;
                                }
                            }
                        }
                    }
                }
            }
            lVarArr = e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00aa, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        s b10;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int i10 = i(obj.hashCode());
        l[] lVarArr = this.f35273a;
        int i11 = 0;
        Object obj3 = null;
        int i12 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & i10;
                    l k10 = k(lVarArr, i13);
                    if (k10 == null) {
                        break;
                    }
                    int i14 = k10.f35298a;
                    if (i14 == -1) {
                        lVarArr = d(lVarArr, k10);
                    } else {
                        synchronized (k10) {
                            try {
                                if (k(lVarArr, i13) == k10) {
                                    if (i14 < 0) {
                                        if (!(k10 instanceof r)) {
                                            if (k10 instanceof m) {
                                                break;
                                            }
                                        } else {
                                            r rVar = (r) k10;
                                            s sVar = rVar.f35316e;
                                            if (sVar != null && (b10 = sVar.b(i10, obj, null)) != null) {
                                                obj3 = biFunction.apply(obj, b10.f35300c);
                                                if (obj3 != null) {
                                                    b10.f35300c = obj3;
                                                } else {
                                                    if (rVar.f(b10)) {
                                                        h(lVarArr, i13, p(rVar.f35317f));
                                                    }
                                                    i11 = -1;
                                                }
                                            }
                                            i12 = 2;
                                        }
                                    } else {
                                        i12 = 1;
                                        l lVar = null;
                                        l lVar2 = k10;
                                        while (true) {
                                            if (lVar2.f35298a == i10 && ((obj2 = lVar2.f35299b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                break;
                                            }
                                            l lVar3 = lVar2.f35301d;
                                            if (lVar3 == null) {
                                                break;
                                            }
                                            i12++;
                                            lVar = lVar2;
                                            lVar2 = lVar3;
                                        }
                                        obj3 = biFunction.apply(obj, lVar2.f35300c);
                                        if (obj3 != null) {
                                            lVar2.f35300c = obj3;
                                        } else {
                                            l lVar4 = lVar2.f35301d;
                                            if (lVar != null) {
                                                lVar.f35301d = lVar4;
                                            } else {
                                                h(lVarArr, i13, lVar4);
                                            }
                                            i11 = -1;
                                        }
                                    }
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        if (i12 != 0) {
                            break;
                        }
                    }
                }
            }
            lVarArr = e();
        }
        if (i11 != 0) {
            a(i11, i12);
        }
        return obj3;
    }

    public boolean contains(Object obj) {
        return containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.f35273a;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a5 = qVar.a();
                if (a5 == null) {
                    break;
                }
                Object obj2 = a5.f35300c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    final l[] d(l[] lVarArr, l lVar) {
        l[] lVarArr2;
        int i10;
        if (!(lVar instanceof g) || (lVarArr2 = ((g) lVar).f35291e) == null) {
            return this.f35273a;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(lVarArr.length) | 32768;
        while (true) {
            if (lVarArr2 != this.f35274b || this.f35273a != lVarArr || (i10 = this.sizeCtl) >= 0 || (i10 >>> 16) != numberOfLeadingZeros || i10 == numberOfLeadingZeros + 1 || i10 == 65535 + numberOfLeadingZeros || this.transferIndex <= 0) {
                break;
            } else if (f35265h.c(this, f35266i, i10, i10 + 1)) {
                m(lVarArr, lVarArr2);
                break;
            }
        }
        return lVarArr2;
    }

    public Enumeration<V> elements() {
        l[] lVarArr = this.f35273a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new h(lVarArr, length, length, this, 1);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.concurrent.b, j$.util.concurrent.e, java.util.Set<java.util.Map$Entry<K, V>>] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        e eVar = this.f35278f;
        if (eVar != null) {
            return eVar;
        }
        ?? r02 = (Set<Map.Entry<K, V>>) new b(this);
        this.f35278f = r02;
        return r02;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        V value;
        V v10;
        if (obj != this) {
            if (!(obj instanceof Map)) {
                return false;
            }
            Map map = (Map) obj;
            l[] lVarArr = this.f35273a;
            int length = lVarArr == null ? 0 : lVarArr.length;
            q qVar = new q(lVarArr, length, 0, length);
            while (true) {
                l a5 = qVar.a();
                if (a5 == null) {
                    for (Map.Entry<K, V> entry : map.entrySet()) {
                        K key = entry.getKey();
                        if (key == null || (value = entry.getValue()) == null || (v10 = get(key)) == null || (value != v10 && !value.equals(v10))) {
                            return false;
                        }
                    }
                    return true;
                }
                Object obj2 = a5.f35300c;
                Object obj3 = map.get(a5.f35299b);
                if (obj3 == null || (obj3 != obj2 && !obj3.equals(obj2))) {
                    break;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00b4, code lost:
        a(1, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b9, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Object obj, Object obj2, boolean z10) {
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int i10 = i(obj.hashCode());
        l[] lVarArr = this.f35273a;
        int i11 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i12 = (length - 1) & i10;
                    l k10 = k(lVarArr, i12);
                    if (k10 != null) {
                        int i13 = k10.f35298a;
                        if (i13 == -1) {
                            lVarArr = d(lVarArr, k10);
                        } else if (z10 && i13 == i10 && (((obj5 = k10.f35299b) == obj || (obj5 != null && obj.equals(obj5))) && (obj6 = k10.f35300c) != null)) {
                            return obj6;
                        } else {
                            synchronized (k10) {
                                try {
                                    if (k(lVarArr, i12) == k10) {
                                        if (i13 < 0) {
                                            if (!(k10 instanceof r)) {
                                                if (k10 instanceof m) {
                                                    break;
                                                }
                                            } else {
                                                s e10 = ((r) k10).e(i10, obj, obj2);
                                                if (e10 != null) {
                                                    Object obj7 = e10.f35300c;
                                                    if (!z10) {
                                                        e10.f35300c = obj2;
                                                    }
                                                    obj3 = obj7;
                                                } else {
                                                    obj3 = null;
                                                }
                                                i11 = 2;
                                            }
                                        } else {
                                            i11 = 1;
                                            l lVar = k10;
                                            while (true) {
                                                if (lVar.f35298a == i10 && ((obj4 = lVar.f35299b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                                    break;
                                                }
                                                l lVar2 = lVar.f35301d;
                                                if (lVar2 == null) {
                                                    lVar.f35301d = new l(i10, obj, obj2);
                                                    break;
                                                }
                                                i11++;
                                                lVar = lVar2;
                                            }
                                            obj3 = lVar.f35300c;
                                            if (!z10) {
                                                lVar.f35300c = obj2;
                                            }
                                        }
                                    }
                                    obj3 = null;
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    n(lVarArr, i12);
                                }
                                if (obj3 != null) {
                                    return obj3;
                                }
                            }
                        }
                    } else if (b(lVarArr, i12, new l(i10, obj, obj2))) {
                        break;
                    }
                }
            }
            lVarArr = e();
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.f35273a;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a5 = qVar.a();
                if (a5 == null) {
                    return;
                }
                biConsumer.accept(a5.f35299b, a5.f35300c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ab, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj, Object obj2, Object obj3) {
        int length;
        int i10;
        l k10;
        Object obj4;
        boolean z10;
        s b10;
        l p10;
        Object obj5;
        int i11 = i(obj.hashCode());
        l[] lVarArr = this.f35273a;
        while (true) {
            if (lVarArr == null || (length = lVarArr.length) == 0 || (k10 = k(lVarArr, (i10 = (length - 1) & i11))) == null) {
                break;
            }
            int i12 = k10.f35298a;
            if (i12 == -1) {
                lVarArr = d(lVarArr, k10);
            } else {
                synchronized (k10) {
                    try {
                        if (k(lVarArr, i10) == k10) {
                            z10 = true;
                            if (i12 < 0) {
                                if (!(k10 instanceof r)) {
                                    if (k10 instanceof m) {
                                        break;
                                    }
                                } else {
                                    r rVar = (r) k10;
                                    s sVar = rVar.f35316e;
                                    if (sVar != null && (b10 = sVar.b(i11, obj, null)) != null) {
                                        obj4 = b10.f35300c;
                                        if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                            if (obj2 != null) {
                                                b10.f35300c = obj2;
                                            } else if (rVar.f(b10)) {
                                                p10 = p(rVar.f35317f);
                                                h(lVarArr, i10, p10);
                                            }
                                        }
                                    }
                                    obj4 = null;
                                }
                            } else {
                                l lVar = null;
                                l lVar2 = k10;
                                while (true) {
                                    if (lVar2.f35298a == i11 && ((obj5 = lVar2.f35299b) == obj || (obj5 != null && obj.equals(obj5)))) {
                                        break;
                                    }
                                    l lVar3 = lVar2.f35301d;
                                    if (lVar3 == null) {
                                        break;
                                    }
                                    lVar = lVar2;
                                    lVar2 = lVar3;
                                }
                                obj4 = lVar2.f35300c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        lVar2.f35300c = obj2;
                                    } else if (lVar != null) {
                                        lVar.f35301d = lVar2.f35301d;
                                    } else {
                                        p10 = lVar2.f35301d;
                                        h(lVarArr, i10, p10);
                                    }
                                }
                                obj4 = null;
                            }
                        }
                        z10 = false;
                        obj4 = null;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (z10) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1L, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004d, code lost:
        return (V) r1.f35300c;
     */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V get(Object obj) {
        int length;
        l k10;
        Object obj2;
        int i10 = i(obj.hashCode());
        l[] lVarArr = this.f35273a;
        if (lVarArr != null && (length = lVarArr.length) > 0 && (k10 = k(lVarArr, (length - 1) & i10)) != null) {
            int i11 = k10.f35298a;
            if (i11 == i10) {
                Object obj3 = k10.f35299b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return (V) k10.f35300c;
                }
            } else if (i11 < 0) {
                l a5 = k10.a(obj, i10);
                if (a5 == null) {
                    return null;
                }
                return (V) a5.f35300c;
            }
            while (true) {
                k10 = k10.f35301d;
                if (k10 == null) {
                    break;
                } else if (k10.f35298a != i10 || ((obj2 = k10.f35299b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                }
            }
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        V v10 = get(obj);
        return v10 == null ? obj2 : v10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        l[] lVarArr = this.f35273a;
        int i10 = 0;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a5 = qVar.a();
                if (a5 == null) {
                    break;
                }
                i10 += a5.f35300c.hashCode() ^ a5.f35299b.hashCode();
            }
        }
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return j() <= 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long j() {
        c[] cVarArr = this.f35275c;
        long j6 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j6 += cVar.value;
                }
            }
        }
        return j6;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.util.concurrent.b, java.util.Set<K>, j$.util.concurrent.i] */
    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        i iVar = this.f35276d;
        if (iVar != null) {
            return iVar;
        }
        ?? r02 = (Set<K>) new b(this);
        this.f35276d = r02;
        return r02;
    }

    public Enumeration<K> keys() {
        l[] lVarArr = this.f35273a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        return new h(lVarArr, length, length, this, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dd, code lost:
        throw new java.lang.IllegalStateException("Recursive update");
     */
    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i10;
        Object obj3;
        Object obj4 = obj2;
        if (obj == null || obj4 == null || biFunction == null) {
            throw null;
        }
        int i11 = i(obj.hashCode());
        l[] lVarArr = this.f35273a;
        int i12 = 0;
        Object obj5 = null;
        int i13 = 0;
        while (true) {
            if (lVarArr != null) {
                int length = lVarArr.length;
                if (length != 0) {
                    int i14 = (length - 1) & i11;
                    l k10 = k(lVarArr, i14);
                    i10 = 1;
                    if (k10 != null) {
                        int i15 = k10.f35298a;
                        if (i15 == -1) {
                            lVarArr = d(lVarArr, k10);
                        } else {
                            synchronized (k10) {
                                try {
                                    if (k(lVarArr, i14) == k10) {
                                        if (i15 < 0) {
                                            if (!(k10 instanceof r)) {
                                                if (k10 instanceof m) {
                                                    break;
                                                }
                                            } else {
                                                r rVar = (r) k10;
                                                s sVar = rVar.f35316e;
                                                s b10 = sVar == null ? null : sVar.b(i11, obj, null);
                                                Object apply = b10 == null ? obj4 : biFunction.apply(b10.f35300c, obj4);
                                                if (apply != null) {
                                                    if (b10 != null) {
                                                        b10.f35300c = apply;
                                                    } else {
                                                        rVar.e(i11, obj, apply);
                                                        i13 = 1;
                                                    }
                                                } else if (b10 != null) {
                                                    if (rVar.f(b10)) {
                                                        h(lVarArr, i14, p(rVar.f35317f));
                                                    }
                                                    i13 = -1;
                                                }
                                                i12 = 2;
                                                obj5 = apply;
                                            }
                                        } else {
                                            l lVar = null;
                                            l lVar2 = k10;
                                            i12 = 1;
                                            while (true) {
                                                if (lVar2.f35298a == i11 && ((obj3 = lVar2.f35299b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                    break;
                                                }
                                                l lVar3 = lVar2.f35301d;
                                                if (lVar3 == null) {
                                                    lVar2.f35301d = new l(i11, obj, obj4);
                                                    obj5 = obj4;
                                                    i13 = 1;
                                                    break;
                                                }
                                                i12++;
                                                lVar = lVar2;
                                                lVar2 = lVar3;
                                            }
                                            Object apply2 = biFunction.apply(lVar2.f35300c, obj4);
                                            if (apply2 != null) {
                                                lVar2.f35300c = apply2;
                                                obj5 = apply2;
                                            } else {
                                                l lVar4 = lVar2.f35301d;
                                                if (lVar != null) {
                                                    lVar.f35301d = lVar4;
                                                } else {
                                                    h(lVarArr, i14, lVar4);
                                                }
                                                obj5 = apply2;
                                                i13 = -1;
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            if (i12 != 0) {
                                if (i12 >= 8) {
                                    n(lVarArr, i14);
                                }
                                i10 = i13;
                                obj4 = obj5;
                            }
                        }
                    } else if (b(lVarArr, i14, new l(i11, obj, obj4))) {
                        break;
                    }
                }
            }
            lVarArr = e();
        }
        if (i10 != 0) {
            a(i10, i12);
        }
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        return (V) f(k10, v10, false);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        o(map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            f(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public V putIfAbsent(K k10, V v10) {
        return (V) f(k10, v10, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        return (V) g(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || g(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return g(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return g(obj, obj3, obj2) != null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.f35273a;
        if (lVarArr != null) {
            q qVar = new q(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l a5 = qVar.a();
                if (a5 == null) {
                    return;
                }
                Object obj = a5.f35300c;
                Object obj2 = a5.f35299b;
                do {
                    Object apply = biFunction.apply(obj2, obj);
                    apply.getClass();
                    if (g(obj2, apply, obj) == null) {
                        obj = get(obj2);
                    }
                } while (obj != null);
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        long j6 = j();
        if (j6 < 0) {
            return 0;
        }
        if (j6 <= 2147483647L) {
            return (int) j6;
        }
        return Integer.MAX_VALUE;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        l[] lVarArr = this.f35273a;
        int length = lVarArr == null ? 0 : lVarArr.length;
        q qVar = new q(lVarArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder("{");
        l a5 = qVar.a();
        if (a5 != null) {
            while (true) {
                Object obj = a5.f35299b;
                Object obj2 = a5.f35300c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                a5 = qVar.a();
                if (a5 == null) {
                    break;
                }
                sb2.append(", ");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Collection<V>, j$.util.concurrent.b, j$.util.concurrent.t] */
    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        t tVar = this.f35277e;
        if (tVar != null) {
            return tVar;
        }
        b bVar = new b(this);
        this.f35277e = bVar;
        return bVar;
    }
}
