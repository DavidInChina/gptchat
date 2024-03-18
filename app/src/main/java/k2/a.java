package K2;

import io.sentry.C3636c1;
import java.nio.ByteBuffer;
import p2.C5065s;
import s2.AbstractC5530A;
import s2.u;
import x2.h;
import y.AbstractC6463a;
import y2.AbstractC6519f;
import y2.C6501D;

/* loaded from: classes.dex */
public final class a extends AbstractC6519f {

    /* renamed from: A0  reason: collision with root package name */
    public long f9326A0;

    /* renamed from: w0  reason: collision with root package name */
    public final h f9327w0 = new h(1);

    /* renamed from: x0  reason: collision with root package name */
    public final u f9328x0 = new u();

    /* renamed from: y0  reason: collision with root package name */
    public long f9329y0;

    /* renamed from: z0  reason: collision with root package name */
    public C6501D f9330z0;

    public a() {
        super(6);
    }

    @Override // y2.AbstractC6519f, y2.e0
    public final void b(int i10, Object obj) {
        if (i10 == 8) {
            this.f9330z0 = (C6501D) obj;
        }
    }

    @Override // y2.AbstractC6519f
    public final String i() {
        return "CameraMotionRenderer";
    }

    @Override // y2.AbstractC6519f
    public final boolean k() {
        return j();
    }

    @Override // y2.AbstractC6519f
    public final boolean l() {
        return true;
    }

    @Override // y2.AbstractC6519f
    public final void m() {
        C6501D c6501d = this.f9330z0;
        if (c6501d != null) {
            c6501d.c();
        }
    }

    @Override // y2.AbstractC6519f
    public final void o(long j6, boolean z10) {
        this.f9326A0 = Long.MIN_VALUE;
        C6501D c6501d = this.f9330z0;
        if (c6501d != null) {
            c6501d.c();
        }
    }

    @Override // y2.AbstractC6519f
    public final void t(C5065s[] c5065sArr, long j6, long j10) {
        this.f9329y0 = j10;
    }

    @Override // y2.AbstractC6519f
    public final void v(long j6, long j10) {
        boolean z10;
        float[] fArr;
        while (!j() && this.f9326A0 < 100000 + j6) {
            h hVar = this.f9327w0;
            hVar.i();
            C3636c1 c3636c1 = this.f50565h0;
            c3636c1.g();
            if (u(c3636c1, hVar, 0) == -4 && !hVar.g(4)) {
                long j11 = hVar.f48643l0;
                this.f9326A0 = j11;
                if (j11 < this.f50574q0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.f9330z0 != null && !z10) {
                    hVar.l();
                    ByteBuffer byteBuffer = hVar.f48641j0;
                    int i10 = AbstractC5530A.f45131a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        u uVar = this.f9328x0;
                        uVar.D(limit, array);
                        uVar.F(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i11 = 0; i11 < 3; i11++) {
                            fArr2[i11] = Float.intBitsToFloat(uVar.i());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f9330z0.a(this.f9326A0 - this.f9329y0, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // y2.AbstractC6519f
    public final int z(C5065s c5065s) {
        if ("application/x-camera-motion".equals(c5065s.f42319q0)) {
            return AbstractC6463a.a(4, 0, 0, 0);
        }
        return AbstractC6463a.a(0, 0, 0, 0);
    }
}
