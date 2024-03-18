package lh;

import Qg.AbstractC1207j;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: lh.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4496o implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1207j f38493Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f38494Z;

    public C4496o(AbstractC1207j abstractC1207j, long j6) {
        this.f38494Z = j6;
        this.f38493Y = abstractC1207j;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[RETURN] */
    @Override // Qg.AbstractC1207j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        C4495n c4495n;
        EnumC5000a enumC5000a;
        int i10;
        C4496o c4496o;
        long j6;
        if (abstractC4825e instanceof C4495n) {
            c4495n = (C4495n) abstractC4825e;
            int i11 = c4495n.f38490Z;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c4495n.f38490Z = i11 - Integer.MIN_VALUE;
                Object obj2 = c4495n.f38489Y;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = c4495n.f38490Z;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            N.B0(obj2);
                            return jf.y.f36177a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c4496o = c4495n.f38492i0;
                    N.B0(obj2);
                } else {
                    N.B0(obj2);
                    c4495n.f38492i0 = this;
                    c4495n.f38490Z = 1;
                    if (this.f38493Y.c(obj, c4495n) == enumC5000a) {
                        return enumC5000a;
                    }
                    c4496o = this;
                }
                j6 = c4496o.f38494Z;
                c4495n.f38492i0 = null;
                c4495n.f38490Z = 2;
                if (R4.b.q0(j6, c4495n) == enumC5000a) {
                    return enumC5000a;
                }
                return jf.y.f36177a;
            }
        }
        c4495n = new C4495n(this, abstractC4825e);
        Object obj22 = c4495n.f38489Y;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = c4495n.f38490Z;
        if (i10 == 0) {
        }
        j6 = c4496o.f38494Z;
        c4495n.f38492i0 = null;
        c4495n.f38490Z = 2;
        if (R4.b.q0(j6, c4495n) == enumC5000a) {
        }
        return jf.y.f36177a;
    }
}
