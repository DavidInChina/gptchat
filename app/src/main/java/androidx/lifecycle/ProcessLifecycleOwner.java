package androidx.lifecycle;

import android.os.Handler;
import g.RunnableC3111d;
import id.AbstractC3557B;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003\u00a8\u0006\u0006"}, d2 = {"Landroidx/lifecycle/ProcessLifecycleOwner;", "Landroidx/lifecycle/v;", "<init>", "()V", "androidx/lifecycle/H", "P5/c", "lifecycle-process_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class ProcessLifecycleOwner implements AbstractC2086v {

    /* renamed from: n0  reason: collision with root package name */
    public static final ProcessLifecycleOwner f25313n0 = new ProcessLifecycleOwner();

    /* renamed from: Y  reason: collision with root package name */
    public int f25314Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f25315Z;

    /* renamed from: j0  reason: collision with root package name */
    public Handler f25318j0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f25316h0 = true;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f25317i0 = true;

    /* renamed from: k0  reason: collision with root package name */
    public final C2088x f25319k0 = new C2088x(this);

    /* renamed from: l0  reason: collision with root package name */
    public final RunnableC3111d f25320l0 = new RunnableC3111d(12, this);

    /* renamed from: m0  reason: collision with root package name */
    public final K f25321m0 = new K(this);

    private ProcessLifecycleOwner() {
    }

    public final void b() {
        int i10 = this.f25315Z + 1;
        this.f25315Z = i10;
        if (i10 == 1) {
            if (this.f25316h0) {
                this.f25319k0.k(EnumC2081p.ON_RESUME);
                this.f25316h0 = false;
                return;
            }
            Handler handler = this.f25318j0;
            AbstractC3557B.Z(handler);
            handler.removeCallbacks(this.f25320l0);
        }
    }

    @Override // androidx.lifecycle.AbstractC2086v
    public final S h() {
        return this.f25319k0;
    }
}
