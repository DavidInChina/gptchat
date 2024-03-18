package H2;

import p2.h0;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final h0 f7326a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f7327b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7328c;

    public q(int i10, h0 h0Var, int[] iArr) {
        if (iArr.length == 0) {
            s2.p.d("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f7326a = h0Var;
        this.f7327b = iArr;
        this.f7328c = i10;
    }
}
