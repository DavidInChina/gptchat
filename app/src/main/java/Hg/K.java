package Hg;

import Mf.AbstractC1013w;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class K extends q {

    /* renamed from: c  reason: collision with root package name */
    public static final K f7766c = new q("must have a single value parameter", 1, 0);

    @Override // Hg.AbstractC0732e
    public final boolean a(AbstractC1013w abstractC1013w) {
        AbstractC3557B.c0("functionDescriptor", abstractC1013w);
        if (abstractC1013w.S().size() == 1) {
            return true;
        }
        return false;
    }
}
