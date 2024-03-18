package a0;

import Z.AbstractC1707e;
import Z.C1742w;
import Z.Q0;
import h0.C3289b;
import id.AbstractC3557B;
import java.util.List;

/* renamed from: a0.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1909f extends AbstractC1901G {

    /* renamed from: c  reason: collision with root package name */
    public static final C1909f f23823c = new AbstractC1901G(0, 2, 1);

    @Override // a0.AbstractC1901G
    public final void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w) {
        int i10 = ((C3289b) c1902h.b(0)).f31682a;
        List list = (List) c1902h.b(1);
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            AbstractC3557B.a0("null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>", abstractC1707e);
            int i12 = i10 + i11;
            abstractC1707e.b(i12, obj);
            abstractC1707e.g(i12, obj);
        }
    }

    @Override // a0.AbstractC1901G
    public final String c(int i10) {
        if (A7.b.A0(i10, 0)) {
            return "effectiveNodeIndex";
        }
        if (A7.b.A0(i10, 1)) {
            return "nodes";
        }
        return super.c(i10);
    }
}
