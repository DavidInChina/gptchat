package io.sentry;

import io.sentry.protocol.C3676c;
import io.sentry.protocol.C3677d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class O0 {

    /* renamed from: Y  reason: collision with root package name */
    public io.sentry.protocol.s f33836Y;

    /* renamed from: Z  reason: collision with root package name */
    public final C3676c f33837Z = new C3676c();

    /* renamed from: h0  reason: collision with root package name */
    public io.sentry.protocol.q f33838h0;

    /* renamed from: i0  reason: collision with root package name */
    public io.sentry.protocol.n f33839i0;

    /* renamed from: j0  reason: collision with root package name */
    public Map f33840j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f33841k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f33842l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f33843m0;

    /* renamed from: n0  reason: collision with root package name */
    public io.sentry.protocol.C f33844n0;

    /* renamed from: o0  reason: collision with root package name */
    public transient Throwable f33845o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f33846p0;

    /* renamed from: q0  reason: collision with root package name */
    public String f33847q0;

    /* renamed from: r0  reason: collision with root package name */
    public List f33848r0;

    /* renamed from: s0  reason: collision with root package name */
    public C3677d f33849s0;

    /* renamed from: t0  reason: collision with root package name */
    public Map f33850t0;

    public O0(io.sentry.protocol.s sVar) {
        this.f33836Y = sVar;
    }

    public final void a(String str, String str2) {
        if (this.f33840j0 == null) {
            this.f33840j0 = new HashMap();
        }
        this.f33840j0.put(str, str2);
    }
}
