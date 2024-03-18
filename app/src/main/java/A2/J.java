package A2;

import android.media.AudioAttributes;
import android.media.AudioTrack;
import p2.C5052e;
import p2.C5065s;
import q2.C5261a;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: a  reason: collision with root package name */
    public final C5065s f404a;

    /* renamed from: b  reason: collision with root package name */
    public final int f405b;

    /* renamed from: c  reason: collision with root package name */
    public final int f406c;

    /* renamed from: d  reason: collision with root package name */
    public final int f407d;

    /* renamed from: e  reason: collision with root package name */
    public final int f408e;

    /* renamed from: f  reason: collision with root package name */
    public final int f409f;

    /* renamed from: g  reason: collision with root package name */
    public final int f410g;

    /* renamed from: h  reason: collision with root package name */
    public final int f411h;

    /* renamed from: i  reason: collision with root package name */
    public final C5261a f412i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f413j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f414k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f415l;

    public J(C5065s c5065s, int i10, int i11, int i12, int i13, int i14, int i15, int i16, C5261a c5261a, boolean z10, boolean z11, boolean z12) {
        this.f404a = c5065s;
        this.f405b = i10;
        this.f406c = i11;
        this.f407d = i12;
        this.f408e = i13;
        this.f409f = i14;
        this.f410g = i15;
        this.f411h = i16;
        this.f412i = c5261a;
        this.f413j = z10;
        this.f414k = z11;
        this.f415l = z12;
    }

    public static AudioAttributes c(C5052e c5052e, boolean z10) {
        if (z10) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return (AudioAttributes) c5052e.b().f8729Y;
    }

    public final AudioTrack a(C5052e c5052e, int i10) {
        boolean z10;
        boolean z11;
        int i11 = this.f406c;
        try {
            AudioTrack b10 = b(c5052e, i10);
            int state = b10.getState();
            if (state == 1) {
                return b10;
            }
            try {
                b10.release();
            } catch (Exception unused) {
            }
            if (i11 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            throw new C0073q(state, this.f408e, this.f409f, this.f411h, this.f404a, z11, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            if (i11 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            throw new C0073q(0, this.f408e, this.f409f, this.f411h, this.f404a, z10, e10);
        }
    }

    public final AudioTrack b(C5052e c5052e, int i10) {
        char c10;
        AudioTrack.Builder offloadedPlayback;
        int i11 = AbstractC5530A.f45131a;
        char c11 = 0;
        boolean z10 = false;
        boolean z11 = this.f415l;
        int i12 = this.f408e;
        int i13 = this.f410g;
        int i14 = this.f409f;
        if (i11 >= 29) {
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(c(c5052e, z11)).setAudioFormat(AbstractC5530A.o(i12, i14, i13)).setTransferMode(1).setBufferSizeInBytes(this.f411h).setSessionId(i10);
            if (this.f406c == 1) {
                z10 = true;
            }
            offloadedPlayback = sessionId.setOffloadedPlayback(z10);
            return offloadedPlayback.build();
        } else if (i11 >= 21) {
            return new AudioTrack(c(c5052e, z11), AbstractC5530A.o(i12, i14, i13), this.f411h, 1, i10);
        } else {
            int i15 = c5052e.f42013h0;
            if (i15 != 13) {
                switch (i15) {
                    case 2:
                        break;
                    case 3:
                        c10 = '\b';
                        c11 = c10;
                        break;
                    case 4:
                        c10 = 4;
                        c11 = c10;
                        break;
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        c10 = 5;
                        c11 = c10;
                        break;
                    case 6:
                        c10 = 2;
                        c11 = c10;
                        break;
                    default:
                        c10 = 3;
                        c11 = c10;
                        break;
                }
            } else {
                c11 = 1;
            }
            if (i10 == 0) {
                return new AudioTrack(c11, this.f408e, this.f409f, this.f410g, this.f411h, 1);
            }
            return new AudioTrack(c11, this.f408e, this.f409f, this.f410g, this.f411h, 1, i10);
        }
    }
}
