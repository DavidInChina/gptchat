package Kg;

import id.AbstractC3557B;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class s implements k {

    /* renamed from: a  reason: collision with root package name */
    public final k f9850a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f9851b;

    public s(k kVar, wf.k kVar2) {
        AbstractC3557B.c0("sequence", kVar);
        AbstractC3557B.c0("transformer", kVar2);
        this.f9850a = kVar;
        this.f9851b = kVar2;
    }

    @Override // Kg.k
    public final Iterator iterator() {
        return new Fe.o(this);
    }
}
