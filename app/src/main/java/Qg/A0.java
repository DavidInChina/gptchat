package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class A0 extends AbstractC5163j implements wf.o {

    /* renamed from: Y  reason: collision with root package name */
    public int f14713Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ AbstractC1207j f14714Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ int f14715h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C0 f14716i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A0(C0 c02, AbstractC4825e abstractC4825e) {
        super(3, abstractC4825e);
        this.f14716i0 = c02;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        A0 a02 = new A0(this.f14716i0, (AbstractC4825e) obj3);
        a02.f14714Z = (AbstractC1207j) obj;
        a02.f14715h0 = intValue;
        return a02.invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0078 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086 A[RETURN] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AbstractC1207j abstractC1207j;
        u0 u0Var;
        long j6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f14713Y;
        C0 c02 = this.f14716i0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            abstractC1207j = this.f14714Z;
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            u0Var = u0.f14930h0;
                            this.f14714Z = null;
                            this.f14713Y = 5;
                            if (abstractC1207j.c(u0Var, this) == enumC5000a) {
                                return enumC5000a;
                            }
                        }
                    } else {
                        abstractC1207j = this.f14714Z;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                        j6 = c02.f14727b;
                        this.f14714Z = abstractC1207j;
                        this.f14713Y = 4;
                        if (R4.b.p0(j6, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        u0Var = u0.f14930h0;
                        this.f14714Z = null;
                        this.f14713Y = 5;
                        if (abstractC1207j.c(u0Var, this) == enumC5000a) {
                        }
                    }
                } else {
                    abstractC1207j = this.f14714Z;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (c02.f14727b > 0) {
                        u0 u0Var2 = u0.f14929Z;
                        this.f14714Z = abstractC1207j;
                        this.f14713Y = 3;
                        if (abstractC1207j.c(u0Var2, this) == enumC5000a) {
                            return enumC5000a;
                        }
                        j6 = c02.f14727b;
                        this.f14714Z = abstractC1207j;
                        this.f14713Y = 4;
                        if (R4.b.p0(j6, this) == enumC5000a) {
                        }
                    }
                    u0Var = u0.f14930h0;
                    this.f14714Z = null;
                    this.f14713Y = 5;
                    if (abstractC1207j.c(u0Var, this) == enumC5000a) {
                    }
                }
            }
            com.google.android.gms.internal.play_billing.N.B0(obj);
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            abstractC1207j = this.f14714Z;
            if (this.f14715h0 > 0) {
                u0 u0Var3 = u0.f14928Y;
                this.f14713Y = 1;
                if (abstractC1207j.c(u0Var3, this) == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                long j10 = c02.f14726a;
                this.f14714Z = abstractC1207j;
                this.f14713Y = 2;
                if (R4.b.p0(j10, this) == enumC5000a) {
                    return enumC5000a;
                }
                if (c02.f14727b > 0) {
                }
                u0Var = u0.f14930h0;
                this.f14714Z = null;
                this.f14713Y = 5;
                if (abstractC1207j.c(u0Var, this) == enumC5000a) {
                }
            }
        }
        return jf.y.f36177a;
    }
}
