package fc;

import id.AbstractC3557B;
import mc.C4616c;

/* renamed from: fc.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2999C extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f30107Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC3022q f30108Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2999C(AbstractC3022q abstractC3022q, int i10) {
        super(1);
        this.f30107Y = i10;
        this.f30108Z = abstractC3022q;
    }

    public final C4616c a(C4616c c4616c) {
        int i10 = this.f30107Y;
        AbstractC3022q abstractC3022q = this.f30108Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("settings", c4616c);
                return C4616c.a(c4616c, false, false, null, ((C3010e) abstractC3022q).f30208a, 7);
            case 1:
                AbstractC3557B.c0("settings", c4616c);
                return C4616c.a(c4616c, ((C3020o) abstractC3022q).f30218a, false, null, false, 14);
            case 2:
                AbstractC3557B.c0("settings", c4616c);
                return C4616c.a(c4616c, false, ((C3021p) abstractC3022q).f30219a, null, false, 13);
            default:
                AbstractC3557B.c0("settings", c4616c);
                return C4616c.a(c4616c, false, false, ((C3016k) abstractC3022q).f30214a, false, 11);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f30107Y) {
            case 0:
                return a((C4616c) obj);
            case 1:
                return a((C4616c) obj);
            case 2:
                return a((C4616c) obj);
            default:
                return a((C4616c) obj);
        }
    }
}
