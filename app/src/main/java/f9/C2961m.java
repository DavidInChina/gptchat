package f9;

import ce.AbstractC2400f;

/* renamed from: f9.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2961m implements AbstractC2400f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29799a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C2962n f29800b;

    public /* synthetic */ C2961m(C2962n c2962n, int i10) {
        this.f29799a = i10;
        this.f29800b = c2962n;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f29799a;
        C2962n c2962n = this.f29800b;
        switch (i10) {
            case 0:
                return new u(c2962n.f29827c, c2962n.f29829d, c2962n.f29831e);
            default:
                return new q(c2962n.f29827c, c2962n.f29829d, c2962n.f29831e);
        }
    }
}
