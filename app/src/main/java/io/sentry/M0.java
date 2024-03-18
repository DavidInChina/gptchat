package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Map;

/* loaded from: classes2.dex */
public final class M0 implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f33820Y;

    /* renamed from: Z  reason: collision with root package name */
    public Double f33821Z;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f33822h0;

    /* renamed from: i0  reason: collision with root package name */
    public Double f33823i0;

    /* renamed from: j0  reason: collision with root package name */
    public String f33824j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f33825k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f33826l0;

    /* renamed from: m0  reason: collision with root package name */
    public Map f33827m0;

    public M0(r1 r1Var, U3.n nVar) {
        this.f33822h0 = ((Boolean) nVar.f17426Y).booleanValue();
        this.f33823i0 = (Double) nVar.f17427Z;
        this.f33820Y = ((Boolean) nVar.f17428h0).booleanValue();
        this.f33821Z = (Double) nVar.f17429i0;
        this.f33824j0 = r1Var.getProfilingTracesDirPath();
        this.f33825k0 = r1Var.isProfilingEnabled();
        this.f33826l0 = r1Var.getProfilingTracesHz();
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("profile_sampled");
        c3636c1.v(h10, Boolean.valueOf(this.f33820Y));
        c3636c1.n("profile_sample_rate");
        c3636c1.v(h10, this.f33821Z);
        c3636c1.n("trace_sampled");
        c3636c1.v(h10, Boolean.valueOf(this.f33822h0));
        c3636c1.n("trace_sample_rate");
        c3636c1.v(h10, this.f33823i0);
        c3636c1.n("profiling_traces_dir_path");
        c3636c1.v(h10, this.f33824j0);
        c3636c1.n("is_profiling_enabled");
        c3636c1.v(h10, Boolean.valueOf(this.f33825k0));
        c3636c1.n("profiling_traces_hz");
        c3636c1.v(h10, Integer.valueOf(this.f33826l0));
        Map map = this.f33827m0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f33827m0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
