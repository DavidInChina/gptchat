package ld;

import Ng.AbstractC1085t;
import Ng.v0;
import java.util.concurrent.atomic.AtomicInteger;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a  reason: collision with root package name */
    public final Object f38294a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f38295b = Ad.l.n();

    /* renamed from: d  reason: collision with root package name */
    public final Object f38297d = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    public final Object f38296c = Ad.l.n();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [pf.j, wf.k] */
    public o(C4431d c4431d) {
        this.f38294a = c4431d;
        a(new AbstractC5163j(1, null));
    }

    public final void a(wf.k kVar) {
        ((AtomicInteger) this.f38297d).incrementAndGet();
        ((v0) ((AbstractC1085t) this.f38295b)).V(new Oc.c(this, 1, kVar));
    }
}
