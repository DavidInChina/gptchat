package io.sentry;

import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class H1 {

    /* renamed from: a  reason: collision with root package name */
    public final r1 f33797a;

    /* renamed from: b  reason: collision with root package name */
    public final SecureRandom f33798b;

    public H1(r1 r1Var) {
        Ad.l.Z0("options are required", r1Var);
        SecureRandom secureRandom = new SecureRandom();
        this.f33797a = r1Var;
        this.f33798b = secureRandom;
    }

    public final U3.n a(U3.e eVar) {
        boolean z10;
        Double d10;
        Double d11;
        U3.n nVar = ((I1) eVar.f17400Y).f33717i0;
        if (nVar != null) {
            return nVar;
        }
        r1 r1Var = this.f33797a;
        r1Var.getProfilesSampler();
        Double profilesSampleRate = r1Var.getProfilesSampleRate();
        boolean z11 = false;
        SecureRandom secureRandom = this.f33798b;
        if (profilesSampleRate != null && profilesSampleRate.doubleValue() >= secureRandom.nextDouble()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Boolean valueOf = Boolean.valueOf(z10);
        r1Var.getTracesSampler();
        U3.n nVar2 = ((I1) eVar.f17400Y).f33804r0;
        if (nVar2 != null) {
            return nVar2;
        }
        Double tracesSampleRate = r1Var.getTracesSampleRate();
        if (Boolean.TRUE.equals(r1Var.getEnableTracing())) {
            d10 = Double.valueOf(1.0d);
        } else {
            d10 = null;
        }
        if (tracesSampleRate == null) {
            tracesSampleRate = d10;
        }
        double pow = Math.pow(2.0d, r1Var.getBackpressureMonitor().a());
        if (tracesSampleRate == null) {
            d11 = null;
        } else {
            d11 = Double.valueOf(tracesSampleRate.doubleValue() / pow);
        }
        if (d11 != null) {
            if (d11.doubleValue() >= secureRandom.nextDouble()) {
                z11 = true;
            }
            return new U3.n(Boolean.valueOf(z11), d11, valueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new U3.n(bool, (Double) null, bool, (Double) null);
    }
}
