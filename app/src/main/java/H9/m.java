package H9;

import L9.AbstractC0904j;
import Qg.F0;
import Qg.s0;
import ca.C2319k;
import com.google.android.gms.internal.play_billing.N;
import java.util.Collection;
import nf.AbstractC4825e;
import of.EnumC5000a;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC0904j f7524a;

    /* renamed from: b  reason: collision with root package name */
    public final F0 f7525b;

    /* renamed from: c  reason: collision with root package name */
    public final F0 f7526c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7527d;

    /* renamed from: e  reason: collision with root package name */
    public int f7528e;

    public m(AbstractC0904j abstractC0904j) {
        this.f7524a = abstractC0904j;
        F0 c10 = s0.c(kf.v.f37483Y);
        this.f7525b = c10;
        this.f7526c = c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        l lVar;
        int i10;
        m mVar;
        boolean z10;
        if (abstractC4825e instanceof l) {
            lVar = (l) abstractC4825e;
            int i11 = lVar.f7523i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f7523i0 = i11 - Integer.MIN_VALUE;
                Object obj = lVar.f7521Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = lVar.f7523i0;
                boolean z11 = true;
                if (i10 == 0) {
                    if (i10 == 1) {
                        mVar = lVar.f7520Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    this.f7527d = true;
                    int i12 = this.f7528e;
                    lVar.f7520Y = this;
                    lVar.f7523i0 = 1;
                    obj = ((Fa.i) this.f7524a).f(i12, 20, true, lVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    mVar = this;
                }
                v0 v0Var = (v0) obj;
                z10 = v0Var instanceof u0;
                if (z10) {
                    if (z10) {
                        C2319k c2319k = (C2319k) ((u0) v0Var).f48468a;
                        return new u0(Boolean.TRUE);
                    } else if ((v0Var instanceof p0) || (v0Var instanceof q0)) {
                        return v0Var;
                    } else {
                        throw new RuntimeException();
                    }
                }
                F0 f02 = mVar.f7525b;
                u0 u0Var = (u0) v0Var;
                f02.setValue(kf.t.w2(((C2319k) u0Var.f48468a).f26396a, (Collection) f02.getValue()));
                mVar.f7527d = false;
                int i13 = mVar.f7528e;
                Object obj2 = u0Var.f48468a;
                int size = ((C2319k) obj2).f26396a.size() + i13;
                mVar.f7528e = size;
                if (((C2319k) obj2).f26397b <= size) {
                    z11 = false;
                }
                return new u0(Boolean.valueOf(z11));
            }
        }
        lVar = new l(this, abstractC4825e);
        Object obj3 = lVar.f7521Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = lVar.f7523i0;
        boolean z112 = true;
        if (i10 == 0) {
        }
        v0 v0Var2 = (v0) obj3;
        z10 = v0Var2 instanceof u0;
        if (z10) {
        }
    }
}
