package io.ktor.utils.io;

import N.T;
import Ng.AbstractC1073l0;
import Ng.C1072l;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k6.AbstractC4194d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5156c;
import q1.AbstractC5260f;
import z.C6685Z;

/* loaded from: classes.dex */
public final class t implements u, x, z, G {

    /* renamed from: k  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33577k = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_state");

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33578l = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_closed");

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33579m = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_readOp");

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33580n = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_writeOp");
    private volatile /* synthetic */ Object _closed;
    private volatile /* synthetic */ Object _readOp;
    private volatile /* synthetic */ Object _state;
    volatile /* synthetic */ Object _writeOp;
    private volatile AbstractC1073l0 attachedJob;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f33581b;

    /* renamed from: c  reason: collision with root package name */
    public final Oe.g f33582c;

    /* renamed from: d  reason: collision with root package name */
    public final int f33583d;

    /* renamed from: e  reason: collision with root package name */
    public int f33584e;

    /* renamed from: f  reason: collision with root package name */
    public int f33585f;

    /* renamed from: g  reason: collision with root package name */
    public final io.ktor.utils.io.internal.q f33586g;

    /* renamed from: h  reason: collision with root package name */
    public final io.ktor.utils.io.internal.b f33587h;

    /* renamed from: i  reason: collision with root package name */
    public final io.ktor.utils.io.internal.b f33588i;

    /* renamed from: j  reason: collision with root package name */
    public final C3596a f33589j;
    private volatile io.ktor.utils.io.internal.d joining;
    private volatile long totalBytesRead;
    private volatile long totalBytesWritten;
    private volatile int writeSuspensionSize;

    /* JADX WARN: Type inference failed for: r2v4, types: [io.ktor.utils.io.internal.q, java.lang.Object] */
    public t(boolean z10, Oe.g gVar, int i10) {
        AbstractC3557B.c0("pool", gVar);
        this.f33581b = z10;
        this.f33582c = gVar;
        this.f33583d = i10;
        this._state = io.ktor.utils.io.internal.g.f33456c;
        this._closed = null;
        this._readOp = null;
        this._writeOp = null;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = Ne.c.f12795i;
        ?? obj = new Object();
        obj.f33477b = this;
        Ne.c cVar = Ne.c.f12798l;
        obj.f33478c = cVar.f12021a;
        obj.f33479d = cVar;
        obj.f33480e = ((io.ktor.utils.io.internal.n) this._state).f33469b;
        this.f33586g = obj;
        this.f33587h = new io.ktor.utils.io.internal.b();
        this.f33588i = new io.ktor.utils.io.internal.b();
        this.f33589j = new C3596a(this, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object H(t tVar, int i10, AbstractC4825e abstractC4825e) {
        k kVar;
        Object obj;
        int i11;
        StringBuilder sb2;
        Object obj2;
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i12 = kVar.f33519i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                kVar.f33519i0 = i12 - Integer.MIN_VALUE;
                obj = kVar.f33517Z;
                Object obj3 = EnumC5000a.f41328Y;
                i11 = kVar.f33519i0;
                if (i11 == 0) {
                    if (i11 == 1) {
                        sb2 = kVar.f33516Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    StringBuilder sb3 = new StringBuilder();
                    kVar.f33516Y = sb3;
                    kVar.f33519i0 = 1;
                    if (((io.ktor.utils.io.internal.n) tVar._state) == io.ktor.utils.io.internal.l.f33466c) {
                        Throwable q10 = tVar.q();
                        if (q10 == null) {
                            obj2 = Boolean.FALSE;
                        } else {
                            throw q10;
                        }
                    } else {
                        obj2 = tVar.I(sb3, i10, kVar);
                    }
                    if (obj2 == obj3) {
                        return obj3;
                    }
                    obj = obj2;
                    sb2 = sb3;
                }
                if (((Boolean) obj).booleanValue()) {
                    return null;
                }
                return sb2.toString();
            }
        }
        kVar = new k(tVar, abstractC4825e);
        obj = kVar.f33517Z;
        Object obj32 = EnumC5000a.f41328Y;
        i11 = kVar.f33519i0;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v15, types: [wf.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object V(t tVar, int i10, C6.a aVar, AbstractC4825e abstractC4825e) {
        n nVar;
        EnumC5000a enumC5000a;
        int i11;
        C6.a aVar2;
        int i12;
        boolean z10;
        int i13;
        if (abstractC4825e instanceof n) {
            nVar = (n) abstractC4825e;
            int i14 = nVar.f33547k0;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                nVar.f33547k0 = i14 - Integer.MIN_VALUE;
                Object obj = nVar.f33545i0;
                enumC5000a = EnumC5000a.f41328Y;
                i11 = nVar.f33547k0;
                if (i11 == 0) {
                    if (i11 == 1) {
                        int i15 = nVar.f33544h0;
                        ?? r13 = nVar.f33543Z;
                        t tVar2 = nVar.f33542Y;
                        N.B0(obj);
                        i10 = i15;
                        tVar = tVar2;
                        aVar2 = r13;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    aVar2 = aVar;
                    if (i10 > 0) {
                        if (i10 > 4088) {
                            throw new IllegalArgumentException(AbstractC4194d.v("Min(", i10, ") should'nt be greater than (4088)").toString());
                        }
                    } else {
                        throw new IllegalArgumentException("min should be positive".toString());
                    }
                }
                do {
                    tVar.getClass();
                    AbstractC3557B.c0("block", aVar2);
                    if (i10 <= 0) {
                        if (i10 <= 4088) {
                            ByteBuffer P = tVar.P();
                            io.ktor.utils.io.internal.p pVar = ((io.ktor.utils.io.internal.n) tVar._state).f33469b;
                            try {
                                io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) tVar._closed;
                                if (cVar == null) {
                                    while (true) {
                                        i12 = pVar._availableForWrite$internal;
                                        z10 = false;
                                        if (i12 < i10) {
                                            i12 = 0;
                                            break;
                                        } else if (io.ktor.utils.io.internal.p.f33473c.compareAndSet(pVar, i12, 0)) {
                                            break;
                                        }
                                    }
                                    if (i12 <= 0) {
                                        i13 = 0;
                                    } else {
                                        tVar.t(P, tVar.f33585f, i12);
                                        int position = P.position();
                                        int limit = P.limit();
                                        aVar2.invoke(P);
                                        if (limit == P.limit()) {
                                            int position2 = P.position() - position;
                                            if (position2 >= 0) {
                                                if (position2 >= 0) {
                                                    tVar.g(P, pVar, position2);
                                                    if (position2 < i12) {
                                                        pVar.a(i12 - position2);
                                                    }
                                                    i13 = position2;
                                                    z10 = true;
                                                } else {
                                                    throw new IllegalStateException();
                                                }
                                            } else {
                                                throw new IllegalStateException("Position has been moved backward: pushback is not supported".toString());
                                            }
                                        } else {
                                            throw new IllegalStateException("Buffer limit modified".toString());
                                        }
                                    }
                                    if (z10 && i13 >= 0) {
                                        return jf.y.f36177a;
                                    }
                                    nVar.f33542Y = tVar;
                                    nVar.f33543Z = aVar2;
                                    nVar.f33544h0 = i10;
                                    nVar.f33547k0 = 1;
                                } else {
                                    N.d(cVar.a());
                                    throw null;
                                }
                            } finally {
                                if (pVar.d() || tVar.f33581b) {
                                    tVar.o(1);
                                }
                                tVar.L();
                                tVar.S();
                            }
                        } else {
                            throw new IllegalArgumentException(AbstractC4194d.v("Min(", i10, ") shouldn't be greater than 4088").toString());
                        }
                    } else {
                        throw new IllegalArgumentException("min should be positive".toString());
                    }
                } while (tVar.e(i10, aVar2, nVar) != enumC5000a);
                return enumC5000a;
            }
        }
        nVar = new n(tVar, abstractC4825e);
        Object obj2 = nVar.f33545i0;
        enumC5000a = EnumC5000a.f41328Y;
        i11 = nVar.f33547k0;
        if (i11 == 0) {
        }
        do {
            tVar.getClass();
            AbstractC3557B.c0("block", aVar2);
            if (i10 <= 0) {
            }
        } while (tVar.e(i10, aVar2, nVar) != enumC5000a);
        return enumC5000a;
    }

    public static final io.ktor.utils.io.internal.c a(t tVar) {
        return (io.ktor.utils.io.internal.c) tVar._closed;
    }

    public static int w(t tVar, Me.a aVar) {
        int i10;
        boolean z10;
        int i11 = aVar.f12025e - aVar.f12023c;
        int i12 = 0;
        do {
            ByteBuffer O10 = tVar.O();
            if (O10 != null) {
                io.ktor.utils.io.internal.p pVar = ((io.ktor.utils.io.internal.n) tVar._state).f33469b;
                try {
                    if (pVar._availableForRead$internal == 0) {
                        tVar.K();
                        tVar.S();
                    } else {
                        int i13 = aVar.f12025e - aVar.f12023c;
                        i10 = pVar.h(Math.min(O10.remaining(), Math.min(i13, i11)));
                        if (i10 <= 0) {
                            z10 = false;
                        } else {
                            if (i13 < O10.remaining()) {
                                O10.limit(O10.position() + i13);
                            }
                            P4.a.U0(aVar, O10);
                            tVar.f(O10, pVar, i10);
                            z10 = true;
                        }
                        i12 += i10;
                        i11 -= i10;
                        if (!z10 || aVar.f12025e <= aVar.f12023c) {
                            break;
                        }
                    }
                } finally {
                    tVar.K();
                    tVar.S();
                }
            }
            z10 = false;
            i10 = 0;
            i12 += i10;
            i11 -= i10;
            if (!z10) {
                break;
            }
            break;
        } while (((io.ktor.utils.io.internal.n) tVar._state).f33469b._availableForRead$internal > 0);
        return i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(byte[] bArr, int i10, int i11, AbstractC4825e abstractC4825e) {
        C3600e c3600e;
        Object obj;
        int i12;
        t tVar;
        if (abstractC4825e instanceof C3600e) {
            c3600e = (C3600e) abstractC4825e;
            int i13 = c3600e.f33421l0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3600e.f33421l0 = i13 - Integer.MIN_VALUE;
                obj = c3600e.f33419j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i12 = c3600e.f33421l0;
                if (i12 == 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = c3600e.f33418i0;
                    i10 = c3600e.f33417h0;
                    bArr = c3600e.f33416Z;
                    tVar = c3600e.f33415Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c3600e.f33415Y = this;
                    c3600e.f33416Z = bArr;
                    c3600e.f33417h0 = i10;
                    c3600e.f33418i0 = i11;
                    c3600e.f33421l0 = 1;
                    obj = E(1, c3600e);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    tVar = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    return new Integer(-1);
                }
                c3600e.f33415Y = null;
                c3600e.f33416Z = null;
                c3600e.f33421l0 = 2;
                obj = tVar.y(bArr, i10, i11, c3600e);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                return obj;
            }
        }
        c3600e = new C3600e(this, abstractC4825e);
        obj = c3600e.f33419j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i12 = c3600e.f33421l0;
        if (i12 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object B(int i10, wf.k kVar, AbstractC4825e abstractC4825e) {
        C3602g c3602g;
        Object obj;
        int i11;
        t tVar;
        int i12;
        if (abstractC4825e instanceof C3602g) {
            c3602g = (C3602g) abstractC4825e;
            int i13 = c3602g.f33432k0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c3602g.f33432k0 = i13 - Integer.MIN_VALUE;
                obj = c3602g.f33430i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = c3602g.f33432k0;
                jf.y yVar = jf.y.f36177a;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = c3602g.f33429h0;
                    kVar = c3602g.f33428Z;
                    tVar = c3602g.f33427Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    if (i10 < 1) {
                        i12 = 1;
                    } else {
                        i12 = i10;
                    }
                    c3602g.f33427Y = this;
                    c3602g.f33428Z = kVar;
                    c3602g.f33429h0 = i10;
                    c3602g.f33432k0 = 1;
                    obj = E(i12, c3602g);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    tVar = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    if (i10 <= 0) {
                        return yVar;
                    }
                    throw new EOFException(AbstractC4194d.v("Got EOF but at least ", i10, " bytes were expected"));
                }
                c3602g.f33427Y = null;
                c3602g.f33428Z = null;
                c3602g.f33432k0 = 2;
                if (tVar.u(i10, kVar, c3602g) == enumC5000a) {
                    return enumC5000a;
                }
                return yVar;
            }
        }
        c3602g = new C3602g(this, abstractC4825e);
        obj = c3602g.f33430i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = c3602g.f33432k0;
        jf.y yVar2 = jf.y.f36177a;
        if (i11 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public final Object C(long j6, AbstractC4825e abstractC4825e) {
        if (s()) {
            Throwable q10 = q();
            if (q10 == null) {
                Me.c cVar = new Me.c();
                try {
                    Ne.c d10 = Ne.d.d(cVar, 1, null);
                    while (true) {
                        if (d10.f12025e - d10.f12023c > j6) {
                            d10.f((int) j6);
                        }
                        j6 -= w(this, d10);
                        if (j6 <= 0 || r()) {
                            break;
                        }
                        d10 = Ne.d.d(cVar, 1, d10);
                    }
                    cVar.a();
                    return cVar.p();
                } finally {
                    cVar.close();
                }
            }
            N.d(q10);
            throw null;
        }
        return D(j6, abstractC4825e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f A[Catch: all -> 0x0031, TryCatch #2 {all -> 0x00ac, blocks: (B:34:0x009e, B:36:0x00a7, B:40:0x00af, B:12:0x002d, B:18:0x0053, B:20:0x005f, B:21:0x0063, B:23:0x0073, B:25:0x0079, B:28:0x008c, B:33:0x0099), top: B:46:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[Catch: all -> 0x0031, TryCatch #2 {all -> 0x00ac, blocks: (B:34:0x009e, B:36:0x00a7, B:40:0x00af, B:12:0x002d, B:18:0x0053, B:20:0x005f, B:21:0x0063, B:23:0x0073, B:25:0x0079, B:28:0x008c, B:33:0x0099), top: B:46:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099 A[Catch: all -> 0x0031, TRY_LEAVE, TryCatch #2 {all -> 0x00ac, blocks: (B:34:0x009e, B:36:0x00a7, B:40:0x00af, B:12:0x002d, B:18:0x0053, B:20:0x005f, B:21:0x0063, B:23:0x0073, B:25:0x0079, B:28:0x008c, B:33:0x0099), top: B:46:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[Catch: all -> 0x00ac, TRY_ENTER, TryCatch #2 {all -> 0x00ac, blocks: (B:34:0x009e, B:36:0x00a7, B:40:0x00af, B:12:0x002d, B:18:0x0053, B:20:0x005f, B:21:0x0063, B:23:0x0073, B:25:0x0079, B:28:0x008c, B:33:0x0099), top: B:46:0x002d }] */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0089 -> B:28:0x008c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0096 -> B:32:0x0097). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object D(long j6, AbstractC4825e abstractC4825e) {
        C3603h c3603h;
        int i10;
        Me.c cVar;
        Throwable th2;
        boolean z10;
        Me.i iVar;
        Ne.c cVar2;
        t tVar;
        Me.c cVar3;
        kotlin.jvm.internal.A a5;
        kotlin.jvm.internal.A a10;
        kotlin.jvm.internal.A a11;
        long j10;
        long w10;
        if (abstractC4825e instanceof C3603h) {
            c3603h = (C3603h) abstractC4825e;
            int i11 = c3603h.f33440m0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3603h.f33440m0 = i11 - Integer.MIN_VALUE;
                Object obj = c3603h.f33438k0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c3603h.f33440m0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        cVar2 = c3603h.f33437j0;
                        iVar = c3603h.f33436i0;
                        kotlin.jvm.internal.A a12 = c3603h.f33435h0;
                        cVar3 = c3603h.f33434Z;
                        tVar = c3603h.f33433Y;
                        try {
                            N.B0(obj);
                            kotlin.jvm.internal.A a13 = a12;
                            a10 = a13;
                            if (((Boolean) obj).booleanValue()) {
                                z10 = true;
                                a5 = a13;
                                if (z10) {
                                    cVar2 = Ne.d.d(iVar, 1, cVar2);
                                    a11 = a5;
                                    cVar3 = cVar3;
                                    j10 = a11.f37621Y;
                                    if (cVar2.f12025e - cVar2.f12023c > j10) {
                                        cVar2.f((int) j10);
                                    }
                                    w10 = a11.f37621Y - w(tVar, cVar2);
                                    a11.f37621Y = w10;
                                    a10 = a11;
                                    if (w10 > 0) {
                                        a10 = a11;
                                        if (!tVar.r()) {
                                            c3603h.f33433Y = tVar;
                                            c3603h.f33434Z = cVar3;
                                            c3603h.f33435h0 = a11;
                                            c3603h.f33436i0 = iVar;
                                            c3603h.f33437j0 = cVar2;
                                            c3603h.f33440m0 = 1;
                                            obj = tVar.E(1, c3603h);
                                            a13 = a11;
                                            if (obj == enumC5000a) {
                                                return enumC5000a;
                                            }
                                            a10 = a13;
                                            if (((Boolean) obj).booleanValue()) {
                                            }
                                        }
                                    }
                                } else {
                                    iVar.a();
                                    Throwable q10 = tVar.q();
                                    if (q10 == null) {
                                        return cVar3.p();
                                    }
                                    throw q10;
                                }
                            }
                            z10 = false;
                            a5 = a10;
                            if (z10) {
                            }
                        } catch (Throwable th3) {
                            th2 = th3;
                            cVar = cVar3;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    cVar = new Me.c();
                    try {
                        ?? obj2 = new Object();
                        obj2.f37621Y = j6;
                        cVar2 = Ne.d.d(cVar, 1, null);
                        tVar = this;
                        iVar = cVar;
                        cVar3 = iVar;
                        a11 = obj2;
                        j10 = a11.f37621Y;
                        if (cVar2.f12025e - cVar2.f12023c > j10) {
                        }
                        w10 = a11.f37621Y - w(tVar, cVar2);
                        a11.f37621Y = w10;
                        a10 = a11;
                        if (w10 > 0) {
                        }
                        z10 = false;
                        a5 = a10;
                        if (z10) {
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                    }
                }
                cVar.close();
                throw th2;
            }
        }
        c3603h = new C3603h(this, abstractC4825e);
        Object obj3 = c3603h.f33438k0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3603h.f33440m0;
        if (i10 == 0) {
        }
        cVar.close();
        throw th2;
    }

    public final Object E(int i10, AbstractC5156c abstractC5156c) {
        if (((io.ktor.utils.io.internal.n) this._state).f33469b._availableForRead$internal >= i10) {
            return Boolean.TRUE;
        }
        io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
        boolean z10 = true;
        if (cVar != null) {
            Throwable th2 = cVar.f33451a;
            if (th2 == null) {
                io.ktor.utils.io.internal.p pVar = ((io.ktor.utils.io.internal.n) this._state).f33469b;
                if (!pVar.c() || pVar._availableForRead$internal < i10) {
                    z10 = false;
                }
                if (((AbstractC4825e) this._readOp) == null) {
                    return Boolean.valueOf(z10);
                }
                throw new IllegalStateException("Read operation is already in progress");
            }
            N.d(th2);
            throw null;
        } else if (i10 == 1) {
            return F(1, abstractC5156c);
        } else {
            return G(i10, abstractC5156c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(int i10, AbstractC4825e abstractC4825e) {
        C3604i c3604i;
        int i11;
        Throwable th2;
        t tVar;
        if (abstractC4825e instanceof C3604i) {
            c3604i = (C3604i) abstractC4825e;
            int i12 = c3604i.f33444i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c3604i.f33444i0 = i12 - Integer.MIN_VALUE;
                Object obj = c3604i.f33442Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = c3604i.f33444i0;
                if (i11 == 0) {
                    if (i11 == 1) {
                        tVar = c3604i.f33441Y;
                        try {
                            N.B0(obj);
                        } catch (Throwable th3) {
                            th2 = th3;
                            tVar._readOp = null;
                            throw th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    if (((io.ktor.utils.io.internal.n) this._state).f33469b._availableForRead$internal < i10) {
                        try {
                            c3604i.f33441Y = this;
                            c3604i.f33444i0 = 1;
                            io.ktor.utils.io.internal.b bVar = this.f33587h;
                            Q(i10, bVar);
                            obj = bVar.d(AbstractC5260f.z(c3604i));
                            if (obj == enumC5000a) {
                                N.k0(c3604i);
                            }
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                        } catch (Throwable th4) {
                            th2 = th4;
                            tVar = this;
                            tVar._readOp = null;
                            throw th2;
                        }
                    } else {
                        return Boolean.TRUE;
                    }
                }
                return obj;
            }
        }
        c3604i = new C3604i(this, abstractC4825e);
        Object obj2 = c3604i.f33442Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = c3604i.f33444i0;
        if (i11 == 0) {
        }
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0082 -> B:39:0x0085). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object G(int i10, AbstractC4825e abstractC4825e) {
        C3605j c3605j;
        int i11;
        t tVar;
        if (abstractC4825e instanceof C3605j) {
            c3605j = (C3605j) abstractC4825e;
            int i12 = c3605j.f33485j0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c3605j.f33485j0 = i12 - Integer.MIN_VALUE;
                Object obj = c3605j.f33483h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = c3605j.f33485j0;
                boolean z10 = true;
                if (i11 == 0) {
                    if (i11 == 1) {
                        i10 = c3605j.f33482Z;
                        tVar = c3605j.f33481Y;
                        N.B0(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return Boolean.FALSE;
                        }
                        if (((io.ktor.utils.io.internal.n) tVar._state).f33469b._availableForRead$internal >= i10) {
                            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) tVar._closed;
                            if (cVar != null) {
                                Throwable th2 = cVar.f33451a;
                                if (th2 == null) {
                                    io.ktor.utils.io.internal.p pVar = ((io.ktor.utils.io.internal.n) tVar._state).f33469b;
                                    if (!pVar.c() || pVar._availableForRead$internal < i10) {
                                        z10 = false;
                                    }
                                    if (((AbstractC4825e) tVar._readOp) == null) {
                                        return Boolean.valueOf(z10);
                                    }
                                    throw new IllegalStateException("Read operation is already in progress");
                                }
                                N.d(th2);
                                throw null;
                            }
                            c3605j.f33481Y = tVar;
                            c3605j.f33482Z = i10;
                            c3605j.f33485j0 = 1;
                            obj = tVar.F(i10, c3605j);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            if (!((Boolean) obj).booleanValue()) {
                            }
                            if (((io.ktor.utils.io.internal.n) tVar._state).f33469b._availableForRead$internal >= i10) {
                                return Boolean.TRUE;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    tVar = this;
                    if (((io.ktor.utils.io.internal.n) tVar._state).f33469b._availableForRead$internal >= i10) {
                    }
                }
            }
        }
        c3605j = new C3605j(this, abstractC4825e);
        Object obj2 = c3605j.f33483h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = c3605j.f33485j0;
        boolean z102 = true;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:87|34|35|89|36|37|93|38|39|97|40|(1:42)(18:43|20|44|23|(1:25)|33|49|(0)|52|(1:54)|66|67|(0)|71|73|75|77|78)) */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0116, code lost:
        r15 = r6;
        r14 = r13;
        r8 = r8;
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011a, code lost:
        r13 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x011d, code lost:
        r12 = r24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016e  */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Appendable] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.jvm.internal.z] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x010f -> B:20:0x0071). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0116 -> B:20:0x0071). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0120 -> B:20:0x0071). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object I(StringBuilder sb2, int i10, AbstractC4825e abstractC4825e) {
        t tVar;
        l lVar;
        int i11;
        kotlin.jvm.internal.z zVar;
        kotlin.jvm.internal.x xVar;
        kotlin.jvm.internal.x xVar2;
        t tVar2;
        boolean z10;
        boolean z11;
        kotlin.jvm.internal.z zVar2;
        kotlin.jvm.internal.x xVar3;
        kotlin.jvm.internal.B b10;
        char[] cArr;
        kotlin.jvm.internal.z zVar3;
        kotlin.jvm.internal.z zVar4;
        kotlin.jvm.internal.x xVar4;
        l lVar2;
        int i12;
        StringBuilder sb3;
        Object obj;
        kotlin.jvm.internal.z zVar5;
        kotlin.jvm.internal.x xVar5;
        if (abstractC4825e instanceof l) {
            lVar = (l) abstractC4825e;
            int i13 = lVar.f33532r0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                lVar.f33532r0 = i13 - Integer.MIN_VALUE;
                tVar = this;
                Object obj2 = lVar.f33530p0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = lVar.f33532r0;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            xVar3 = (kotlin.jvm.internal.x) lVar.f33523i0;
                            kotlin.jvm.internal.x xVar6 = (kotlin.jvm.internal.x) lVar.f33522h0;
                            zVar2 = (kotlin.jvm.internal.z) lVar.f33521Z;
                            t tVar3 = lVar.f33520Y;
                            try {
                                N.B0(obj2);
                            } catch (EOFException unused) {
                            }
                            xVar = xVar6;
                            tVar2 = tVar3;
                            z10 = true;
                            xVar2 = xVar3;
                            zVar = zVar2;
                            if ((tVar2.r() || zVar.f37647Y <= 0) && !xVar2.f37645Y && !xVar.f37645Y) {
                                z11 = false;
                            } else {
                                z11 = z10;
                            }
                            return Boolean.valueOf(z11);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i14 = lVar.f33529o0;
                    kotlin.jvm.internal.z zVar6 = lVar.f33528n0;
                    kotlin.jvm.internal.B b11 = lVar.f33527m0;
                    char[] cArr2 = lVar.f33526l0;
                    kotlin.jvm.internal.x xVar7 = lVar.f33525k0;
                    kotlin.jvm.internal.x xVar8 = lVar.f33524j0;
                    kotlin.jvm.internal.z zVar7 = (kotlin.jvm.internal.z) lVar.f33523i0;
                    kotlin.jvm.internal.z zVar8 = (kotlin.jvm.internal.z) lVar.f33522h0;
                    ?? r14 = (Appendable) lVar.f33521Z;
                    t tVar4 = lVar.f33520Y;
                    try {
                        N.B0(obj2);
                        sb3 = r14;
                        cArr = cArr2;
                        xVar = xVar8;
                        zVar5 = zVar6;
                        lVar2 = lVar;
                        i12 = i14;
                        tVar2 = tVar4;
                        b10 = b11;
                        xVar5 = xVar7;
                        zVar = zVar8;
                    } catch (EOFException unused2) {
                        sb3 = r14;
                        cArr = cArr2;
                        xVar = xVar8;
                        zVar5 = zVar6;
                        lVar2 = lVar;
                        i12 = i14;
                        tVar2 = tVar4;
                        b10 = b11;
                        xVar5 = xVar7;
                        zVar = zVar8;
                    }
                    zVar3 = zVar7;
                    xVar4 = xVar5;
                    zVar4 = zVar5;
                    if (tVar2.r() && !xVar4.f37645Y && !xVar.f37645Y && (i12 == Integer.MAX_VALUE || zVar.f37647Y <= i12)) {
                        try {
                        } catch (EOFException unused3) {
                            zVar7 = zVar3;
                            xVar5 = xVar4;
                            zVar5 = zVar4;
                        }
                        int i15 = zVar3.f37647Y;
                        kotlin.jvm.internal.z zVar9 = zVar3;
                        char[] cArr3 = cArr;
                        kotlin.jvm.internal.B b12 = b10;
                        m mVar = new m(b10, i12, cArr3, zVar, zVar9, xVar4, xVar, sb3, zVar4);
                        lVar2.f33520Y = tVar2;
                        lVar2.f33521Z = sb3;
                        lVar2.f33522h0 = zVar;
                        zVar7 = zVar9;
                        lVar2.f33523i0 = zVar7;
                        lVar2.f33524j0 = xVar;
                        lVar2.f33525k0 = xVar4;
                        char[] cArr4 = cArr3;
                        lVar2.f33526l0 = cArr4;
                        lVar2.f33527m0 = b12;
                        lVar2.f33528n0 = zVar4;
                        lVar2.f33529o0 = i12;
                        lVar2.f33532r0 = 1;
                        if (tVar2.u(i15, mVar, lVar2) == enumC5000a) {
                            return enumC5000a;
                        }
                        b10 = b12;
                        cArr = cArr4;
                        xVar5 = xVar4;
                        zVar5 = zVar4;
                        zVar3 = zVar7;
                        xVar4 = xVar5;
                        zVar4 = zVar5;
                        if (tVar2.r()) {
                        }
                        obj = b10.f37622Y;
                        if (obj != null) {
                        }
                        if (tVar2.r()) {
                        }
                        z10 = true;
                        xVar2 = xVar4;
                        if (tVar2.r()) {
                        }
                        z11 = false;
                        return Boolean.valueOf(z11);
                    }
                    obj = b10.f37622Y;
                    if (obj != null) {
                        io.ktor.utils.io.internal.f.f33453b.E0(obj);
                    }
                    if (tVar2.r() && xVar.f37645Y && !xVar4.f37645Y) {
                        try {
                            T t10 = new T(xVar4, 2);
                            lVar2.f33520Y = tVar2;
                            lVar2.f33521Z = zVar;
                            lVar2.f33522h0 = xVar;
                            lVar2.f33523i0 = xVar4;
                            lVar2.f33524j0 = null;
                            lVar2.f33525k0 = null;
                            lVar2.f33526l0 = null;
                            lVar2.f33527m0 = null;
                            lVar2.f33528n0 = null;
                            lVar2.f33532r0 = 2;
                            z10 = true;
                            try {
                                if (tVar2.u(1, t10, lVar2) == enumC5000a) {
                                    return enumC5000a;
                                }
                            } catch (EOFException unused4) {
                            }
                        } catch (EOFException unused5) {
                            z10 = true;
                        }
                        xVar3 = xVar4;
                        zVar2 = zVar;
                        xVar2 = xVar3;
                        zVar = zVar2;
                        if (tVar2.r()) {
                        }
                        z11 = false;
                        return Boolean.valueOf(z11);
                    }
                    z10 = true;
                    xVar2 = xVar4;
                    if (tVar2.r()) {
                    }
                    z11 = false;
                    return Boolean.valueOf(z11);
                }
                N.B0(obj2);
                ?? obj3 = new Object();
                ?? obj4 = new Object();
                obj4.f37647Y = 1;
                ?? obj5 = new Object();
                ?? obj6 = new Object();
                zVar3 = obj4;
                cArr = new char[8192];
                b10 = new Object();
                zVar = obj3;
                tVar2 = tVar;
                xVar = obj5;
                sb3 = sb2;
                lVar2 = lVar;
                i12 = i10;
                xVar4 = obj6;
                zVar4 = new Object();
                if (tVar2.r()) {
                }
                obj = b10.f37622Y;
                if (obj != null) {
                }
                if (tVar2.r()) {
                }
                z10 = true;
                xVar2 = xVar4;
                if (tVar2.r()) {
                }
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }
        tVar = this;
        lVar = new l(tVar, abstractC4825e);
        Object obj22 = lVar.f33530p0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = lVar.f33532r0;
        if (i11 == 0) {
        }
    }

    public final void J(io.ktor.utils.io.internal.i iVar) {
        this.f33582c.E0(iVar);
    }

    public final void K() {
        io.ktor.utils.io.internal.n e10;
        io.ktor.utils.io.internal.h hVar = null;
        loop0: while (true) {
            Object obj = this._state;
            io.ktor.utils.io.internal.n nVar = (io.ktor.utils.io.internal.n) obj;
            io.ktor.utils.io.internal.h hVar2 = hVar;
            if (hVar2 != null) {
                hVar2.f33469b.f();
                N();
                hVar = null;
            }
            e10 = nVar.e();
            if ((e10 instanceof io.ktor.utils.io.internal.h) && ((io.ktor.utils.io.internal.n) this._state) == nVar && e10.f33469b.g()) {
                e10 = io.ktor.utils.io.internal.g.f33456c;
                hVar = e10;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33577k;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, e10)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        io.ktor.utils.io.internal.g gVar = io.ktor.utils.io.internal.g.f33456c;
        if (e10 == gVar) {
            io.ktor.utils.io.internal.h hVar3 = hVar;
            if (hVar3 != null) {
                J(hVar3.f33457c);
            }
            N();
        } else if (e10 instanceof io.ktor.utils.io.internal.h) {
            io.ktor.utils.io.internal.p pVar = e10.f33469b;
            if (pVar._availableForWrite$internal == pVar.f33475a && e10.f33469b.g()) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f33577k;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, e10, gVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != e10) {
                        return;
                    }
                }
                e10.f33469b.f();
                J(((io.ktor.utils.io.internal.h) e10).f33457c);
                N();
            }
        }
    }

    public final void L() {
        io.ktor.utils.io.internal.n f6;
        io.ktor.utils.io.internal.h hVar;
        io.ktor.utils.io.internal.h hVar2 = null;
        loop0: while (true) {
            Object obj = this._state;
            f6 = ((io.ktor.utils.io.internal.n) obj).f();
            if (f6 instanceof io.ktor.utils.io.internal.h) {
                io.ktor.utils.io.internal.p pVar = f6.f33469b;
                if (pVar._availableForWrite$internal == pVar.f33475a) {
                    f6 = io.ktor.utils.io.internal.g.f33456c;
                    hVar2 = f6;
                }
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33577k;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, f6)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
        }
        if (f6 == io.ktor.utils.io.internal.g.f33456c && (hVar = hVar2) != null) {
            J(hVar.f33457c);
        }
    }

    public final void M() {
        Throwable th2 = null;
        AbstractC4825e abstractC4825e = (AbstractC4825e) f33579m.getAndSet(this, null);
        if (abstractC4825e != null) {
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            if (cVar != null) {
                th2 = cVar.f33451a;
            }
            if (th2 != null) {
                abstractC4825e.resumeWith(N.w(th2));
            } else {
                abstractC4825e.resumeWith(Boolean.TRUE);
            }
        }
    }

    public final void N() {
        Object w10;
        while (true) {
            AbstractC4825e abstractC4825e = (AbstractC4825e) this._writeOp;
            if (abstractC4825e == null) {
                return;
            }
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33580n;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC4825e, null)) {
                if (atomicReferenceFieldUpdater.get(this) != abstractC4825e) {
                    break;
                }
            }
            if (cVar == null) {
                w10 = jf.y.f36177a;
            } else {
                w10 = N.w(cVar.a());
            }
            abstractC4825e.resumeWith(w10);
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        com.google.android.gms.internal.play_billing.N.d(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        r0 = (io.ktor.utils.io.internal.c) r4._closed;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r0 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
        r0 = r0.f33451a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r0 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ByteBuffer O() {
        Throwable th2;
        while (true) {
            Object obj = this._state;
            io.ktor.utils.io.internal.n nVar = (io.ktor.utils.io.internal.n) obj;
            if (!AbstractC3557B.K(nVar, io.ktor.utils.io.internal.l.f33466c) && !AbstractC3557B.K(nVar, io.ktor.utils.io.internal.g.f33456c)) {
                io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
                if (cVar != null && (th2 = cVar.f33451a) != null) {
                    N.d(th2);
                    throw null;
                } else if (nVar.f33469b._availableForRead$internal == 0) {
                    return null;
                } else {
                    io.ktor.utils.io.internal.n c10 = nVar.c();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33577k;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    ByteBuffer a5 = c10.a();
                    t(a5, this.f33584e, c10.f33469b._availableForRead$internal);
                    return a5;
                }
            }
        }
    }

    public final ByteBuffer P() {
        io.ktor.utils.io.internal.n d10;
        io.ktor.utils.io.internal.i iVar;
        AbstractC4825e abstractC4825e = (AbstractC4825e) this._writeOp;
        if (abstractC4825e == null) {
            io.ktor.utils.io.internal.i iVar2 = null;
            while (true) {
                Object obj = this._state;
                io.ktor.utils.io.internal.n nVar = (io.ktor.utils.io.internal.n) obj;
                if (((io.ktor.utils.io.internal.c) this._closed) != null) {
                    if (iVar2 != null) {
                        J(iVar2);
                    }
                    io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
                    AbstractC3557B.Z(cVar);
                    N.d(cVar.a());
                    throw null;
                }
                if (nVar == io.ktor.utils.io.internal.g.f33456c) {
                    if (iVar2 == null) {
                        iVar2 = (io.ktor.utils.io.internal.i) this.f33582c.C();
                        iVar2.f33469b.f();
                    }
                    d10 = iVar2.f33462g;
                } else if (nVar == io.ktor.utils.io.internal.l.f33466c) {
                    if (iVar2 != null) {
                        J(iVar2);
                    }
                    io.ktor.utils.io.internal.c cVar2 = (io.ktor.utils.io.internal.c) this._closed;
                    AbstractC3557B.Z(cVar2);
                    N.d(cVar2.a());
                    throw null;
                } else {
                    d10 = nVar.d();
                }
                io.ktor.utils.io.internal.n nVar2 = d10;
                iVar = iVar2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33577k;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((io.ktor.utils.io.internal.c) this._closed) == null) {
                    ByteBuffer b10 = nVar2.b();
                    if (iVar != null) {
                        if (nVar != null) {
                            if (nVar != io.ktor.utils.io.internal.g.f33456c) {
                                J(iVar);
                            }
                        } else {
                            AbstractC3557B.C2("old");
                            throw null;
                        }
                    }
                    t(b10, this.f33585f, nVar2.f33469b._availableForWrite$internal);
                    return b10;
                }
                L();
                S();
                io.ktor.utils.io.internal.c cVar3 = (io.ktor.utils.io.internal.c) this._closed;
                AbstractC3557B.Z(cVar3);
                N.d(cVar3.a());
                throw null;
                iVar2 = iVar;
            }
        } else {
            throw new IllegalStateException("Write operation is already in progress: " + abstractC4825e);
        }
    }

    public final void Q(int i10, io.ktor.utils.io.internal.b bVar) {
        boolean z10;
        loop0: while (true) {
            if (((io.ktor.utils.io.internal.n) this._state).f33469b._availableForRead$internal < i10) {
                io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
                if (cVar != null) {
                    Throwable th2 = cVar.f33451a;
                    if (th2 != null) {
                        bVar.resumeWith(N.w(th2));
                        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                        return;
                    }
                    boolean c10 = ((io.ktor.utils.io.internal.n) this._state).f33469b.c();
                    boolean z11 = false;
                    if (((io.ktor.utils.io.internal.n) this._state).f33469b._availableForRead$internal >= i10) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c10 && z10) {
                        z11 = true;
                    }
                    bVar.resumeWith(Boolean.valueOf(z11));
                    EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                    return;
                }
                while (((AbstractC4825e) this._readOp) == null) {
                    if (((io.ktor.utils.io.internal.c) this._closed) == null && ((io.ktor.utils.io.internal.n) this._state).f33469b._availableForRead$internal < i10) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33579m;
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, bVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != null) {
                                break;
                            }
                        }
                        if (((io.ktor.utils.io.internal.c) this._closed) == null && ((io.ktor.utils.io.internal.n) this._state).f33469b._availableForRead$internal < i10) {
                            break;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f33579m;
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, bVar, null)) {
                            if (atomicReferenceFieldUpdater2.get(this) != bVar) {
                                break loop0;
                            }
                        }
                        continue;
                    }
                }
                throw new IllegalStateException("Operation is already in progress".toString());
            }
            bVar.resumeWith(Boolean.TRUE);
            break;
        }
        EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
    }

    public final boolean R(boolean z10) {
        io.ktor.utils.io.internal.i iVar;
        Throwable th2;
        io.ktor.utils.io.internal.i iVar2 = null;
        while (true) {
            Object obj = this._state;
            io.ktor.utils.io.internal.n nVar = (io.ktor.utils.io.internal.n) obj;
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            if (iVar2 != null) {
                if (cVar != null) {
                    th2 = cVar.f33451a;
                } else {
                    th2 = null;
                }
                if (th2 == null) {
                    iVar2.f33469b.f();
                }
                N();
                iVar2 = null;
            }
            io.ktor.utils.io.internal.l lVar = io.ktor.utils.io.internal.l.f33466c;
            if (nVar == lVar) {
                return true;
            }
            if (nVar != io.ktor.utils.io.internal.g.f33456c) {
                if (cVar != null && (nVar instanceof io.ktor.utils.io.internal.h) && (nVar.f33469b.g() || cVar.f33451a != null)) {
                    if (cVar.f33451a != null) {
                        io.ktor.utils.io.internal.p pVar = nVar.f33469b;
                        pVar.getClass();
                        io.ktor.utils.io.internal.p.f33473c.getAndSet(pVar, 0);
                    }
                    iVar2 = ((io.ktor.utils.io.internal.h) nVar).f33457c;
                } else if (!z10 || !(nVar instanceof io.ktor.utils.io.internal.h) || !nVar.f33469b.g()) {
                    break;
                } else {
                    iVar2 = ((io.ktor.utils.io.internal.h) nVar).f33457c;
                }
            }
            iVar = iVar2;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33577k;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (iVar != null && ((io.ktor.utils.io.internal.n) this._state) == io.ktor.utils.io.internal.l.f33466c) {
                J(iVar);
            }
            return true;
            iVar2 = iVar;
        }
    }

    public final void S() {
        if (((io.ktor.utils.io.internal.c) this._closed) != null && R(false)) {
            M();
            N();
        }
    }

    public final int T(Me.d dVar) {
        ByteBuffer P = P();
        io.ktor.utils.io.internal.p pVar = ((io.ktor.utils.io.internal.n) this._state).f33469b;
        try {
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            if (cVar == null) {
                int i10 = pVar.i((int) Math.min(dVar.m(), P.remaining()));
                if (i10 > 0) {
                    P.limit(P.position() + i10);
                    r.f.U(dVar, P);
                    g(P, pVar, i10);
                }
                return i10;
            }
            N.d(cVar.a());
            throw null;
        } finally {
            if (pVar.d() || this.f33581b) {
                o(1);
            }
            L();
            S();
        }
    }

    public final Object U(int i10, AbstractC5156c abstractC5156c) {
        boolean f02 = f0(i10);
        jf.y yVar = jf.y.f36177a;
        if (!f02) {
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            if (cVar == null) {
                return yVar;
            }
            N.d(cVar.a());
            throw null;
        }
        this.writeSuspensionSize = i10;
        if (this.attachedJob != null) {
            Object invoke = this.f33589j.invoke(abstractC5156c);
            EnumC5000a enumC5000a = EnumC5000a.f41328Y;
            if (invoke == enumC5000a) {
                N.k0(abstractC5156c);
            }
            if (invoke == enumC5000a) {
                return invoke;
            }
            return yVar;
        }
        io.ktor.utils.io.internal.b bVar = this.f33588i;
        this.f33589j.invoke(bVar);
        Object d10 = bVar.d(AbstractC5260f.z(abstractC5156c));
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        if (d10 == enumC5000a2) {
            N.k0(abstractC5156c);
        }
        if (d10 == enumC5000a2) {
            return d10;
        }
        return yVar;
    }

    public final int W(byte[] bArr, int i10, int i11) {
        ByteBuffer P = P();
        io.ktor.utils.io.internal.p pVar = ((io.ktor.utils.io.internal.n) this._state).f33469b;
        try {
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            if (cVar == null) {
                int i12 = 0;
                while (true) {
                    int i13 = pVar.i(Math.min(i11 - i12, P.remaining()));
                    if (i13 != 0) {
                        if (i13 > 0) {
                            P.put(bArr, i10 + i12, i13);
                            i12 += i13;
                            t(P, i(this.f33585f + i12, P), pVar._availableForWrite$internal);
                        } else {
                            throw new IllegalArgumentException("Failed requirement.".toString());
                        }
                    } else {
                        g(P, pVar, i12);
                        if (pVar.d() || this.f33581b) {
                            o(1);
                        }
                        L();
                        S();
                        return i12;
                    }
                }
            } else {
                N.d(cVar.a());
                throw null;
            }
        } catch (Throwable th2) {
            if (pVar.d() || this.f33581b) {
                o(1);
            }
            L();
            S();
            throw th2;
        }
    }

    public final void X(Me.a aVar) {
        ByteBuffer P = P();
        io.ktor.utils.io.internal.p pVar = ((io.ktor.utils.io.internal.n) this._state).f33469b;
        try {
            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
            if (cVar == null) {
                int i10 = 0;
                while (true) {
                    int i11 = pVar.i(Math.min(aVar.f12023c - aVar.f12022b, P.remaining()));
                    if (i11 == 0) {
                        break;
                    }
                    N.m0(aVar, P, i11);
                    i10 += i11;
                    t(P, i(this.f33585f + i10, P), pVar._availableForWrite$internal);
                }
                g(P, pVar, i10);
                if (pVar.d() || this.f33581b) {
                    o(1);
                }
                L();
                S();
                return;
            }
            N.d(cVar.a());
            throw null;
        } catch (Throwable th2) {
            if (pVar.d() || this.f33581b) {
                o(1);
            }
            L();
            S();
            throw th2;
        }
    }

    public final Object Y(byte[] bArr, int i10, AbstractC4825e abstractC4825e) {
        Object a02;
        int i11 = 0;
        while (i10 > 0) {
            int W6 = W(bArr, i11, i10);
            if (W6 == 0) {
                break;
            }
            i11 += W6;
            i10 -= W6;
        }
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0 && (a02 = a0(bArr, i11, i10, abstractC4825e)) == EnumC5000a.f41328Y) {
            return a02;
        }
        return yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0050 -> B:24:0x0053). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Z(Me.a aVar, AbstractC4825e abstractC4825e) {
        o oVar;
        int i10;
        t tVar;
        if (abstractC4825e instanceof o) {
            oVar = (o) abstractC4825e;
            int i11 = oVar.f33552j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                oVar.f33552j0 = i11 - Integer.MIN_VALUE;
                Object obj = oVar.f33550h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = oVar.f33552j0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = oVar.f33549Z;
                    tVar = oVar.f33548Y;
                    N.B0(obj);
                    tVar.getClass();
                    tVar.X(aVar);
                    if (aVar.f12023c > aVar.f12022b) {
                        oVar.f33548Y = tVar;
                        oVar.f33549Z = aVar;
                        oVar.f33552j0 = 1;
                        if (tVar.U(1, oVar) == enumC5000a) {
                            return enumC5000a;
                        }
                        tVar.getClass();
                        tVar.X(aVar);
                        if (aVar.f12023c > aVar.f12022b) {
                            return yVar;
                        }
                    }
                } else {
                    N.B0(obj);
                    tVar = this;
                    if (aVar.f12023c > aVar.f12022b) {
                    }
                }
            }
        }
        oVar = new o(this, abstractC4825e);
        Object obj2 = oVar.f33550h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = oVar.f33552j0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x005b -> B:23:0x005e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a0(byte[] bArr, int i10, int i11, AbstractC4825e abstractC4825e) {
        p pVar;
        int i12;
        t tVar;
        if (abstractC4825e instanceof p) {
            pVar = (p) abstractC4825e;
            int i13 = pVar.f33559l0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                pVar.f33559l0 = i13 - Integer.MIN_VALUE;
                Object obj = pVar.f33557j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i12 = pVar.f33559l0;
                if (i12 == 0) {
                    if (i12 == 1) {
                        int i14 = pVar.f33556i0;
                        i10 = pVar.f33555h0;
                        byte[] bArr2 = pVar.f33554Z;
                        tVar = pVar.f33553Y;
                        N.B0(obj);
                        int intValue = ((Number) obj).intValue();
                        i10 += intValue;
                        byte[] bArr3 = bArr2;
                        i11 = i14 - intValue;
                        bArr = bArr3;
                        if (i11 > 0) {
                            pVar.f33553Y = tVar;
                            pVar.f33554Z = bArr;
                            pVar.f33555h0 = i10;
                            pVar.f33556i0 = i11;
                            pVar.f33559l0 = 1;
                            int W6 = tVar.W(bArr, i10, i11);
                            if (W6 > 0) {
                                obj = new Integer(W6);
                            } else {
                                obj = tVar.e0(bArr, i10, i11, pVar);
                            }
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            int i15 = i11;
                            bArr2 = bArr;
                            i14 = i15;
                            int intValue2 = ((Number) obj).intValue();
                            i10 += intValue2;
                            byte[] bArr32 = bArr2;
                            i11 = i14 - intValue2;
                            bArr = bArr32;
                            if (i11 > 0) {
                                return jf.y.f36177a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    tVar = this;
                    if (i11 > 0) {
                    }
                }
            }
        }
        pVar = new p(this, abstractC4825e);
        Object obj2 = pVar.f33557j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i12 = pVar.f33559l0;
        if (i12 == 0) {
        }
    }

    public final Object b0(Me.d dVar, AbstractC4825e abstractC4825e) {
        Object c02;
        do {
            try {
                if (!(!dVar.j())) {
                    break;
                }
            } catch (Throwable th2) {
                dVar.F();
                throw th2;
            }
        } while (T(dVar) != 0);
        int i10 = (dVar.m() > 0L ? 1 : (dVar.m() == 0L ? 0 : -1));
        jf.y yVar = jf.y.f36177a;
        if (i10 > 0 && (c02 = c0(dVar, abstractC4825e)) == EnumC5000a.f41328Y) {
            return c02;
        }
        return yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0050 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:14:0x002c, B:21:0x0041, B:23:0x0049, B:25:0x0050, B:28:0x005d), top: B:33:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064 A[DONT_GENERATE] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005a -> B:28:0x005d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c0(Me.d dVar, AbstractC4825e abstractC4825e) {
        q qVar;
        int i10;
        t tVar;
        try {
            if (abstractC4825e instanceof q) {
                qVar = (q) abstractC4825e;
                int i11 = qVar.f33564j0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    qVar.f33564j0 = i11 - Integer.MIN_VALUE;
                    Object obj = qVar.f33562h0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = qVar.f33564j0;
                    jf.y yVar = jf.y.f36177a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                dVar = (Me.d) qVar.f33560Y;
                                N.B0(obj);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        dVar = qVar.f33561Z;
                        tVar = qVar.f33560Y;
                        N.B0(obj);
                        tVar.getClass();
                        tVar.T(dVar);
                        if (!dVar.j()) {
                            qVar.f33560Y = tVar;
                            qVar.f33561Z = dVar;
                            qVar.f33564j0 = 1;
                            if (tVar.d0(1, qVar) == enumC5000a) {
                                return enumC5000a;
                            }
                            tVar.getClass();
                            tVar.T(dVar);
                            if (!dVar.j()) {
                                return yVar;
                            }
                        }
                    } else {
                        N.B0(obj);
                        tVar = this;
                        if (!dVar.j()) {
                        }
                    }
                }
            }
            if (i10 == 0) {
            }
        } finally {
            dVar.F();
        }
        qVar = new q(this, abstractC4825e);
        Object obj2 = qVar.f33562h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = qVar.f33564j0;
        jf.y yVar2 = jf.y.f36177a;
    }

    public final void d(AbstractC1073l0 abstractC1073l0) {
        AbstractC1073l0 abstractC1073l02 = this.attachedJob;
        if (abstractC1073l02 != null) {
            abstractC1073l02.k(null);
        }
        this.attachedJob = abstractC1073l0;
        L4.a.C0(abstractC1073l0, true, new C3596a(this, 0), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d0(int i10, AbstractC4825e abstractC4825e) {
        s sVar;
        EnumC5000a enumC5000a;
        int i11;
        t tVar;
        boolean f02;
        Object t10;
        if (abstractC4825e instanceof s) {
            sVar = (s) abstractC4825e;
            int i12 = sVar.f33576j0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                sVar.f33576j0 = i12 - Integer.MIN_VALUE;
                Object obj = sVar.f33574h0;
                enumC5000a = EnumC5000a.f41328Y;
                i11 = sVar.f33576j0;
                if (i11 == 0) {
                    if (i11 == 1) {
                        i10 = sVar.f33573Z;
                        tVar = sVar.f33572Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    tVar = this;
                }
                do {
                    f02 = tVar.f0(i10);
                    jf.y yVar = jf.y.f36177a;
                    if (!f02) {
                        sVar.f33572Y = tVar;
                        sVar.f33573Z = i10;
                        sVar.f33576j0 = 1;
                        C1072l c1072l = new C1072l(1, AbstractC5260f.z(sVar));
                        c1072l.u();
                        while (true) {
                            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) tVar._closed;
                            if (cVar == null) {
                                if (!tVar.f0(i10)) {
                                    c1072l.resumeWith(yVar);
                                    break;
                                }
                                while (((AbstractC4825e) tVar._writeOp) == null) {
                                    if (tVar.f0(i10)) {
                                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33580n;
                                        while (!atomicReferenceFieldUpdater.compareAndSet(tVar, null, c1072l)) {
                                            if (atomicReferenceFieldUpdater.get(tVar) != null) {
                                                break;
                                            }
                                        }
                                        if (tVar.f0(i10)) {
                                            break;
                                        }
                                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f33580n;
                                        while (!atomicReferenceFieldUpdater2.compareAndSet(tVar, c1072l, null)) {
                                            if (atomicReferenceFieldUpdater2.get(tVar) != c1072l) {
                                                break;
                                            }
                                        }
                                        continue;
                                    } else {
                                        break;
                                    }
                                }
                                throw new IllegalStateException("Operation is already in progress".toString());
                            }
                            N.d(cVar.a());
                            throw null;
                        }
                        tVar.o(i10);
                        t10 = c1072l.t();
                        if (t10 == EnumC5000a.f41328Y) {
                            N.k0(sVar);
                            continue;
                        }
                    } else {
                        io.ktor.utils.io.internal.c cVar2 = (io.ktor.utils.io.internal.c) tVar._closed;
                        if (cVar2 == null) {
                            return yVar;
                        }
                        N.d(cVar2.a());
                        throw null;
                    }
                } while (t10 != enumC5000a);
                return enumC5000a;
            }
        }
        sVar = new s(this, abstractC4825e);
        Object obj2 = sVar.f33574h0;
        enumC5000a = EnumC5000a.f41328Y;
        i11 = sVar.f33576j0;
        if (i11 == 0) {
        }
        do {
            f02 = tVar.f0(i10);
            jf.y yVar2 = jf.y.f36177a;
            if (!f02) {
            }
        } while (t10 != enumC5000a);
        return enumC5000a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i10, wf.k kVar, AbstractC4825e abstractC4825e) {
        C3597b c3597b;
        int i11;
        t tVar;
        if (abstractC4825e instanceof C3597b) {
            c3597b = (C3597b) abstractC4825e;
            int i12 = c3597b.f33393i0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c3597b.f33393i0 = i12 - Integer.MIN_VALUE;
                Object obj = c3597b.f33391Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i11 = c3597b.f33393i0;
                jf.y yVar = jf.y.f36177a;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = c3597b.f33390Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c3597b.f33390Y = this;
                    c3597b.getClass();
                    c3597b.f33393i0 = 1;
                    if (d0(i10, c3597b) == enumC5000a) {
                        return enumC5000a;
                    }
                    tVar = this;
                }
                tVar.getClass();
                return yVar;
            }
        }
        c3597b = new C3597b(this, abstractC4825e);
        Object obj2 = c3597b.f33391Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i11 = c3597b.f33393i0;
        jf.y yVar2 = jf.y.f36177a;
        if (i11 == 0) {
        }
        tVar.getClass();
        return yVar2;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0053 -> B:22:0x0056). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object e0(byte[] r6, int r7, int r8, nf.AbstractC4825e r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof io.ktor.utils.io.r
            if (r0 == 0) goto L13
            r0 = r9
            io.ktor.utils.io.r r0 = (io.ktor.utils.io.r) r0
            int r1 = r0.f33571l0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33571l0 = r1
            goto L18
        L13:
            io.ktor.utils.io.r r0 = new io.ktor.utils.io.r
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f33569j0
            of.a r1 = of.EnumC5000a.f41328Y
            int r2 = r0.f33571l0
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 == r3) goto L32
            r6 = 2
            if (r2 != r6) goto L2a
            com.google.android.gms.internal.play_billing.N.B0(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            int r6 = r0.f33568i0
            int r7 = r0.f33567h0
            byte[] r8 = r0.f33566Z
            io.ktor.utils.io.t r2 = r0.f33565Y
            com.google.android.gms.internal.play_billing.N.B0(r9)
            r4 = r8
            r8 = r6
            r6 = r4
            goto L56
        L41:
            com.google.android.gms.internal.play_billing.N.B0(r9)
            r2 = r5
        L45:
            r0.f33565Y = r2
            r0.f33566Z = r6
            r0.f33567h0 = r7
            r0.f33568i0 = r8
            r0.f33571l0 = r3
            java.lang.Object r9 = r2.U(r3, r0)
            if (r9 != r1) goto L56
            return r1
        L56:
            r2.getClass()
            int r9 = r2.W(r6, r7, r8)
            if (r9 <= 0) goto L45
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r9)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.t.e0(byte[], int, int, nf.e):java.lang.Object");
    }

    public final void f(ByteBuffer byteBuffer, io.ktor.utils.io.internal.p pVar, int i10) {
        if (i10 >= 0) {
            this.f33584e = i(this.f33584e + i10, byteBuffer);
            pVar.a(i10);
            this.totalBytesRead += i10;
            N();
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean f0(int i10) {
        io.ktor.utils.io.internal.n nVar = (io.ktor.utils.io.internal.n) this._state;
        if (((io.ktor.utils.io.internal.c) this._closed) != null || nVar.f33469b._availableForWrite$internal >= i10 || nVar == io.ktor.utils.io.internal.g.f33456c) {
            return false;
        }
        return true;
    }

    public final void g(ByteBuffer byteBuffer, io.ktor.utils.io.internal.p pVar, int i10) {
        if (i10 >= 0) {
            this.f33585f = i(this.f33585f + i10, byteBuffer);
            pVar.b(i10);
            this.totalBytesWritten += i10;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final boolean h(Throwable th2) {
        if (th2 == null) {
            th2 = new CancellationException("Channel has been cancelled");
        }
        return j(th2);
    }

    public final int i(int i10, ByteBuffer byteBuffer) {
        int capacity = byteBuffer.capacity();
        int i11 = this.f33583d;
        if (i10 >= capacity - i11) {
            return i10 - (byteBuffer.capacity() - i11);
        }
        return i10;
    }

    public final boolean j(Throwable th2) {
        io.ktor.utils.io.internal.c cVar;
        Throwable th3;
        boolean z10 = false;
        if (((io.ktor.utils.io.internal.c) this._closed) != null) {
            return false;
        }
        if (th2 == null) {
            cVar = io.ktor.utils.io.internal.c.f33450b;
        } else {
            cVar = new io.ktor.utils.io.internal.c(th2);
        }
        ((io.ktor.utils.io.internal.n) this._state).f33469b.c();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33578l;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, cVar)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                return false;
            }
        }
        ((io.ktor.utils.io.internal.n) this._state).f33469b.c();
        io.ktor.utils.io.internal.p pVar = ((io.ktor.utils.io.internal.n) this._state).f33469b;
        if (pVar._availableForWrite$internal == pVar.f33475a || th2 != null) {
            S();
        }
        AbstractC4825e abstractC4825e = (AbstractC4825e) f33579m.getAndSet(this, null);
        if (abstractC4825e != null) {
            if (th2 != null) {
                abstractC4825e.resumeWith(N.w(th2));
            } else {
                if (((io.ktor.utils.io.internal.n) this._state).f33469b._availableForRead$internal > 0) {
                    z10 = true;
                }
                abstractC4825e.resumeWith(Boolean.valueOf(z10));
            }
        }
        AbstractC4825e abstractC4825e2 = (AbstractC4825e) f33580n.getAndSet(this, null);
        if (abstractC4825e2 != null) {
            if (th2 == null) {
                th3 = new C6685Z("Byte channel was closed");
            } else {
                th3 = th2;
            }
            abstractC4825e2.resumeWith(N.w(th3));
        }
        io.ktor.utils.io.internal.n nVar = (io.ktor.utils.io.internal.n) this._state;
        io.ktor.utils.io.internal.l lVar = io.ktor.utils.io.internal.l.f33466c;
        if (th2 != null) {
            AbstractC1073l0 abstractC1073l0 = this.attachedJob;
            if (abstractC1073l0 != null) {
                abstractC1073l0.k(null);
            }
            this.f33587h.c(th2);
            this.f33588i.c(th2);
            return true;
        }
        this.f33588i.c(new C6685Z("Byte channel was closed"));
        io.ktor.utils.io.internal.b bVar = this.f33587h;
        Boolean valueOf = Boolean.valueOf(((io.ktor.utils.io.internal.n) this._state).f33469b.c());
        bVar.getClass();
        bVar.resumeWith(valueOf);
        io.ktor.utils.io.internal.a aVar = (io.ktor.utils.io.internal.a) io.ktor.utils.io.internal.b.f33449Z.getAndSet(bVar, null);
        if (aVar != null) {
            aVar.a();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x0208, code lost:
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x020f, code lost:
        throw new java.lang.AssertionError();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d4 A[Catch: all -> 0x0200, TryCatch #0 {all -> 0x0200, blocks: (B:100:0x01bd, B:103:0x01d4, B:106:0x01e4, B:118:0x0215, B:119:0x021b), top: B:177:0x01bd }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x025a A[Catch: all -> 0x02a7, TryCatch #6 {all -> 0x02a7, blocks: (B:129:0x0246, B:131:0x024c, B:135:0x0255, B:137:0x025a, B:138:0x0262, B:140:0x026e, B:142:0x0278), top: B:189:0x0246 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x026e A[Catch: all -> 0x02a7, TryCatch #6 {all -> 0x02a7, blocks: (B:129:0x0246, B:131:0x024c, B:135:0x0255, B:137:0x025a, B:138:0x0262, B:140:0x026e, B:142:0x0278), top: B:189:0x0246 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02cd A[Catch: all -> 0x003c, TryCatch #17 {all -> 0x003c, blocks: (B:15:0x0037, B:20:0x0051, B:37:0x00b4, B:39:0x00ba, B:147:0x029e, B:153:0x02ae, B:160:0x02c7, B:162:0x02cd, B:164:0x02d1, B:166:0x02d7, B:167:0x02df, B:168:0x02e5, B:170:0x02e8, B:171:0x02ec), top: B:211:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02d7 A[Catch: all -> 0x003c, TryCatch #17 {all -> 0x003c, blocks: (B:15:0x0037, B:20:0x0051, B:37:0x00b4, B:39:0x00ba, B:147:0x029e, B:153:0x02ae, B:160:0x02c7, B:162:0x02cd, B:164:0x02d1, B:166:0x02d7, B:167:0x02df, B:168:0x02e5, B:170:0x02e8, B:171:0x02ec), top: B:211:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02e8 A[Catch: all -> 0x003c, TryCatch #17 {all -> 0x003c, blocks: (B:15:0x0037, B:20:0x0051, B:37:0x00b4, B:39:0x00ba, B:147:0x029e, B:153:0x02ae, B:160:0x02c7, B:162:0x02cd, B:164:0x02d1, B:166:0x02d7, B:167:0x02df, B:168:0x02e5, B:170:0x02e8, B:171:0x02ec), top: B:211:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #17 {all -> 0x003c, blocks: (B:15:0x0037, B:20:0x0051, B:37:0x00b4, B:39:0x00ba, B:147:0x029e, B:153:0x02ae, B:160:0x02c7, B:162:0x02cd, B:164:0x02d1, B:166:0x02d7, B:167:0x02df, B:168:0x02e5, B:170:0x02e8, B:171:0x02ec), top: B:211:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0 A[Catch: all -> 0x0231, TRY_LEAVE, TryCatch #14 {all -> 0x0231, blocks: (B:43:0x00da, B:45:0x00e0), top: B:205:0x00da }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0156  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x01e8 -> B:205:0x00da). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x02b1 -> B:37:0x00b4). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(t tVar, long j6, AbstractC4825e abstractC4825e) {
        C3598c c3598c;
        int i10;
        t tVar2;
        Throwable th2;
        io.ktor.utils.io.internal.p pVar;
        ByteBuffer byteBuffer;
        long j10;
        t tVar3;
        t tVar4;
        long j11;
        kotlin.jvm.internal.A a5;
        t tVar5;
        t tVar6;
        t tVar7;
        io.ktor.utils.io.internal.p pVar2;
        boolean z10;
        long j12;
        int i11;
        boolean z11;
        long j13;
        io.ktor.utils.io.internal.p pVar3;
        EnumC5000a enumC5000a;
        t tVar8;
        kotlin.jvm.internal.A a10;
        long j14;
        boolean z12;
        io.ktor.utils.io.internal.p pVar4;
        t tVar9;
        t tVar10;
        C3598c c3598c2;
        Throwable th3;
        t tVar11;
        t tVar12;
        int i12;
        int i13;
        t tVar13;
        EnumC5000a enumC5000a2;
        long j15;
        Object F10;
        kotlin.jvm.internal.A a11;
        kotlin.jvm.internal.A a12;
        kotlin.jvm.internal.A a13;
        kotlin.jvm.internal.A a14;
        int i14;
        try {
            if (abstractC4825e instanceof C3598c) {
                c3598c = (C3598c) abstractC4825e;
                int i15 = c3598c.f33408t0;
                if ((i15 & Integer.MIN_VALUE) != 0) {
                    c3598c.f33408t0 = i15 - Integer.MIN_VALUE;
                    Object obj = c3598c.f33406r0;
                    EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                    i10 = c3598c.f33408t0;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    z12 = c3598c.f33405q0;
                                    j15 = c3598c.f33403o0;
                                    kotlin.jvm.internal.A a15 = c3598c.f33396h0;
                                    tVar3 = c3598c.f33395Z;
                                    tVar13 = c3598c.f33394Y;
                                    N.B0(obj);
                                    a14 = a15;
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                z12 = c3598c.f33405q0;
                                j15 = c3598c.f33403o0;
                                kotlin.jvm.internal.A a16 = c3598c.f33396h0;
                                tVar3 = c3598c.f33395Z;
                                tVar13 = c3598c.f33394Y;
                                N.B0(obj);
                                F10 = obj;
                                enumC5000a2 = enumC5000a3;
                                a13 = a16;
                                a11 = a13;
                                if (((Boolean) F10).booleanValue()) {
                                    a12 = a13;
                                    tVar13.getClass();
                                    enumC5000a3 = enumC5000a2;
                                    a14 = a12;
                                }
                                if (z12) {
                                    tVar13.o(1);
                                }
                                return new Long(a11.f37621Y);
                            }
                        } else {
                            j11 = c3598c.f33404p0;
                            boolean z13 = c3598c.f33405q0;
                            long j16 = c3598c.f33403o0;
                            t tVar14 = c3598c.f33402n0;
                            ByteBuffer byteBuffer2 = c3598c.f33401m0;
                            io.ktor.utils.io.internal.p pVar5 = c3598c.f33400l0;
                            pVar = c3598c.f33399k0;
                            tVar5 = c3598c.f33398j0;
                            tVar6 = c3598c.f33397i0;
                            a5 = c3598c.f33396h0;
                            t tVar15 = c3598c.f33395Z;
                            tVar7 = c3598c.f33394Y;
                            try {
                                N.B0(obj);
                                z10 = z13;
                                pVar2 = pVar;
                                pVar = pVar5;
                                byteBuffer = byteBuffer2;
                                tVar3 = tVar15;
                                tVar4 = tVar14;
                                j10 = j16;
                            } catch (Throwable th4) {
                                th = th4;
                                if (!pVar.d()) {
                                }
                                tVar5.o(1);
                                if (tVar5 != tVar6) {
                                }
                                tVar5.L();
                                tVar5.S();
                                throw th;
                            }
                            try {
                                try {
                                    tVar4.getClass();
                                    boolean z14 = z10;
                                    tVar4.t(byteBuffer, tVar4.f33585f, i11);
                                    ByteBuffer O10 = tVar3.O();
                                    int i16 = 0;
                                    if (O10 == null) {
                                        pVar3 = pVar2;
                                        c3598c2 = c3598c;
                                    } else {
                                        try {
                                            try {
                                                pVar3 = pVar2;
                                                try {
                                                    io.ktor.utils.io.internal.p pVar6 = ((io.ktor.utils.io.internal.n) tVar3._state).f33469b;
                                                    if (pVar6._availableForRead$internal == 0) {
                                                        try {
                                                            tVar3.K();
                                                            tVar3.S();
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            pVar = pVar3;
                                                            j11 = j12;
                                                            if (!pVar.d()) {
                                                            }
                                                            tVar5.o(1);
                                                            if (tVar5 != tVar6) {
                                                            }
                                                            tVar5.L();
                                                            tVar5.S();
                                                            throw th;
                                                        }
                                                    } else {
                                                        try {
                                                            try {
                                                                try {
                                                                    int i17 = pVar.i((int) Math.min(O10.remaining(), Math.min(byteBuffer.remaining(), j10 - a5.f37621Y)));
                                                                    if (i17 <= 0) {
                                                                        tVar3 = tVar12;
                                                                    } else {
                                                                        do {
                                                                            i12 = pVar6._availableForRead$internal;
                                                                            if (i12 < i17) {
                                                                                break;
                                                                            }
                                                                        } while (!io.ktor.utils.io.internal.p.f33472b.compareAndSet(pVar6, i12, i12 - i17));
                                                                        O10.limit(O10.position() + i17);
                                                                        byteBuffer.put(O10);
                                                                        tVar3 = tVar12;
                                                                        tVar3.f(O10, pVar6, i17);
                                                                        i16 = i17;
                                                                    }
                                                                    tVar3.K();
                                                                    tVar3.S();
                                                                    i13 = i16;
                                                                    if (i13 > 0) {
                                                                        pVar2 = pVar3;
                                                                        c3598c = c3598c2;
                                                                        tVar8 = tVar9;
                                                                        z12 = z11;
                                                                        a10 = a5;
                                                                        j14 = j12;
                                                                        tVar6 = tVar10;
                                                                        try {
                                                                            if (!pVar2.d() || tVar5.f33581b) {
                                                                                tVar5.o(1);
                                                                            }
                                                                            if (tVar5 != tVar6) {
                                                                                tVar6.totalBytesWritten += tVar5.totalBytesWritten - j14;
                                                                            }
                                                                            tVar5.L();
                                                                            tVar5.S();
                                                                            if (a10.f37621Y >= j10) {
                                                                                tVar8.o(1);
                                                                                if (tVar3.p() == 0) {
                                                                                    c3598c.f33394Y = tVar8;
                                                                                    c3598c.f33395Z = tVar3;
                                                                                    c3598c.f33396h0 = a10;
                                                                                    c3598c.f33397i0 = null;
                                                                                    c3598c.f33398j0 = null;
                                                                                    c3598c.f33399k0 = null;
                                                                                    c3598c.f33400l0 = null;
                                                                                    c3598c.f33401m0 = null;
                                                                                    c3598c.f33402n0 = null;
                                                                                    c3598c.f33403o0 = j10;
                                                                                    c3598c.f33405q0 = z12;
                                                                                    c3598c.f33408t0 = 2;
                                                                                    F10 = tVar3.F(1, c3598c);
                                                                                    enumC5000a2 = enumC5000a;
                                                                                    if (F10 == enumC5000a2) {
                                                                                        return enumC5000a2;
                                                                                    }
                                                                                    j15 = j10;
                                                                                    tVar13 = tVar8;
                                                                                    a13 = a10;
                                                                                    a11 = a13;
                                                                                    if (((Boolean) F10).booleanValue()) {
                                                                                    }
                                                                                    if (z12) {
                                                                                    }
                                                                                    return new Long(a11.f37621Y);
                                                                                }
                                                                                enumC5000a2 = enumC5000a;
                                                                                j15 = j10;
                                                                                tVar13 = tVar8;
                                                                                a12 = a10;
                                                                                tVar13.getClass();
                                                                                enumC5000a3 = enumC5000a2;
                                                                                a14 = a12;
                                                                            } else {
                                                                                tVar13 = tVar8;
                                                                                a11 = a10;
                                                                                if (z12) {
                                                                                }
                                                                                return new Long(a11.f37621Y);
                                                                            }
                                                                        } catch (Throwable th6) {
                                                                            th2 = th6;
                                                                            tVar2 = tVar8;
                                                                            tVar2.j(th2);
                                                                            throw th2;
                                                                        }
                                                                    } else {
                                                                        try {
                                                                            tVar4 = tVar11;
                                                                            tVar4.g(byteBuffer, pVar, i13);
                                                                            a5.f37621Y += i13;
                                                                            if (i11 - i13 == 0 || z11) {
                                                                                tVar4.o(1);
                                                                            }
                                                                            if (a5.f37621Y < j10) {
                                                                                i11 = pVar._availableForWrite$internal;
                                                                                if (i11 == 0) {
                                                                                    try {
                                                                                        try {
                                                                                            try {
                                                                                                try {
                                                                                                    c3598c.f33403o0 = j10;
                                                                                                    c3598c.f33405q0 = z11;
                                                                                                    c3598c.f33404p0 = j11;
                                                                                                    c3598c.f33408t0 = 1;
                                                                                                    boolean z15 = z11;
                                                                                                    if (tVar4.U(1, c3598c) == enumC5000a3) {
                                                                                                        return enumC5000a3;
                                                                                                    }
                                                                                                    pVar2 = pVar4;
                                                                                                    z10 = z15;
                                                                                                    tVar4.getClass();
                                                                                                    boolean z142 = z10;
                                                                                                    j12 = j11;
                                                                                                    i11 = pVar._availableForWrite$internal;
                                                                                                    z11 = z142;
                                                                                                    tVar4.t(byteBuffer, tVar4.f33585f, i11);
                                                                                                    ByteBuffer O102 = tVar3.O();
                                                                                                    int i162 = 0;
                                                                                                    if (O102 == null) {
                                                                                                    }
                                                                                                } catch (Throwable th7) {
                                                                                                    th = th7;
                                                                                                    pVar = pVar4;
                                                                                                    if (!pVar.d()) {
                                                                                                    }
                                                                                                    tVar5.o(1);
                                                                                                    if (tVar5 != tVar6) {
                                                                                                    }
                                                                                                    tVar5.L();
                                                                                                    tVar5.S();
                                                                                                    throw th;
                                                                                                }
                                                                                                pVar4 = pVar2;
                                                                                            } catch (Throwable th8) {
                                                                                                th = th8;
                                                                                                pVar4 = pVar2;
                                                                                                pVar = pVar4;
                                                                                                if (!pVar.d()) {
                                                                                                }
                                                                                                tVar5.o(1);
                                                                                                if (tVar5 != tVar6) {
                                                                                                }
                                                                                                tVar5.L();
                                                                                                tVar5.S();
                                                                                                throw th;
                                                                                            }
                                                                                            j11 = j13;
                                                                                        } catch (Throwable th9) {
                                                                                            th = th9;
                                                                                            j11 = j13;
                                                                                        }
                                                                                        c3598c.f33394Y = tVar7;
                                                                                        c3598c.f33395Z = tVar3;
                                                                                        c3598c.f33396h0 = a5;
                                                                                        c3598c.f33397i0 = tVar6;
                                                                                        c3598c.f33398j0 = tVar5;
                                                                                        c3598c.f33399k0 = pVar2;
                                                                                        c3598c.f33400l0 = pVar;
                                                                                        c3598c.f33401m0 = byteBuffer;
                                                                                        c3598c.f33402n0 = tVar4;
                                                                                    } catch (Throwable th10) {
                                                                                        th = th10;
                                                                                        j11 = j13;
                                                                                    }
                                                                                } else {
                                                                                    j12 = j13;
                                                                                    tVar4.t(byteBuffer, tVar4.f33585f, i11);
                                                                                    ByteBuffer O1022 = tVar3.O();
                                                                                    int i1622 = 0;
                                                                                    if (O1022 == null) {
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                enumC5000a = enumC5000a3;
                                                                                tVar8 = tVar7;
                                                                                a10 = a5;
                                                                                j14 = j13;
                                                                                z12 = z11;
                                                                                if (!pVar2.d()) {
                                                                                }
                                                                                tVar5.o(1);
                                                                                if (tVar5 != tVar6) {
                                                                                }
                                                                                tVar5.L();
                                                                                tVar5.S();
                                                                                if (a10.f37621Y >= j10) {
                                                                                }
                                                                            }
                                                                        } catch (Throwable th11) {
                                                                            th = th11;
                                                                            j12 = j13;
                                                                            pVar3 = pVar2;
                                                                            pVar = pVar3;
                                                                            j11 = j12;
                                                                            if (!pVar.d()) {
                                                                            }
                                                                            tVar5.o(1);
                                                                            if (tVar5 != tVar6) {
                                                                            }
                                                                            tVar5.L();
                                                                            tVar5.S();
                                                                            throw th;
                                                                        }
                                                                        pVar2 = pVar3;
                                                                        c3598c = c3598c2;
                                                                        tVar7 = tVar9;
                                                                        j13 = j12;
                                                                        tVar6 = tVar10;
                                                                        enumC5000a3 = enumC5000a;
                                                                    }
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    pVar = pVar3;
                                                                    j11 = j12;
                                                                    tVar6 = tVar10;
                                                                    if (!pVar.d() || tVar5.f33581b) {
                                                                        tVar5.o(1);
                                                                    }
                                                                    if (tVar5 != tVar6) {
                                                                        tVar6.totalBytesWritten += tVar5.totalBytesWritten - j11;
                                                                    }
                                                                    tVar5.L();
                                                                    tVar5.S();
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th13) {
                                                                th3 = th13;
                                                            }
                                                            tVar9 = tVar7;
                                                            tVar10 = tVar6;
                                                        } catch (Throwable th14) {
                                                            th3 = th14;
                                                            tVar3 = tVar12;
                                                            tVar3.K();
                                                            tVar3.S();
                                                            throw th3;
                                                        }
                                                        enumC5000a = enumC5000a3;
                                                        tVar11 = tVar4;
                                                        tVar12 = tVar3;
                                                    }
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    tVar9 = tVar7;
                                                    tVar10 = tVar6;
                                                }
                                            } catch (Throwable th16) {
                                                th3 = th16;
                                                tVar9 = tVar7;
                                                tVar10 = tVar6;
                                            }
                                            c3598c2 = c3598c;
                                        } catch (Throwable th17) {
                                            th = th17;
                                            pVar = pVar3;
                                            j11 = j12;
                                            if (!pVar.d()) {
                                            }
                                            tVar5.o(1);
                                            if (tVar5 != tVar6) {
                                            }
                                            tVar5.L();
                                            tVar5.S();
                                            throw th;
                                        }
                                    }
                                    enumC5000a = enumC5000a3;
                                    tVar9 = tVar7;
                                    tVar10 = tVar6;
                                    tVar11 = tVar4;
                                    i13 = i1622;
                                    if (i13 > 0) {
                                    }
                                } catch (Throwable th18) {
                                    th = th18;
                                    pVar3 = pVar2;
                                }
                                j12 = j11;
                                i11 = pVar._availableForWrite$internal;
                                z11 = z142;
                            } catch (Throwable th19) {
                                th = th19;
                                pVar = pVar2;
                                if (!pVar.d()) {
                                }
                                tVar5.o(1);
                                if (tVar5 != tVar6) {
                                }
                                tVar5.L();
                                tVar5.S();
                                throw th;
                            }
                        }
                    } else {
                        N.B0(obj);
                        if (tVar.r()) {
                            if (tVar.q() != null) {
                                j(tVar.q());
                            }
                            return new Long(0L);
                        }
                        z12 = this.f33581b;
                        try {
                            tVar3 = tVar;
                            j15 = j6;
                            tVar13 = this;
                            a14 = new Object();
                        } catch (Throwable th20) {
                            th2 = th20;
                            tVar2 = this;
                            tVar2.j(th2);
                            throw th2;
                        }
                    }
                    i14 = (a14.f37621Y > j15 ? 1 : (a14.f37621Y == j15 ? 0 : -1));
                    a11 = a14;
                    if (i14 < 0) {
                        tVar13.getClass();
                        ByteBuffer P = tVar13.P();
                        pVar = ((io.ktor.utils.io.internal.n) tVar13._state).f33469b;
                        long j17 = tVar13.totalBytesWritten;
                        try {
                            io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) tVar13._closed;
                            if (cVar == null) {
                                byteBuffer = P;
                                z11 = z12;
                                j13 = j17;
                                a5 = a14;
                                tVar7 = tVar13;
                                tVar6 = tVar7;
                                tVar5 = tVar6;
                                tVar4 = tVar5;
                                pVar2 = pVar;
                                j10 = j15;
                                if (a5.f37621Y < j10) {
                                }
                            } else {
                                N.d(cVar.a());
                                throw null;
                            }
                        } catch (Throwable th21) {
                            th = th21;
                            j11 = j17;
                            tVar6 = tVar13;
                            tVar5 = tVar6;
                            if (!pVar.d()) {
                            }
                            tVar5.o(1);
                            if (tVar5 != tVar6) {
                            }
                            tVar5.L();
                            tVar5.S();
                            throw th;
                        }
                    }
                    if (z12) {
                    }
                    return new Long(a11.f37621Y);
                }
            }
            if (i10 == 0) {
            }
            i14 = (a14.f37621Y > j15 ? 1 : (a14.f37621Y == j15 ? 0 : -1));
            a11 = a14;
            if (i14 < 0) {
            }
            if (z12) {
            }
            return new Long(a11.f37621Y);
        } catch (Throwable th22) {
            th2 = th22;
        }
        c3598c = new C3598c(this, abstractC4825e);
        Object obj2 = c3598c.f33406r0;
        EnumC5000a enumC5000a32 = EnumC5000a.f41328Y;
        i10 = c3598c.f33408t0;
    }

    public final io.ktor.utils.io.internal.n l() {
        return (io.ktor.utils.io.internal.n) this._state;
    }

    public final Object m(AbstractC4825e abstractC4825e) {
        long j6;
        long j10;
        ByteBuffer O10 = O();
        if (O10 != null) {
            io.ktor.utils.io.internal.p pVar = ((io.ktor.utils.io.internal.n) this._state).f33469b;
            try {
                if (pVar._availableForRead$internal != 0) {
                    int h10 = pVar.h((int) Math.min(2147483647L, Long.MAX_VALUE));
                    f(O10, pVar, h10);
                    j6 = h10;
                    j10 = j6;
                    if (j10 == Long.MAX_VALUE && !r()) {
                        return n(j10, Long.MAX_VALUE, abstractC4825e);
                    }
                    return new Long(j10);
                }
            } finally {
                K();
                S();
            }
        }
        j6 = 0;
        j10 = j6;
        if (j10 == Long.MAX_VALUE) {
        }
        return new Long(j10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
        if (((java.lang.Boolean) r14).booleanValue() != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Type inference failed for: r14v9, types: [kotlin.jvm.internal.A, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0071 -> B:28:0x0074). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(long j6, long j10, AbstractC4825e abstractC4825e) {
        C3599d c3599d;
        int i10;
        t tVar;
        kotlin.jvm.internal.A a5;
        long j11;
        if (abstractC4825e instanceof C3599d) {
            c3599d = (C3599d) abstractC4825e;
            int i11 = c3599d.f33414k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3599d.f33414k0 = i11 - Integer.MIN_VALUE;
                Object obj = c3599d.f33412i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c3599d.f33414k0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        j11 = c3599d.f33411h0;
                        a5 = c3599d.f33410Z;
                        tVar = c3599d.f33409Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    ?? obj2 = new Object();
                    obj2.f37621Y = j6;
                    j11 = j10;
                    a5 = obj2;
                    tVar = this;
                    while (a5.f37621Y < j11) {
                        ByteBuffer O10 = tVar.O();
                        if (O10 != null) {
                            io.ktor.utils.io.internal.p pVar = ((io.ktor.utils.io.internal.n) tVar._state).f33469b;
                            try {
                                if (pVar._availableForRead$internal != 0) {
                                    int h10 = pVar.h((int) Math.min(2147483647L, j11 - a5.f37621Y));
                                    tVar.f(O10, pVar, h10);
                                    a5.f37621Y += h10;
                                }
                            } finally {
                                tVar.K();
                                tVar.S();
                            }
                        }
                        if (!tVar.r()) {
                            c3599d.f33409Y = tVar;
                            c3599d.f33410Z = a5;
                            c3599d.f33411h0 = j11;
                            c3599d.f33414k0 = 1;
                            obj = tVar.E(1, c3599d);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                        return new Long(a5.f37621Y);
                    }
                    return new Long(a5.f37621Y);
                }
            }
        }
        c3599d = new C3599d(this, abstractC4825e);
        Object obj3 = c3599d.f33412i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3599d.f33414k0;
        if (i10 == 0) {
        }
    }

    public final void o(int i10) {
        io.ktor.utils.io.internal.n nVar;
        do {
            nVar = (io.ktor.utils.io.internal.n) this._state;
            if (nVar == io.ktor.utils.io.internal.l.f33466c) {
                return;
            }
            nVar.f33469b.c();
        } while (nVar != ((io.ktor.utils.io.internal.n) this._state));
        int i11 = nVar.f33469b._availableForWrite$internal;
        if (nVar.f33469b._availableForRead$internal >= 1) {
            M();
        }
        if (i11 >= i10) {
            N();
        }
    }

    public final int p() {
        return ((io.ktor.utils.io.internal.n) this._state).f33469b._availableForRead$internal;
    }

    public final Throwable q() {
        io.ktor.utils.io.internal.c cVar = (io.ktor.utils.io.internal.c) this._closed;
        if (cVar != null) {
            return cVar.f33451a;
        }
        return null;
    }

    public final boolean r() {
        if (((io.ktor.utils.io.internal.n) this._state) == io.ktor.utils.io.internal.l.f33466c && ((io.ktor.utils.io.internal.c) this._closed) != null) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        if (((io.ktor.utils.io.internal.c) this._closed) != null) {
            return true;
        }
        return false;
    }

    public final void t(ByteBuffer byteBuffer, int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                int capacity = byteBuffer.capacity() - this.f33583d;
                int i12 = i11 + i10;
                if (i12 <= capacity) {
                    capacity = i12;
                }
                byteBuffer.limit(capacity);
                byteBuffer.position(i10);
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public final String toString() {
        return "ByteBufferChannel(" + hashCode() + ", " + ((io.ktor.utils.io.internal.n) this._state) + ')';
    }

    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(int i10, wf.k kVar, AbstractC5156c abstractC5156c) {
        boolean z10;
        int i11;
        if (i10 >= 0) {
            ByteBuffer O10 = O();
            jf.y yVar = jf.y.f36177a;
            if (O10 != null) {
                io.ktor.utils.io.internal.p pVar = ((io.ktor.utils.io.internal.n) this._state).f33469b;
                try {
                    if (pVar._availableForRead$internal == 0) {
                        K();
                        S();
                    } else {
                        int i12 = pVar._availableForRead$internal;
                        if (i12 > 0 && i12 >= i10) {
                            int position = O10.position();
                            int limit = O10.limit();
                            kVar.invoke(O10);
                            if (limit == O10.limit()) {
                                int position2 = O10.position() - position;
                                if (position2 >= 0) {
                                    do {
                                        i11 = pVar._availableForRead$internal;
                                        if (i11 >= position2) {
                                        } else {
                                            throw new IllegalStateException("Check failed.".toString());
                                        }
                                    } while (!io.ktor.utils.io.internal.p.f33472b.compareAndSet(pVar, i11, i11 - position2));
                                    f(O10, pVar, position2);
                                    z10 = true;
                                    K();
                                    S();
                                    if (z10) {
                                        return yVar;
                                    }
                                } else {
                                    throw new IllegalStateException("Position has been moved backward: pushback is not supported.".toString());
                                }
                            } else {
                                throw new IllegalStateException("Buffer limit modified.".toString());
                            }
                        }
                        z10 = false;
                        K();
                        S();
                        if (z10) {
                        }
                    }
                } catch (Throwable th2) {
                    K();
                    S();
                    throw th2;
                }
            }
            if (r() && i10 > 0) {
                throw new EOFException(AbstractC4194d.v("Got EOF but at least ", i10, " bytes were expected"));
            }
            Object B10 = B(i10, kVar, abstractC5156c);
            if (B10 == EnumC5000a.f41328Y) {
                return B10;
            }
            return yVar;
        }
        throw new IllegalArgumentException("min should be positive or zero".toString());
    }

    public final int v(byte[] bArr, int i10, int i11) {
        ByteBuffer O10 = O();
        int i12 = 0;
        if (O10 != null) {
            io.ktor.utils.io.internal.p pVar = ((io.ktor.utils.io.internal.n) this._state).f33469b;
            try {
                if (pVar._availableForRead$internal != 0) {
                    int capacity = O10.capacity() - this.f33583d;
                    while (true) {
                        int i13 = i11 - i12;
                        if (i13 == 0) {
                            break;
                        }
                        int i14 = this.f33584e;
                        int h10 = pVar.h(Math.min(capacity - i14, i13));
                        if (h10 == 0) {
                            break;
                        }
                        O10.limit(i14 + h10);
                        O10.position(i14);
                        O10.get(bArr, i10 + i12, h10);
                        f(O10, pVar, h10);
                        i12 += h10;
                    }
                }
            } finally {
                K();
                S();
            }
        }
        return i12;
    }

    public final Object x(Ne.c cVar, AbstractC5156c abstractC5156c) {
        int w10 = w(this, cVar);
        if (w10 == 0 && ((io.ktor.utils.io.internal.c) this._closed) != null) {
            w10 = ((io.ktor.utils.io.internal.n) this._state).f33469b.c() ? w(this, cVar) : -1;
        } else if (w10 <= 0 && cVar.f12025e > cVar.f12023c) {
            return z(cVar, abstractC5156c);
        }
        return new Integer(w10);
    }

    public final Object y(byte[] bArr, int i10, int i11, AbstractC4825e abstractC4825e) {
        int v10 = v(bArr, i10, i11);
        if (v10 == 0 && ((io.ktor.utils.io.internal.c) this._closed) != null) {
            v10 = ((io.ktor.utils.io.internal.n) this._state).f33469b.c() ? v(bArr, i10, i11) : -1;
        } else if (v10 <= 0 && i11 != 0) {
            return A(bArr, i10, i11, abstractC4825e);
        }
        return new Integer(v10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object z(Ne.c cVar, AbstractC4825e abstractC4825e) {
        C3601f c3601f;
        Object obj;
        int i10;
        t tVar;
        if (abstractC4825e instanceof C3601f) {
            c3601f = (C3601f) abstractC4825e;
            int i11 = c3601f.f33426j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3601f.f33426j0 = i11 - Integer.MIN_VALUE;
                obj = c3601f.f33424h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c3601f.f33426j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = c3601f.f33423Z;
                    tVar = c3601f.f33422Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    c3601f.f33422Y = this;
                    c3601f.f33423Z = cVar;
                    c3601f.f33426j0 = 1;
                    obj = E(1, c3601f);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    tVar = this;
                }
                if (((Boolean) obj).booleanValue()) {
                    return new Integer(-1);
                }
                c3601f.f33422Y = null;
                c3601f.f33423Z = null;
                c3601f.f33426j0 = 2;
                obj = tVar.x(cVar, c3601f);
                if (obj == enumC5000a) {
                    return enumC5000a;
                }
                return obj;
            }
        }
        c3601f = new C3601f(this, abstractC4825e);
        obj = c3601f.f33424h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c3601f.f33426j0;
        if (i10 == 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }

    public t(ByteBuffer byteBuffer) {
        this(false, io.ktor.utils.io.internal.f.f33455d, 0);
        ByteBuffer slice = byteBuffer.slice();
        AbstractC3557B.b0("content.slice()", slice);
        io.ktor.utils.io.internal.i iVar = new io.ktor.utils.io.internal.i(0, slice);
        iVar.f33469b.e();
        this._state = iVar.f33462g;
        L();
        P4.a.y(this);
        S();
    }
}
