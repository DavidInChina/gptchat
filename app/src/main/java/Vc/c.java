package Vc;

import me.T;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class c extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public T f18533Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f18534Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ d f18535h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f18536i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18535h0 = dVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18534Z = obj;
        this.f18536i0 |= Integer.MIN_VALUE;
        return this.f18535h0.a(null, this);
    }
}
