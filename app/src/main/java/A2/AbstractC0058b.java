package A2;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import s2.AbstractC5530A;
import x8.n0;
import x8.o0;
import x8.p0;

/* renamed from: A2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0058b {

    /* renamed from: a  reason: collision with root package name */
    public static final AudioAttributes f527a = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    /* JADX WARN: Type inference failed for: r0v1, types: [x8.K, x8.H] */
    public static x8.N a() {
        boolean isDirectPlaybackSupported;
        x8.L l10 = x8.N.f49523Z;
        ?? h10 = new x8.H();
        p0 p0Var = C0059c.f537e;
        n0 n0Var = p0Var.f49528Z;
        if (n0Var == null) {
            n0 n0Var2 = new n0(p0Var, new o0(0, p0Var.f49598k0, p0Var.f49597j0));
            p0Var.f49528Z = n0Var2;
            n0Var = n0Var2;
        }
        com.google.android.gms.internal.play_billing.C m02 = n0Var.m0();
        while (m02.hasNext()) {
            Integer num = (Integer) m02.next();
            int intValue = num.intValue();
            if (AbstractC5530A.f45131a >= AbstractC5530A.n(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), f527a);
                if (isDirectPlaybackSupported) {
                    h10.d0(num);
                }
            }
        }
        h10.d0(2);
        return h10.i0();
    }

    public static int b(int i10, int i11) {
        boolean isDirectPlaybackSupported;
        for (int i12 = 10; i12 > 0; i12--) {
            int p10 = AbstractC5530A.p(i12);
            if (p10 != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i10).setSampleRate(i11).setChannelMask(p10).build(), f527a);
                if (isDirectPlaybackSupported) {
                    return i12;
                }
            }
        }
        return 0;
    }
}
