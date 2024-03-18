package Fa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f5114Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f5115Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f5116h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(i iVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f5115Z = iVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f5114Y = obj;
        this.f5116h0 |= Integer.MIN_VALUE;
        return this.f5115Z.b(this);
    }
}
