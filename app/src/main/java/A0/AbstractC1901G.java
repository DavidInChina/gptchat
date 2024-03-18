package a0;

import Z.AbstractC1707e;
import Z.C1742w;
import Z.Q0;

/* renamed from: a0.G  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1901G {

    /* renamed from: a  reason: collision with root package name */
    public final int f23792a;

    /* renamed from: b  reason: collision with root package name */
    public final int f23793b;

    public /* synthetic */ AbstractC1901G(int i10, int i11, int i12) {
        this((i12 & 1) != 0 ? 0 : i10, (i12 & 2) != 0 ? 0 : i11);
    }

    public abstract void a(C1902H c1902h, AbstractC1707e abstractC1707e, Q0 q02, C1742w c1742w);

    public String b(int i10) {
        return "IntParameter(" + i10 + ')';
    }

    public String c(int i10) {
        return "ObjectParameter(" + i10 + ')';
    }

    public final String toString() {
        String o10 = kotlin.jvm.internal.C.f37623a.b(getClass()).o();
        if (o10 == null) {
            return "";
        }
        return o10;
    }

    public AbstractC1901G(int i10, int i11) {
        this.f23792a = i10;
        this.f23793b = i11;
    }
}
