package Fa;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f5111Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ i f5112Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f5113h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f5112Z = iVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f5111Y = obj;
        this.f5113h0 |= Integer.MIN_VALUE;
        return this.f5112Z.a(null, false, this);
    }
}
