package Wg;

import Sg.z;
import java.util.concurrent.atomic.AtomicReferenceArray;
import nf.AbstractC4831k;

/* loaded from: classes2.dex */
public final class k extends z {

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f21111j0 = new AtomicReferenceArray(j.f21110f);

    public k(long j6, k kVar, int i10) {
        super(j6, kVar, i10);
    }

    @Override // Sg.z
    public final int f() {
        return j.f21110f;
    }

    @Override // Sg.z
    public final void g(int i10, AbstractC4831k abstractC4831k) {
        this.f21111j0.set(i10, j.f21109e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f16688h0 + ", hashCode=" + hashCode() + ']';
    }
}
