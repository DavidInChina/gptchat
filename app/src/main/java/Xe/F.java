package Xe;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import livekit.org.webrtc.RtpParameters;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final int f21855a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21856b;

    public F(int i10, int i11) {
        this.f21855a = i10;
        this.f21856b = i11;
    }

    public final RtpParameters.Encoding a(String str, double d10) {
        RtpParameters.Encoding encoding = new RtpParameters.Encoding(str, true, Double.valueOf(d10));
        encoding.numTemporalLayers = 1;
        encoding.maxBitrateBps = Integer.valueOf(this.f21855a);
        encoding.maxFramerate = Integer.valueOf(this.f21856b);
        if (d10 == 1.0d) {
            encoding.networkPriority = 3;
            encoding.bitratePriority = 4.0d;
        } else {
            encoding.networkPriority = 1;
            encoding.bitratePriority = 1.0d;
        }
        return encoding;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f6 = (F) obj;
        if (this.f21855a == f6.f21855a && this.f21856b == f6.f21856b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f21855a * 31) + this.f21856b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoEncoding(maxBitrate=");
        sb2.append(this.f21855a);
        sb2.append(", maxFps=");
        return AbstractC2469q0.j(sb2, this.f21856b, ')');
    }
}
