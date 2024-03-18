package me;

import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ve.AbstractC6034c;

/* renamed from: me.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4640m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39218Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f39219Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f39220h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6034c f39221i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4640m(Object obj, AbstractC6034c abstractC6034c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39220h0 = obj;
        this.f39221i0 = abstractC6034c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4640m c4640m = new C4640m(this.f39220h0, this.f39221i0, abstractC4825e);
        c4640m.f39219Z = obj;
        return c4640m;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4640m) create((io.ktor.utils.io.B) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39218Y;
        AbstractC6034c abstractC6034c = this.f39221i0;
        try {
            if (i10 != 0) {
                try {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th2) {
                    AbstractC3557B.f0(abstractC6034c);
                    throw th2;
                }
            } else {
                com.google.android.gms.internal.play_billing.N.B0(obj);
                io.ktor.utils.io.B b10 = (io.ktor.utils.io.B) this.f39219Z;
                io.ktor.utils.io.x xVar = (io.ktor.utils.io.x) this.f39220h0;
                io.ktor.utils.io.u uVar = b10.f33365Y;
                this.f39218Y = 1;
                if (xVar != uVar) {
                    if ((xVar instanceof io.ktor.utils.io.t) && (uVar instanceof io.ktor.utils.io.t)) {
                        obj2 = ((io.ktor.utils.io.t) uVar).k((io.ktor.utils.io.t) xVar, Long.MAX_VALUE, this);
                    } else {
                        obj2 = Ad.l.d0(xVar, uVar, Long.MAX_VALUE, this);
                    }
                    if (obj2 == enumC5000a) {
                        return enumC5000a;
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            AbstractC3557B.f0(abstractC6034c);
            return jf.y.f36177a;
        } catch (CancellationException e10) {
            Ad.l.P(abstractC6034c, e10);
            throw e10;
        } catch (Throwable th3) {
            Ad.l.P(abstractC6034c, A7.b.g("Receive failed", th3));
            throw th3;
        }
    }
}
