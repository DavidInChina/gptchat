package Ee;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f4700Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f4701Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f4702h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(i iVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f4701Z = iVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f4700Y = obj;
        this.f4702h0 |= Integer.MIN_VALUE;
        return this.f4701Z.b(null, null, null, this);
    }
}
