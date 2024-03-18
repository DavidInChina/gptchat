package Uf;

import Mf.AbstractC1013w;
import Pf.AbstractC1158p;
import id.AbstractC3557B;
import kg.C4294f;
import rg.AbstractC5493d;

/* renamed from: Uf.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1446h extends Q {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f17820m = 0;

    public static final AbstractC1013w a(AbstractC1013w abstractC1013w) {
        AbstractC3557B.c0("functionDescriptor", abstractC1013w);
        C4294f name = ((AbstractC1158p) abstractC1013w).getName();
        AbstractC3557B.b0("getName(...)", name);
        if (!b(name)) {
            return null;
        }
        return (AbstractC1013w) AbstractC5493d.b(abstractC1013w, C1444f.f17818Y);
    }

    public static boolean b(C4294f c4294f) {
        AbstractC3557B.c0("<this>", c4294f);
        return Q.f17793f.contains(c4294f);
    }
}
