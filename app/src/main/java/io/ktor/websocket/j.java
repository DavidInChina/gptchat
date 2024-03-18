package io.ktor.websocket;

import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.C1079o0;
import Ng.C1084s;
import Ng.E;
import Ng.G;
import Ng.M0;
import Ng.Q;
import Pg.C;
import Pg.C1171d;
import Pg.D;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import l8.AbstractC4344b;
import me.C4641n;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import nf.AbstractC4831k;
import of.EnumC5000a;

/* loaded from: classes.dex */
public final class j implements c, z {

    /* renamed from: Y  reason: collision with root package name */
    public final z f33652Y;
    private volatile /* synthetic */ int closed;

    /* renamed from: i0  reason: collision with root package name */
    public final Pg.k f33655i0;

    /* renamed from: j0  reason: collision with root package name */
    public final C1079o0 f33656j0;

    /* renamed from: k0  reason: collision with root package name */
    public final ArrayList f33657k0;

    /* renamed from: l0  reason: collision with root package name */
    public final AbstractC4831k f33658l0;

    /* renamed from: m0  reason: collision with root package name */
    public final long f33659m0;

    /* renamed from: n0  reason: collision with root package name */
    public final long f33660n0;
    private volatile /* synthetic */ int started;

    /* renamed from: r0  reason: collision with root package name */
    public static final o f33651r0 = new o(new byte[0], t.f33679Y);

    /* renamed from: o0  reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33648o0 = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "pinger");

    /* renamed from: p0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33649p0 = AtomicIntegerFieldUpdater.newUpdater(j.class, "closed");

    /* renamed from: q0  reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f33650q0 = AtomicIntegerFieldUpdater.newUpdater(j.class, "started");
    volatile /* synthetic */ Object pinger = null;

    /* renamed from: Z  reason: collision with root package name */
    public final C1084s f33653Z = A7.b.j();

    /* renamed from: h0  reason: collision with root package name */
    public final Pg.k f33654h0 = Bi.c.d(8, null, 6);

    public j(z zVar, long j6, long j10) {
        this.f33652Y = zVar;
        int i10 = 8;
        String property = System.getProperty("io.ktor.websocket.outgoingChannelCapacity");
        this.f33655i0 = Bi.c.d(property != null ? Integer.parseInt(property) : i10, null, 6);
        this.closed = 0;
        C1079o0 c1079o0 = new C1079o0((AbstractC1073l0) zVar.i().get(C1071k0.f12951Y));
        this.f33656j0 = c1079o0;
        this.f33657k0 = new ArrayList();
        this.started = 0;
        this.f33658l0 = zVar.i().plus(c1079o0).plus(new E("ws-default"));
        this.f33659m0 = j6;
        this.f33660n0 = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(j jVar, Me.c cVar, q qVar, AbstractC4825e abstractC4825e) {
        d dVar;
        int i10;
        int i11;
        int i12;
        jVar.getClass();
        if (abstractC4825e instanceof d) {
            dVar = (d) abstractC4825e;
            int i13 = dVar.f33618i0;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f33618i0 = i13 - Integer.MIN_VALUE;
                Object obj = dVar.f33616Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = dVar.f33618i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = dVar.f33615Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    int length = qVar.f33667c.length;
                    if (cVar != null) {
                        i12 = (cVar.f12044j0 - cVar.f12046l0) + cVar.f12047m0;
                    } else {
                        i12 = 0;
                    }
                    int i14 = length + i12;
                    z zVar = jVar.f33652Y;
                    if (i14 > zVar.P0()) {
                        if (cVar != null) {
                            cVar.close();
                        }
                        EnumC3606a enumC3606a = EnumC3606a.TOO_BIG;
                        StringBuilder q10 = android.gov.nist.core.a.q("Frame is too big: ", i14, ". Max size is ");
                        q10.append(zVar.P0());
                        b bVar = new b(enumC3606a, q10.toString());
                        dVar.f33615Y = i14;
                        dVar.f33618i0 = 1;
                        if (AbstractC4344b.V(jVar, bVar, dVar) != enumC5000a) {
                            i11 = i14;
                        } else {
                            return enumC5000a;
                        }
                    } else {
                        return jf.y.f36177a;
                    }
                }
                throw new r(i11);
            }
        }
        dVar = new d(jVar, abstractC4825e);
        Object obj2 = dVar.f33616Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = dVar.f33618i0;
        if (i10 == 0) {
        }
        throw new r(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00d9 -> B:14:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(j jVar, AbstractC4825e abstractC4825e) {
        e eVar;
        int i10;
        C1171d c1171d;
        j jVar2;
        C1171d c1171d2;
        jVar.getClass();
        if (abstractC4825e instanceof e) {
            eVar = (e) abstractC4825e;
            int i11 = eVar.f33623j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f33623j0 = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f33621h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar.f33623j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                c1171d = eVar.f33620Z;
                                jVar2 = eVar.f33619Y;
                                N.B0(obj);
                                j jVar3 = jVar2;
                                c1171d2 = c1171d;
                                jVar = jVar3;
                                eVar.f33619Y = jVar;
                                eVar.f33620Z = c1171d2;
                                eVar.f33623j0 = 1;
                                obj = c1171d2.a(eVar);
                                if (obj != enumC5000a) {
                                    C1171d c1171d3 = c1171d2;
                                    jVar2 = jVar;
                                    c1171d = c1171d3;
                                    if (((Boolean) obj).booleanValue()) {
                                        q qVar = (q) c1171d.b();
                                        Ei.a aVar = k.f33661a;
                                        aVar.c("Sending " + qVar + " from session " + jVar2);
                                        if (qVar instanceof m) {
                                            b n02 = N.n0((m) qVar);
                                            eVar.f33619Y = null;
                                            eVar.f33620Z = null;
                                            eVar.f33623j0 = 2;
                                            if (jVar2.d(n02, null, eVar) == enumC5000a) {
                                                return enumC5000a;
                                            }
                                        } else {
                                            if ((qVar instanceof p) || (qVar instanceof l)) {
                                                Iterator it = jVar2.f33657k0.iterator();
                                                if (it.hasNext()) {
                                                    AbstractC2469q0.p(it.next());
                                                    throw null;
                                                }
                                            }
                                            D d02 = jVar2.f33652Y.d0();
                                            eVar.f33619Y = jVar2;
                                            eVar.f33620Z = c1171d;
                                            eVar.f33623j0 = 3;
                                            if (d02.n(qVar, eVar) == enumC5000a) {
                                                return enumC5000a;
                                            }
                                            j jVar32 = jVar2;
                                            c1171d2 = c1171d;
                                            jVar = jVar32;
                                            eVar.f33619Y = jVar;
                                            eVar.f33620Z = c1171d2;
                                            eVar.f33623j0 = 1;
                                            obj = c1171d2.a(eVar);
                                            if (obj != enumC5000a) {
                                            }
                                        }
                                    }
                                    return jf.y.f36177a;
                                }
                                return enumC5000a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        N.B0(obj);
                        return jf.y.f36177a;
                    }
                    c1171d = eVar.f33620Z;
                    jVar2 = eVar.f33619Y;
                    N.B0(obj);
                    if (((Boolean) obj).booleanValue()) {
                    }
                    return jf.y.f36177a;
                }
                N.B0(obj);
                Pg.k kVar = jVar.f33655i0;
                kVar.getClass();
                c1171d2 = new C1171d(kVar);
                eVar.f33619Y = jVar;
                eVar.f33620Z = c1171d2;
                eVar.f33623j0 = 1;
                obj = c1171d2.a(eVar);
                if (obj != enumC5000a) {
                }
            }
        }
        eVar = new e(jVar, abstractC4825e);
        Object obj2 = eVar.f33621h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = eVar.f33623j0;
        if (i10 == 0) {
        }
    }

    @Override // io.ktor.websocket.z
    public final void F0(long j6) {
        this.f33652Y.F0(j6);
    }

    @Override // io.ktor.websocket.z
    public final Object H0(m mVar, A a5) {
        Object n10 = d0().n(mVar, a5);
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        jf.y yVar = jf.y.f36177a;
        if (n10 != enumC5000a) {
            n10 = yVar;
        }
        if (n10 == enumC5000a) {
            return n10;
        }
        return yVar;
    }

    @Override // io.ktor.websocket.z
    public final long P0() {
        return this.f33652Y.P0();
    }

    public final void c() {
        Pg.k kVar;
        long j6 = this.f33659m0;
        if (this.closed != 0 || j6 <= 0) {
            kVar = null;
        } else {
            D d02 = this.f33652Y.d0();
            long j10 = this.f33660n0;
            g gVar = new g(this, null);
            E e10 = y.f33700a;
            AbstractC3557B.c0("outgoing", d02);
            C1079o0 n10 = Ad.l.n();
            kVar = Bi.c.d(Integer.MAX_VALUE, null, 6);
            Ad.l.O0(this, AbstractC4344b.Q0(n10, y.f33701b), null, new w(j6, j10, gVar, kVar, d02, null), 2);
            AbstractC4829i abstractC4829i = this.f33658l0.get(C1071k0.f12951Y);
            AbstractC3557B.Z(abstractC4829i);
            ((AbstractC1073l0) abstractC4829i).V(new C4641n(n10, 2));
        }
        D d10 = (D) f33648o0.getAndSet(this, kVar);
        if (d10 != null) {
            d10.l(null);
        }
        if (kVar != null) {
            boolean z10 = kVar.t(f33651r0) instanceof Pg.r;
        }
        if (this.closed != 0 && kVar != null) {
            c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(b bVar, Throwable th2, AbstractC4825e abstractC4825e) {
        i iVar;
        int i10;
        Throwable th3;
        j jVar;
        if (abstractC4825e instanceof i) {
            iVar = (i) abstractC4825e;
            int i11 = iVar.f33647k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                iVar.f33647k0 = i11 - Integer.MIN_VALUE;
                Object obj = iVar.f33645i0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = iVar.f33647k0;
                jf.y yVar = jf.y.f36177a;
                if (i10 == 0) {
                    if (i10 == 1) {
                        bVar = iVar.f33644h0;
                        th2 = iVar.f33643Z;
                        jVar = iVar.f33642Y;
                        try {
                            N.B0(obj);
                        } catch (Throwable th4) {
                            th3 = th4;
                            jVar.f33653Z.b0(bVar);
                            if (th2 != null) {
                            }
                            throw th3;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    if (!f33649p0.compareAndSet(this, 0, 1)) {
                        return yVar;
                    }
                    Ei.a aVar = k.f33661a;
                    aVar.c("Sending Close Sequence for session " + this + " with reason " + bVar + " and exception " + th2);
                    this.f33656j0.q0();
                    if (bVar == null) {
                        bVar = new b(EnumC3606a.NORMAL, "");
                    }
                    try {
                        c();
                        short s10 = bVar.f33613a;
                        LinkedHashMap linkedHashMap = EnumC3606a.f33606Z;
                        if (s10 != 1006) {
                            D d02 = this.f33652Y.d0();
                            m mVar = new m(bVar);
                            iVar.f33642Y = this;
                            iVar.f33643Z = th2;
                            iVar.f33644h0 = bVar;
                            iVar.f33647k0 = 1;
                            if (d02.n(mVar, iVar) == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                        jVar = this;
                    } catch (Throwable th5) {
                        th3 = th5;
                        jVar = this;
                        jVar.f33653Z.b0(bVar);
                        if (th2 != null) {
                            jVar.f33655i0.o(th2, false);
                            jVar.f33654h0.o(th2, false);
                        }
                        throw th3;
                    }
                }
                jVar.f33653Z.b0(bVar);
                if (th2 != null) {
                    jVar.f33655i0.o(th2, false);
                    jVar.f33654h0.o(th2, false);
                }
                return yVar;
            }
        }
        iVar = new i(this, abstractC4825e);
        Object obj2 = iVar.f33645i0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = iVar.f33647k0;
        jf.y yVar2 = jf.y.f36177a;
        if (i10 == 0) {
        }
        jVar.f33653Z.b0(bVar);
        if (th2 != null) {
        }
        return yVar2;
    }

    @Override // io.ktor.websocket.z
    public final D d0() {
        return this.f33655i0;
    }

    @Override // Ng.F
    public final AbstractC4831k i() {
        return this.f33658l0;
    }

    @Override // io.ktor.websocket.z
    public final C r() {
        return this.f33654h0;
    }

    @Override // io.ktor.websocket.z
    public final Object u0(A a5) {
        Object u02 = this.f33652Y.u0(a5);
        if (u02 == EnumC5000a.f41328Y) {
            return u02;
        }
        return jf.y.f36177a;
    }

    @Override // io.ktor.websocket.c
    public final void w0(List list) {
        if (f33650q0.compareAndSet(this, 0, 1)) {
            Ei.a aVar = k.f33661a;
            aVar.c("Starting default WebSocketSession(" + this + ") with negotiated extensions: " + kf.t.m2(list, null, null, null, null, 63));
            this.f33657k0.addAll(list);
            c();
            E e10 = y.f33700a;
            Pg.k kVar = this.f33655i0;
            AbstractC3557B.c0("outgoing", kVar);
            Pg.k d10 = Bi.c.d(5, null, 6);
            Ad.l.O0(this, y.f33700a, null, new x(d10, kVar, null), 2);
            E e11 = k.f33662b;
            M0 m02 = Q.f12905b;
            Ad.l.O0(this, e11.plus(m02), null, new f(this, d10, null), 2);
            Ad.l.N0(this, k.f33663c.plus(m02), G.f12870i0, new h(this, null));
            return;
        }
        throw new IllegalStateException(("WebSocket session " + this + " is already started.").toString());
    }
}
