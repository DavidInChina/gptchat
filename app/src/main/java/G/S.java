package G;

import E0.l0;

/* loaded from: classes2.dex */
public final class S implements O {

    /* renamed from: a  reason: collision with root package name */
    public final int f5448a;

    /* renamed from: b  reason: collision with root package name */
    public final long f5449b;

    /* renamed from: c  reason: collision with root package name */
    public l0 f5450c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f5451d;

    public S(int i10, long j6) {
        this.f5448a = i10;
        this.f5449b = j6;
    }

    @Override // G.O
    public final void cancel() {
        if (!this.f5451d) {
            this.f5451d = true;
            l0 l0Var = this.f5450c;
            if (l0Var != null) {
                l0Var.dispose();
            }
            this.f5450c = null;
        }
    }
}
