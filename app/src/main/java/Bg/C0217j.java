package Bg;

import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import l8.AbstractC4344b;

/* renamed from: Bg.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0217j extends kotlin.jvm.internal.o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f2125Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC0218k f2126Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0217j(AbstractC0218k abstractC0218k, int i10) {
        super(1);
        this.f2125Y = i10;
        this.f2126Z = abstractC0218k;
    }

    @Override // wf.k
    public final Object invoke(Object obj) {
        Collection collection;
        Collection collection2;
        jf.y yVar = jf.y.f36177a;
        AbstractC0218k abstractC0218k = null;
        List list = null;
        AbstractC0218k abstractC0218k2 = this.f2126Z;
        switch (this.f2125Y) {
            case 2:
                Y y10 = (Y) obj;
                AbstractC3557B.c0("it", y10);
                abstractC0218k2.getClass();
                if (y10 instanceof AbstractC0218k) {
                    abstractC0218k = (AbstractC0218k) y10;
                }
                if (abstractC0218k != null) {
                    collection = kf.t.w2(abstractC0218k.e(false), ((C0215h) abstractC0218k.f2130b.mo122invoke()).f2121a);
                } else {
                    collection = y10.l();
                    AbstractC3557B.b0("getSupertypes(...)", collection);
                }
                return collection;
            case 3:
                A a5 = (A) obj;
                AbstractC3557B.c0("it", a5);
                abstractC0218k2.o(a5);
                return yVar;
            default:
                C0215h c0215h = (C0215h) obj;
                AbstractC3557B.c0("supertypes", c0215h);
                ((Mf.Y) abstractC0218k2.f()).getClass();
                Collection collection3 = c0215h.f2121a;
                AbstractC3557B.c0("superTypes", collection3);
                boolean isEmpty = collection3.isEmpty();
                Collection collection4 = collection3;
                if (isEmpty) {
                    A c10 = abstractC0218k2.c();
                    if (c10 != null) {
                        collection2 = AbstractC4344b.F0(c10);
                    } else {
                        collection2 = null;
                    }
                    if (collection2 == null) {
                        collection2 = kf.v.f37483Y;
                    }
                    collection4 = collection2;
                }
                if (collection4 instanceof List) {
                    list = (List) collection4;
                }
                if (list == null) {
                    list = kf.t.K2(collection4);
                }
                List n10 = abstractC0218k2.n(list);
                AbstractC3557B.c0("<set-?>", n10);
                c0215h.f2122b = n10;
                return yVar;
        }
    }
}
