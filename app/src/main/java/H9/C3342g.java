package h9;

import android.os.Handler;
import android.os.Looper;
import com.datadog.android.rum.DdRumContentProvider;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.ExperimentKey;
import com.openai.experiment.G;
import com.openai.experiment.t;
import i6.C3481a;
import id.AbstractC3557B;
import io.opentracing.util.GlobalTracer;
import j9.C3926b;
import j9.C3927c;
import java.util.LinkedHashMap;
import java.util.Map;
import jf.C3959i;
import jf.y;
import k6.C4199i;
import kf.AbstractC4268D;
import l9.C4355c;
import nf.AbstractC4825e;
import o5.AbstractC4918b;
import o6.C4943w;
import of.EnumC5000a;
import p5.AbstractC5091c;
import p5.AbstractC5092d;
import p5.C5089a;
import p5.EnumC5090b;
import pf.AbstractC5163j;
import r6.C5370b;
import wd.C6205s;
import wf.n;

/* renamed from: h9.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3342g extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public C4355c f31970Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f31971Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f31972h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f31973i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f31974j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C3343h f31975k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3342g(C3343h c3343h, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31975k0 = c3343h;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3342g c3342g = new C3342g(this.f31975k0, abstractC4825e);
        c3342g.f31974j0 = obj;
        return c3342g;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C3342g) create((C6205s) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e9 A[LOOP:0: B:55:0x01e3->B:57:0x01e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0247  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean booleanValue;
        boolean z10;
        V5.c cVar;
        i6.f a5;
        boolean z11;
        r5.d dVar;
        AbstractC5091c abstractC5091c;
        Object obj3;
        C6205s c6205s;
        C4355c c4355c;
        String str;
        String str2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31973i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    obj2 = obj;
                    booleanValue = ((Boolean) obj2).booleanValue();
                    C4355c c4355c2 = this.f31975k0.f31979d;
                    if (booleanValue) {
                        i6.e eVar = c4355c2.f37895d;
                        AbstractC5092d a10 = AbstractC4918b.a(null);
                        AbstractC3557B.c0("rumConfiguration", eVar);
                        if (!(a10 instanceof u5.g)) {
                            if (a10 instanceof r5.d) {
                                dVar = (r5.d) a10;
                            } else {
                                dVar = null;
                            }
                            if (dVar == null || (abstractC5091c = dVar.l()) == null) {
                                AbstractC5091c.f42742a.getClass();
                                abstractC5091c = C5089a.f42737b;
                            }
                            P4.a.m0(abstractC5091c, 5, EnumC5090b.f42738Y, C3481a.f32717h0, null, false, 56);
                        } else if (Lg.n.n2(eVar.f32729a)) {
                            P4.a.m0(((u5.g) a10).l(), 5, EnumC5090b.f42738Y, C3481a.f32718i0, null, false, 56);
                        } else {
                            u5.g gVar = (u5.g) a10;
                            if (gVar.h("rum") != null) {
                                P4.a.m0(gVar.l(), 4, EnumC5090b.f42738Y, C3481a.f32719j0, null, false, 56);
                            } else {
                                C4199i c4199i = new C4199i((r5.d) a10, eVar.f32729a, eVar.f32730b);
                                gVar.i(c4199i);
                                z10 = booleanValue;
                                C5370b c5370b = new C5370b(c4199i.f37141b, gVar, c4199i.f37146g, c4199i.f37149j, c4199i.f37150k, c4199i.f37144e, new Handler(Looper.getMainLooper()), new A6.c(gVar, new S5.c(c4199i.f37147h), new S5.c(c4199i.f37148i)), gVar.m(), c4199i.f37154o, c4199i.f37155p, c4199i.f37156q, c4199i.f37157r);
                                LinkedHashMap linkedHashMap = i6.b.f32721a;
                                synchronized (linkedHashMap) {
                                    try {
                                        if (linkedHashMap.containsKey(a10)) {
                                            P4.a.m0(((r5.d) a10).l(), 4, EnumC5090b.f42738Y, C3481a.f32716Z, null, false, 56);
                                        } else {
                                            linkedHashMap.put(a10, c5370b);
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                if (DdRumContentProvider.f26755Y == 100) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                c5370b.d(new C4943w(z11, ((Number) c5370b.f44449e.f37106a.getValue()).longValue()));
                                a5 = i6.b.a(AbstractC4918b.a(null));
                                for (Map.Entry entry : C4355c.f37891e.entrySet()) {
                                    a5.n((String) entry.getKey(), entry.getValue());
                                }
                                C6.f fVar = c4355c2.f37894c;
                                AbstractC5092d a11 = AbstractC4918b.a(null);
                                AbstractC3557B.c0("traceConfiguration", fVar);
                                r5.d dVar2 = (r5.d) a11;
                                dVar2.i(new E6.a(dVar2, fVar.f2717a, fVar.f2718b, fVar.f2719c));
                                C6.d dVar3 = new C6.d(AbstractC4918b.a(null));
                                dVar3.f2709e = A7.b.W0(c4355c2.f37892a);
                                dVar3.f2708d = true;
                                GlobalTracer.a(dVar3.a());
                            }
                        }
                        z10 = booleanValue;
                        a5 = i6.b.a(AbstractC4918b.a(null));
                        while (r2.hasNext()) {
                        }
                        C6.f fVar2 = c4355c2.f37894c;
                        AbstractC5092d a112 = AbstractC4918b.a(null);
                        AbstractC3557B.c0("traceConfiguration", fVar2);
                        r5.d dVar22 = (r5.d) a112;
                        dVar22.i(new E6.a(dVar22, fVar2.f2717a, fVar2.f2718b, fVar2.f2719c));
                        C6.d dVar32 = new C6.d(AbstractC4918b.a(null));
                        dVar32.f2709e = A7.b.W0(c4355c2.f37892a);
                        dVar32.f2708d = true;
                        GlobalTracer.a(dVar32.a());
                    } else {
                        z10 = booleanValue;
                        c4355c2.getClass();
                    }
                    C3927c c3927c = this.f31975k0.f31980e;
                    if (z10) {
                        cVar = c3927c.f36083b;
                    } else {
                        C3926b c3926b = C3926b.f36080h0;
                        c3927c.getClass();
                        cVar = C3927c.f(c3926b);
                    }
                    c3927c.f36084c = cVar;
                    return y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = this.f31972h0;
            str = this.f31971Z;
            c4355c = this.f31970Y;
            c6205s = (C6205s) this.f31974j0;
            N.B0(obj);
            obj3 = obj;
        } else {
            N.B0(obj);
            c6205s = (C6205s) this.f31974j0;
            c4355c = this.f31975k0.f31979d;
            str = c6205s.f48458b.f48352a;
            str2 = c6205s.a();
            if (str2 == null) {
                str2 = null;
            }
            Lc.e eVar2 = this.f31975k0.f31981f;
            this.f31974j0 = c6205s;
            this.f31970Y = c4355c;
            this.f31971Z = str;
            this.f31972h0 = str2;
            this.f31973i0 = 1;
            obj3 = eVar2.a(this);
            if (obj3 == enumC5000a) {
                return enumC5000a;
            }
        }
        String str3 = (String) obj3;
        String str4 = c6205s.f48458b.f48353b;
        String c10 = c6205s.c();
        c4355c.getClass();
        AbstractC3557B.c0("deviceId", str3);
        AbstractC3557B.c0("email", str4);
        AbstractC4918b.c(str, str4, AbstractC4268D.a1(new C3959i("account_id", str2), new C3959i("device_id", str3), new C3959i("plan_type", c10)), 18);
        t tVar = this.f31975k0.f31977b;
        ExperimentKey.HeavyTrafficLogSampling heavyTrafficLogSampling = ExperimentKey.HeavyTrafficLogSampling.INSTANCE;
        this.f31974j0 = null;
        this.f31970Y = null;
        this.f31971Z = null;
        this.f31972h0 = null;
        this.f31973i0 = 2;
        G g10 = (G) tVar;
        g10.getClass();
        obj2 = G.d(g10, heavyTrafficLogSampling, this);
        if (obj2 == enumC5000a) {
            return enumC5000a;
        }
        booleanValue = ((Boolean) obj2).booleanValue();
        C4355c c4355c22 = this.f31975k0.f31979d;
        if (booleanValue) {
        }
        C3927c c3927c2 = this.f31975k0.f31980e;
        if (z10) {
        }
        c3927c2.f36084c = cVar;
        return y.f36177a;
    }
}
