package A2;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a  reason: collision with root package name */
    public Exception f422a;

    /* renamed from: b  reason: collision with root package name */
    public long f423b;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f422a == null) {
            this.f422a = exc;
            this.f423b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f423b) {
            Exception exc2 = this.f422a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f422a;
            this.f422a = null;
            throw exc3;
        }
    }
}
