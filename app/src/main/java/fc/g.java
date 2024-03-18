package Fc;

import Df.H;
import Ec.A;
import Ec.B;
import Ec.C;
import Ec.D;
import Ec.E;
import Ec.z;
import Qg.F0;
import Qg.s0;
import Vc.r;
import Vc.s;
import Vc.w;
import Vc.x;
import android.app.Application;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.play_billing.N;
import g.RunnableC3118k;
import id.AbstractC3557B;
import j$.time.DateTimeException;
import j$.time.Instant;
import java.io.Closeable;
import java.io.File;
import java.util.UUID;
import jf.C3963m;
import jf.y;
import lc.C4385I;
import ld.C4428a;
import ld.C4429b;
import nd.C4812a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import rc.C5451O;
import wd.u0;
import x8.W;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class g implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public final xd.g f5205Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Gc.b f5206Z;

    /* renamed from: h0  reason: collision with root package name */
    public final C4428a f5207h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Pc.g f5208i0 = Bi.c.i1(Pc.b.f13931i0);

    /* renamed from: j0  reason: collision with root package name */
    public final F0 f5209j0 = s0.c(A.f4599c);

    /* renamed from: k0  reason: collision with root package name */
    public final Handler f5210k0 = new Handler(Looper.getMainLooper());

    /* renamed from: l0  reason: collision with root package name */
    public final C3963m f5211l0;

    /* renamed from: m0  reason: collision with root package name */
    public h f5212m0;

    public g(Application application, xd.g gVar, Gc.b bVar, C4428a c4428a, C4812a c4812a, C4429b c4429b) {
        this.f5205Y = gVar;
        this.f5206Z = bVar;
        this.f5207h0 = c4428a;
        this.f5211l0 = R4.b.D1(new C4385I(c4812a, application, c4429b, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        c cVar;
        int i10;
        Yg.p pVar;
        g gVar;
        h hVar;
        try {
            if (abstractC4825e instanceof c) {
                cVar = (c) abstractC4825e;
                int i11 = cVar.f5191j0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    cVar.f5191j0 = i11 - Integer.MIN_VALUE;
                    Object obj = cVar.f5189h0;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = cVar.f5191j0;
                    y yVar = y.f36177a;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            pVar = cVar.f5188Z;
                            gVar = cVar.f5187Y;
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        F0 f02 = this.f5209j0;
                        if (f02.getValue() instanceof C) {
                            return new u0(yVar);
                        }
                        Yg.p.Companion.getClass();
                        Yg.p pVar2 = new Yg.p(AbstractC6463a.n("instant(...)"));
                        C c10 = new C(0, pVar2);
                        cVar.f5187Y = this;
                        cVar.f5188Z = pVar2;
                        cVar.f5191j0 = 1;
                        f02.setValue(c10);
                        if (yVar == enumC5000a) {
                            return enumC5000a;
                        }
                        gVar = this;
                        pVar = pVar2;
                    }
                    hVar = gVar.f5212m0;
                    if (hVar != null) {
                        hVar.close();
                    }
                    UUID randomUUID = UUID.randomUUID();
                    File file = new File((File) gVar.f5211l0.getValue(), randomUUID + ".m4a");
                    MediaRecorder mediaRecorder = new MediaRecorder();
                    mediaRecorder.setAudioSource(1);
                    mediaRecorder.setOutputFormat(2);
                    mediaRecorder.setAudioEncoder(1);
                    mediaRecorder.setOutputFile(file.getPath());
                    mediaRecorder.prepare();
                    mediaRecorder.start();
                    gVar.f5212m0 = new h(file, mediaRecorder, pVar, 0);
                    new RunnableC3118k(19, gVar).run();
                    return new u0(yVar);
                }
            }
            mediaRecorder.setAudioSource(1);
            mediaRecorder.setOutputFormat(2);
            mediaRecorder.setAudioEncoder(1);
            mediaRecorder.setOutputFile(file.getPath());
            mediaRecorder.prepare();
            mediaRecorder.start();
            gVar.f5212m0 = new h(file, mediaRecorder, pVar, 0);
            new RunnableC3118k(19, gVar).run();
            return new u0(yVar);
        } catch (Exception e10) {
            W.W(gVar.f5208i0, "MediaRecorder failed", e10, null, 4);
            gVar.close();
            return new wd.s0(0, e10);
        }
        cVar = new c(this, abstractC4825e);
        Object obj2 = cVar.f5189h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f5191j0;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        hVar = gVar.f5212m0;
        if (hVar != null) {
        }
        UUID randomUUID2 = UUID.randomUUID();
        File file2 = new File((File) gVar.f5211l0.getValue(), randomUUID2 + ".m4a");
        MediaRecorder mediaRecorder2 = new MediaRecorder();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Ad.l.O0(this.f5207h0, null, null, new a(this, null), 3);
        this.f5210k0.removeCallbacksAndMessages(null);
        h hVar = this.f5212m0;
        if (hVar != null) {
            hVar.close();
        }
        this.f5212m0 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(AbstractC4825e abstractC4825e) {
        d dVar;
        EnumC5000a enumC5000a;
        int i10;
        g gVar;
        h hVar;
        h hVar2;
        x xVar;
        Object obj;
        Ec.n nVar;
        g gVar2;
        Object m02;
        if (abstractC4825e instanceof d) {
            dVar = (d) abstractC4825e;
            int i11 = dVar.f5197k0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f5197k0 = i11 - Integer.MIN_VALUE;
                Object obj2 = dVar.f5195i0;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = dVar.f5197k0;
                y yVar = y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    h hVar3 = (h) dVar.f5192Y;
                                    N.B0(obj2);
                                    return yVar;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            hVar2 = dVar.f5194h0;
                            hVar = (h) dVar.f5193Z;
                            gVar = (g) dVar.f5192Y;
                            N.B0(obj2);
                            xVar = (x) obj2;
                            if ((xVar instanceof Vc.q) || (xVar instanceof w)) {
                                hVar2.f5213Y.delete();
                                gVar.f5212m0 = null;
                                if (!(xVar instanceof w)) {
                                    obj = new D(((Gc.f) ((w) xVar).f18565a).f6268a);
                                } else {
                                    obj = A.f4599c;
                                }
                            } else if (!(xVar instanceof s)) {
                                obj = z.f4654a;
                            } else if (xVar instanceof r) {
                                obj = B.f4600a;
                            } else {
                                throw new RuntimeException();
                            }
                            F0 f02 = gVar.f5209j0;
                            dVar.f5192Y = hVar;
                            dVar.f5193Z = null;
                            dVar.f5194h0 = null;
                            dVar.f5197k0 = 4;
                            f02.setValue(obj);
                            if (yVar == enumC5000a) {
                                return enumC5000a;
                            }
                            return yVar;
                        }
                        nVar = (Ec.n) dVar.f5193Z;
                        gVar = (g) dVar.f5192Y;
                        N.B0(obj2);
                        nVar.getClass();
                        Ec.o a5 = Ec.n.a((zd.g) obj2);
                        hVar2 = gVar.f5212m0;
                        if (hVar2 != null) {
                            dVar.f5192Y = gVar;
                            dVar.f5193Z = hVar2;
                            dVar.f5194h0 = hVar2;
                            dVar.f5197k0 = 3;
                            Gc.b bVar = gVar.f5206Z;
                            bVar.getClass();
                            Gc.a aVar = new Gc.a(a5, hVar2.f5213Y, null);
                            Df.w a10 = kotlin.jvm.internal.C.a(Gc.f.class);
                            Je.a n22 = R4.b.n2(H.O(a10), kotlin.jvm.internal.C.f37623a.b(Gc.f.class), a10);
                            Yc.a aVar2 = bVar.f6264a;
                            aVar2.getClass();
                            obj2 = W.S(aVar2, n22, aVar, dVar);
                            if (obj2 == enumC5000a) {
                                return enumC5000a;
                            }
                            hVar = hVar2;
                            xVar = (x) obj2;
                            if (xVar instanceof Vc.q) {
                                if (!(xVar instanceof s)) {
                                }
                                F0 f022 = gVar.f5209j0;
                                dVar.f5192Y = hVar;
                                dVar.f5193Z = null;
                                dVar.f5194h0 = null;
                                dVar.f5197k0 = 4;
                                f022.setValue(obj);
                                if (yVar == enumC5000a) {
                                }
                            }
                            hVar2.f5213Y.delete();
                            gVar.f5212m0 = null;
                            if (!(xVar instanceof w)) {
                            }
                            F0 f0222 = gVar.f5209j0;
                            dVar.f5192Y = hVar;
                            dVar.f5193Z = null;
                            dVar.f5194h0 = null;
                            dVar.f5197k0 = 4;
                            f0222.setValue(obj);
                            if (yVar == enumC5000a) {
                            }
                        }
                        return yVar;
                    }
                    gVar2 = (g) dVar.f5192Y;
                    N.B0(obj2);
                } else {
                    N.B0(obj2);
                    E e10 = E.f4604a;
                    dVar.f5192Y = this;
                    dVar.f5197k0 = 1;
                    this.f5209j0.setValue(e10);
                    if (yVar == enumC5000a) {
                        return enumC5000a;
                    }
                    gVar2 = this;
                }
                Ec.n nVar2 = Ec.o.f4626h0;
                Ia.j jVar = ((C5451O) gVar2.f5205Y).f44814c;
                dVar.f5192Y = gVar2;
                dVar.f5193Z = nVar2;
                dVar.f5197k0 = 2;
                m02 = L4.a.m0(jVar, dVar);
                if (m02 != enumC5000a) {
                    return enumC5000a;
                }
                g gVar3 = gVar2;
                nVar = nVar2;
                obj2 = m02;
                gVar = gVar3;
                nVar.getClass();
                Ec.o a52 = Ec.n.a((zd.g) obj2);
                hVar2 = gVar.f5212m0;
                if (hVar2 != null) {
                }
                return yVar;
            }
        }
        dVar = new d(this, abstractC4825e);
        Object obj22 = dVar.f5195i0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = dVar.f5197k0;
        y yVar2 = y.f36177a;
        if (i10 == 0) {
        }
        Ec.n nVar22 = Ec.o.f4626h0;
        Ia.j jVar2 = ((C5451O) gVar2.f5205Y).f44814c;
        dVar.f5192Y = gVar2;
        dVar.f5193Z = nVar22;
        dVar.f5197k0 = 2;
        m02 = L4.a.m0(jVar2, dVar);
        if (m02 != enumC5000a) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(AbstractC4825e abstractC4825e) {
        f fVar;
        int i10;
        Yg.p pVar;
        Yg.p pVar2;
        if (abstractC4825e instanceof f) {
            fVar = (f) abstractC4825e;
            int i11 = fVar.f5204h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                fVar.f5204h0 = i11 - Integer.MIN_VALUE;
                Object obj = fVar.f5202Y;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = fVar.f5204h0;
                Object obj3 = y.f36177a;
                if (i10 == 0) {
                    if (i10 != 1 && i10 != 2 && i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    this.f5210k0.removeCallbacksAndMessages(null);
                    h hVar = this.f5212m0;
                    if (hVar != null) {
                        MediaRecorder mediaRecorder = hVar.f5214Z;
                        try {
                            mediaRecorder.stop();
                        } catch (Exception e10) {
                            W.W(this.f5208i0, "Failed to stop MediaRecorder", e10, null, 4);
                        }
                        mediaRecorder.release();
                        Mg.a aVar = Mg.b.f12127Z;
                        Mg.d dVar = Mg.d.f12134i0;
                        long x02 = H.x0(1, dVar);
                        Yg.p pVar3 = hVar.f5215h0;
                        pVar3.getClass();
                        try {
                            Instant plusNanos = pVar3.f22419Y.plusSeconds(Mg.b.l(x02, dVar)).plusNanos(Mg.b.f(x02));
                            AbstractC3557B.b0("plusNanos(...)", plusNanos);
                            pVar = new Yg.p(plusNanos);
                        } catch (Exception e11) {
                            if (!(e11 instanceof ArithmeticException) && !(e11 instanceof DateTimeException)) {
                                throw e11;
                            }
                            if (x02 > 0) {
                                pVar2 = Yg.p.f22418j0;
                            } else {
                                pVar2 = Yg.p.f22417i0;
                            }
                            pVar = pVar2;
                        }
                        Yg.p.Companion.getClass();
                        int compareTo = pVar.compareTo(new Yg.p(AbstractC6463a.n("instant(...)")));
                        F0 f02 = this.f5209j0;
                        if (compareTo > 0) {
                            A a5 = A.f4598b;
                            fVar.getClass();
                            fVar.f5204h0 = 1;
                            f02.setValue(a5);
                            if (obj3 == obj2) {
                                return obj2;
                            }
                        } else if (hVar.f5216i0 < 2000) {
                            A a10 = A.f4597a;
                            fVar.getClass();
                            fVar.f5204h0 = 2;
                            f02.setValue(a10);
                            if (obj3 == obj2) {
                                return obj2;
                            }
                        } else {
                            fVar.getClass();
                            fVar.f5204h0 = 3;
                            if (h(fVar) == obj2) {
                                return obj2;
                            }
                        }
                    }
                }
                return obj3;
            }
        }
        fVar = new f(this, abstractC4825e);
        Object obj4 = fVar.f5202Y;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = fVar.f5204h0;
        Object obj32 = y.f36177a;
        if (i10 == 0) {
        }
        return obj32;
    }
}
