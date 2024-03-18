package G;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import y.C6484w;
import z.AbstractC6659E;
import z.C6694e;
import z.C6697f0;

/* renamed from: G.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0559n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC6659E f5538Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f5539Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ r f5540h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6659E f5541i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f5542j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0559n(r rVar, AbstractC6659E abstractC6659E, long j6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f5540h0 = rVar;
        this.f5541i0 = abstractC6659E;
        this.f5542j0 = j6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C0559n(this.f5540h0, this.f5541i0, this.f5542j0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C0559n) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009f A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC6659E abstractC6659E;
        C6694e c6694e;
        Z0.i iVar;
        C6484w c6484w;
        AbstractC6659E abstractC6659E2;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f5539Z;
        long j6 = this.f5542j0;
        r rVar = this.f5540h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    int i11 = r.f5550n;
                    rVar.b(false);
                    return jf.y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC6659E2 = this.f5538Y;
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C6694e c6694e2 = rVar.f5557g;
            C6694e c6694e3 = rVar.f5557g;
            boolean booleanValue = ((Boolean) c6694e2.f51231d.getValue()).booleanValue();
            AbstractC6659E abstractC6659E3 = this.f5541i0;
            if (booleanValue) {
                if (abstractC6659E3 instanceof C6697f0) {
                    abstractC6659E3 = (C6697f0) abstractC6659E3;
                } else {
                    abstractC6659E3 = AbstractC0564t.f5566a;
                }
            }
            if (!((Boolean) c6694e3.f51231d.getValue()).booleanValue()) {
                Z0.i iVar2 = new Z0.i(j6);
                this.f5538Y = abstractC6659E3;
                this.f5539Z = 1;
                if (c6694e3.f(iVar2, this) == enumC5000a) {
                    return enumC5000a;
                }
                abstractC6659E2 = abstractC6659E3;
            } else {
                abstractC6659E = abstractC6659E3;
                long j10 = ((Z0.i) rVar.f5557g.e()).f22799a;
                long c10 = kotlin.jvm.internal.m.c(((int) (j10 >> 32)) - ((int) (j6 >> 32)), ((int) (j10 & 4294967295L)) - ((int) (j6 & 4294967295L)));
                c6694e = rVar.f5557g;
                iVar = new Z0.i(c10);
                c6484w = new C6484w(rVar, c10, 2);
                this.f5538Y = null;
                this.f5539Z = 2;
                if (C6694e.c(c6694e, iVar, abstractC6659E, c6484w, this, 4) == enumC5000a) {
                    return enumC5000a;
                }
                int i112 = r.f5550n;
                rVar.b(false);
                return jf.y.f36177a;
            }
        }
        abstractC6659E = abstractC6659E2;
        long j102 = ((Z0.i) rVar.f5557g.e()).f22799a;
        long c102 = kotlin.jvm.internal.m.c(((int) (j102 >> 32)) - ((int) (j6 >> 32)), ((int) (j102 & 4294967295L)) - ((int) (j6 & 4294967295L)));
        c6694e = rVar.f5557g;
        iVar = new Z0.i(c102);
        c6484w = new C6484w(rVar, c102, 2);
        this.f5538Y = null;
        this.f5539Z = 2;
        if (C6694e.c(c6694e, iVar, abstractC6659E, c6484w, this, 4) == enumC5000a) {
        }
        int i1122 = r.f5550n;
        rVar.b(false);
        return jf.y.f36177a;
    }
}
