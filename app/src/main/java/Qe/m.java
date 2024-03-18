package Qe;

import Ng.x0;
import Qg.F0;
import Qg.s0;
import android.media.AudioTrack;
import androidx.lifecycle.C2071f;
import cf.AbstractC2408g;
import id.AbstractC3557B;
import java.util.concurrent.atomic.AtomicBoolean;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class m implements h {
    public static final l Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final C2071f f14704a;

    /* renamed from: d  reason: collision with root package name */
    public AudioTrack f14707d;

    /* renamed from: b  reason: collision with root package name */
    public final F0 f14705b = s0.c(Boolean.FALSE);

    /* renamed from: c  reason: collision with root package name */
    public final F0 f14706c = s0.c(Boolean.TRUE);

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f14708e = new AtomicBoolean(false);

    public m(x0 x0Var) {
        AbstractC3557B.c0("dispatcher", x0Var);
        C2071f c2071f = new C2071f(x0Var, 1);
        this.f14704a = c2071f;
        Ad.l.O0(c2071f, null, null, new k(this, null), 3);
    }

    @Override // Qe.h
    public final void a() {
        this.f14706c.setValue(Boolean.TRUE);
    }

    @Override // Qe.h
    public final void b() {
        this.f14706c.setValue(Boolean.FALSE);
    }

    public final void c() {
        AudioTrack audioTrack;
        if (this.f14708e.compareAndSet(true, false) && (audioTrack = this.f14707d) != null) {
            synchronized (audioTrack) {
                try {
                    if (audioTrack.getState() == 1) {
                        audioTrack.pause();
                    } else {
                        AbstractC2408g.Companion.getClass();
                        if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                            Mi.a.a(new Object[0]);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // Qe.h
    public final void start() {
        this.f14705b.setValue(Boolean.TRUE);
    }

    @Override // Qe.h
    public final void stop() {
        this.f14705b.setValue(Boolean.FALSE);
    }
}
