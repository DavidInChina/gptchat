package V8;

import B.Y0;
import B0.A;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.concurrent.CancellationException;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class m implements Y0, Z0.b {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Z0.b f18493Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f18494Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f18495h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Wg.d f18496i0 = new Wg.d(false);

    public m(A a5) {
        AbstractC3557B.c0("density", a5);
        this.f18493Y = a5;
    }

    @Override // Z0.b
    public final long C(int i10) {
        return this.f18493Y.C(i10);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return this.f18493Y.D(f6);
    }

    @Override // Z0.b
    public final float J(int i10) {
        return this.f18493Y.J(i10);
    }

    @Override // Z0.b
    public final float K(float f6) {
        return this.f18493Y.K(f6);
    }

    @Override // Z0.b
    public final float O() {
        return this.f18493Y.O();
    }

    @Override // Z0.b
    public final float R(float f6) {
        return this.f18493Y.R(f6);
    }

    @Override // Z0.b
    public final int a0(float f6) {
        return this.f18493Y.a0(f6);
    }

    @Override // Z0.b
    public final float b() {
        return this.f18493Y.b();
    }

    @Override // Z0.b
    public final long g0(long j6) {
        return this.f18493Y.g0(j6);
    }

    @Override // Z0.b
    public final float i0(long j6) {
        return this.f18493Y.i0(j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // B.Y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k0(AbstractC4825e abstractC4825e) {
        l lVar;
        int i10;
        m mVar;
        if (abstractC4825e instanceof l) {
            lVar = (l) abstractC4825e;
            int i11 = lVar.f18492i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                lVar.f18492i0 = i11 - Integer.MIN_VALUE;
                Object obj = lVar.f18490Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = lVar.f18492i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        mVar = lVar.f18489Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    if (!this.f18494Z && !this.f18495h0) {
                        lVar.f18489Y = this;
                        lVar.f18492i0 = 1;
                        if (this.f18496i0.e(null, lVar) == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    mVar = this;
                }
                return Boolean.valueOf(mVar.f18494Z);
            }
        }
        lVar = new l(this, abstractC4825e);
        Object obj2 = lVar.f18490Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = lVar.f18492i0;
        if (i10 == 0) {
        }
        return Boolean.valueOf(mVar.f18494Z);
    }

    @Override // Z0.b
    public final long p(long j6) {
        return this.f18493Y.p(j6);
    }

    @Override // Z0.b
    public final float t(long j6) {
        return this.f18493Y.t(j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    @Override // B.Y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object y(AbstractC4825e abstractC4825e) {
        k kVar;
        Object obj;
        int i10;
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i11 = kVar.f18488h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f18488h0 = i11 - Integer.MIN_VALUE;
                obj = kVar.f18486Y;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = kVar.f18488h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    kVar.f18488h0 = 1;
                    obj = k0(kVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    return y.f36177a;
                }
                throw new CancellationException("The press gesture was canceled.");
            }
        }
        kVar = new k(this, abstractC4825e);
        obj = kVar.f18486Y;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = kVar.f18488h0;
        if (i10 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
