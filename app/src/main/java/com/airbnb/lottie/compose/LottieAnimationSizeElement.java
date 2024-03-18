package com.airbnb.lottie.compose;

import G0.X;
import android.gov.nist.core.Separators;
import android.gov.nist.core.a;
import id.AbstractC3557B;
import kotlin.Metadata;
import l0.AbstractC4325q;
import z4.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "LG0/X;", "Lz4/m;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class LottieAnimationSizeElement extends X {

    /* renamed from: b  reason: collision with root package name */
    public final int f26693b;

    /* renamed from: c  reason: collision with root package name */
    public final int f26694c;

    public LottieAnimationSizeElement(int i10, int i11) {
        this.f26693b = i10;
        this.f26694c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) obj;
        if (this.f26693b == lottieAnimationSizeElement.f26693b && this.f26694c == lottieAnimationSizeElement.f26694c) {
            return true;
        }
        return false;
    }

    @Override // G0.X
    public final int hashCode() {
        return (this.f26693b * 31) + this.f26694c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z4.m, l0.q] */
    @Override // G0.X
    public final AbstractC4325q j() {
        ?? abstractC4325q = new AbstractC4325q();
        abstractC4325q.f51698s0 = this.f26693b;
        abstractC4325q.f51699t0 = this.f26694c;
        return abstractC4325q;
    }

    @Override // G0.X
    public final void m(AbstractC4325q abstractC4325q) {
        m mVar = (m) abstractC4325q;
        AbstractC3557B.c0("node", mVar);
        mVar.f51698s0 = this.f26693b;
        mVar.f51699t0 = this.f26694c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LottieAnimationSizeElement(width=");
        sb2.append(this.f26693b);
        sb2.append(", height=");
        return a.l(sb2, this.f26694c, Separators.RPAREN);
    }
}
