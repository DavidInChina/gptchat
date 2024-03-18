package Q3;

import Kd.K;
import L9.F;
import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Qg.AbstractC1206i;
import Qg.AbstractC1207j;
import Qg.C1204h;
import Qg.C1209l;
import Qg.F0;
import Qg.n0;
import Qg.r0;
import Qg.s0;
import Xe.B;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.google.android.gms.internal.play_billing.N;
import com.openai.experiment.G;
import com.openai.experiment.t;
import f9.AbstractC2949a;
import f9.C2954f;
import f9.C2962n;
import f9.w;
import g9.AbstractC3215f;
import he.C3418c;
import id.AbstractC3557B;
import ie.C3574b;
import io.ktor.utils.io.x;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import jf.C3959i;
import jf.C3963m;
import jf.y;
import kf.q;
import kf.v;
import kotlin.jvm.internal.C;
import me.AbstractC4630c;
import me.AbstractC4642o;
import me.C4638k;
import me.C4639l;
import me.C4643p;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rc.C5472v;
import rc.C5476z;
import te.C5760d;
import ve.AbstractC6034c;
import ve.C6035d;
import wf.o;
import xe.AbstractC6416e;
import xe.AbstractC6435x;
import xe.AbstractC6437z;
import xe.C6417f;
import xe.C6433v;
import yf.AbstractC6583a;
import zd.n;
import ze.AbstractC6848g;

/* loaded from: classes.dex */
public final class h extends AbstractC5163j implements o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14411Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f14412Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f14413h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f14414i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f14411Y = i10;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y yVar = y.f36177a;
        switch (this.f14411Y) {
            case 0:
                return t((AbstractC1207j) obj, (Object[]) obj2, (AbstractC4825e) obj3);
            case 1:
                return r((AbstractC1207j) obj, obj2, (AbstractC4825e) obj3);
            case 2:
                return r((AbstractC1207j) obj, obj2, (AbstractC4825e) obj3);
            case 3:
                return r((AbstractC1207j) obj, obj2, (AbstractC4825e) obj3);
            case 4:
                return r((AbstractC1207j) obj, obj2, (AbstractC4825e) obj3);
            case 5:
                return r((AbstractC1207j) obj, obj2, (AbstractC4825e) obj3);
            case 6:
                h hVar = new h(6, (AbstractC4825e) obj3);
                hVar.f14413h0 = (n) obj;
                hVar.f14414i0 = (zd.g) obj2;
                return hVar.invokeSuspend(yVar);
            case 7:
                h hVar2 = new h(7, (AbstractC4825e) obj3);
                hVar2.f14413h0 = (AbstractC1207j) obj;
                hVar2.f14414i0 = (Throwable) obj2;
                return hVar2.invokeSuspend(yVar);
            case 8:
                return r((AbstractC1207j) obj, obj2, (AbstractC4825e) obj3);
            case 9:
                return p((Ie.e) obj, obj2, (AbstractC4825e) obj3);
            case 10:
                h hVar3 = new h(10, (AbstractC4825e) obj3);
                hVar3.f14413h0 = (Ie.e) obj;
                hVar3.f14414i0 = (AbstractC6034c) obj2;
                return hVar3.invokeSuspend(yVar);
            case 11:
                return p((Ie.e) obj, obj2, (AbstractC4825e) obj3);
            case 12:
                h hVar4 = new h(12, (AbstractC4825e) obj3);
                hVar4.f14413h0 = (Ie.e) obj;
                hVar4.f14414i0 = (C6035d) obj2;
                return hVar4.invokeSuspend(yVar);
            case 13:
                return r((AbstractC1207j) obj, obj2, (AbstractC4825e) obj3);
            default:
                return t((AbstractC1207j) obj, (Object[]) obj2, (AbstractC4825e) obj3);
        }
    }

    /* JADX WARN: Type inference failed for: r13v0, types: [Df.q, kotlin.jvm.internal.w] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        c cVar;
        AbstractC1206i abstractC1206i;
        F0 f02;
        F0 f03;
        t c10;
        AbstractC1206i abstractC1206i2;
        AbstractC6848g abstractC6848g;
        C6417f c6417f;
        C5760d c5760d;
        AbstractC1206i abstractC1206i3;
        y yVar = y.f36177a;
        int i10 = 0;
        c cVar2 = null;
        switch (this.f14411Y) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                int i11 = this.f14412Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                AbstractC1207j abstractC1207j = (AbstractC1207j) this.f14413h0;
                c[] cVarArr = (c[]) ((Object[]) this.f14414i0);
                int length = cVarArr.length;
                while (true) {
                    cVar = a.f14402a;
                    if (i10 < length) {
                        c cVar3 = cVarArr[i10];
                        if (!AbstractC3557B.K(cVar3, cVar)) {
                            cVar2 = cVar3;
                        } else {
                            i10++;
                        }
                    }
                }
                if (cVar2 != null) {
                    cVar = cVar2;
                }
                this.f14412Z = 1;
                if (abstractC1207j.c(cVar, this) == enumC5000a) {
                    return enumC5000a;
                }
                return yVar;
            case 1:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                int i12 = this.f14412Z;
                if (i12 != 0) {
                    if (i12 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                AbstractC1207j abstractC1207j2 = (AbstractC1207j) this.f14413h0;
                AbstractC3215f abstractC3215f = (AbstractC3215f) this.f14414i0;
                if (abstractC3215f instanceof w) {
                    abstractC1206i = ((C2954f) ((w) abstractC3215f).f29979j.get()).f29786d;
                } else {
                    abstractC1206i = s0.c(null);
                }
                this.f14412Z = 1;
                if (L4.a.j0(this, abstractC1206i, abstractC1207j2) == enumC5000a2) {
                    return enumC5000a2;
                }
                return yVar;
            case 2:
                EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                int i13 = this.f14412Z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                AbstractC1207j abstractC1207j3 = (AbstractC1207j) this.f14413h0;
                AbstractC3215f abstractC3215f2 = (AbstractC3215f) this.f14414i0;
                if (abstractC3215f2 instanceof w) {
                    f02 = ((C5472v) ((xd.b) ((w) abstractC3215f2).f29985p.get())).f44937g;
                } else {
                    f02 = s0.c(null);
                }
                this.f14412Z = 1;
                if (L4.a.j0(this, f02, abstractC1207j3) == enumC5000a3) {
                    return enumC5000a3;
                }
                return yVar;
            case 3:
                EnumC5000a enumC5000a4 = EnumC5000a.f41328Y;
                int i14 = this.f14412Z;
                if (i14 != 0) {
                    if (i14 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                AbstractC1207j abstractC1207j4 = (AbstractC1207j) this.f14413h0;
                AbstractC2949a abstractC2949a = (AbstractC2949a) this.f14414i0;
                if (abstractC2949a == null || (c10 = ((C2962n) abstractC2949a).c()) == null || (f03 = ((G) c10).f27676e) == null) {
                    f03 = s0.c(null);
                }
                this.f14412Z = 1;
                if (L4.a.j0(this, f03, abstractC1207j4) == enumC5000a4) {
                    return enumC5000a4;
                }
                return yVar;
            case 4:
                EnumC5000a enumC5000a5 = EnumC5000a.f41328Y;
                int i15 = this.f14412Z;
                if (i15 != 0) {
                    if (i15 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                r0 r0Var = ((C5476z) ((xd.f) ((C2962n) ((AbstractC2949a) this.f14414i0)).f29865v.get())).f44946b;
                this.f14412Z = 1;
                if (L4.a.j0(this, r0Var, (AbstractC1207j) this.f14413h0) == enumC5000a5) {
                    return enumC5000a5;
                }
                return yVar;
            case 5:
                EnumC5000a enumC5000a6 = EnumC5000a.f41328Y;
                int i16 = this.f14412Z;
                if (i16 != 0) {
                    if (i16 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                n0 n0Var = ((C2954f) ((w) this.f14414i0).f29979j.get()).f29786d;
                this.f14412Z = 1;
                if (L4.a.j0(this, n0Var, (AbstractC1207j) this.f14413h0) == enumC5000a6) {
                    return enumC5000a6;
                }
                return yVar;
            case 6:
                EnumC5000a enumC5000a7 = EnumC5000a.f41328Y;
                if (this.f14412Z == 0) {
                    N.B0(obj);
                    return new C3959i((n) this.f14413h0, (zd.g) this.f14414i0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            case 7:
                EnumC5000a enumC5000a8 = EnumC5000a.f41328Y;
                int i17 = this.f14412Z;
                if (i17 != 0) {
                    if (i17 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                AbstractC1207j abstractC1207j5 = (AbstractC1207j) this.f14413h0;
                Throwable th2 = (Throwable) this.f14414i0;
                if (!(th2 instanceof CancellationException)) {
                    F f6 = new F(th2);
                    this.f14413h0 = null;
                    this.f14412Z = 1;
                    if (abstractC1207j5.c(f6, this) == enumC5000a8) {
                        return enumC5000a8;
                    }
                    return yVar;
                }
                return yVar;
            case 8:
                EnumC5000a enumC5000a9 = EnumC5000a.f41328Y;
                int i18 = this.f14412Z;
                if (i18 != 0) {
                    if (i18 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                AbstractC1207j abstractC1207j6 = (AbstractC1207j) this.f14413h0;
                K k10 = (K) this.f14414i0;
                if (k10 == null || (abstractC1206i2 = k10.f9723k) == null) {
                    abstractC1206i2 = C1204h.f14855Y;
                }
                this.f14412Z = 1;
                if (L4.a.j0(this, abstractC1206i2, abstractC1207j6) == enumC5000a9) {
                    return enumC5000a9;
                }
                return yVar;
            case 9:
                EnumC5000a enumC5000a10 = EnumC5000a.f41328Y;
                int i19 = this.f14412Z;
                if (i19 != 0) {
                    if (i19 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                Ie.e eVar = (Ie.e) this.f14413h0;
                Object obj2 = this.f14414i0;
                o oVar = (o) ((C5760d) eVar.f8578Y).f46130f.d(AbstractC4630c.f39193a);
                if (oVar != null) {
                    AbstractC3557B.a0("null cannot be cast to non-null type io.ktor.http.content.OutgoingContent", obj2);
                    C3574b c3574b = new C3574b((AbstractC6848g) obj2, ((C5760d) eVar.f8578Y).f46129e, oVar);
                    this.f14413h0 = null;
                    this.f14412Z = 1;
                    if (eVar.d(c3574b, this) == enumC5000a10) {
                        return enumC5000a10;
                    }
                    return yVar;
                }
                return yVar;
            case 10:
                EnumC5000a enumC5000a11 = EnumC5000a.f41328Y;
                int i20 = this.f14412Z;
                if (i20 != 0) {
                    if (i20 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                Ie.e eVar2 = (Ie.e) this.f14413h0;
                AbstractC6034c abstractC6034c = (AbstractC6034c) this.f14414i0;
                o oVar2 = (o) abstractC6034c.b().c().h().d(AbstractC4630c.f39194b);
                if (oVar2 != null) {
                    AbstractC6034c d10 = AbstractC3557B.N2(abstractC6034c.b(), r.f.P(abstractC6034c.c(), abstractC6034c.i(), AbstractC3557B.j0(abstractC6034c), oVar2)).d();
                    this.f14413h0 = null;
                    this.f14412Z = 1;
                    if (eVar2.d(d10, this) == enumC5000a11) {
                        return enumC5000a11;
                    }
                    return yVar;
                }
                return yVar;
            case 11:
                EnumC5000a enumC5000a12 = EnumC5000a.f41328Y;
                int i21 = this.f14412Z;
                if (i21 != 0) {
                    if (i21 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                Ie.e eVar3 = (Ie.e) this.f14413h0;
                Object obj3 = this.f14414i0;
                C6433v c6433v = ((C5760d) eVar3.f8578Y).f46127c;
                List list = AbstractC6435x.f49956a;
                String i22 = c6433v.i(SIPHeaderNames.ACCEPT);
                Object obj4 = eVar3.f8578Y;
                if (i22 == null) {
                    ((C5760d) obj4).f46127c.f(SIPHeaderNames.ACCEPT, "*/*");
                }
                C6417f l02 = AbstractC3557B.l0((AbstractC6437z) obj4);
                if (obj3 instanceof String) {
                    String str = (String) obj3;
                    if (l02 == null) {
                        l02 = AbstractC6416e.f49883a;
                    }
                    abstractC6848g = new ze.l(str, l02);
                } else if (obj3 instanceof byte[]) {
                    abstractC6848g = new C4638k(l02, obj3);
                } else if (obj3 instanceof x) {
                    abstractC6848g = new C4639l(eVar3, l02, obj3);
                } else if (obj3 instanceof AbstractC6848g) {
                    abstractC6848g = (AbstractC6848g) obj3;
                } else {
                    C5760d c5760d2 = (C5760d) obj4;
                    AbstractC3557B.c0("context", c5760d2);
                    AbstractC3557B.c0("body", obj3);
                    if (obj3 instanceof InputStream) {
                        abstractC6848g = new C4639l(c5760d2, l02, obj3);
                    } else {
                        abstractC6848g = null;
                    }
                }
                if (abstractC6848g != null) {
                    c6417f = abstractC6848g.b();
                } else {
                    c6417f = null;
                }
                if (c6417f != null) {
                    ((C5760d) obj4).f46127c.j(SIPHeaderNames.CONTENT_TYPE);
                    AbstractC4642o.f39224a.c("Transformed with default transformers request body for " + c5760d.f46125a + " from " + C.f37623a.b(obj3.getClass()));
                    this.f14413h0 = null;
                    this.f14412Z = 1;
                    if (eVar3.d(abstractC6848g, this) == enumC5000a12) {
                        return enumC5000a12;
                    }
                    return yVar;
                }
                return yVar;
            case 12:
                EnumC5000a enumC5000a13 = EnumC5000a.f41328Y;
                int i23 = this.f14412Z;
                if (i23 != 0) {
                    if (i23 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                Ie.e eVar4 = (Ie.e) this.f14413h0;
                C6035d c6035d = (C6035d) this.f14414i0;
                Je.a aVar = c6035d.f47491a;
                Object obj5 = c6035d.f47492b;
                if ((obj5 instanceof x) && AbstractC3557B.K(aVar.f9097a, C.f37623a.b(InputStream.class))) {
                    x xVar = (x) obj5;
                    C3963m c3963m = io.ktor.utils.io.jvm.javaio.e.f33497a;
                    AbstractC3557B.c0("<this>", xVar);
                    C6035d c6035d2 = new C6035d(aVar, new C4643p(new io.ktor.utils.io.jvm.javaio.i(xVar, (AbstractC1073l0) ((C3418c) eVar4.f8578Y).i().get(C1071k0.f12951Y)), eVar4));
                    this.f14413h0 = null;
                    this.f14412Z = 1;
                    if (eVar4.d(c6035d2, this) == enumC5000a13) {
                        return enumC5000a13;
                    }
                    return yVar;
                }
                return yVar;
            case 13:
                EnumC5000a enumC5000a14 = EnumC5000a.f41328Y;
                int i24 = this.f14412Z;
                if (i24 != 0) {
                    if (i24 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                AbstractC1207j abstractC1207j7 = (AbstractC1207j) this.f14413h0;
                Map map = (Map) this.f14414i0;
                if (map.isEmpty()) {
                    abstractC1206i3 = new C1209l(1, v.f37483Y);
                } else {
                    Collection<B> values = map.values();
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(values, 10));
                    for (B b10 : values) {
                        arrayList.add(new Ia.j(R4.b.j1(new kotlin.jvm.internal.w(b10, B.class, "track", "getTrack()Lio/livekit/android/room/track/Track;", 0)), 9, b10));
                    }
                    Object[] array = kf.t.K2(arrayList).toArray(new AbstractC1206i[0]);
                    if (array != null) {
                        abstractC1206i3 = new i((AbstractC1206i[]) array, 1);
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                }
                this.f14412Z = 1;
                if (L4.a.j0(this, abstractC1206i3, abstractC1207j7) == enumC5000a14) {
                    return enumC5000a14;
                }
                return yVar;
            default:
                EnumC5000a enumC5000a15 = EnumC5000a.f41328Y;
                int i25 = this.f14412Z;
                if (i25 != 0) {
                    if (i25 == 1) {
                        N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                N.B0(obj);
                List z32 = q.z3((C3959i[]) ((Object[]) this.f14414i0));
                this.f14412Z = 1;
                if (((AbstractC1207j) this.f14413h0).c(z32, this) == enumC5000a15) {
                    return enumC5000a15;
                }
                return yVar;
        }
    }

    public final Object p(Ie.e eVar, Object obj, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        switch (this.f14411Y) {
            case 9:
                h hVar = new h(9, abstractC4825e);
                hVar.f14413h0 = eVar;
                hVar.f14414i0 = obj;
                return hVar.invokeSuspend(yVar);
            default:
                h hVar2 = new h(11, abstractC4825e);
                hVar2.f14413h0 = eVar;
                hVar2.f14414i0 = obj;
                return hVar2.invokeSuspend(yVar);
        }
    }

    public final Object r(AbstractC1207j abstractC1207j, Object obj, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        switch (this.f14411Y) {
            case 1:
                h hVar = new h(1, abstractC4825e);
                hVar.f14413h0 = abstractC1207j;
                hVar.f14414i0 = obj;
                return hVar.invokeSuspend(yVar);
            case 2:
                h hVar2 = new h(2, abstractC4825e);
                hVar2.f14413h0 = abstractC1207j;
                hVar2.f14414i0 = obj;
                return hVar2.invokeSuspend(yVar);
            case 3:
                h hVar3 = new h(3, abstractC4825e);
                hVar3.f14413h0 = abstractC1207j;
                hVar3.f14414i0 = obj;
                return hVar3.invokeSuspend(yVar);
            case 4:
                h hVar4 = new h(4, abstractC4825e);
                hVar4.f14413h0 = abstractC1207j;
                hVar4.f14414i0 = obj;
                return hVar4.invokeSuspend(yVar);
            case 5:
                h hVar5 = new h(5, abstractC4825e);
                hVar5.f14413h0 = abstractC1207j;
                hVar5.f14414i0 = obj;
                return hVar5.invokeSuspend(yVar);
            case 6:
            case 7:
            default:
                h hVar6 = new h(13, abstractC4825e);
                hVar6.f14413h0 = abstractC1207j;
                hVar6.f14414i0 = obj;
                return hVar6.invokeSuspend(yVar);
            case 8:
                h hVar7 = new h(8, abstractC4825e);
                hVar7.f14413h0 = abstractC1207j;
                hVar7.f14414i0 = obj;
                return hVar7.invokeSuspend(yVar);
        }
    }

    public final Object t(AbstractC1207j abstractC1207j, Object[] objArr, AbstractC4825e abstractC4825e) {
        y yVar = y.f36177a;
        switch (this.f14411Y) {
            case 0:
                h hVar = new h(0, abstractC4825e);
                hVar.f14413h0 = abstractC1207j;
                hVar.f14414i0 = objArr;
                return hVar.invokeSuspend(yVar);
            default:
                h hVar2 = new h(14, abstractC4825e);
                hVar2.f14413h0 = abstractC1207j;
                hVar2.f14414i0 = objArr;
                return hVar2.invokeSuspend(yVar);
        }
    }
}
