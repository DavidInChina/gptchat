package me;

import he.C3418c;
import id.AbstractC3557B;
import java.nio.charset.Charset;
import java.util.List;
import l8.AbstractC4344b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6035d;
import xe.AbstractC6416e;
import xe.AbstractC6435x;
import xe.AbstractC6437z;
import xe.C6417f;
import xe.C6433v;

/* loaded from: classes2.dex */
public final class z extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39272Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f39273Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Ie.e f39274h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f39275i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C4618A f39276j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(C4618A c4618a, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f39272Y = i10;
        this.f39276j0 = c4618a;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39272Y;
        C4618A c4618a = this.f39276j0;
        switch (i10) {
            case 0:
                z zVar = new z(c4618a, (AbstractC4825e) obj3, 0);
                zVar.f39274h0 = (Ie.e) obj;
                zVar.f39275i0 = obj2;
                return zVar.invokeSuspend(yVar);
            default:
                z zVar2 = new z(c4618a, (AbstractC4825e) obj3, 1);
                zVar2.f39274h0 = (Ie.e) obj;
                zVar2.f39275i0 = (C6035d) obj2;
                return zVar2.invokeSuspend(yVar);
        }
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C6417f c6417f;
        Charset charset;
        Ie.e eVar;
        Je.a aVar;
        Charset charset2;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39272Y;
        C4618A c4618a = this.f39276j0;
        switch (i10) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                int i11 = this.f39273Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        return yVar;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                Ie.e eVar2 = this.f39274h0;
                Object obj2 = this.f39275i0;
                C5760d c5760d = (C5760d) eVar2.f8578Y;
                c4618a.getClass();
                AbstractC3557B.c0("context", c5760d);
                List list = AbstractC6435x.f49956a;
                C6433v c6433v = c5760d.f46127c;
                if (c6433v.i("Accept-Charset") == null) {
                    Ei.a aVar2 = AbstractC4619B.f39138a;
                    StringBuilder sb2 = new StringBuilder("Adding Accept-Charset=");
                    String str = c4618a.f39137c;
                    sb2.append(str);
                    sb2.append(" to ");
                    sb2.append(c5760d.f46125a);
                    aVar2.c(sb2.toString());
                    c6433v.k("Accept-Charset", str);
                }
                if (obj2 instanceof String) {
                    Object obj3 = eVar2.f8578Y;
                    C6417f l02 = AbstractC3557B.l0((AbstractC6437z) obj3);
                    if (l02 != null) {
                        if (!AbstractC3557B.K(l02.f49886c, AbstractC6416e.f49883a.f49886c)) {
                            return yVar;
                        }
                    }
                    C5760d c5760d2 = (C5760d) obj3;
                    String str2 = (String) obj2;
                    if (l02 == null) {
                        c6417f = AbstractC6416e.f49883a;
                    } else {
                        c6417f = l02;
                    }
                    if (l02 == null || (charset = AbstractC4344b.S(l02)) == null) {
                        charset = c4618a.f39136b;
                    }
                    AbstractC4619B.f39138a.c("Sending request body to " + c5760d2.f46125a + " as text/plain with charset " + charset);
                    AbstractC3557B.c0("<this>", c6417f);
                    AbstractC3557B.c0("charset", charset);
                    ze.l lVar = new ze.l(str2, c6417f.c("charset", Le.a.d(charset)));
                    this.f39274h0 = null;
                    this.f39273Z = 1;
                    if (eVar2.d(lVar, this) == enumC5000a) {
                        return enumC5000a;
                    }
                    return yVar;
                }
                return yVar;
            default:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                int i12 = this.f39273Z;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return yVar;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (Je.a) this.f39275i0;
                    eVar = this.f39274h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Ie.e eVar3 = this.f39274h0;
                    C6035d c6035d = (C6035d) this.f39275i0;
                    Je.a aVar3 = c6035d.f47491a;
                    if (AbstractC3557B.K(aVar3.f9097a, kotlin.jvm.internal.C.f37623a.b(String.class))) {
                        Object obj4 = c6035d.f47492b;
                        if (obj4 instanceof io.ktor.utils.io.x) {
                            this.f39274h0 = eVar3;
                            this.f39275i0 = aVar3;
                            this.f39273Z = 1;
                            Object o22 = AbstractC3557B.o2((io.ktor.utils.io.x) obj4, this);
                            if (o22 != enumC5000a2) {
                                eVar = eVar3;
                                obj = o22;
                                aVar = aVar3;
                            }
                            return enumC5000a2;
                        }
                        return yVar;
                    }
                    return yVar;
                }
                Me.d dVar = (Me.d) obj;
                C3418c c3418c = (C3418c) eVar.f8578Y;
                c4618a.getClass();
                AbstractC3557B.c0("call", c3418c);
                AbstractC3557B.c0("body", dVar);
                C6417f k02 = AbstractC3557B.k0(c3418c.d());
                if (k02 != null) {
                    charset2 = AbstractC4344b.S(k02);
                } else {
                    charset2 = null;
                }
                if (charset2 == null) {
                    charset2 = c4618a.f39135a;
                }
                AbstractC4619B.f39138a.c("Reading response body for " + c3418c.c().O() + " as String with charset " + charset2);
                C6035d c6035d2 = new C6035d(aVar, com.google.android.gms.internal.play_billing.N.q0(dVar, charset2));
                this.f39274h0 = null;
                this.f39275i0 = null;
                this.f39273Z = 2;
                if (eVar.d(c6035d2, this) != enumC5000a2) {
                    return yVar;
                }
                return enumC5000a2;
        }
    }
}
