package Kg;

import id.AbstractC3557B;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    public final k f9821a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9822b;

    /* renamed from: c  reason: collision with root package name */
    public final wf.k f9823c;

    public f(k kVar, boolean z10, wf.k kVar2) {
        AbstractC3557B.c0("predicate", kVar2);
        this.f9821a = kVar;
        this.f9822b = z10;
        this.f9823c = kVar2;
    }

    @Override // Kg.k
    public final Iterator iterator() {
        return new e(this);
    }
}
