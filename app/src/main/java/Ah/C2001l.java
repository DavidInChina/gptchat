package ah;

import Df.AbstractC0405d;
import id.AbstractC3557B;
import kotlinx.serialization.KSerializer;

/* renamed from: ah.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2001l extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Z  reason: collision with root package name */
    public static final C2001l f24210Z = new C2001l(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C2001l f24211h0 = new C2001l(1);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f24212Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2001l(int i10) {
        super(1);
        this.f24212Y = i10;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        int i10 = this.f24212Y;
        switch (i10) {
            case 0:
                AbstractC0405d abstractC0405d = (AbstractC0405d) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("it", abstractC0405d);
                        return Bi.c.G1(abstractC0405d);
                    default:
                        AbstractC3557B.c0("it", abstractC0405d);
                        KSerializer G12 = Bi.c.G1(abstractC0405d);
                        if (G12 == null) {
                            return null;
                        }
                        return A7.b.U0(G12);
                }
            default:
                AbstractC0405d abstractC0405d2 = (AbstractC0405d) obj;
                switch (i10) {
                    case 0:
                        AbstractC3557B.c0("it", abstractC0405d2);
                        return Bi.c.G1(abstractC0405d2);
                    default:
                        AbstractC3557B.c0("it", abstractC0405d2);
                        KSerializer G13 = Bi.c.G1(abstractC0405d2);
                        if (G13 == null) {
                            return null;
                        }
                        return A7.b.U0(G13);
                }
        }
    }
}
