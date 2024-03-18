package I4;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.gov.nist.core.Separators;
import android.graphics.PointF;
import android.os.Build;
import android.view.Choreographer;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import v4.C5971a;

/* loaded from: classes2.dex */
public final class d extends ValueAnimator implements Choreographer.FrameCallback {

    /* renamed from: q0  reason: collision with root package name */
    public C5971a f8051q0;

    /* renamed from: Y  reason: collision with root package name */
    public final CopyOnWriteArraySet f8040Y = new CopyOnWriteArraySet();

    /* renamed from: Z  reason: collision with root package name */
    public final CopyOnWriteArraySet f8041Z = new CopyOnWriteArraySet();

    /* renamed from: h0  reason: collision with root package name */
    public final CopyOnWriteArraySet f8042h0 = new CopyOnWriteArraySet();

    /* renamed from: i0  reason: collision with root package name */
    public float f8043i0 = 1.0f;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f8044j0 = false;

    /* renamed from: k0  reason: collision with root package name */
    public long f8045k0 = 0;

    /* renamed from: l0  reason: collision with root package name */
    public float f8046l0 = 0.0f;

    /* renamed from: m0  reason: collision with root package name */
    public float f8047m0 = 0.0f;

    /* renamed from: n0  reason: collision with root package name */
    public int f8048n0 = 0;

    /* renamed from: o0  reason: collision with root package name */
    public float f8049o0 = -2.14748365E9f;

    /* renamed from: p0  reason: collision with root package name */
    public float f8050p0 = 2.14748365E9f;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f8052r0 = false;

    /* renamed from: a */
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f8041Z.add(animatorListener);
    }

    /* renamed from: b */
    public final void addPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f8042h0.add(animatorPauseListener);
    }

    /* renamed from: c */
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f8040Y.add(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        Iterator it = this.f8041Z.iterator();
        while (it.hasNext()) {
            ((Animator.AnimatorListener) it.next()).onAnimationCancel(this);
        }
        i(h());
        m(true);
    }

    public final float d() {
        C5971a c5971a = this.f8051q0;
        if (c5971a == null) {
            return 0.0f;
        }
        float f6 = this.f8047m0;
        float f10 = c5971a.f47159l;
        return (f6 - f10) / (c5971a.f47160m - f10);
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j6) {
        boolean z10;
        float f6;
        float f10;
        if (this.f8052r0) {
            m(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
        C5971a c5971a = this.f8051q0;
        if (c5971a != null && this.f8052r0) {
            long j10 = this.f8045k0;
            long j11 = 0;
            if (j10 != 0) {
                j11 = j6 - j10;
            }
            float abs = ((float) j11) / ((1.0E9f / c5971a.f47161n) / Math.abs(this.f8043i0));
            float f11 = this.f8046l0;
            if (h()) {
                abs = -abs;
            }
            float f12 = f11 + abs;
            float f13 = f();
            float e10 = e();
            PointF pointF = f.f8054a;
            if (f12 >= f13 && f12 <= e10) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z11 = !z10;
            float b10 = f.b(f12, f(), e());
            this.f8046l0 = b10;
            this.f8047m0 = b10;
            this.f8045k0 = j6;
            j();
            if (z11) {
                if (getRepeatCount() != -1 && this.f8048n0 >= getRepeatCount()) {
                    if (this.f8043i0 < 0.0f) {
                        f10 = f();
                    } else {
                        f10 = e();
                    }
                    this.f8046l0 = f10;
                    this.f8047m0 = f10;
                    m(true);
                    i(h());
                } else {
                    Iterator it = this.f8041Z.iterator();
                    while (it.hasNext()) {
                        ((Animator.AnimatorListener) it.next()).onAnimationRepeat(this);
                    }
                    this.f8048n0++;
                    if (getRepeatMode() == 2) {
                        this.f8044j0 = !this.f8044j0;
                        this.f8043i0 = -this.f8043i0;
                    } else {
                        if (h()) {
                            f6 = e();
                        } else {
                            f6 = f();
                        }
                        this.f8046l0 = f6;
                        this.f8047m0 = f6;
                    }
                    this.f8045k0 = j6;
                }
            }
            if (this.f8051q0 != null) {
                float f14 = this.f8047m0;
                if (f14 >= this.f8049o0 && f14 <= this.f8050p0) {
                    return;
                }
                throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f8049o0), Float.valueOf(this.f8050p0), Float.valueOf(this.f8047m0)));
            }
        }
    }

    public final float e() {
        C5971a c5971a = this.f8051q0;
        if (c5971a == null) {
            return 0.0f;
        }
        float f6 = this.f8050p0;
        if (f6 == 2.14748365E9f) {
            return c5971a.f47160m;
        }
        return f6;
    }

    public final float f() {
        C5971a c5971a = this.f8051q0;
        if (c5971a == null) {
            return 0.0f;
        }
        float f6 = this.f8049o0;
        if (f6 == -2.14748365E9f) {
            return c5971a.f47159l;
        }
        return f6;
    }

    public final long g() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f6;
        float e10;
        float f10;
        if (this.f8051q0 == null) {
            return 0.0f;
        }
        if (h()) {
            f6 = e() - this.f8047m0;
            e10 = e();
            f10 = f();
        } else {
            f6 = this.f8047m0 - f();
            e10 = e();
            f10 = f();
        }
        return f6 / (e10 - f10);
    }

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(d());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        C5971a c5971a = this.f8051q0;
        if (c5971a == null) {
            return 0L;
        }
        return c5971a.b();
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ long getStartDelay() {
        g();
        throw null;
    }

    public final boolean h() {
        if (this.f8043i0 < 0.0f) {
            return true;
        }
        return false;
    }

    public final void i(boolean z10) {
        Iterator it = this.f8041Z.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z10);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.f8052r0;
    }

    public final void j() {
        Iterator it = this.f8040Y.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    /* renamed from: k */
    public final void removeAllListeners() {
        this.f8041Z.clear();
    }

    /* renamed from: l */
    public final void removeAllUpdateListeners() {
        this.f8040Y.clear();
    }

    public final void m(boolean z10) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z10) {
            this.f8052r0 = false;
        }
    }

    /* renamed from: n */
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f8041Z.remove(animatorListener);
    }

    /* renamed from: o */
    public final void removePauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.f8042h0.remove(animatorPauseListener);
    }

    /* renamed from: p */
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f8040Y.remove(animatorUpdateListener);
    }

    public final ValueAnimator q(long j6) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }

    public final void r(float f6) {
        if (this.f8046l0 == f6) {
            return;
        }
        float b10 = f.b(f6, f(), e());
        this.f8046l0 = b10;
        this.f8047m0 = b10;
        this.f8045k0 = 0L;
        j();
    }

    public final void s(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ void setInterpolator(TimeInterpolator timeInterpolator) {
        s(timeInterpolator);
        throw null;
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i10) {
        super.setRepeatMode(i10);
        if (i10 != 2 && this.f8044j0) {
            this.f8044j0 = false;
            this.f8043i0 = -this.f8043i0;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final /* bridge */ /* synthetic */ void setStartDelay(long j6) {
        u(j6);
        throw null;
    }

    public final void t(float f6, float f10) {
        float f11;
        float f12;
        if (f6 <= f10) {
            C5971a c5971a = this.f8051q0;
            if (c5971a == null) {
                f11 = -3.4028235E38f;
            } else {
                f11 = c5971a.f47159l;
            }
            if (c5971a == null) {
                f12 = Float.MAX_VALUE;
            } else {
                f12 = c5971a.f47160m;
            }
            float b10 = f.b(f6, f11, f12);
            float b11 = f.b(f10, f11, f12);
            if (b10 != this.f8049o0 || b11 != this.f8050p0) {
                this.f8049o0 = b10;
                this.f8050p0 = b11;
                r((int) f.b(this.f8047m0, b10, b11));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("minFrame (" + f6 + ") must be <= maxFrame (" + f10 + Separators.RPAREN);
    }

    public final void u(long j6) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }
}
