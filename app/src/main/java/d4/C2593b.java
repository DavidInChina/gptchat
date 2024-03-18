package d4;

import id.AbstractC3557B;
import wf.k;

/* renamed from: d4.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2593b implements AbstractC2596e {

    /* renamed from: b  reason: collision with root package name */
    public final k f27989b;

    public /* synthetic */ C2593b(k kVar) {
        this.f27989b = kVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2593b)) {
            return false;
        }
        if (!AbstractC3557B.K(this.f27989b, ((C2593b) obj).f27989b)) {
            return false;
        }
        return true;
    }

    @Override // d4.AbstractC2596e
    public final Object getValue() {
        throw new IllegalStateException("The driver used with SQLDelight is asynchronous, so SQLDelight should be configured for\nasynchronous usage:\n\nsqldelight {\n  databases {\n    MyDatabase {\n      generateAsync = true\n    }\n  }\n}");
    }

    public final int hashCode() {
        return this.f27989b.hashCode();
    }

    public final String toString() {
        return "AsyncValue(getter=" + this.f27989b + ')';
    }
}
