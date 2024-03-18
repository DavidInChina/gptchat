package J2;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public long f8736a;

    /* renamed from: b  reason: collision with root package name */
    public long f8737b;

    /* renamed from: c  reason: collision with root package name */
    public long f8738c;

    /* renamed from: d  reason: collision with root package name */
    public long f8739d;

    /* renamed from: e  reason: collision with root package name */
    public long f8740e;

    /* renamed from: f  reason: collision with root package name */
    public long f8741f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean[] f8742g = new boolean[15];

    /* renamed from: h  reason: collision with root package name */
    public int f8743h;

    public final boolean a() {
        if (this.f8739d > 15 && this.f8743h == 0) {
            return true;
        }
        return false;
    }

    public final void b(long j6) {
        long j10 = this.f8739d;
        if (j10 == 0) {
            this.f8736a = j6;
        } else if (j10 == 1) {
            long j11 = j6 - this.f8736a;
            this.f8737b = j11;
            this.f8741f = j11;
            this.f8740e = 1L;
        } else {
            long j12 = j6 - this.f8738c;
            int i10 = (int) (j10 % 15);
            int i11 = (Math.abs(j12 - this.f8737b) > 1000000L ? 1 : (Math.abs(j12 - this.f8737b) == 1000000L ? 0 : -1));
            boolean[] zArr = this.f8742g;
            if (i11 <= 0) {
                this.f8740e++;
                this.f8741f += j12;
                if (zArr[i10]) {
                    zArr[i10] = false;
                    this.f8743h--;
                }
            } else if (!zArr[i10]) {
                zArr[i10] = true;
                this.f8743h++;
            }
        }
        this.f8739d++;
        this.f8738c = j6;
    }

    public final void c() {
        this.f8739d = 0L;
        this.f8740e = 0L;
        this.f8741f = 0L;
        this.f8743h = 0;
        Arrays.fill(this.f8742g, false);
    }
}
