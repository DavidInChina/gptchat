package Qg;

import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class H implements AbstractC1206i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1206i f14754Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ wf.o f14755Z;

    public H(C1209l c1209l, Q3.h hVar) {
        this.f14754Y = c1209l;
        this.f14755Z = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    @Override // Qg.AbstractC1206i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(AbstractC1207j abstractC1207j, AbstractC4825e abstractC4825e) {
        G g10;
        int i10;
        H h10;
        Throwable th2;
        if (abstractC4825e instanceof G) {
            g10 = (G) abstractC4825e;
            int i11 = g10.f14749Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                g10.f14749Z = i11 - Integer.MIN_VALUE;
                Object obj = g10.f14748Y;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = g10.f14749Z;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            com.google.android.gms.internal.play_billing.N.B0(obj);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC1207j = g10.f14752j0;
                    h10 = g10.f14751i0;
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    g10.f14751i0 = this;
                    g10.f14752j0 = abstractC1207j;
                    g10.f14749Z = 1;
                    obj = L4.a.Z(g10, this.f14754Y, abstractC1207j);
                    if (obj == obj2) {
                        return obj2;
                    }
                    h10 = this;
                }
                th2 = (Throwable) obj;
                if (th2 != null) {
                    wf.o oVar = h10.f14755Z;
                    g10.f14751i0 = null;
                    g10.f14752j0 = null;
                    g10.f14749Z = 2;
                    if (oVar.invoke(abstractC1207j, th2, g10) == obj2) {
                        return obj2;
                    }
                }
                return jf.y.f36177a;
            }
        }
        g10 = new G(this, abstractC4825e);
        Object obj3 = g10.f14748Y;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = g10.f14749Z;
        if (i10 == 0) {
        }
        th2 = (Throwable) obj3;
        if (th2 != null) {
        }
        return jf.y.f36177a;
    }
}
