package yh;

import Qh.AbstractC1239q;
import th.AbstractC5806n;
import th.C5805m;

/* renamed from: yh.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6594b extends AbstractC6591a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50990Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f50991Z;

    public C6594b(int i10, Object obj) {
        this.f50990Y = i10;
        this.f50991Z = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [th.n, Qh.q] */
    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        switch (this.f50990Y) {
            case 0:
                return new C5805m(((Package) this.f50991Z).getDeclaredAnnotations());
            default:
                return new AbstractC1239q(1);
        }
    }

    @Override // sh.AbstractC5637i.b
    public final String getName() {
        int i10 = this.f50990Y;
        Object obj = this.f50991Z;
        switch (i10) {
            case 0:
                return ((Package) obj).getName();
            default:
                return (String) obj;
        }
    }
}
