package Ng;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: Ng.o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1079o0 extends v0 implements AbstractC1085t {

    /* renamed from: h0  reason: collision with root package name */
    public final boolean f12961h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1079o0(AbstractC1073l0 abstractC1073l0) {
        super(true);
        C1080p c1080p;
        C1080p c1080p2;
        boolean z10 = true;
        Y(abstractC1073l0);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v0.f12990Z;
        AbstractC1078o abstractC1078o = (AbstractC1078o) atomicReferenceFieldUpdater.get(this);
        if (abstractC1078o instanceof C1080p) {
            c1080p = (C1080p) abstractC1078o;
        } else {
            c1080p = null;
        }
        if (c1080p != null) {
            v0 o10 = c1080p.o();
            while (!o10.Q()) {
                AbstractC1078o abstractC1078o2 = (AbstractC1078o) atomicReferenceFieldUpdater.get(o10);
                if (abstractC1078o2 instanceof C1080p) {
                    c1080p2 = (C1080p) abstractC1078o2;
                } else {
                    c1080p2 = null;
                }
                if (c1080p2 != null) {
                    o10 = c1080p2.o();
                }
            }
            this.f12961h0 = z10;
        }
        z10 = false;
        this.f12961h0 = z10;
    }

    @Override // Ng.v0
    public final boolean Q() {
        return this.f12961h0;
    }

    @Override // Ng.v0
    public final boolean R() {
        return true;
    }

    public final boolean q0() {
        return b0(jf.y.f36177a);
    }
}
