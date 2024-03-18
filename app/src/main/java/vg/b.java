package vg;

import Bg.A;
import Mf.AbstractC0993b;
import Mf.AbstractC0997f;
import id.AbstractC3557B;
import kg.C4294f;

/* loaded from: classes.dex */
public final class b extends AbstractC6047a implements e {

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f47528Z = 1;

    /* renamed from: h0  reason: collision with root package name */
    public final C4294f f47529h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Object f47530i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AbstractC0993b abstractC0993b, A a5, C4294f c4294f) {
        super(a5);
        AbstractC3557B.c0("receiverType", a5);
        this.f47530i0 = abstractC0993b;
        this.f47529h0 = c4294f;
    }

    public final String toString() {
        Object obj = this.f47530i0;
        switch (this.f47528Z) {
            case 0:
                return getType() + ": Ctx { " + ((AbstractC0997f) obj) + " }";
            default:
                return "Cxt { " + ((AbstractC0993b) obj) + " }";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AbstractC0997f abstractC0997f, A a5, C4294f c4294f) {
        super(a5);
        AbstractC3557B.c0("classDescriptor", abstractC0997f);
        AbstractC3557B.c0("receiverType", a5);
        this.f47530i0 = abstractC0997f;
        this.f47529h0 = c4294f;
    }
}
