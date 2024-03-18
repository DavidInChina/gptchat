package i4;

import Ng.Q;
import android.os.StatFs;
import com.google.android.gms.internal.play_billing.N;
import java.io.File;
import ji.AbstractC4141p;
import ji.C4113B;
import ji.x;

/* renamed from: i4.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3468a {

    /* renamed from: a  reason: collision with root package name */
    public C4113B f32659a;

    /* renamed from: f  reason: collision with root package name */
    public long f32664f;

    /* renamed from: b  reason: collision with root package name */
    public final x f32660b = AbstractC4141p.f36737a;

    /* renamed from: c  reason: collision with root package name */
    public double f32661c = 0.02d;

    /* renamed from: d  reason: collision with root package name */
    public final long f32662d = 10485760;

    /* renamed from: e  reason: collision with root package name */
    public final long f32663e = 262144000;

    /* renamed from: g  reason: collision with root package name */
    public final Tg.d f32665g = Q.f12906c;

    public final n a() {
        long j6;
        C4113B c4113b = this.f32659a;
        if (c4113b != null) {
            if (this.f32661c > 0.0d) {
                try {
                    File e10 = c4113b.e();
                    e10.mkdir();
                    StatFs statFs = new StatFs(e10.getAbsolutePath());
                    j6 = N.q((long) (this.f32661c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f32662d, this.f32663e);
                } catch (Exception unused) {
                    j6 = this.f32662d;
                }
            } else {
                j6 = this.f32664f;
            }
            return new n(j6, c4113b, this.f32660b, this.f32665g);
        }
        throw new IllegalStateException("directory == null".toString());
    }
}
