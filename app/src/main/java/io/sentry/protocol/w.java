package io.sentry.protocol;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.C3645f1;
import io.sentry.H;
import java.util.Map;

/* loaded from: classes2.dex */
public final class w implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34641Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34642Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34643h0;

    /* renamed from: i0  reason: collision with root package name */
    public Integer f34644i0;

    /* renamed from: j0  reason: collision with root package name */
    public Integer f34645j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f34646k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f34647l0;

    /* renamed from: m0  reason: collision with root package name */
    public Boolean f34648m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f34649n0;

    /* renamed from: o0  reason: collision with root package name */
    public Boolean f34650o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f34651p0;

    /* renamed from: q0  reason: collision with root package name */
    public String f34652q0;

    /* renamed from: r0  reason: collision with root package name */
    public String f34653r0;

    /* renamed from: s0  reason: collision with root package name */
    public String f34654s0;

    /* renamed from: t0  reason: collision with root package name */
    public String f34655t0;

    /* renamed from: u0  reason: collision with root package name */
    public Map f34656u0;

    /* renamed from: v0  reason: collision with root package name */
    public String f34657v0;

    /* renamed from: w0  reason: collision with root package name */
    public C3645f1 f34658w0;

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        if (this.f34641Y != null) {
            c3636c1.n("filename");
            c3636c1.t(this.f34641Y);
        }
        if (this.f34642Z != null) {
            c3636c1.n("function");
            c3636c1.t(this.f34642Z);
        }
        if (this.f34643h0 != null) {
            c3636c1.n("module");
            c3636c1.t(this.f34643h0);
        }
        if (this.f34644i0 != null) {
            c3636c1.n("lineno");
            c3636c1.s(this.f34644i0);
        }
        if (this.f34645j0 != null) {
            c3636c1.n("colno");
            c3636c1.s(this.f34645j0);
        }
        if (this.f34646k0 != null) {
            c3636c1.n("abs_path");
            c3636c1.t(this.f34646k0);
        }
        if (this.f34647l0 != null) {
            c3636c1.n("context_line");
            c3636c1.t(this.f34647l0);
        }
        if (this.f34648m0 != null) {
            c3636c1.n("in_app");
            c3636c1.r(this.f34648m0);
        }
        if (this.f34649n0 != null) {
            c3636c1.n("package");
            c3636c1.t(this.f34649n0);
        }
        if (this.f34650o0 != null) {
            c3636c1.n("native");
            c3636c1.r(this.f34650o0);
        }
        if (this.f34651p0 != null) {
            c3636c1.n("platform");
            c3636c1.t(this.f34651p0);
        }
        if (this.f34652q0 != null) {
            c3636c1.n("image_addr");
            c3636c1.t(this.f34652q0);
        }
        if (this.f34653r0 != null) {
            c3636c1.n("symbol_addr");
            c3636c1.t(this.f34653r0);
        }
        if (this.f34654s0 != null) {
            c3636c1.n("instruction_addr");
            c3636c1.t(this.f34654s0);
        }
        if (this.f34657v0 != null) {
            c3636c1.n("raw_function");
            c3636c1.t(this.f34657v0);
        }
        if (this.f34655t0 != null) {
            c3636c1.n("symbol");
            c3636c1.t(this.f34655t0);
        }
        if (this.f34658w0 != null) {
            c3636c1.n("lock");
            c3636c1.v(h10, this.f34658w0);
        }
        Map map = this.f34656u0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34656u0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
