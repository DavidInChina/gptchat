package Qg;

import h9.C3340e;
import nf.AbstractC4825e;
import o9.C4957e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class D implements AbstractC1206i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f14728Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.o f14729Z;

    public D(C4957e c4957e, C3340e c3340e) {
        this.f14728Y = c4957e;
        this.f14729Z = c3340e;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    @Override // Qg.AbstractC1206i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        C c10;
        EnumC5000a enumC5000a;
        int i10;
        Throwable th2;
        D d10;
        H0 h02;
        wf.o oVar;
        Throwable th3;
        Rg.C c11;
        Rg.C c12;
        wf.o oVar2;
        try {
            if (abstractC4825e instanceof C) {
                c10 = (C) abstractC4825e;
                int i11 = c10.f14722Z;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    c10.f14722Z = i11 - Integer.MIN_VALUE;
                    Object obj = c10.f14721Y;
                    enumC5000a = EnumC5000a.f41328Y;
                    i10 = c10.f14722Z;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 != 2) {
                                if (i10 == 3) {
                                    c11 = (Rg.C) c10.f14724i0;
                                    try {
                                        com.google.android.gms.internal.play_billing.N.B0(obj);
                                        c11.releaseIntercepted();
                                        return jf.y.f36177a;
                                    } catch (Throwable th4) {
                                        th3 = th4;
                                        c11.releaseIntercepted();
                                        throw th3;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th5 = (Throwable) c10.f14724i0;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            throw th5;
                        }
                        abstractC1207j = c10.f14725j0;
                        d10 = (D) c10.f14724i0;
                        try {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                        } catch (Throwable th6) {
                            th2 = th6;
                            h02 = new H0(th2);
                            oVar = d10.f14729Z;
                            c10.f14724i0 = th2;
                            c10.f14725j0 = null;
                            c10.f14722Z = 2;
                            if (A7.b.V(h02, oVar, th2, c10) != enumC5000a) {
                            }
                        }
                    } else {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        try {
                            AbstractC1206i abstractC1206i = this.f14728Y;
                            c10.f14724i0 = this;
                            c10.f14725j0 = abstractC1207j;
                            c10.f14722Z = 1;
                            if (abstractC1206i.b(abstractC1207j, c10) == enumC5000a) {
                                return enumC5000a;
                            }
                            d10 = this;
                        } catch (Throwable th7) {
                            th2 = th7;
                            d10 = this;
                            h02 = new H0(th2);
                            oVar = d10.f14729Z;
                            c10.f14724i0 = th2;
                            c10.f14725j0 = null;
                            c10.f14722Z = 2;
                            if (A7.b.V(h02, oVar, th2, c10) != enumC5000a) {
                                return enumC5000a;
                            }
                            throw th2;
                        }
                    }
                    c12 = new Rg.C(abstractC1207j, c10.getContext());
                    oVar2 = d10.f14729Z;
                    c10.f14724i0 = c12;
                    c10.f14725j0 = null;
                    c10.f14722Z = 3;
                    if (oVar2.invoke(c12, null, c10) != enumC5000a) {
                        return enumC5000a;
                    }
                    c11 = c12;
                    c11.releaseIntercepted();
                    return jf.y.f36177a;
                }
            }
            oVar2 = d10.f14729Z;
            c10.f14724i0 = c12;
            c10.f14725j0 = null;
            c10.f14722Z = 3;
            if (oVar2.invoke(c12, null, c10) != enumC5000a) {
            }
        } catch (Throwable th8) {
            th3 = th8;
            c11 = c12;
            c11.releaseIntercepted();
            throw th3;
        }
        c10 = new C(this, abstractC4825e);
        Object obj2 = c10.f14721Y;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c10.f14722Z;
        if (i10 == 0) {
        }
        c12 = new Rg.C(abstractC1207j, c10.getContext());
    }
}
