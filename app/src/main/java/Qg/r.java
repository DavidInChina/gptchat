package Qg;

import Rg.AbstractC1282c;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class r implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14904Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Pg.A f14905Z;

    public /* synthetic */ r(Pg.A a5, int i10) {
        this.f14904Y = i10;
        this.f14905Z = a5;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0078  */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        C1214q c1214q;
        int i10;
        C1219w c1219w;
        int i11;
        jf.y yVar = jf.y.f36177a;
        Q1.u uVar = AbstractC1282c.f15530b;
        int i12 = this.f14904Y;
        Pg.A a5 = this.f14905Z;
        switch (i12) {
            case 0:
                if (abstractC4825e instanceof C1214q) {
                    c1214q = (C1214q) abstractC4825e;
                    int i13 = c1214q.f14896h0;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c1214q.f14896h0 = i13 - Integer.MIN_VALUE;
                        Object obj2 = c1214q.f14894Y;
                        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                        i10 = c1214q.f14896h0;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj2);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj2);
                        if (obj == null) {
                            obj = uVar;
                        }
                        c1214q.f14896h0 = 1;
                        if (((Pg.p) a5).f14244i0.n(obj, c1214q) == enumC5000a) {
                            return enumC5000a;
                        }
                        return yVar;
                    }
                }
                c1214q = new C1214q(this, abstractC4825e);
                Object obj22 = c1214q.f14894Y;
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                i10 = c1214q.f14896h0;
                if (i10 == 0) {
                }
            default:
                if (abstractC4825e instanceof C1219w) {
                    c1219w = (C1219w) abstractC4825e;
                    int i14 = c1219w.f14939h0;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        c1219w.f14939h0 = i14 - Integer.MIN_VALUE;
                        Object obj3 = c1219w.f14937Y;
                        EnumC5000a enumC5000a3 = EnumC5000a.f41328Y;
                        i11 = c1219w.f14939h0;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                com.google.android.gms.internal.play_billing.N.B0(obj3);
                                return yVar;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.google.android.gms.internal.play_billing.N.B0(obj3);
                        if (obj == null) {
                            obj = uVar;
                        }
                        c1219w.f14939h0 = 1;
                        if (((Pg.p) a5).f14244i0.n(obj, c1219w) == enumC5000a3) {
                            return enumC5000a3;
                        }
                        return yVar;
                    }
                }
                c1219w = new C1219w(this, abstractC4825e);
                Object obj32 = c1219w.f14937Y;
                EnumC5000a enumC5000a32 = EnumC5000a.f41328Y;
                i11 = c1219w.f14939h0;
                if (i11 == 0) {
                }
        }
    }
}
