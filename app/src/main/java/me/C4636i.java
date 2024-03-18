package me;

import he.C3418c;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ve.AbstractC6034c;

/* renamed from: me.i  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4636i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC6034c f39205Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f39206Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f39207h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f39208i0;

    /* JADX WARN: Type inference failed for: r0v0, types: [me.i, pf.j, nf.e] */
    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        ?? abstractC5163j = new AbstractC5163j(2, abstractC4825e);
        abstractC5163j.f39208i0 = obj;
        return abstractC5163j;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4636i) create((AbstractC6034c) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:2|(1:(1:(8:6|48|7|28|31|(2:35|(1:(1:43)(1:42))(1:38))(1:34)|44|45)(2:8|9))(1:10))(2:11|(2:13|14)(2:15|(1:46)(2:19|(1:21)(1:22))))|23|50|24|(1:26)(10:27|28|31|(0)|35|(0)|(1:40)|43|44|45)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00bd, code lost:
        r0 = r1;
        r2 = r6;
        r1 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC6034c abstractC6034c;
        AbstractC6034c abstractC6034c2;
        int i10;
        String str;
        Throwable th2;
        AbstractC6034c abstractC6034c3;
        int i11;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i12 = this.f39207h0;
        jf.y yVar = jf.y.f36177a;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    i10 = this.f39206Z;
                    abstractC6034c2 = this.f39205Y;
                    abstractC6034c = (AbstractC6034c) this.f39208i0;
                    try {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        str = (String) obj;
                    } catch (Le.b unused) {
                        str = "<body failed decoding>";
                        if (300 > i10) {
                        }
                        if (400 > i10) {
                        }
                        if (500 > i10) {
                        }
                        th2 = new T(abstractC6034c2, str);
                        Ei.a aVar = AbstractC4637j.f39210b;
                        aVar.c("Default response validation for " + abstractC6034c.b().c().O() + " failed with " + th2);
                        throw th2;
                    }
                    if (300 > i10 && i10 < 400) {
                        th2 = new S(abstractC6034c2, str, 0);
                    } else if (400 > i10 && i10 < 500) {
                        th2 = new C4631d(abstractC6034c2, str);
                    } else if (500 > i10 && i10 < 600) {
                        th2 = new S(abstractC6034c2, str, 1);
                    } else {
                        th2 = new T(abstractC6034c2, str);
                    }
                    Ei.a aVar2 = AbstractC4637j.f39210b;
                    aVar2.c("Default response validation for " + abstractC6034c.b().c().O() + " failed with " + th2);
                    throw th2;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f39206Z;
            abstractC6034c3 = (AbstractC6034c) this.f39208i0;
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            AbstractC6034c abstractC6034c4 = (AbstractC6034c) this.f39208i0;
            if (!((Boolean) abstractC6034c4.b().h().b(w.f39270b)).booleanValue()) {
                Ei.a aVar3 = AbstractC4637j.f39210b;
                aVar3.c("Skipping default response validation for " + abstractC6034c4.b().c().O());
                return yVar;
            }
            i11 = abstractC6034c4.f().f49834Y;
            C3418c b10 = abstractC6034c4.b();
            if (i11 >= 300 && !b10.h().a(AbstractC4637j.f39209a)) {
                this.f39208i0 = abstractC6034c4;
                this.f39206Z = i11;
                this.f39207h0 = 1;
                Object w02 = com.google.android.gms.internal.play_billing.N.w0(b10, this);
                if (w02 == enumC5000a) {
                    return enumC5000a;
                }
                abstractC6034c3 = abstractC6034c4;
                obj = w02;
            } else {
                return yVar;
            }
        }
        C3418c c3418c = (C3418c) obj;
        c3418c.h().e(AbstractC4637j.f39209a, yVar);
        AbstractC6034c d10 = c3418c.d();
        this.f39208i0 = abstractC6034c3;
        this.f39205Y = d10;
        this.f39206Z = i11;
        this.f39207h0 = 2;
        Object U10 = AbstractC3557B.U(d10, Lg.a.f11131a, this);
        if (U10 == enumC5000a) {
            return enumC5000a;
        }
        i10 = i11;
        abstractC6034c2 = d10;
        obj = U10;
        abstractC6034c = abstractC6034c3;
        str = (String) obj;
        if (300 > i10) {
        }
        if (400 > i10) {
        }
        if (500 > i10) {
        }
        th2 = new T(abstractC6034c2, str);
        Ei.a aVar22 = AbstractC4637j.f39210b;
        aVar22.c("Default response validation for " + abstractC6034c.b().c().O() + " failed with " + th2);
        throw th2;
    }
}
