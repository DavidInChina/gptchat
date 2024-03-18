package d1;

import jf.y;
import kotlin.jvm.internal.A;
import wf.AbstractC6216a;

/* renamed from: d1.r  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2583r extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ A f27894Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2584s f27895Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Z0.j f27896h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ long f27897i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f27898j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2583r(A a5, C2584s c2584s, Z0.j jVar, long j6, long j10) {
        super(0);
        this.f27894Y = a5;
        this.f27895Z = c2584s;
        this.f27896h0 = jVar;
        this.f27897i0 = j6;
        this.f27898j0 = j10;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        C2584s c2584s = this.f27895Z;
        AbstractC2586u positionProvider = c2584s.getPositionProvider();
        Z0.l parentLayoutDirection = c2584s.getParentLayoutDirection();
        this.f27894Y.f37621Y = positionProvider.a(this.f27896h0, this.f27897i0, parentLayoutDirection, this.f27898j0);
        return y.f36177a;
    }
}
