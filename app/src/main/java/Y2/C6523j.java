package y2;

import livekit.org.webrtc.WebrtcBuildVersion;
import s2.AbstractC5530A;

/* renamed from: y2.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6523j implements AbstractC6511N {

    /* renamed from: a  reason: collision with root package name */
    public final I2.d f50633a;

    /* renamed from: b  reason: collision with root package name */
    public final long f50634b;

    /* renamed from: c  reason: collision with root package name */
    public final long f50635c;

    /* renamed from: i  reason: collision with root package name */
    public boolean f50641i;

    /* renamed from: d  reason: collision with root package name */
    public final long f50636d = AbstractC5530A.C(2500);

    /* renamed from: e  reason: collision with root package name */
    public final long f50637e = AbstractC5530A.C(5000);

    /* renamed from: f  reason: collision with root package name */
    public final int f50638f = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f50640h = 13107200;

    /* renamed from: g  reason: collision with root package name */
    public final long f50639g = AbstractC5530A.C(0);

    public C6523j() {
        I2.d dVar = new I2.d();
        a("bufferForPlaybackMs", 2500, 0, WebrtcBuildVersion.maint_version);
        a("bufferForPlaybackAfterRebufferMs", 5000, 0, WebrtcBuildVersion.maint_version);
        a("minBufferMs", 50000, 2500, "bufferForPlaybackMs");
        a("minBufferMs", 50000, 5000, "bufferForPlaybackAfterRebufferMs");
        a("maxBufferMs", 50000, 50000, "minBufferMs");
        a("backBufferDurationMs", 0, 0, WebrtcBuildVersion.maint_version);
        this.f50633a = dVar;
        long j6 = 50000;
        this.f50634b = AbstractC5530A.C(j6);
        this.f50635c = AbstractC5530A.C(j6);
    }

    public static void a(String str, int i10, int i11, String str2) {
        boolean z10;
        if (i10 >= i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        Gi.e.k(str + " cannot be less than " + str2, z10);
    }

    public final void b(boolean z10) {
        int i10 = this.f50638f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        this.f50640h = i10;
        this.f50641i = false;
        if (z10) {
            I2.d dVar = this.f50633a;
            synchronized (dVar) {
                if (dVar.f7962a) {
                    dVar.a(0);
                }
            }
        }
    }

    public final boolean c(float f6, long j6) {
        int i10;
        boolean z10;
        I2.d dVar = this.f50633a;
        synchronized (dVar) {
            i10 = dVar.f7965d * dVar.f7963b;
        }
        if (i10 >= this.f50640h) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = (f6 > 1.0f ? 1 : (f6 == 1.0f ? 0 : -1));
        long j10 = this.f50635c;
        long j11 = this.f50634b;
        if (i11 > 0) {
            j11 = Math.min(AbstractC5530A.s(f6, j11), j10);
        }
        if (j6 < Math.max(j11, 500000L)) {
            boolean z11 = !z10;
            this.f50641i = z11;
            if (!z11 && j6 < 500000) {
                s2.p.g("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j6 >= j10 || z10) {
            this.f50641i = false;
        }
        return this.f50641i;
    }
}
