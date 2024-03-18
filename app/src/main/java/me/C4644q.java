package me;

import he.C3418c;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.AbstractC5759c;
import te.C5760d;
import ve.AbstractC6034c;
import ve.C6035d;

/* renamed from: me.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4644q extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f39227Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f39228Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f39229h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f39230i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ C4647u f39231j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4644q(C4647u c4647u, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f39227Y = i10;
        this.f39231j0 = c4647u;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39227Y;
        C4647u c4647u = this.f39231j0;
        switch (i10) {
            case 0:
                C4644q c4644q = new C4644q(c4647u, (AbstractC4825e) obj3, 0);
                c4644q.f39229h0 = (Ie.e) obj;
                c4644q.f39230i0 = obj2;
                return c4644q.invokeSuspend(yVar);
            case 1:
                C4644q c4644q2 = new C4644q(c4647u, (AbstractC4825e) obj3, 1);
                c4644q2.f39229h0 = (Ie.e) obj;
                c4644q2.f39230i0 = (C6035d) obj2;
                return c4644q2.invokeSuspend(yVar);
            default:
                C4644q c4644q3 = new C4644q(c4647u, (AbstractC4825e) obj3, 2);
                c4644q3.f39229h0 = (U) obj;
                c4644q3.f39230i0 = (C5760d) obj2;
                return c4644q3.invokeSuspend(yVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [Ie.e] */
    /* JADX WARN: Type inference failed for: r3v13, types: [Ie.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [Ie.e, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v8, types: [Ie.e] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008b -> B:34:0x00a3). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00ee -> B:53:0x0109). Please submit an issue!!! */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f39227Y;
        C4647u c4647u = this.f39231j0;
        ?? r32 = "call to 'resume' before 'invoke' with coroutine";
        switch (i10) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                int i11 = this.f39228Z;
                try {
                } catch (Throwable th2) {
                    Throwable I22 = AbstractC3557B.I2(th2);
                    Ei.a aVar = w.f39269a;
                    v vVar = new v((C5760d) r32.f8578Y);
                    this.f39229h0 = I22;
                    this.f39228Z = 2;
                    C4647u.a(c4647u, I22, vVar, this);
                    if (yVar != enumC5000a) {
                        throw I22;
                    }
                }
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException((String) r32);
                        }
                        Throwable th3 = (Throwable) this.f39229h0;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        throw th3;
                    }
                    Ie.e eVar = (Ie.e) this.f39229h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return yVar;
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                r32 = (Ie.e) this.f39229h0;
                Object obj2 = this.f39230i0;
                ((C5760d) r32.f8578Y).f46130f.f(w.f39270b, new zc.u(11, c4647u));
                this.f39229h0 = r32;
                this.f39228Z = 1;
                if (r32.d(obj2, this) != enumC5000a) {
                    return yVar;
                }
                return enumC5000a;
            case 1:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                int i12 = this.f39228Z;
                try {
                } catch (Throwable th4) {
                    Throwable I23 = AbstractC3557B.I2(th4);
                    AbstractC5759c c10 = ((C3418c) r32.f8578Y).c();
                    this.f39229h0 = I23;
                    this.f39228Z = 2;
                    C4647u.a(c4647u, I23, c10, this);
                    if (yVar != enumC5000a2) {
                        throw I23;
                    }
                }
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException((String) r32);
                        }
                        Throwable th5 = (Throwable) this.f39229h0;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        throw th5;
                    }
                    Ie.e eVar2 = (Ie.e) this.f39229h0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    return yVar;
                }
                com.google.android.gms.internal.play_billing.N.B0(obj);
                r32 = (Ie.e) this.f39229h0;
                C6035d c6035d = (C6035d) this.f39230i0;
                this.f39229h0 = r32;
                this.f39228Z = 1;
                if (r32.d(c6035d, this) != enumC5000a2) {
                    return yVar;
                }
                return enumC5000a2;
            default:
                EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                int i13 = this.f39228Z;
                if (i13 != 0) {
                    if (i13 != 1) {
                        if (i13 == 2) {
                            C3418c c3418c = (C3418c) this.f39229h0;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return c3418c;
                        }
                        throw new IllegalStateException((String) r32);
                    }
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    this.f39229h0 = null;
                    this.f39228Z = 1;
                    obj = ((U) this.f39229h0).a((C5760d) this.f39230i0, this);
                    if (obj == enumC5000a3) {
                        return enumC5000a3;
                    }
                }
                C3418c c3418c2 = (C3418c) obj;
                AbstractC6034c d10 = c3418c2.d();
                this.f39229h0 = c3418c2;
                this.f39228Z = 2;
                if (C4647u.b(c4647u, d10, this) != enumC5000a3) {
                    return c3418c2;
                }
                return enumC5000a3;
        }
    }
}
