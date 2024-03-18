package zg;

import Bg.AbstractC0218k;
import id.AbstractC3557B;
import java.util.Collection;
import ug.C5925g;
import wf.AbstractC6216a;

/* renamed from: zg.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6857d extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f52025Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6859f f52026Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6857d(C6859f c6859f, int i10) {
        super(0);
        this.f52025Y = i10;
        this.f52026Z = c6859f;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        ug.k kVar = ug.k.f46795Y;
        C6859f c6859f = this.f52026Z;
        int i10 = this.f52025Y;
        switch (i10) {
            case 0:
                switch (i10) {
                    case 0:
                        C5925g c5925g = C5925g.f46781l;
                        ug.n.f46798a.getClass();
                        Tf.d dVar = Tf.d.f17211Y;
                        return c6859f.i(c5925g, kVar);
                    default:
                        ((Cg.h) c6859f.f52028g).getClass();
                        C6862i c6862i = c6859f.f52031j;
                        AbstractC3557B.c0("classDescriptor", c6862i);
                        Collection l10 = ((AbstractC0218k) c6862i.f()).l();
                        AbstractC3557B.b0("getSupertypes(...)", l10);
                        return l10;
                }
            default:
                switch (i10) {
                    case 0:
                        C5925g c5925g2 = C5925g.f46781l;
                        ug.n.f46798a.getClass();
                        Tf.d dVar2 = Tf.d.f17211Y;
                        return c6859f.i(c5925g2, kVar);
                    default:
                        ((Cg.h) c6859f.f52028g).getClass();
                        C6862i c6862i2 = c6859f.f52031j;
                        AbstractC3557B.c0("classDescriptor", c6862i2);
                        Collection l11 = ((AbstractC0218k) c6862i2.f()).l();
                        AbstractC3557B.b0("getSupertypes(...)", l11);
                        return l11;
                }
        }
    }
}
