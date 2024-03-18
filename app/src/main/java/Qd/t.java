package Qd;

import Df.AbstractC0405d;
import com.google.android.gms.internal.play_billing.N;
import com.segment.analytics.kotlin.core.Settings;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class t extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public i f14655Y;

    /* renamed from: Z  reason: collision with root package name */
    public Settings f14656Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f14657h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Settings f14658i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ i f14659j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(i iVar, Settings settings, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f14658i0 = settings;
        this.f14659j0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new t(this.f14659j0, this.f14658i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092 A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Li.q e10;
        D d10;
        AbstractC0405d b10;
        i iVar;
        Settings settings;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14657h0;
        i iVar2 = this.f14659j0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    e10 = iVar2.f14611Z.e();
                    d10 = new D(1, true);
                    b10 = kotlin.jvm.internal.C.f37623a.b(E.class);
                    this.f14657h0 = 3;
                    if (e10.b(d10, b10, this) == enumC5000a) {
                        return enumC5000a;
                    }
                }
            } else {
                settings = this.f14656Z;
                iVar = this.f14655Y;
                N.B0(obj);
                this.f14655Y = null;
                this.f14656Z = null;
                this.f14657h0 = 2;
                if (P4.a.P0(iVar, settings, this) == enumC5000a) {
                    return enumC5000a;
                }
                e10 = iVar2.f14611Z.e();
                d10 = new D(1, true);
                b10 = kotlin.jvm.internal.C.f37623a.b(E.class);
                this.f14657h0 = 3;
                if (e10.b(d10, b10, this) == enumC5000a) {
                }
            }
        } else {
            N.B0(obj);
            settings = this.f14658i0;
            if (settings != null) {
                r.f.M(iVar2, "Dispatching update settings on " + Thread.currentThread().getName());
                Li.q e11 = iVar2.f14611Z.e();
                C c10 = new C(settings);
                AbstractC0405d b11 = kotlin.jvm.internal.C.f37623a.b(E.class);
                this.f14655Y = iVar2;
                this.f14656Z = settings;
                this.f14657h0 = 1;
                if (e11.b(c10, b11, this) == enumC5000a) {
                    return enumC5000a;
                }
                iVar = iVar2;
                this.f14655Y = null;
                this.f14656Z = null;
                this.f14657h0 = 2;
                if (P4.a.P0(iVar, settings, this) == enumC5000a) {
                }
            }
            e10 = iVar2.f14611Z.e();
            d10 = new D(1, true);
            b10 = kotlin.jvm.internal.C.f37623a.b(E.class);
            this.f14657h0 = 3;
            if (e10.b(d10, b10, this) == enumC5000a) {
            }
        }
        return jf.y.f36177a;
    }
}
