package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class F implements AbstractC1206i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ wf.n f14744Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f14745Z;

    public F(wf.n nVar, M1.w wVar) {
        this.f14744Y = nVar;
        this.f14745Z = wVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072 A[RETURN] */
    @Override // Qg.AbstractC1206i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        E e10;
        EnumC5000a enumC5000a;
        int i10;
        Throwable th2;
        Rg.C c10;
        F f6;
        AbstractC1207j abstractC1207j2;
        AbstractC1206i abstractC1206i;
        if (abstractC4825e instanceof E) {
            e10 = (E) abstractC4825e;
            int i11 = e10.f14731Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                e10.f14731Z = i11 - Integer.MIN_VALUE;
                Object obj = e10.f14730Y;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = e10.f14731Z;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c10 = e10.f14735k0;
                    abstractC1207j2 = e10.f14734j0;
                    f6 = e10.f14733i0;
                    try {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } catch (Throwable th3) {
                        th2 = th3;
                        c10.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    Rg.C c11 = new Rg.C(abstractC1207j, e10.getContext());
                    try {
                        wf.n nVar = this.f14744Y;
                        e10.f14733i0 = this;
                        e10.f14734j0 = abstractC1207j;
                        e10.f14735k0 = c11;
                        e10.f14731Z = 1;
                        if (nVar.invoke(c11, e10) == enumC5000a) {
                            return enumC5000a;
                        }
                        f6 = this;
                        abstractC1207j2 = abstractC1207j;
                        c10 = c11;
                    } catch (Throwable th4) {
                        th2 = th4;
                        c10 = c11;
                        c10.releaseIntercepted();
                        throw th2;
                    }
                }
                c10.releaseIntercepted();
                abstractC1206i = f6.f14745Z;
                e10.f14733i0 = null;
                e10.f14734j0 = null;
                e10.f14735k0 = null;
                e10.f14731Z = 2;
                if (abstractC1206i.b(abstractC1207j2, e10) == enumC5000a) {
                    return enumC5000a;
                }
                return jf.y.f36177a;
            }
        }
        e10 = new E(this, abstractC4825e);
        Object obj2 = e10.f14730Y;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = e10.f14731Z;
        if (i10 == 0) {
        }
        c10.releaseIntercepted();
        abstractC1206i = f6.f14745Z;
        e10.f14733i0 = null;
        e10.f14734j0 = null;
        e10.f14735k0 = null;
        e10.f14731Z = 2;
        if (abstractC1206i.b(abstractC1207j2, e10) == enumC5000a) {
        }
        return jf.y.f36177a;
    }
}
