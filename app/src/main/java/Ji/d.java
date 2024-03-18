package Ji;

import K4.J;
import sun.misc.Cleaner;

/* loaded from: classes.dex */
public final class d extends g {

    /* renamed from: k0  reason: collision with root package name */
    public float[] f9292k0;

    public d(long j6, boolean z10) {
        this.f9300Y = q.f9306Z;
        this.f9302h0 = 4L;
        if (j6 > 0) {
            this.f9301Z = j6;
            if (j6 > 1073741824) {
                this.f9304j0 = r.f9309a.allocateMemory(4 * j6);
                if (z10) {
                    a(j6);
                }
                Cleaner.create(this, new f(this.f9304j0, this.f9301Z, this.f9302h0));
                J.G(this.f9301Z * this.f9302h0);
                return;
            }
            this.f9292k0 = new float[(int) j6];
            return;
        }
        throw new IllegalArgumentException(j6 + " is not a positive long value");
    }

    public final float b(long j6) {
        long j10 = this.f9304j0;
        if (j10 != 0) {
            return r.f9309a.getFloat((this.f9302h0 * j6) + j10);
        }
        boolean z10 = this.f9303i0;
        float[] fArr = this.f9292k0;
        if (z10) {
            return fArr[0];
        }
        return fArr[(int) j6];
    }

    public final void c(float f6, long j6) {
        long j10 = this.f9304j0;
        if (j10 != 0) {
            r.f9309a.putFloat((this.f9302h0 * j6) + j10, f6);
        } else if (!this.f9303i0) {
            this.f9292k0[(int) j6] = f6;
        } else {
            throw new IllegalAccessError("Constant arrays cannot be modified.");
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [Ji.d, java.lang.Object, Ji.g] */
    public final Object clone() {
        if (this.f9303i0) {
            long j6 = this.f9301Z;
            float b10 = b(0L);
            ?? gVar = new g();
            gVar.f9300Y = q.f9306Z;
            gVar.f9302h0 = 4L;
            if (j6 > 0) {
                gVar.f9301Z = j6;
                gVar.f9303i0 = true;
                gVar.f9292k0 = new float[]{b10};
                return gVar;
            }
            throw new IllegalArgumentException(j6 + " is not a positive long value");
        }
        d dVar = new d(this.f9301Z, false);
        r.a(0L, 0L, this.f9301Z, this, dVar);
        return dVar;
    }

    @Override // Ji.g
    public final boolean equals(Object obj) {
        if (!super.equals(obj) || this.f9292k0 != ((d) obj).f9292k0) {
            return false;
        }
        return true;
    }

    @Override // Ji.g
    public final int hashCode() {
        int i10;
        int hashCode = super.hashCode() * 29;
        float[] fArr = this.f9292k0;
        if (fArr != null) {
            i10 = fArr.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
