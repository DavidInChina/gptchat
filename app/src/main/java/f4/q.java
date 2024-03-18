package f4;

import Ng.AbstractC1073l0;
import Ng.B;
import Ng.E0;
import Ng.Q;
import Sg.C1394f;
import U3.u;
import Wh.s;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.lifecycle.S;
import com.google.android.gms.internal.play_billing.N;
import g4.C3189q;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.AbstractC3957g;
import jf.C3959i;
import jf.C3963m;
import k4.C4159a;
import k4.C4167i;
import kf.t;
import l8.AbstractC4344b;
import m4.C4560a;
import n4.C4715a;
import nf.AbstractC4825e;
import of.EnumC5000a;
import q4.C5270a;
import s4.AbstractC5575a;

/* loaded from: classes.dex */
public final class q implements i {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29632a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.c f29633b;

    /* renamed from: c  reason: collision with root package name */
    public final AbstractC3957g f29634c;

    /* renamed from: d  reason: collision with root package name */
    public final AbstractC3957g f29635d;

    /* renamed from: e  reason: collision with root package name */
    public final u4.i f29636e;

    /* renamed from: f  reason: collision with root package name */
    public final C1394f f29637f;

    /* renamed from: g  reason: collision with root package name */
    public final u f29638g;

    /* renamed from: h  reason: collision with root package name */
    public final c f29639h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f29640i;

    public q(Context context, q4.c cVar, C3963m c3963m, C3963m c3963m2, C3963m c3963m3, c cVar2, u4.i iVar) {
        this.f29632a = context;
        this.f29633b = cVar;
        this.f29634c = c3963m;
        this.f29635d = c3963m2;
        this.f29636e = iVar;
        E0 z10 = Bi.c.z();
        Tg.e eVar = Q.f12904a;
        this.f29637f = Ad.l.g(AbstractC4344b.Q0(z10, ((Og.d) Sg.u.f16684a).f13759j0).plus(new p(this)));
        u4.k kVar = new u4.k(this);
        u uVar = new u(this, kVar);
        this.f29638g = uVar;
        b bVar = new b(cVar2);
        bVar.b(new C4715a(2), s.class);
        bVar.b(new C4715a(5), String.class);
        bVar.b(new C4715a(1), Uri.class);
        bVar.b(new C4715a(4), Uri.class);
        bVar.b(new C4715a(3), Integer.class);
        bVar.b(new C4715a(0), byte[].class);
        C3959i c3959i = new C3959i(new Object(), Uri.class);
        ArrayList arrayList = bVar.f29590c;
        arrayList.add(c3959i);
        arrayList.add(new C3959i(new C4560a(iVar.f46398a), File.class));
        bVar.a(new C4167i(c3963m3, c3963m2, iVar.f46400c), Uri.class);
        bVar.a(new C4159a(5), File.class);
        bVar.a(new C4159a(0), Uri.class);
        bVar.a(new C4159a(3), Uri.class);
        bVar.a(new C4159a(6), Uri.class);
        bVar.a(new C4159a(4), Drawable.class);
        bVar.a(new C4159a(1), Bitmap.class);
        bVar.a(new C4159a(2), ByteBuffer.class);
        h4.c cVar3 = new h4.c(iVar.f46401d, iVar.f46402e);
        ArrayList arrayList2 = bVar.f29592e;
        arrayList2.add(cVar3);
        List S12 = A7.b.S1(bVar.f29588a);
        this.f29639h = new c(S12, A7.b.S1(bVar.f29589b), A7.b.S1(arrayList), A7.b.S1(bVar.f29591d), A7.b.S1(arrayList2));
        this.f29640i = t.x2(new l4.i(this, kVar, uVar), S12);
        new AtomicBoolean(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:2|(2:4|(12:6|8|(5:(1:(1:(10:13|96|14|15|103|68|(1:70)(2:74|(1:76))|77|78|87)(2:18|19))(7:20|93|21|22|100|65|(1:108)(7:67|103|68|(0)(0)|77|78|87)))(4:26|98|27|28)|25|102|83|(4:85|86|78|87)(2:88|89))(4:31|95|32|(3:34|(2:36|(1:106))|40)(2:81|82))|104|41|(3:43|(2:45|(1:47))(1:50)|(6:52|(1:55)(1:58)|59|(1:61)|62|(1:107)(4:64|100|65|(0)(0))))|53|(0)(0)|59|(0)|62|(0)(0)))|7|8|(0)(0)|104|41|(0)|53|(0)(0)|59|(0)|62|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e4, code lost:
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fd, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1 A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:41:0x00c7, B:43:0x00d1, B:45:0x00d5, B:47:0x00dd, B:52:0x00eb, B:55:0x00f1, B:58:0x00ff, B:59:0x010b, B:61:0x010f, B:62:0x0112), top: B:104:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1 A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:41:0x00c7, B:43:0x00d1, B:45:0x00d5, B:47:0x00dd, B:52:0x00eb, B:55:0x00f1, B:58:0x00ff, B:59:0x010b, B:61:0x010f, B:62:0x0112), top: B:104:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ff A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:41:0x00c7, B:43:0x00d1, B:45:0x00d5, B:47:0x00dd, B:52:0x00eb, B:55:0x00f1, B:58:0x00ff, B:59:0x010b, B:61:0x010f, B:62:0x0112), top: B:104:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010f A[Catch: all -> 0x00fd, TryCatch #7 {all -> 0x00fd, blocks: (B:41:0x00c7, B:43:0x00d1, B:45:0x00d5, B:47:0x00dd, B:52:0x00eb, B:55:0x00f1, B:58:0x00ff, B:59:0x010b, B:61:0x010f, B:62:0x0112), top: B:104:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e A[Catch: all -> 0x016d, TryCatch #6 {all -> 0x016d, blocks: (B:68:0x0158, B:70:0x015e, B:74:0x016f, B:76:0x0173), top: B:103:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016f A[Catch: all -> 0x016d, TryCatch #6 {all -> 0x016d, blocks: (B:68:0x0158, B:70:0x015e, B:74:0x016f, B:76:0x0173), top: B:103:0x0158 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0198 A[Catch: all -> 0x01b8, TRY_LEAVE, TryCatch #5 {all -> 0x01b8, blocks: (B:83:0x0194, B:85:0x0198, B:88:0x01af, B:89:0x01b7), top: B:102:0x0194 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01af A[Catch: all -> 0x01b8, TRY_ENTER, TryCatch #5 {all -> 0x01b8, blocks: (B:83:0x0194, B:85:0x0198, B:88:0x01af, B:89:0x01b7), top: B:102:0x0194 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(q qVar, q4.j jVar, int i10, AbstractC4825e abstractC4825e) {
        n nVar;
        EnumC5000a enumC5000a;
        int i11;
        e eVar;
        q4.p pVar;
        q4.j jVar2;
        q4.j jVar3;
        o4.f fVar;
        Bitmap bitmap;
        Drawable drawable;
        AbstractC5575a abstractC5575a;
        Object j6;
        Bitmap bitmap2;
        q4.j jVar4;
        e eVar2;
        o4.d dVar;
        q4.k kVar;
        q4.p pVar2;
        q qVar2;
        q qVar3 = qVar;
        qVar.getClass();
        if (abstractC4825e instanceof n) {
            nVar = (n) abstractC4825e;
            int i12 = nVar.f29624m0;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                nVar.f29624m0 = i12 - Integer.MIN_VALUE;
                Object obj = nVar.f29622k0;
                enumC5000a = EnumC5000a.f41328Y;
                i11 = nVar.f29624m0;
                if (i11 == 0) {
                    try {
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 == 3) {
                                    e eVar3 = nVar.f29620i0;
                                    jVar3 = nVar.f29619h0;
                                    pVar2 = nVar.f29618Z;
                                    q qVar4 = nVar.f29617Y;
                                    try {
                                        N.B0(obj);
                                        pVar = pVar2;
                                        eVar2 = eVar3;
                                        qVar3 = qVar4;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        eVar = eVar3;
                                        qVar3 = qVar4;
                                    }
                                    try {
                                        kVar = (q4.k) obj;
                                        if (!(kVar instanceof q4.q)) {
                                            AbstractC5575a abstractC5575a2 = jVar3.f43844c;
                                            qVar3.getClass();
                                            d((q4.q) kVar, abstractC5575a2, eVar2);
                                        } else if (kVar instanceof q4.e) {
                                            AbstractC5575a abstractC5575a3 = jVar3.f43844c;
                                            qVar3.getClass();
                                            c((q4.e) kVar, abstractC5575a3, eVar2);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        eVar = eVar2;
                                        pVar2 = pVar;
                                        if (th instanceof CancellationException) {
                                        }
                                    }
                                    return r0;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Bitmap bitmap3 = nVar.f29621j0;
                            eVar2 = nVar.f29620i0;
                            jVar4 = nVar.f29619h0;
                            pVar = nVar.f29618Z;
                            qVar2 = nVar.f29617Y;
                            try {
                                N.B0(obj);
                                bitmap2 = bitmap3;
                                qVar3 = qVar2;
                            } catch (Throwable th4) {
                                th = th4;
                                eVar = eVar2;
                                jVar3 = jVar4;
                            }
                            try {
                                eVar2.getClass();
                                B b10 = jVar4.f43864w;
                                o oVar = new o(jVar4, qVar3, (r4.h) obj, eVar2, bitmap2, null);
                                nVar.f29617Y = qVar3;
                                nVar.f29618Z = pVar;
                                nVar.f29619h0 = jVar4;
                                nVar.f29620i0 = eVar2;
                                nVar.f29621j0 = null;
                                nVar.f29624m0 = 3;
                                obj = Ad.l.n1(nVar, b10, oVar);
                            } catch (Throwable th5) {
                                th = th5;
                                eVar = eVar2;
                                jVar3 = jVar4;
                                pVar2 = pVar;
                                if (th instanceof CancellationException) {
                                }
                            }
                            if (obj == enumC5000a) {
                                jVar3 = jVar4;
                                kVar = (q4.k) obj;
                                if (!(kVar instanceof q4.q)) {
                                }
                                return r0;
                            }
                            return enumC5000a;
                        }
                        e eVar4 = nVar.f29620i0;
                        jVar2 = nVar.f29619h0;
                        pVar = nVar.f29618Z;
                        qVar2 = nVar.f29617Y;
                        try {
                            N.B0(obj);
                            eVar = eVar4;
                            qVar3 = qVar2;
                        } catch (Throwable th6) {
                            th = th6;
                            eVar = eVar4;
                            jVar3 = jVar2;
                        }
                        if (th instanceof CancellationException) {
                            qVar3.f29638g.getClass();
                            q4.e k10 = u.k(jVar3, th);
                            c(k10, jVar3.f43844c, eVar);
                            C5270a c5270a = (C5270a) pVar2;
                            c5270a.f43745Y.g(c5270a);
                            q4.e eVar5 = k10;
                            return eVar5;
                        }
                        qVar3.getClass();
                        eVar.getClass();
                        q4.i iVar = jVar3.f43845d;
                        throw th;
                    } finally {
                        C5270a c5270a2 = (C5270a) pVar2;
                        c5270a2.f43745Y.g(c5270a2);
                    }
                    pVar2 = pVar;
                    qVar3 = qVar2;
                } else {
                    N.B0(obj);
                    AbstractC1073l0 v02 = Ad.l.v0(nVar.getContext());
                    qVar3.f29638g.getClass();
                    S s10 = jVar.f43829A;
                    C5270a c5270a3 = new C5270a(s10, v02);
                    q4.h a5 = q4.j.a(jVar);
                    a5.f43804b = qVar3.f29633b;
                    a5.f43802O = null;
                    jVar2 = a5.a();
                    eVar = e.f29598a;
                    try {
                        if (jVar2.f43843b != q4.l.f43868a) {
                            s10.a(c5270a3);
                            if (i10 == 0) {
                                S s11 = jVar2.f43829A;
                                nVar.f29617Y = qVar3;
                                nVar.f29618Z = c5270a3;
                                nVar.f29619h0 = jVar2;
                                nVar.f29620i0 = eVar;
                                nVar.f29624m0 = 1;
                                if (AbstractC4344b.O(s11, nVar) == enumC5000a) {
                                    return enumC5000a;
                                }
                            }
                            pVar = c5270a3;
                        } else {
                            throw new RuntimeException("The request's data is null.");
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        jVar3 = jVar2;
                        pVar2 = c5270a3;
                    }
                }
                fVar = (o4.f) qVar3.f29634c.getValue();
                if (fVar != null) {
                    o4.c cVar = jVar2.f43833E;
                    if (cVar != null) {
                        dVar = fVar.f40586a.a(cVar);
                        if (dVar == null) {
                            dVar = fVar.f40587b.a(cVar);
                        }
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        bitmap = dVar.f40582a;
                        if (bitmap != null) {
                            drawable = new BitmapDrawable(jVar2.f43842a.getResources(), bitmap);
                        } else {
                            drawable = u4.d.b(jVar2, jVar2.f43835G, jVar2.f43834F, jVar2.f43841M.f43762j);
                        }
                        abstractC5575a = jVar2.f43844c;
                        if (abstractC5575a != null) {
                            abstractC5575a.a(drawable);
                        }
                        eVar.getClass();
                        r4.i iVar2 = jVar2.f43830B;
                        nVar.f29617Y = qVar3;
                        nVar.f29618Z = pVar;
                        nVar.f29619h0 = jVar2;
                        nVar.f29620i0 = eVar;
                        nVar.f29621j0 = bitmap;
                        nVar.f29624m0 = 2;
                        j6 = iVar2.j(nVar);
                        if (j6 != enumC5000a) {
                            bitmap2 = bitmap;
                            obj = j6;
                            jVar4 = jVar2;
                            eVar2 = eVar;
                            eVar2.getClass();
                            B b102 = jVar4.f43864w;
                            o oVar2 = new o(jVar4, qVar3, (r4.h) obj, eVar2, bitmap2, null);
                            nVar.f29617Y = qVar3;
                            nVar.f29618Z = pVar;
                            nVar.f29619h0 = jVar4;
                            nVar.f29620i0 = eVar2;
                            nVar.f29621j0 = null;
                            nVar.f29624m0 = 3;
                            obj = Ad.l.n1(nVar, b102, oVar2);
                            if (obj == enumC5000a) {
                            }
                        } else {
                            return enumC5000a;
                        }
                    }
                }
                bitmap = null;
                if (bitmap != null) {
                }
                abstractC5575a = jVar2.f43844c;
                if (abstractC5575a != null) {
                }
                eVar.getClass();
                r4.i iVar22 = jVar2.f43830B;
                nVar.f29617Y = qVar3;
                nVar.f29618Z = pVar;
                nVar.f29619h0 = jVar2;
                nVar.f29620i0 = eVar;
                nVar.f29621j0 = bitmap;
                nVar.f29624m0 = 2;
                j6 = iVar22.j(nVar);
                if (j6 != enumC5000a) {
                }
            }
        }
        nVar = new n(qVar3, abstractC4825e);
        Object obj2 = nVar.f29622k0;
        enumC5000a = EnumC5000a.f41328Y;
        i11 = nVar.f29624m0;
        if (i11 == 0) {
        }
        fVar = (o4.f) qVar3.f29634c.getValue();
        if (fVar != null) {
        }
        bitmap = null;
        if (bitmap != null) {
        }
        abstractC5575a = jVar2.f43844c;
        if (abstractC5575a != null) {
        }
        eVar.getClass();
        r4.i iVar222 = jVar2.f43830B;
        nVar.f29617Y = qVar3;
        nVar.f29618Z = pVar;
        nVar.f29619h0 = jVar2;
        nVar.f29620i0 = eVar;
        nVar.f29621j0 = bitmap;
        nVar.f29624m0 = 2;
        j6 = iVar222.j(nVar);
        if (j6 != enumC5000a) {
        }
    }

    public static void c(q4.e eVar, AbstractC5575a abstractC5575a, e eVar2) {
        q4.j jVar = eVar.f43784b;
        if (abstractC5575a instanceof C3189q) {
            t4.f a5 = jVar.f43854m.a((C3189q) abstractC5575a, eVar);
            if (a5 instanceof t4.d) {
                abstractC5575a.getClass();
            } else {
                eVar2.getClass();
                a5.a();
            }
        }
        eVar2.getClass();
        q4.i iVar = jVar.f43845d;
    }

    public static void d(q4.q qVar, AbstractC5575a abstractC5575a, e eVar) {
        q4.j jVar = qVar.f43887b;
        if (abstractC5575a instanceof C3189q) {
            t4.f a5 = jVar.f43854m.a((C3189q) abstractC5575a, qVar);
            if (a5 instanceof t4.d) {
                abstractC5575a.getClass();
            } else {
                eVar.getClass();
                a5.a();
            }
        }
        eVar.getClass();
        q4.i iVar = jVar.f43845d;
    }

    public final Object b(q4.j jVar, AbstractC4825e abstractC4825e) {
        return Ad.l.e0(new m(this, jVar, null), abstractC4825e);
    }
}
