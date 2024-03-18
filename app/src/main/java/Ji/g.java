package Ji;

import java.io.Serializable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import li.AbstractC4499c;

/* loaded from: classes.dex */
public abstract class g implements Serializable, Cloneable {

    /* renamed from: Y  reason: collision with root package name */
    public q f9300Y;

    /* renamed from: Z  reason: collision with root package name */
    public long f9301Z;

    /* renamed from: h0  reason: collision with root package name */
    public long f9302h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f9303i0 = false;

    /* renamed from: j0  reason: collision with root package name */
    public long f9304j0 = 0;

    public final void a(long j6) {
        long j10;
        if (this.f9304j0 != 0) {
            int e10 = (int) AbstractC4499c.e(j6, c.b());
            if (e10 > 2 && j6 >= c.a()) {
                long j11 = j6 / e10;
                Future[] futureArr = new Future[e10];
                long j12 = this.f9304j0;
                for (int i10 = 0; i10 < e10; i10++) {
                    long j13 = i10 * j11;
                    if (i10 == e10 - 1) {
                        j10 = j6;
                    } else {
                        j10 = j13 + j11;
                    }
                    futureArr[i10] = c.c(new e(this, j13, j10, j12));
                }
                try {
                    c.d(futureArr);
                    return;
                } catch (InterruptedException unused) {
                    r.f9309a.setMemory(this.f9304j0, j6 * this.f9302h0, (byte) 0);
                    return;
                } catch (ExecutionException unused2) {
                    r.f9309a.setMemory(this.f9304j0, this.f9302h0 * j6, (byte) 0);
                    return;
                }
            }
            r.f9309a.setMemory(this.f9304j0, j6 * this.f9302h0, (byte) 0);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f9300Y != gVar.f9300Y || this.f9301Z != gVar.f9301Z || this.f9302h0 != gVar.f9302h0 || this.f9303i0 != gVar.f9303i0 || this.f9304j0 != gVar.f9304j0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i10;
        q qVar = this.f9300Y;
        if (qVar != null) {
            i10 = qVar.hashCode();
        } else {
            i10 = 0;
        }
        long j6 = this.f9301Z;
        long j10 = this.f9302h0;
        long j11 = this.f9304j0;
        return ((((((((203 + i10) * 29) + ((int) (j6 ^ (j6 >>> 32)))) * 29) + ((int) (j10 ^ (j10 >>> 32)))) * 29) + (this.f9303i0 ? 1 : 0)) * 841) + ((int) (j11 ^ (j11 >>> 32)));
    }
}
