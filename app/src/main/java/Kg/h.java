package Kg;

import id.AbstractC3557B;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class h implements k {

    /* renamed from: a  reason: collision with root package name */
    public final k f9828a;

    /* renamed from: b  reason: collision with root package name */
    public final wf.k f9829b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.k f9830c;

    public h(k kVar, wf.k kVar2, wf.k kVar3) {
        AbstractC3557B.c0("sequence", kVar);
        AbstractC3557B.c0("transformer", kVar2);
        this.f9828a = kVar;
        this.f9829b = kVar2;
        this.f9830c = kVar3;
    }

    @Override // Kg.k
    public final Iterator iterator() {
        return new g(this);
    }
}
