package A2;

import android.media.AudioTrack;
import s2.AbstractC5530A;

/* renamed from: A2.v  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0077v {

    /* renamed from: a  reason: collision with root package name */
    public final C0076u f593a;

    /* renamed from: b  reason: collision with root package name */
    public int f594b;

    /* renamed from: c  reason: collision with root package name */
    public long f595c;

    /* renamed from: d  reason: collision with root package name */
    public long f596d;

    /* renamed from: e  reason: collision with root package name */
    public long f597e;

    /* renamed from: f  reason: collision with root package name */
    public long f598f;

    public C0077v(AudioTrack audioTrack) {
        if (AbstractC5530A.f45131a >= 19) {
            this.f593a = new C0076u(audioTrack);
            a();
            return;
        }
        this.f593a = null;
        b(3);
    }

    public final void a() {
        if (this.f593a != null) {
            b(0);
        }
    }

    public final void b(int i10) {
        this.f594b = i10;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2 && i10 != 3) {
                    if (i10 == 4) {
                        this.f596d = 500000L;
                        return;
                    }
                    throw new IllegalStateException();
                }
                this.f596d = 10000000L;
                return;
            }
            this.f596d = 10000L;
            return;
        }
        this.f597e = 0L;
        this.f598f = -1L;
        this.f595c = System.nanoTime() / 1000;
        this.f596d = 10000L;
    }
}
