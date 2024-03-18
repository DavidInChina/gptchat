package B;

import java.util.concurrent.CancellationException;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: B.c1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115c1 implements Y0, Z0.b {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ Z0.b f1289Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f1290Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1291h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Wg.d f1292i0 = new Wg.d(false);

    public C0115c1(Z0.b bVar) {
        this.f1289Y = bVar;
    }

    @Override // Z0.b
    public final long C(int i10) {
        return this.f1289Y.C(i10);
    }

    @Override // Z0.b
    public final long D(float f6) {
        return this.f1289Y.D(f6);
    }

    @Override // Z0.b
    public final float J(int i10) {
        return this.f1289Y.J(i10);
    }

    @Override // Z0.b
    public final float K(float f6) {
        return this.f1289Y.K(f6);
    }

    @Override // Z0.b
    public final float O() {
        return this.f1289Y.O();
    }

    @Override // Z0.b
    public final float R(float f6) {
        return this.f1289Y.R(f6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(AbstractC4825e abstractC4825e) {
        C0109a1 c0109a1;
        int i10;
        C0115c1 c0115c1;
        if (abstractC4825e instanceof C0109a1) {
            c0109a1 = (C0109a1) abstractC4825e;
            int i11 = c0109a1.f1261i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0109a1.f1261i0 = i11 - Integer.MIN_VALUE;
                Object obj = c0109a1.f1259Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0109a1.f1261i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c0115c1 = c0109a1.f1258Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    c0109a1.f1258Y = this;
                    c0109a1.f1261i0 = 1;
                    if (this.f1292i0.e(null, c0109a1) == enumC5000a) {
                        return enumC5000a;
                    }
                    c0115c1 = this;
                }
                c0115c1.f1290Z = false;
                c0115c1.f1291h0 = false;
                return jf.y.f36177a;
            }
        }
        c0109a1 = new C0109a1(this, abstractC4825e);
        Object obj2 = c0109a1.f1259Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0109a1.f1261i0;
        if (i10 == 0) {
        }
        c0115c1.f1290Z = false;
        c0115c1.f1291h0 = false;
        return jf.y.f36177a;
    }

    @Override // Z0.b
    public final int a0(float f6) {
        return this.f1289Y.a0(f6);
    }

    @Override // Z0.b
    public final float b() {
        return this.f1289Y.b();
    }

    @Override // Z0.b
    public final long g0(long j6) {
        return this.f1289Y.g0(j6);
    }

    @Override // Z0.b
    public final float i0(long j6) {
        return this.f1289Y.i0(j6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // B.Y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k0(AbstractC4825e abstractC4825e) {
        C0112b1 c0112b1;
        int i10;
        C0115c1 c0115c1;
        if (abstractC4825e instanceof C0112b1) {
            c0112b1 = (C0112b1) abstractC4825e;
            int i11 = c0112b1.f1275i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c0112b1.f1275i0 = i11 - Integer.MIN_VALUE;
                Object obj = c0112b1.f1273Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = c0112b1.f1275i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        c0115c1 = c0112b1.f1272Y;
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    if (!this.f1290Z && !this.f1291h0) {
                        c0112b1.f1272Y = this;
                        c0112b1.f1275i0 = 1;
                        if (this.f1292i0.e(null, c0112b1) == enumC5000a) {
                            return enumC5000a;
                        }
                        c0115c1 = this;
                    } else {
                        c0115c1 = this;
                        return Boolean.valueOf(c0115c1.f1290Z);
                    }
                }
                c0115c1.f1292i0.g(null);
                return Boolean.valueOf(c0115c1.f1290Z);
            }
        }
        c0112b1 = new C0112b1(this, abstractC4825e);
        Object obj2 = c0112b1.f1273Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = c0112b1.f1275i0;
        if (i10 == 0) {
        }
        c0115c1.f1292i0.g(null);
        return Boolean.valueOf(c0115c1.f1290Z);
    }

    @Override // Z0.b
    public final long p(long j6) {
        return this.f1289Y.p(j6);
    }

    @Override // Z0.b
    public final float t(long j6) {
        return this.f1289Y.t(j6);
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
        Z0 z02;
        Object obj;
        int i10;
        if (abstractC4825e instanceof Z0) {
            z02 = (Z0) abstractC4825e;
            int i11 = z02.f1250h0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                z02.f1250h0 = i11 - Integer.MIN_VALUE;
                obj = z02.f1248Y;
                Object obj2 = EnumC5000a.f41328Y;
                i10 = z02.f1250h0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        com.google.android.gms.internal.play_billing.N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    com.google.android.gms.internal.play_billing.N.B0(obj);
                    z02.f1250h0 = 1;
                    obj = k0(z02);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    return jf.y.f36177a;
                }
                throw new CancellationException("The press gesture was canceled.");
            }
        }
        z02 = new Z0(this, abstractC4825e);
        obj = z02.f1248Y;
        Object obj22 = EnumC5000a.f41328Y;
        i10 = z02.f1250h0;
        if (i10 == 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
