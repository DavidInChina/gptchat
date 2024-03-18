package Vc;

import me.T;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public T f18541Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f18542Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ h f18543h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f18544i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f18543h0 = hVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f18542Z = obj;
        this.f18544i0 |= Integer.MIN_VALUE;
        return this.f18543h0.a(null, this);
    }
}
