package qc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class h extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public i f44050Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44051Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ i f44052h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f44053i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44052h0 = iVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44051Z = obj;
        this.f44053i0 |= Integer.MIN_VALUE;
        return this.f44052h0.b(null, null, this);
    }
}
